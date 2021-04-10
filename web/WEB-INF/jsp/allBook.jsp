<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Zero
  Date: 2021/4/10
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书页面</title>
</head>
<body>

<table>
    <thead>
    <tr>
        <th>图书id</th>
        <th>图书名称</th>
        <th>图书描述</th>
        <th>图书状态</th>
        <th>图书数量</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="book" items="${booksList}">
        <tr>
            <td>${book.bookId}</td>
            <td>${book.bookName}</td>
            <td>${book.bookDescription}</td>
            <td>${book.bookStatus}</td>
            <td>${book.bookCount}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
