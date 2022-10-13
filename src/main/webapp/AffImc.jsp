<%@ page import="utilitaire.CalculateurIMC" %><%--
  Created by IntelliJ IDEA.
  User: lafon
  Date: 2022-08-16
  Time: 13:42
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

<div class="alert alert-success container" role="alert">
    <h3 style="color: green">Voici le résultat de :${candidat.nom}</h3>
    <h3 style="color: green">Vous faite un IMC de  : ${candidat.imc1}</h3>

</div>


<br>
<div class="container">
    <table class="table table-striped table-hover">
        <h2 class="text-center">Vos résultat </h2>
        <thead>
        <tr>
            <th>Nom</th>
            <th>Taille</th>
            <th>Poids</th>
            <th>IMC</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>${candidat.nom}</td>
            <td>${candidat.taille}</td>
            <td>${candidat.poids}</td>
            <td>${candidat.imc1}</td>
        </tr>
        </tbody>
    </table>
</div>
<br><br>
<div class="alert alert-danger container" role="alert">
    <br>

    <h3>Classification du risque pour la santé en fonction de l'indice de masse corporelle (IMC) </h3>
</div>

<br>
<div class="container">
    <p>
        L’évaluation du poids santé s’effectue en utilisant l’indice de masse corporelle (IMC) et le tour de taille. L’IMC est un simple rapport mathématique entre le poids et la taille. Une fois établi, il permet d’évaluer le risque de développer certaines maladies à long terme.
    </p>

    <br>
</div>
<div class="container">
    <div class="row">

        <br>

        <table class="table">
            <thead>
            <tr class="table-secondary">
                <th>Classification</th>
                <th>Catégorie de
                    l'IMC (kg/m2)</th>
                <th>Risque de développer
                    des problèmes de santé</th>
            </tr>
            </thead>
            <tbody>
            <tr class="table-primary">
                <td>Poids insuffisant</td>
                <td>< 18,5</td>
                <td>Accru</td>
            </tr>
            <tr class="table-info">
                <td>Poids normal</td>
                <td>18,5 - 24,9</td>
                <td>Moindre</td>
            </tr>
            <tr class="table-success">
                <td>Excès de poids</td>
                <td>25,0 - 29,9</td>
                <td>Accru</td>
            </tr>
            <tr class="table-success">
                <td>Obésité, classe I</td>
                <td>30,0 - 34,9</td>
                <td>Élevé</td>
            </tr>
            <tr class="table-warning">
                <td>Obésité, classe II</td>
                <td>35,0 - 39,9</td>
                <td>Très élevé</td>
            </tr>
            <tr class="table-danger">
                <td>Obésité, classe III</td>
                <td>>= 40,0</td>
                <td>Extrêmement élevé</td>
            </tr>
            </tbody>
        </table>





    </div>
</div>
<%@include file="/includes/footer.jsp"%>
</body>
</html>
