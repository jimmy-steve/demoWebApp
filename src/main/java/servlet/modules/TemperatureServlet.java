package servlet.modules;

import modeles.module.Temperature;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TemperatureServlet", value = "/TemperatureServlet")
public class TemperatureServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try {

            double temp = Double.parseDouble(request.getParameter("temp"));
            String choix = request.getParameter("choix");


            if (choix.equals("celcius")) {


                Temperature t = new Temperature();
                t.setCelcsius(temp);

                double val1 =  t.Celcius_to_Fahrenheit(temp);
                t.setFahr(val1);

                request.setAttribute("valF", val1);
            } else {


                Temperature t = new Temperature();

                t.setFahr(temp);
                double val2 = t.Fahrenheit_to_Celcius(temp);
                t.setCelcsius(val2);

                request.setAttribute("valG", val2);
            }



            RequestDispatcher disp = getServletContext().getRequestDispatcher("/afficherTemp.jsp");
            disp.forward(request, response);
        } catch (NumberFormatException e) {
            RequestDispatcher disp = getServletContext().getRequestDispatcher("/erreur.jsp");

            disp.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
