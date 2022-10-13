package servlet;

import dao.ArticleDAO;
import dao.CommandeDAO;
import dao.LigneCommandeDAO;
import modeles.Article;
import modeles.Commande;
import modeles.LigneCommande;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SaveCommandeServlet", value = "/SaveCommandeServlet")
public class SaveCommandeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int noCommande = Integer.parseInt(request.getParameter("noCommande"));
        String dateCommande = request.getParameter("dateCommande");
        int noClient = Integer.parseInt(request.getParameter("noClient"));

        int noArticle = Integer.parseInt(request.getParameter("noArticle"));
        int quantite = Integer.parseInt(request.getParameter("quantite"));

        String dest = "ConfirmCommande.jsp";
        Commande cmd = new Commande(noCommande, dateCommande, noClient);
        LigneCommande ligneCommande = new LigneCommande(noCommande, noArticle, quantite);

        CommandeDAO commandeDao = new CommandeDAO();
        commandeDao.insert(cmd);

        LigneCommandeDAO ligneCommandeDao = new LigneCommandeDAO();
        ligneCommandeDao.insert(ligneCommande);



        request.setAttribute("ligneCommande",ligneCommande);
        request.setAttribute("cmd",cmd);

        RequestDispatcher disp = request.getRequestDispatcher(dest);
        disp.forward(request, response);

    }
}
