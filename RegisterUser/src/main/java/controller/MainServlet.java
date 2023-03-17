package controller;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.User;


@WebServlet(name = "MainServlet", value = "/main-servlet")
public class MainServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
            doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        User temp = new User(request.getParameter("userName"), request.getParameter("password"));
        System.out.println(temp.getUserName() + " " + temp.getUserPassword() + " is user valid? = " + temp.isUserLogInInputValid(temp));
        if (new User().isUserLogInInputValid(temp)){
            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("user", temp);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("View/main.jsp");
            requestDispatcher.forward(request, response);

        } else {
            RequestDispatcher dispatcher = getServletContext()
                    .getRequestDispatcher("/index.jsp");
            request.setAttribute("errorMessage", "Username - Password error!");
            dispatcher.include(request, response);
            dispatcher.forward(request, response);
        }

    }

    public void destroy() {
    }
}