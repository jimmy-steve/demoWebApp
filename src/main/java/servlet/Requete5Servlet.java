package servlet;

import dao.CommandeDAO;
import dao.IItemDAO;
import modeles.Commande;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Requete5Servlet", value = "/Requete5Servlet")
public class Requete5Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String dest = "Requete.jsp";

        IItemDAO commandeDao = new CommandeDAO();

        List<Commande> listeCommandes =  commandeDao.select5();

        request.setAttribute("liste5", listeCommandes);

        RequestDispatcher disp = request.getRequestDispatcher(dest);
        disp.forward(request, response);
    }
}
