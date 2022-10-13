<%--
  Created by IntelliJ IDEA.
  User: lafon
  Date: 2022-08-16
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/includes/head.jsp" %>
</head>
<body>
<%@include file="/includes/navbar.jsp" %>


<br>

<div class="alert alert-success container" role="alert">
    <h3 style="color: green">Voici la liste de tous les client dans la base de donnée</h3>
</div>
<br>

<div class="container">
    <div class="col-12">
        <table class="table table-striped table-hover">


            <thead>
            <tr>
                <th>Numéro client</th>
                <th>Nom Client</th>
                <th>Numéro de téléphone</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="info" items="${requestScope.listeClient}">
                <tr>
                    <form action="UpdateClientServlet" method="post">
                        <td><input type="number" name="noClient" value="${info.noClient}"/></td>
                        <td><input type="text" name="nomClient" value="${info.nomClient}"/></td>
                        <td><input type="text" name="noTelephone" value="${info.noTelephone}"/></td>
                        <td>
                        <td>
                            <input class="btn btn-primary " type="submit" value="Modifier"/>
                        </td>

                        </td>
                    </form>
                </tr>
            </c:forEach>
            </tbody>


        </table>
    </div>
</div>


<br>
<%@include file="/includes/footer.jsp" %>
</body>
</html>