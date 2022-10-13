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

@WebServlet(name = "SaveArticleServlet", value = "/SaveArticleServlet")
public class SaveArticleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int noArticle = Integer.parseInt(request.getParameter("noArticle"));
        String description = request.getParameter("description");
        double prixUnitaire = Double.parseDouble(request.getParameter("prixUnitaire"));
        int quantite = Integer.parseInt(request.getParameter("quantite"));
        String dest = "Confirm.jsp";
        Article art = new Article(noArticle, description, prixUnitaire, quantite);



        ArticleDAO articleDao = new ArticleDAO();
        articleDao.insert(art);

        request.setAttribute("article",art);

        RequestDispatcher disp = request.getRequestDispatcher(dest);
        disp.forward(request, response);
    }
}
