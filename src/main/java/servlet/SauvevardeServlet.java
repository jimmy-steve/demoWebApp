package servlet;

import dao.ClientDAO;
import dao.IItemDAO;
import modeles.Client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SauvevardeServlet", value = "/SauvevardeServlet")
public class SauvevardeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int noClient = Integer.parseInt(request.getParameter("noClient"));
        String nomClient = request.getParameter("nomClient");
        String noTelephone = request.getParameter("noTelephone");

        Client cl = new Client(noClient, nomClient, noTelephone);









        IItemDAO clientDao = new ClientDAO();
        clientDao.insert(cl);

        request.setAttribute("client", cl);

        RequestDispatcher disp = request.getRequestDispatcher("Confirmation.jsp");
        disp.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int noClient = Integer.parseInt(request.getParameter("noClient"));
        String nomClient = request.getParameter("nomClient");
        String noTelephone = request.getParameter("noTelephone");

        Client cl = new Client(noClient, nomClient, noTelephone);



            ClientDAO clientDao = new ClientDAO();
            clientDao.insert(cl);

            request.setAttribute("client", cl);

            RequestDispatcher disp = request.getRequestDispatcher("Confirmation.jsp");
            disp.forward(request, response);

    }
}
