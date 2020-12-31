<%--
  Created by IntelliJ IDEA.
  User: lqj
  Date: 2020/12/16
  Time: 2:28 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>登录页面</title>
    <link rel="stylesheet" href="/css/style.css"/>
    <link rel="stylesheet" href="/css/boot-crm.css"/>
    <script src="/js/jquery-1.11.3.min.js"></script>
</head>
<body leftmargin="0" topmargin="0" marginheight="0" background="/images/rightbg.jpg">
    <div align="center">
        <table border="0" width="1140px" cellpadding="0" cellspacing="0" id="table1">
            <tr>
                <td height="93"></td>
                <td></td>
            </tr>
            <tr>
                <td background="/images/rights.jpg" width="740" height="412"></td>
                <td class="login_msg" width="400" align="center">
                    <fieldset style="width: auto;margin: 0 auto">
                        <legend>
                            <font style="font-size: 15px "  face="宋体">
                                欢迎使用Boot客户关系管理系统
                            </font>
                        </legend>
                        <font color="red">
                            <span id="message">${msg}</span>
                        </font>
                        <form action="login.action" method="post" onsubmit="return check()">
                            <br><br>
                            账&nbsp;号: <input type="text" id="usercode" name="usercode"/>
                            <br><br>
                            密&nbsp;码: <input type="password" id="password" name="password"/>
                            <br><br>
                            <center>
                                <input type="submit" value="登录">
                            </center>
                        </form>
                    </fieldset>
                </td>
            </tr>
        </table>
    </div>
    <script>
        function check() {
            var usercode=$("#usercode").val()
            var password=$("#password").val()
            if (usercode==''|| password==''){
                $("#message").text("账号密码不能为空!");
                return false;
            }
           return true;
        }
    </script>
</body>
</html>
