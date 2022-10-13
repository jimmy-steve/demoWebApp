<%--
  Created by IntelliJ IDEA.
  User: lafon
  Date: 2022-08-16
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/includes/head.jsp"%>
</head>
<body>
<%@include file="/includes/navbar.jsp"%>

<h1 class="text-center">SuPer CoNveRtIsSeUr De DeGrÉe </h1>
<br>

<div class="container">
    <div class="row ">
        <div class="col-12 ">
            <div class="card mx-auto my-5" style="">
                <ul class="list-group list-group-flush">
                    <li class="list-group-item"><%= request.getParameter("temp")%> en celcius correspond à <%=request.getAttribute("valF")%>
                        en Farenheit</li>
                    <li class="list-group-item"><%= request.getParameter("temp")%> en Farenheit correspond à <%=request.getAttribute("valG")%>
                        en Celcius</li>
                    <li class="list-group-item">A third item</li>
                </ul>
                <div class="card-footer">
                    <a href="index.jsp">Resaisir vos donnée</a>
                </div>
            </div>
        </div>
    </div>
</div>
<%@include file="/includes/footer.jsp"%>
</body>
</html>
