<%@ page import="modeles.Article" %><%--
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
    <%@include file="/includes/head.jsp"%>
    <link rel="stylesheet" href="./css/style.css">
</head>
<body>
<%@include file="/includes/navbar.jsp"%>


<br>

<div class="alert alert-success container" role="alert">
    <h3 style="color: green">Voici la liste de tous les articles dans la base de donnée</h3>
</div>
<br>














<div class="container">
    <div class="card-header my-3 bg-dark text-light">La liste en format Card </div>
    <div class="row">


        <c:forEach var="info" items="${requestScope.listeArticles}">
        <div class="col-md-3 my-3">
            <div class="card-container">
            <div class="card w-100">



                    <figure class="front card-container border">
                    <form action="" name="forms1" method="get">

                        <table class="table-sm text-center rounded-3"  cellspacing="1" cellpadding="1">
                            <thead>
                            <tr>
                                <th colspan="2">${info.description}</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>Numéro : </td>
                                <td>${info.noArticle}</td>
                            </tr>

                            <tr>
                                <td>Description</td>
                                <td>${info.description}</td>
                            </tr>


                            <tr>
                                <td>Prix unitaire</td>
                                <td>${info.prixUnitaire}</td>
                            </tr>

                            <tr>
                                <td>Quantité : </td>
                                <td>${info.quantite}</td>
                            </tr>

                            </tbody>
                        </table>
                    </form>

                    </figure>

                    <figure class="back">
                    <div class="mt-3 d-flex justify-content-between my-3">
                        <a class="btn btn-dark" href="">Add to Cart</a>
                        <a class="btn btn-primary" href="AjouterElement.jsp">Buy Now</a>
                    </div>
                    </figure>





            </div>
            </div>
        </div>
        </c:forEach>

    </div>
</div>






<%--<br>--%>
<%--<div class="container">--%>
<%--    <div class="card-header my-3 bg-dark text-light">La liste en format liste </div>--%>
<%--    <div class="col-12">--%>
<%--        <table class="table table-striped table-hover">--%>


<%--            <thead>--%>
<%--            <tr>--%>
<%--                <th>Numéro Article</th>--%>
<%--                <th>Description</th>--%>
<%--                <th>Prix Unitaire</th>--%>
<%--                <th>Quantité</th>--%>
<%--                <th>Action</th>--%>
<%--            </tr>--%>
<%--            </thead>--%>
<%--            <tbody>--%>
<%--            <c:forEach var="info" items="${requestScope.listeArticles}">--%>
<%--                <tr>--%>
<%--                    <form action="" method="post">--%>
<%--                        <td>${info.noArticle}</td>--%>
<%--                        <td>${info.description}</td>--%>
<%--                        <td>${info.prixUnitaire}</td>--%>
<%--                        <td>${info.quantite}</td>--%>
<%--                        <td>--%>
<%--                            <a class="btn btn-primary" href="AjouterElement.jsp">Buy Now</a>--%>
<%--                        </td>--%>
<%--                    </form>--%>
<%--                </tr>--%>
<%--            </c:forEach>--%>
<%--            </tbody>--%>


<%--        </table>--%>
<%--    </div>--%>
<%--</div>--%>


<br>
<%@include file="/includes/footer.jsp"%>
</body>
</html>