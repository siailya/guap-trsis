package ru.siailya.carsales.servlets;

import ru.siailya.carsales.servlets.ViewCarsServlet.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@WebServlet(name = "AddCarServlet", urlPatterns = "/cars/add")
public class AddCarServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/static/add.html")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String model = req.getParameter("model");
        int year = Integer.parseInt(req.getParameter("year"));
        String id = UUID.randomUUID().toString();

        ViewCarsServlet.getCars().add(new Car(id, model, year));
        resp.sendRedirect(req.getContextPath() + "/cars/view");
    }
}
