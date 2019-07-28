//java package (trishna146)
package com.maren.Pro1.controller;
//import classes (trishna146)
import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherController
 */
@WebServlet("/DispatcherController")
public class DispatcherController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//dispatching the request to another resource (trishna146) (trishna146)
		RequestDispatcher  dispature= request.getRequestDispatcher("/ConfigCtrl");
		dispature.forward(request, response);
	}

}
