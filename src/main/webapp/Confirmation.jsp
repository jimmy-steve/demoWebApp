<%--
  Created by IntelliJ IDEA.
  User: lafon
  Date: 2022-08-16
  Time: 11:08
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
<br>
<h4 style="color: red">Vous avez sauvegarder avec succès  ${client.nomClient}</h4>
<ul>
    <li>Numéro de client ${client.noClient}</li>
    <li>Nom de client : ${client.nomClient}</li>
    <li>Numéro de téléphone : ${client.noTelephone}</li>
</ul>
<%@include file="/includes/footer.jsp"%>
</body>
</html>
