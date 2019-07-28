//java package (trishna146)
package com.maren.Pro1.controller;
//import class (trishna146)
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigCtrl
 */
@WebServlet(
		urlPatterns= { "/ConfigCtrl" } ,
		initParams= {
				//initialization of parameters (trishna146)
				@WebInitParam(name="UNIV",value="CUTM"),
				@WebInitParam(name="LOC",value="BBSR")

		})
public class ConfigCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig config=getServletConfig();
		String univ=config.getInitParameter("UNIV");
		String loc=config.getInitParameter("LOC");
		//for print the content (trishna146)
		response.getWriter().append("University is: "+ univ +"at:" +loc);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
