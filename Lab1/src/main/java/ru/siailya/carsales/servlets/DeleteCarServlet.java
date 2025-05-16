package ru.siailya.carsales.servlets;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteCarServlet", urlPatterns = "/cars/delete")
public class DeleteCarServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        String id = req.getParameter("id");
        ViewCarsServlet.getCars().removeIf(car -> car.getId().equals(id));
        resp.sendRedirect(req.getContextPath() + "/cars/view");
    }
}

