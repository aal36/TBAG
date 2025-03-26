package edu.ycp.cs320.lab02.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	//CHAT GPT
        // Get the action parameter from the form submission
        String action = req.getParameter("action");

        if ("add".equals(action)) {
            // Forward to AddNumbersServlet
            req.getRequestDispatcher("/addNumbers").forward(req, resp);
        } else if ("multiply".equals(action)) {
            // Forward to MultiplyNumbersServlet
            req.getRequestDispatcher("/multiplyNumbers").forward(req, resp);
        } else if ("guess".equals(action)) {
            // Forward to GuessingGameServlet
            req.getRequestDispatcher("/guessingGame").forward(req, resp);
        } else {
            // Default: forward to the index.jsp
            req.getRequestDispatcher("/_view/index.jsp").forward(req, resp);
        }
    }
}