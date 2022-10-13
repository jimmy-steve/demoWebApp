package servlet;

import modeles.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ClientServlet", value = "/ClientServlet")
public class AjouterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String dest = "AjouterElement.jsp";
        Client client = new Client(300, "Roger Chouinard", "(514)123-2345)");
        Article article = new Article(3, "Du Tilleul", 75.33, 12);

        Commande commande = new Commande(99, "2010-08-01", 40);
        LigneCommande ligneCommande = new LigneCommande(99, 10, 4);


        Livraison livraison = new Livraison(106, "2020-01-01");
        DetailLivraison detailLivraison = new DetailLivraison(106, 5, 10, 4);


        request.setAttribute("livraison", livraison);
        request.setAttribute("detailLivraison", detailLivraison);

        request.setAttribute("lc", ligneCommande);
        request.setAttribute("cmd", commande);

        request.setAttribute("article", article);
        request.setAttribute("client", client);

        RequestDispatcher disp = request.getRequestDispatcher(dest);
        disp.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String dest = "AjouterElement.jsp";
        Client client = new Client(300, "Roger Chouinard", "(514)123-2345)");


        request.setAttribute("client", client);

        RequestDispatcher disp = request.getRequestDispatcher(dest);
        disp.forward(request, response);
    }
}
