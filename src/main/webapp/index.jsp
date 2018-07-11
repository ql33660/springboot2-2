<%@page pageEncoding="utf-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!sssssssssss总</h2>
${sessionScope.user.name}

<c:forEach items="${requestScope.list}" var="user">
    ${user.name}

</c:forEach>
</body>
</html>
