package servlet;

import dao.CommandeDAO;
import dao.DetailLivraisonDAO;
import dao.LivraisonDAO;
import modeles.Commande;
import modeles.DetailLivraison;
import modeles.Livraison;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SaveLivraisonServlet", value = "/SaveLivraisonServlet")
public class SaveLivraisonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int noLivraison = Integer.parseInt(request.getParameter("noLivraison"));
        String dateLivraison = request.getParameter("dateLivraison");

        int noCommande = Integer.parseInt(request.getParameter("noCommande"));
        int noArticle = Integer.parseInt(request.getParameter("noArticle"));
        int quantiteLivrer = Integer.parseInt(request.getParameter("quantiteLivrer"));


        String dest = "ConfirmLivraison.jsp";


        Livraison liv = new Livraison(noLivraison, dateLivraison);
        LivraisonDAO livraisonDao = new LivraisonDAO();
        livraisonDao.insert(liv);


        DetailLivraison detailLivraison = new DetailLivraison(noLivraison, noCommande, noArticle, quantiteLivrer);
        DetailLivraisonDAO detailLivraisonDAO = new DetailLivraisonDAO();
        detailLivraisonDAO.insert(detailLivraison);


        request.setAttribute("detailLivraison", detailLivraison);
        request.setAttribute("liv", liv);

        RequestDispatcher disp = request.getRequestDispatcher(dest);
        disp.forward(request, response);
    }
}
