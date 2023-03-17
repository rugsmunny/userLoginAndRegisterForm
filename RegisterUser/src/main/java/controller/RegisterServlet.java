package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.User;

import java.io.IOException;

@WebServlet(name = "RegisterServlet", value = "/register-servlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("We are inside register servlet, delete user");


        User temp = new User( ((User) request.getSession().getAttribute("user")).getUserName(),
                ((User) request.getSession().getAttribute("user")).getUserPassword());
        new User().removeUser(temp);
        System.out.println("User has been removed");
        request.setAttribute("registerMessage", "Account has been deleted. Bye!");
        HttpSession session = request.getSession();
        session.invalidate();
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        requestDispatcher.include(request, response);
        requestDispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("We are inside register servlet, register new user");
        new User(request.getParameter("firstName"), request.getParameter("lastName"), request.getParameter("psw"), request.getParameter("email")).registerNewUser();
        request.setAttribute("registerMessage", "Account has been created. Try to log in.");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        requestDispatcher.include(request, response);
        requestDispatcher.forward(request, response);


    }
}
