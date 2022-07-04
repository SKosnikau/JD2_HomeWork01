package by.skosnikov.controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public Controller() {
        super();
    }
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	if(request.getParameter("command01").equals("registration")) {
    		registrationPrint(request,response);
    	} else if(request.getParameter("command01").equals("authentification")){
    		authentificationPrint(request,response);
    	} else {
    		System.out.print("Something went terrably wrong");
    	}
    }
    
    private void registrationPrint(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    	response.getWriter().print("User's name is: " + request.getParameter("name") + "<br/>");
    	response.getWriter().print("User's surname is: " + request.getParameter("surname") + "<br/>");
    	response.getWriter().print(request.getParameter("name") + " " + request.getParameter("surname") + 
    			" date of birth is: " + request.getParameter("birthdate") + "<br/>");
    	response.getWriter().print("Login:" + request.getParameter("login") + "<br/>");
    	response.getWriter().print("Password:" + request.getParameter("password"));
    }
	
    private void authentificationPrint(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    	response.getWriter().print("Login = " + request.getParameter("login") + "<br/>");
		response.getWriter().print("Password = " + request.getParameter("password") + "<br/>");
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}