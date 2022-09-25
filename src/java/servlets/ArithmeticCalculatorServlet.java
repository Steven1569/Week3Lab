/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Steven
 */
public class ArithmeticCalculatorServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setAttribute("output", "---");
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String firstNumberString = request.getParameter("firstNumber");
        String secondNumberString = request.getParameter("secondNumber");
        String output = "---";
        
        request.setAttribute("firstNumber", firstNumberString);
        request.setAttribute("secondNumber", secondNumberString);
        

        if (firstNumberString.equals("") || firstNumberString == null || secondNumberString.equals("") || secondNumberString == null) {
            output = "invalid"; 
            request.setAttribute("output", output);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        
        int firstNumber = Integer.parseInt(firstNumberString);
        int secondNumber = Integer.parseInt(secondNumberString);
        String operation = request.getParameter("operation");
        
        
        
        if (operation.equals("+")) {
            output = Integer.toString(firstNumber + secondNumber);
        } else if (operation.equals("-")) {
            output = Integer.toString(firstNumber - secondNumber);
        } else if (operation.equals("*")) {
            output = Integer.toString(firstNumber * secondNumber);
        } else if (operation.equals("%")) {
            output = Integer.toString(firstNumber % secondNumber);
        }
        
        request.setAttribute("output", output);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}
