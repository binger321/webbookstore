<%--
  Created by IntelliJ IDEA.
  User: yb
  Date: 2017/8/15
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<form action="loginOrRegister/registerAction">
    <table>
        <tr><td>
            <select name="status" id="status">
                <option value="customer">会员</option>
                <option value="seller">店主</option>
            </select>
        </td></tr>
        <tr><td><input type="text" name="realName" size="15" placeholder="这里输入姓名"></td></tr>
        <%--<tr><td><input type="text" name="tel" size="15" placeholder="这里输入您的手机"></td></tr>--%>
        <tr><td><input type="text" name="userName" size="15" placeholder="这里输入用户名"></td></tr>
        <tr><td><input type="password" name="password" size="15" placeholder="这里输入密码"></td></tr>
        <tr><td><input type="password" name="password2" size="15" placeholder="这里确认密码"></td></tr>
        <tr><td><input type="submit" value="注册"><input type="reset" value="重置"></td></tr>
    </table>
</form>
</body>
</html>
