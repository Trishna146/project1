// ProfileView (trishna146)
package com.maren.Pro1.controller;
//import classes (trishna146)
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maren.Pro1.dao.ProfileDao;

/**
 * Servlet implementation class ProfileViewCtrl
 */
@WebServlet("/ProfileViewCtrl")
public class ProfileViewCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;      

protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	//request to get value (trishna146)
	int res = (int) request.getAttribute("RES");
	//add cast to int (trishna146)
	PrintWriter out = response.getWriter();
	if (res == 0)//set business logic (trishna146)
		//for output (trishna146)
		out.println("There is some problem ;  Try again .");
	else
		out.println("Data Successfully inserted");
	
	out.print(" <br/> The Datas are");
	List<Profile> list = new ProfileDao().fetchAll();//fetch all the remaining row in the result set (trishna146)
	for (Iterator iterator = list.iterator(); iterator.hasNext();) {//iterator enable the programmer to traverse a container perticural list (trishna146)
		Profile profile = (Profile) iterator.next();
		out.println("Name : "+ profile.getName() +" Userid : "+ profile.getUserid()+ "mobile "+ profile.getMobile());
	}
	

}

protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	doGet(request, response);
}

}
