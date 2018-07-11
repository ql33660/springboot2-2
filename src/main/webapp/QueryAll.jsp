<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>emplist</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>

</head>
<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    当前用户：退出</a>
                    <br/>
                </p>
            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="">main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                Welcome!
            </h1>
            <table class="table">
                <tr class="table_header">

                    <td>
                        Name
                    </td>

                </tr>
                <c:forEach items="${requestScope.list}" var="user">
                    <tr>
                        <td>
                                ${user.name}
                        </td>
                    </tr>

                </c:forEach>

            </table>


            <div id="footer">
                <div id="footer_bg">
                    ABC@126.com
                </div>
            </div>
        </div>
</body>
</body>
</html>
