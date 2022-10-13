<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container">
        <a class="navbar-brand" href="index.jsp">Jimmy-steve</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse"
                data-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false"
                aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ml-auto">


                <li class="nav-item">
                    <form action="hello-servlet" name="forms1" method="get">
                        <div class="text-center">
                            <input class=" btn btn-primary " style="margin-right: 10px" type="submit" value="AjouterClient"/>
                        </div>
                    </form>
                </li>
                <li class="nav-item">
                    <form action="ClientServlet" name="forms2" method="get">
                        <div class="text-center">
                            <input class=" btn btn-primary " style="margin-right: 10px" type="submit" value="Ajouter"/>
                        </div>
                    </form>
                </li>
                <li class="nav-item">
                    <form action="ListDeClientServlet" name="forms5" method="get">
                        <div class="text-center">
                            <input class=" btn btn-primary " style="margin-right: 10px" type="submit" value="Afficher Liste"/>
                        </div>
                    </form>
                </li>

                <li class="nav-item">
                    <form action="CatalogueArticleServlet" name="forms5" method="post">
                        <div class="text-center">
                            <input class=" btn btn-primary " style="margin-right: 10px" type="submit" value="Afficher Catalogue"/>
                        </div>
                    </form>
                </li>


                <li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="new.jsp">NEW</a></li>
                <li class="nav-item"><a class="nav-link" href="Requete.jsp">Requete</a></li>

                <li class="nav-item"><a class="nav-link btn btn-dark text-light" href="FormulaireConnexion.jsp">Login</a></li>

            </ul>
        </div>
    </div>
</nav>
