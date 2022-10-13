package servlet;

import dao.ClientDAO;
import dao.IItemDAO;
import modeles.Client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UpdateClientServlet", value = "/UpdateClientServlet")
public class UpdateClientServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String dest = "Confirmation.jsp";

        int noClient = Integer.parseInt(request.getParameter("noClient"));
        String nomClient = request.getParameter("nomClient");
        String noTelephone = request.getParameter("noTelephone");

        Client cl = new Client(noClient, nomClient, noTelephone);


        IItemDAO clientDao = new ClientDAO();

       clientDao.update(noClient,cl);


        request.setAttribute("client", cl);

        RequestDispatcher disp = request.getRequestDispatcher(dest);
        disp.forward(request, response);
    }
}
