package servlet;

import dao.ArticleDAO;
import dao.IItemDAO;
import modeles.Article;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Requete4Servlet", value = "/Requete4Servlet")
public class Requete4Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String dest = "Requete.jsp";


        IItemDAO articleDao = new ArticleDAO();



        List<Article> listeArticles = articleDao.select4();




        request.setAttribute("listeArticles", listeArticles);

        RequestDispatcher disp = request.getRequestDispatcher(dest);
        disp.forward(request, response);
    }
}
