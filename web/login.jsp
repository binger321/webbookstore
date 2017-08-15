<%--
  Created by IntelliJ IDEA.
  User: yb
  Date: 2017/8/14
  Time: 19:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<form id="loginForm" action="loginOrRegister/loginAction">
    <table>
        <tr>
            <select name="status" id="status">
                <option value="customer">顾客</option>
                <option value="seller">店家</option>
            </select>
        </tr>
        <tr><td><input type="text" name="userName" size="15" placeholder="这里输入用户名"></td></tr>
        <tr><td><input type="password" name="password" size="15" placeholder="这里输入密码"></td></tr>

        <tr><td><input type="submit" value="登录"> <a href="register.jsp">没注册点这里...</a</tr>
    </table>
</form>
</body>
</html>
