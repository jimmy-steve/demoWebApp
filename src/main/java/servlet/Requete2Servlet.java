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

@WebServlet(name = "Requete2Servlet", value = "/Requete2Servlet")
public class Requete2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String dest = "Requete.jsp";


        IItemDAO clientDao = new ClientDAO();



        List<Client> listeClients =  clientDao.select2();




        request.setAttribute("listeClients", listeClients);

        RequestDispatcher disp = request.getRequestDispatcher(dest);
        disp.forward(request, response);
    }
}
