package servlet;

import dao.CommandeDAO;
import dao.IItemDAO;
import modeles.Commande;
import modeles.CommandeGateau;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@WebServlet(name = "AnniversaireServlet", value = "/AnniversaireServlet")
public class AnniversaireServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String dest = "AffCommandeGateau.jsp";






        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String adresse = request.getParameter("adresse");
        String theme = request.getParameter("theme");
        String glacage = request.getParameter("glacage");


        CommandeGateau cmd1 = new CommandeGateau();
        cmd1.setNom(nom);
        cmd1.setPrenom(prenom);
        cmd1.setAdresse(adresse);
        cmd1.setTheme(theme);
        cmd1.setGlacage(glacage);

        int prix = 10;//frais de livraison

        int[] listePrix ={25,20,7,5};

        if (cmd1.getTheme().equals("spiderman")){
            prix = prix + listePrix[0];
            request.setAttribute("prixTheme", listePrix[0]);
        }else {
            prix = prix + listePrix[1];
            request.setAttribute("prixTheme", listePrix[1]);
        }

        if (cmd1.getGlacage().equals("chocolat")){
            prix = prix + listePrix[2];
            request.setAttribute("prixGlacage", listePrix[2]);
        }else if (cmd1.getGlacage().equals("vanille")){
            prix = prix + listePrix[3];
            request.setAttribute("prixGlacage", listePrix[3]);
        }


        cmd1.setPrix(prix);



        LocalDate todaysDate = LocalDate.now();
        request.setAttribute("date", todaysDate);






        request.setAttribute("commande", cmd1);

        RequestDispatcher disp = request.getRequestDispatcher(dest);
        disp.forward(request, response);
    }
}
