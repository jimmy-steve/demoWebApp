<%--
  Created by IntelliJ IDEA.
  User: lafon
  Date: 2022-08-16
  Time: 10:39
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

<h1>Hello World!</h1>

<form action="SauvevardeServlet" method="get">
    <table border="1">
        <thead>
        <tr>
            <th colspan="2" style="text-align: center">Produit</th>

        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Nom :</td>
            <td>
                <input type="number" name="noClient" value="${client.noClient}" />
            </td>
        </tr>
        <tr>
            <td>Quantite :</td>
            <td>
                <input type="text" name="nomClient" value="${client.nomClient}" />
            </td>
        </tr>
        <tr>
            <td>Prix :</td>
            <td>
                <input type="text" name="noTelephone" value="${client.noTelephone}" />
            </td>
        </tr>
        <tr>
            <td align='center' colspan="2">
                <div class="text-center">
                    <input class="btn btn-danger" type="submit" value="Enregistrer"/>
                </div>
            </td>
        </tr>
        </tbody>
    </table>
</form>
<%@include file="/includes/footer.jsp"%>
</body>
</html>
