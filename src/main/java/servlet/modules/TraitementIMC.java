package servlet.modules;

import modeles.module.Candidat;
import utilitaire.CalculateurIMC;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TraitementIMC", value = "/TraitementIMC")
public class TraitementIMC extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            Candidat candidat = new Candidat();

            String nom = request.getParameter("nom");
            double taille = Double.parseDouble(request.getParameter("taille"));
            double poids = Double.parseDouble(request.getParameter("poids"));
            candidat.setTaille(taille);
            candidat.setPoids(poids);
            candidat.setNom(nom);

            double imc1 = CalculateurIMC.calculerImc(candidat);
            String risque = CalculateurIMC.calculeRisque(imc1);
            candidat.setImc1(imc1);



            request.setAttribute("risque", risque);
            request.setAttribute("candidat", candidat);

            RequestDispatcher disp = getServletContext().getRequestDispatcher("/AffImc.jsp");
            disp.forward(request, response);

        } catch (NumberFormatException e) {
            System.out.println("erreur");
            RequestDispatcher disp = getServletContext().getRequestDispatcher("/erreur.jsp");

            disp.forward(request, response);
        }
    }
}
