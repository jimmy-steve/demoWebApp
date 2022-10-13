package servlet;

import dao.ClientDAO;
import dao.IItemDAO;
import modeles.Client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Requete6Servlet", value = "/Requete6Servlet")
public class Requete6Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String dest = "Requete.jsp";


        IItemDAO clientDao = new ClientDAO();



        List<Client> listeClients =  clientDao.select6();




        request.setAttribute("listeClients6", listeClients);

        RequestDispatcher disp = request.getRequestDispatcher(dest);
        disp.forward(request, response);
    }
}
