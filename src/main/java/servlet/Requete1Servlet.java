package servlet;

import dao.ClientDAO;
import dao.CommandeDAO;
import dao.IItemDAO;
import modeles.Client;
import modeles.Commande;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Requete1Servlet", value = "/Requete1Servlet")
public class Requete1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String dest = "Requete.jsp";

        IItemDAO commandeDao = new CommandeDAO();

        List<Commande> listeCommandes =  commandeDao.select();

        request.setAttribute("liste", listeCommandes);

        RequestDispatcher disp = request.getRequestDispatcher(dest);
        disp.forward(request, response);
    }
}
