package com.example.registrationjspservletjdbcexample.registration.controller;

import com.example.registrationjspservletjdbcexample.registration.dao.EmployeeDAO;
import com.example.registrationjspservletjdbcexample.registration.model.Employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {

    private EmployeeDAO employeeDAO = new EmployeeDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher( "/webapp/employeeregister.jsp");
        dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");

        Employee employee = new Employee();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setUserName(username);
        employee.setPassword(password);
        employee.setAddress(address);
        employee.setContact(contact);

        try {
            employeeDAO.registerEmployee(employee);
        } catch (Exception e){
            e.printStackTrace();
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher( "/employeedetails.jsp");
        dispatcher.forward(request,response);

    }
}
