//java package (trishna146)
package com.maren.Pro1.controller;
//import classes (trishna146)
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParametersCtrl
 */
@WebServlet("/ParametersCtrl")
public class ParametersCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request parameter (trishna146)
		String name=request.getParameter("txtName");
		String pass=request.getParameter("pass");
		//return printwriter object that sends character  text to client (trishna146)
		PrintWriter out=response.getWriter();
		//print name and password (trishna146)
		out.print("<b> Name <b>:"+name);
		out.print("<b> Password <b>:"+pass);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
