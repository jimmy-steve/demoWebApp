<%--
  Created by IntelliJ IDEA.
  User: lafon
  Date: 2022-08-16
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/includes/head.jsp" %>
</head>
<body>
<%@include file="/includes/navbar.jsp"%>


<br>

<div class="alert alert-success container" role="alert">
    <h3 style="color: green">Ajouter un élément par table.....</h3>
</div>
<br>

<div class="container-fluid " style="width: 80%; margin-left: auto; margin-right: auto">
    <div class="card-header my-3 bg-dark text-light">Ajouter un client</div>


    <div class="col-10">
        <table class="table table-striped table-hover">


            <thead>
            <tr>
                <th>Numéro client</th>
                <th>Nom Client</th>
                <th>Numéro de téléphone</th>
                <th>Action</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>

            <tr>
                <form action="SauvevardeServlet" method="post">
                    <td>
                        <input type="number" name="noClient" value="${client.noClient}"/>
                    </td>
                    <td><input type="text" name="nomClient" value="${client.nomClient}"/></td>
                    <td><input type="text" name="noTelephone" value="${client.noTelephone}"/></td>
                    <td></td>
                    <td>
                        <input class="btn btn-primary " type="submit" value="Insérer"/>
                    </td>
                </form>
            </tr>
            </tbody>


        </table>
    </div>


    <div class="card-header my-3 bg-dark text-light">Ajouter un article</div>
    <div class="col-10">
        <table class="table table-striped table-hover">


            <thead>
            <tr>
                <th>Numéro article</th>
                <th>Description</th>
                <th>Prix Unitaire</th>
                <th>Quantite</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>

            <tr>
                <form action="SaveArticleServlet" method="post">
                    <td>
                        <input type="number" name="noArticle" value="${article.noArticle}"/>
                    </td>
                    <td><input type="text" name="description" value="${article.description}"/></td>
                    <td><input type="number" name="prixUnitaire" value="${article.prixUnitaire}"/></td>
                    <td><input type="number" name="quantite" value="${article.quantite}"/></td>
                    <td>
                        <input class="btn btn-primary " type="submit" value="Insérer"/>
                    </td>
                </form>
            </tr>
            </tbody>


        </table>
    </div>


    <div class="card-header my-3 bg-dark text-light">Ajouter une commande</div>
    <div class="col-10">
        <table class="table table-striped table-hover col-10">


            <thead>
            <tr>
                <th>Numéro Commande</th>
                <th>Date de commande</th>
                <th>Numéro de client</th>
                <th>Numéro de l'article</th>
                <th>Quantité</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>

            <tr>
                <form action="SaveCommandeServlet" method="post">
                    <td>
                        <input type="number" name="noCommande" value="${cmd.noCommande}"/>
                    </td>
                    <td><input type="text" name="dateCommande" value="${cmd.dateCommande}"/></td>
                    <td><input type="number" name="noClient" value="${cmd.noClient}"/></td>
                    <td><input type="number" name="noArticle" value="${lc.noArticle}"/></td>
                    <td><input type="number" name="quantite" value="${lc.quantite}"/></td>


                    <td>
                        <input class="btn btn-primary " type="submit" value="Insérer"/>
                    </td>
                </form>
            </tr>
            </tbody>


        </table>
    </div>


    <div class="card-header my-3 bg-dark text-light">Ajouter une Livraison</div>
    <div class="col-10">
        <table class="table table-striped table-hover">


            <thead>
            <tr>
                <th>Numéro de Livraison</th>
                <th>Date de Livraision</th>
                <th>Numéro de commande</th>
                <th>Numéro de l'article</th>
                <th>Quantitée livrée</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>

            <tr>
                <form action="SaveLivraisonServlet" method="post">
                    <td><input type="number" name="noLivraison" value="${livraison.noLivraison}"/></td>
                    <td><input type="text" name="dateLivraison" value="${livraison.dateLivraison}"/></td>
                    <td><input type="number" name="noCommande" value="${detailLivraison.noCommande}"/></td>
                    <td><input type="number" name="noArticle" value="${detailLivraison.noArticle}"/></td>
                    <td><input type="number" name="quantiteLivrer" value="${detailLivraison.quantiteLivrer}"/></td>
                    <td><input class="btn btn-primary " type="submit" value="Insérer"/></td>
                </form>
            </tr>
            </tbody>


        </table>
    </div>
    <br>
    <br>


</div>


<%@include file="/includes/footer.jsp"%>
</body>
</html>
