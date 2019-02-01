<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/21
  Time: 9:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld" %>
<html>
<head>
    <title>搜索</title>

</head>
<body>
    <table>
        <thead>
            <tr>
                <th>编号</th>
                <th>标题</th>
                <th>概要</th>
                <th>作者</th>
                <th>创建时间</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${infos}" var="i">
            <tr>
                <td>${i.id}</td>
                <td>${i.title}</td>
                <td>${i.summary}</td>
                <td>${i.auto}</td>
                <td>${i.createdate}</td>
            </tr>
            
        </c:forEach>
    </table>
        </tbody>
    <span>共${totalCount}条记录</span>
    <span>共${totalPage}页</span>>
</body>
</html>
