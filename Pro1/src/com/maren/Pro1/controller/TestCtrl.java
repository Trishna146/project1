//java package (trishna146)
package com.maren.Pro1.controller;
//import classes (trishna146)
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TestCtrl
 */
@WebServlet("/TestCtrl")
public class TestCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//set values (trishna146)
	request.setAttribute("REQ", "Request Scope");
	//get session has access to doget and dopost method and set the value of session,request,application (trishna146)
	HttpSession session=request.getSession();
	session.setAttribute("SES","Session Scope");
	ServletContext context= getServletContext();
	context.setAttribute("APP", "Application Scope");
	//disparthing the request to another resource (trishna146)
	RequestDispatcher rd=request.getRequestDispatcher("/ScopeCtrl");
	rd.forward(request, response);
	
	}

}
