package edu.njpi.crm.interceptor;

import edu.njpi.crm.model.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Classname LoginInterceptor
 * @Description TODO
 * @Date 2020/12/17 4:28 下午
 * @Created by lqj(1724226325@qq.com)
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //1. 放行login.action请求
        String uri = request.getRequestURI();
        if(uri.indexOf("/login.action")>=0){
            return true;
        }
        //2. 放行已登录的请求
        HttpSession session = request.getSession();
        User user =(User) session.getAttribute("USER_SESSION");
        if(user!=null){
            //用户已登录
            return true;
        }
        //3. 拦截所有其他请求
        request.setAttribute("msg","您还没有登录,请先登录!");
        //跳转到登录页面
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp")
                .forward(request,response);
        return false;
    }
}
