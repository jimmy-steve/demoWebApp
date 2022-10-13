package servlet;

import dao.ClientDAO;
import dao.IItemDAO;
import modeles.Client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ListDeClientServlet", value = "/ListDeClientServlet")
public class ListDeClientServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String dest = "AffListeClient.jsp";
//        List maListe = new ArrayList();
//
//        Client client = new Client(300,"Roger Chouinard", "(514)123-2345)");
//        Client client2 = new Client(310,"Lise Martel", "(514)000-6565)");
//        Client client3 = new Client(320,"Martin St-Louis", "(514)999-9898)");
//        Client client4 = new Client(330,"Jonathan Robillard", "(450)123-0000)");
//        Client client5 = new Client(340,"Marcel  Labelle", "(438)162-2225)");
//
//        maListe.add(client);
//        maListe.add(client2);
//        maListe.add(client3);
//        maListe.add(client4);
//        maListe.add(client5);

        Client cl = new Client();
        IItemDAO clientDao = new ClientDAO();
        List<Client> listeClient =  clientDao.getAllClients(cl);





        request.setAttribute("listeClient", listeClient);

        RequestDispatcher disp = request.getRequestDispatcher(dest);
        disp.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
