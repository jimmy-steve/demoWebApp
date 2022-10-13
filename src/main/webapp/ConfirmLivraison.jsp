<%--
  Created by IntelliJ IDEA.
  User: lafon
  Date: 2022-08-16
  Time: 17:40
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

<h4 style="color: red">Vous avez sauvegarder avec succès la livraison # : ${liv.noLivraison} ) </h4>
<ul>
    <li>Numéro de Livraison ${liv.noLivraison}</li>
    <li>Date de livraison ${liv.dateLivraison}</li>
    <li>Numéro de commande : ${detailLivraison.noCommande}</li>
    <li>Numéro de l'article : ${detailLivraison.noArticle}</li>
    <li>Quantitée Livrée : ${detailLivraison.quantiteLivrer}</li>
</ul>

<a href="./index.jsp" class="btn btn-primary btn-lg px-4 gap-3">Home</a>
<a href="./index.jsp" class="btn btn-primary btn-lg px-4">Maison</a>
<%@include file="/includes/footer.jsp"%>
</body>
</html>
