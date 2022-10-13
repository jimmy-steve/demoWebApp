<%--
  Created by IntelliJ IDEA.
  User: lafon
  Date: 2022-08-18
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<title>Page de quete SQL</title>
<%@include file="/includes/head.jsp" %>
</head>
<body>
<%@include file="/includes/navbar.jsp" %>
<br>
<H1 class="text-center">Voila la page pour les requêtes</H1>
<br>

<div class="container">
    <div class="card-header my-3">1) Les noCommande et dateCommande des Commandes du Client #10 dont le noCommande est
        supérieur à 3.
    </div>
    <div class="row">
        <div class="col">


            <table class="table table-striped table-hover border">


                <thead>
                <tr>
                    <th>Numéro de commande</th>
                    <th>Date de commande</th>
                    <th rowspan="2">
                        <form action="Requete1Servlet" name="forms1" method="post">
                            <div class="text-center">
                                <input class=" btn btn-primary " style="margin-right: 10px" type="submit"
                                       value="Faire la requête"/>
                            </div>
                        </form>

                    </th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="info" items="${liste}">
                    <tr>
                        <td>${info.noCommande}</td>
                        <td>${info.dateCommande}</td>
                    </tr>
                </c:forEach>
                </tbody>


            </table>


        </div>
    </div>
</div>
<br>
<br>
<div class="container">
    <div class="card-header my-3">2) Le noClient, noTéléphone du Client et noCommande pour les Commandes faites le 4/06/2000.

    </div>
    <div class="row">
        <div class="col">


            <table class="table table-striped table-hover border">


                <thead>
                <tr>
                    <th>Numéro de client</th>
                    <th>Nom du client</th>
                    <th>Numéro de téléphone</th>
                    <th>Numéro de Commande</th>
                    <th>Date de Commande</th>
                    <th rowspan="2">
                        <form action="Requete2Servlet" name="forms1" method="post">
                            <div class="text-center">
                                <input class=" btn btn-primary " style="margin-right: 10px" type="submit"
                                       value="Faire la requête"/>
                            </div>
                        </form>

                    </th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="info" items="${listeClients}">
                    <tr>
                        <td>${info.noClient}</td>
                        <td>${info.nomClient}</td>
                        <td>${info.noTelephone}</td>
<%--                        <td>${info.listeCommandes.noCommande}</td>--%>
<%--                        <td>${info.listeCommandes.dateCommande}</td>--%>
                    </tr>
                </c:forEach>
                </tbody>


            </table>


        </div>
    </div>
</div>

<br>
<br>

<div class="container">
    <div class="card-header my-3">3) Les Articles dont la description débute par la lettre « C ».

    </div>
    <div class="row">
        <div class="col">


            <table class="table table-striped table-hover border">


                <thead>
                <tr>
                    <th>Numéro de l'article</th>
                    <th>Description</th>
                    <th>Prix Unitaire</th>
                    <th>Quantité</th>
                    <th rowspan="2">
                        <form action="Requete3Servlet" name="forms1" method="post">
                            <div class="text-center">
                                <input class=" btn btn-primary " style="margin-right: 10px" type="submit"
                                       value="Faire la requête"/>
                            </div>
                        </form>

                    </th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="info" items="${listeArticles3}">
                    <tr>
                        <td>${info.noArticle}</td>
                        <td>${info.description}</td>
                        <td>${info.prixUnitaire}</td>
                        <td>${info.quantite}</td>
                    </tr>
                </c:forEach>
                </tbody>


            </table>


        </div>
    </div>
</div>

<br>
<br>


<div class="container">
    <div class="card-header my-3">4) Les Articles dont le prix est supérieur à la moyenne

    </div>
    <div class="row">
        <div class="col">


            <table class="table table-striped table-hover border">


                <thead>
                <tr>
                    <th>Numéro de l'article</th>
                    <th>Description</th>
                    <th>Prix Unitaire</th>
                    <th>Quantité</th>
                    <th rowspan="2">
                        <form action="Requete4Servlet" name="forms1" method="post">
                            <div class="text-center">
                                <input class=" btn btn-primary " style="margin-right: 10px" type="submit"
                                       value="Faire la requête"/>
                            </div>
                        </form>

                    </th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="info" items="${listeArticles}">
                    <tr>
                        <td>${info.noArticle}</td>
                        <td>${info.description}</td>
                        <td>${info.prixUnitaire}</td>
                        <td>${info.quantite}</td>
                    </tr>
                </c:forEach>
                </tbody>


            </table>


        </div>
    </div>
</div>

<br>
<br>

<div class="container">
    <div class="card-header my-3">5) La liste des noCommande avec les noLivraisons associées,
        et ce, incluant aussi les noCommandes sans
        livraison.
    </div>
    <div class="row">
        <div class="col">


            <table class="table table-striped table-hover border">


                <thead>
                <tr>
                    <th>Numéro de commande</th>
                    <th>Numéro de Livraison</th>
                    <th rowspan="2">
                        <form action="Requete5Servlet" name="forms1" method="post">
                            <div class="text-center">
                                <input class=" btn btn-primary " style="margin-right: 10px" type="submit"
                                       value="Faire la requête"/>
                            </div>
                        </form>

                    </th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="info" items="${liste5}">
                    <tr>
                        <td>${info.noCommande}</td>
                        <td>${info.noLivraison}</td>
                    </tr>
                </c:forEach>
                </tbody>


            </table>


        </div>
    </div>
</div>
<br>
<br>


<div class="container">
    <div class="card-header my-3">6) Le noClient, noTéléphone des Clients sans aucune commande

    </div>
    <div class="row">
        <div class="col">


            <table class="table table-striped table-hover border">


                <thead>
                <tr>
                    <th>Numéro de client</th>
                    <th>Numéro Téléphone</th>
                    <th rowspan="2">
                        <form action="Requete6Servlet" name="forms1" method="post">
                            <div class="text-center">
                                <input class=" btn btn-primary " style="margin-right: 10px" type="submit"
                                       value="Faire la requête"/>
                            </div>
                        </form>

                    </th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="info" items="${listeClients6}">
                    <tr>
                        <td>${info.noClient}</td>
                        <td>${info.noTelephone}</td>
                    </tr>
                </c:forEach>
                </tbody>


            </table>


        </div>
    </div>
</div>

<br>
<br>

<%@include file="/includes/footer.jsp" %>
</body>
</html>
