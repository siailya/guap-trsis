package ru.siailya.carsales.servlets;

import lombok.Data;
import lombok.Getter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet(name = "ViewCarsServlet", urlPatterns = "/cars/view")
public class ViewCarsServlet extends HttpServlet {
    @Getter
    private static final List<Car> cars = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.setContentType("text/html;charset=UTF-8");

        String template;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                getServletContext().getResourceAsStream("/static/view.html"),
                StandardCharsets.UTF_8))) {
            template = reader.lines().collect(Collectors.joining("\n"));
        }

        StringBuilder rows = new StringBuilder();
        for (Car car : getCars()) {
            rows.append("<tr>")
                    .append("<td>").append(car.getId()).append("</td>")
                    .append("<td>").append(car.getModel()).append("</td>")
                    .append("<td>").append(car.getYear()).append("</td>")
                    .append("</tr>\n");
        }

        String page = template.replace("<!--CAR_ROWS-->", rows.toString());

        resp.getWriter().write(page);
    }

    @Data
    public static class Car {
        private final String id;
        private final String model;
        private final int year;
    }
}
