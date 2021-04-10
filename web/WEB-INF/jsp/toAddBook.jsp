<%--
  Created by IntelliJ IDEA.
  User: Zero
  Date: 2021/4/10
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加书籍页面</title>

    <form action="${pageContext.request.contextPath}/book/addBook">

        <br>
        图书名字 <input type="text" name="bookName">
        <br>
        图书描述 <input type="text" name="bookDescription">
        <br>
        图书数量 <input type="int" name="bookCount"/>
        <br>
        <button type="submit" value="提交" style="size: 20px">提交</button>


    </form>

</head>
<body>


</body>
</html>
