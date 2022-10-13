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

@WebServlet(name = "CatalogueArticleServlet", value = "/CatalogueArticleServlet")
public class CatalogueArticleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String dest = "AffCatalogueArticle.jsp";

        Article ar = new Article();
        IItemDAO articleDao = new ArticleDAO();
        List<Article> listeArticles =  articleDao.getAllArticles(ar);



        request.setAttribute("listeArticles", listeArticles);

        RequestDispatcher disp = request.getRequestDispatcher(dest);
        disp.forward(request, response);
    }
}
