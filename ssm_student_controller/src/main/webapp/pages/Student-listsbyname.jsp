<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>

    <script src="${pageContext.request.contextPath}/js/jquery-2.2.3.min.js"></script>
</head>
<body>

    <h1>所有学生信息</h1>
    <table border="1" cellspacing="0">
        <div>
            <input type="text" id="nameserch" placeholder="请输入搜索的姓名">
            <input type="button" onclick="search()" value="搜索">
        </div>
        <tr>
            <th>Id</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>生日</th>
            <th>地址</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${students}" var="students">
        <tr>
            <th>${students.id}</th>
            <th>${students.name}</th>
            <th>${students.age}</th>
            <th>${students.birthdayStr}</th>
            <th>${students.address}</th>
            <th><button type="button" onclick="location.href='${pageContext.request.contextPath}/student/delete.do?id=${students.id}'">删除学生信息</button>
            <button type="button" onclick="location.href='${pageContext.request.contextPath}/student/findOneById.do?id=${students.id}'">修改学生信息</button></th>
        </tr>
        </c:forEach>
    </table>
    <button type="button" title="添加学生信息" onclick="location.href='${pageContext.request.contextPath}/pages/Student-add.jsp'">
        添加学生信息
    </button>
    <button type="button" title="显示所有学生信息" onclick="location.href='${pageContext.request.contextPath}/student/findAll.do'">
        显示所有学生信息
    </button>

</body>
</html>
