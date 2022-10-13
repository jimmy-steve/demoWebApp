package servlet;

import dao.CommandeDAO;
import dao.LigneCommandeDAO;
import modeles.Commande;
import modeles.LigneCommande;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SaveLigneCommandeServlet", value = "/SaveLigneCommandeServlet")
public class SaveLigneCommandeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int noCommande = Integer.parseInt(request.getParameter("noCommande"));
        int noArticle = Integer.parseInt(request.getParameter("noArticle"));
        int quantite = Integer.parseInt(request.getParameter("quantite"));


        String dest = "ConfirmLigneCommande.jsp";
        LigneCommande ligneCommande = new LigneCommande(noCommande, noArticle, quantite);



        LigneCommandeDAO ligneCommandeDao = new LigneCommandeDAO();
        ligneCommandeDao.insert(ligneCommande);

        request.setAttribute("ligneCommande",ligneCommande);

        RequestDispatcher disp = request.getRequestDispatcher(dest);
        disp.forward(request, response);

    }
}
