package servlet;

import modeles.Article;
import modeles.module.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ConnexionServlet", value = "/ConnexionServlet")
public class ConnexionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String dest;
        User admin = new User("Francis", "1234");

        String nom = request.getParameter("nom");
        String motDePasse = request.getParameter("motDePasse");

        User user = new User(nom, motDePasse);

        request.setAttribute("user", user);

        if (user.getNom().equals(admin.getNom()) && user.getMotDePasse().equals(admin.getMotDePasse())) {

            dest = "WEB-INF/Connecter.jsp";
        } else {
            dest = "WEB-INF/erreur.jsp";
        }

        RequestDispatcher disp = request.getRequestDispatcher(dest);
        disp.forward(request, response);
    }
}
