package edu.njpi.crm.utils;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;
import java.util.Map;

/**
 * @Classname NavigationTag
 * @Description TODO
 * @Date 2020/12/23 11:36 上午
 * @Created by lqj(1724226325@qq.com)
 */
public class NavigationTag extends TagSupport {
    private String bean="page"; //保存Page<E>对象名
    private String url=null;    //分页跳转url
    private int number=5;       //显示页面数量

    public String getBean() {
        return bean;
    }

    public void setBean(String bean) {
        this.bean = bean;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int doStartTag() throws JspException {
        //获取out对象
        JspWriter out = pageContext.getOut();
        //获取request对象
        HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();
        //从reques中获取page对象
        Page page = (Page)request.getAttribute(bean);
        //对page对象判断,是否为null
        if(page==null){
            return SKIP_BODY;
        }
        //解析url
        url=resolveUrl(url,pageContext);
        try{
            //计算总页数
            int pageCount=page.getRecordTotal()/page.getPageSize();
            if(page.getRecordTotal()%page.getPageSize()>0){
                pageCount++;
            }
            //打印
            out.print("<nav><ul class=\"pagination\">");
            //首页链接
            String homeUrl=append(url,"page",1);
            //添加末页链接
            String backUrl=append(url,"page",pageCount);
            //显示上一页按钮
            if(page.getCurrentPage()>1){
                String preUrl=append(url,"page",page.getCurrentPage()-1);
                preUrl=append(preUrl,"rows",page.getPageSize());
                out.print("<li><a href=\""+homeUrl+"\">"+"首页</a></li>");
                out.print("<li><a href=\""+preUrl+"\">"+"上一页</a></li>");
            } else{
                out.print("<li class=\"disabled\"><a href=\"#\">"+"首页</a></li>");
                out.print("<li class=\"disabled\"><a href=\"#\">"+"上一页</a></li>");
            }
            /**
             * 显示页码
             *
             * 1 2 3 4 5
             * indexPage=page.getCurrentPage()-2>0?page.getCurrentPage()-2:1
             */
            //设置起始页
            int indexPage=1;
            if(page.getCurrentPage()-2<=0){
                indexPage=1;
            }else if(pageCount-page.getCurrentPage()<=2){
                indexPage=pageCount-4;
            }else{
                indexPage=page.getCurrentPage()-2;
            }
            //打印页码
            for(int i=1;i<number && indexPage<=pageCount;indexPage++,i++){
                if(indexPage==page.getCurrentPage()){
                    out.print("<li class=\"activie\"><a href=\"#\">"
                    +indexPage+"<span class=\"sr-only\">(current)</span></a></li>");
                    continue;
                }
                String pageUrl=append(url,"page",indexPage);
                pageUrl=append(pageUrl,"rows",page.getPageSize());
                out.print("<li><a href=\""+pageUrl+"\">"+indexPage+"</a></li>");
            }
            //打印下一页
            if(page.getCurrentPage()<pageCount){
                String nextUrl=append(url,"page",page.getCurrentPage()+1);
                nextUrl=append(nextUrl,"rows",page.getPageSize());
                out.print("<li><a href=\""+nextUrl+"\">"+"下一页</a></li>");
                out.print("<li><a href=\""+backUrl+"\">"+"尾页</a></li>");
            } else{
                out.print("<li class=\"disabled\"><a href=\"#\">"+"下一页</a></li>");
                out.print("<li class=\"disabled\"><a href=\"#\">"+"尾页</a></li>");
            }
            out.print("</nav>");

        } catch (Exception e){
              e.printStackTrace();
        }
        return SKIP_BODY;
    }

    /**
     * 为url匹配参数使用
     * @param url
     * @param key
     * @param value
     * @return
     */
    private String append(String url, String key, String value) {
        if(url==null || url.trim().length()==0){
            return "";
        }
        //url存在参数
        if(url.indexOf("?")==-1){
            url=url+"?"+key+"="+value;
        }else{
            if(url.endsWith("?")){
                url=url+key+"="+value;
            } else{
                //多个参数间使用&符合进行分隔
                url=url+"&AMP;"+key+"="+value;
            }
        }
        return  url;
    }

    private String append(String url, String key, int value) {
        return   append(url,key,String.valueOf(value));

    }

    private String resolveUrl(String url, PageContext pageContext) {
        //1. 获取参数
        Map<String, String[]> params = pageContext.getRequest().getParameterMap();
        //2. 遍历map
        for(Object key:params.keySet()){
            if("page".equals(key)|| "rows".equals(key)){
                continue;
            }
            Object value=params.get(key);
            if(value==null){
                continue;
            }
            if(value.getClass().isArray()){
                url=append(url,key.toString(),((String[])value)[0]);
            } else if(value instanceof String){
                url=append(url,key.toString(),value.toString());
            }
        }
        return url;
    }
}
