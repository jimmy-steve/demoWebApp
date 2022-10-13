package servlet;

import dao.ArticleDAO;
import dao.ClientDAO;
import dao.IItemDAO;
import modeles.Article;
import modeles.Client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Requete3Servlet", value = "/Requete3Servlet")
public class Requete3Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String dest = "Requete.jsp";


        IItemDAO articleDao = new ArticleDAO();



        List<Article> listeArticles = articleDao.select3();




        request.setAttribute("listeArticles3", listeArticles);

        RequestDispatcher disp = request.getRequestDispatcher(dest);
        disp.forward(request, response);
    }
}
