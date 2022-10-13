package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CommandeServlet", value = "/CommandeServlet")
public class CommandeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int noCommande = Integer.parseInt(request.getParameter("noCommande"));
        String dateCommande = request.getParameter("dateCommande");
        int noClient = Integer.parseInt(request.getParameter("noClient"));

    }
}
