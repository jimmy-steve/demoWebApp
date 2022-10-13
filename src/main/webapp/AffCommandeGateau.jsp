<%--
  Created by IntelliJ IDEA.
  User: lafon
  Date: 2022-08-19
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CommandeGateau</title>
    <%@include file="/includes/head.jsp" %>
</head>
<body>
<%@include file="/includes/navbar.jsp" %>

<h1>Vous êtes dans la JSP du gateau d'anniversaire</h1>

<div class="card-header my-3 bg-dark text-light">Voici votre commande</div>
<div class="col-10">
    <table class="table table-striped table-hover">


        <thead>
        <tr>
            <th>Nom</th>
            <th>Prenom</th>
            <th>Adresse</th>
            <th>Le thème</th>
            <th>Le glacage</th>
            <th>Le Prix (inclus 10 $ de livraison)</th>
        </tr>
        </thead>
        <tbody>

        <tr>
            <form action="" method="post">
                <td>
                    <input type="text" name="nom" value="${commande.nom}"/>
                </td>
                <td><input type="text" name="prenom" value="${commande.prenom}"/></td>
                <td><input type="text" name="adresse" value="${commande.adresse}"/></td>
                <td><input type="text" name="theme" value="${commande.theme}"/></td>
                <td><input type="text" name="theme" value="${commande.glacage}"/></td>
                <td><input type="number" name="theme" value="${commande.prix}"/></td>


                <td>
                    <input class="btn btn-primary " type="submit" value="Sauvegarder"/>
                </td>
            </form>
        </tr>
        </tbody>


    </table>
</div>


<br>

<div class="container">
    <div col-4>


        <div class="card">
            <div class="card-body mx-4">
                <div class="container">
                    <p class="my-5 mx-5" style="font-size: 30px;">Thank for your purchase</p>
                    <div class="row">
                        <ul class="list-unstyled">
                            <li class="text-black">${commande.prenom} ${commande.nom}</li>
                            <li class="text-muted mt-1">${commande.adresse}</li>
                            <li class="text-black mt-1"><%=request.getAttribute("date")%></li>
                        </ul>
                    </div>


                    <div class="row">
                        <div class="col-xl-10">
                            <p>Gateau : ${commande.theme}</p>
                        </div>
                        <div class="col-xl-2">
                            <p class="float-end">$ <%=request.getAttribute("prixTheme")%>.00
                            </p>
                        </div>
                        <hr>
                    </div>
                    <div class="row">
                        <div class="col-xl-10">
                            <p>Glaçage : ${commande.glacage}</p>
                        </div>
                        <div class="col-xl-2">
                            <p class="float-end">$ <%=request.getAttribute("prixGlacage")%>.00
                            </p>
                        </div>
                        <hr>
                    </div>
                    <div class="row">
                        <div class="col-xl-10">
                            <p>Frais Livraison</p>
                        </div>
                        <div class="col-xl-2">
                            <p class="float-end">$10.00
                            </p>
                        </div>
                        <hr style="border: 2px solid black;">
                    </div>
                    <div class="row text-black">

                        <div class="col-xl-12">
                            <p class="float-end fw-bold">Total dû : ${commande.prix}
                            </p>
                        </div>
                        <hr style="border: 2px solid black;">
                    </div>

                </div>
            </div>
        </div>


    </div>

</div>
<br>


<%@include file="/includes/footer.jsp" %>
</body>
</html>
