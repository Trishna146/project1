//java package (trishna146)
package com.maren.Pro1.controller;
//import classes (trishna146)

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maren.Pro1.dao.ProfileDao;


@WebServlet("/profileSaveCtrl")
public class ProfileSaveCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//create new object profile (trishna146)
		Profile profile = new Profile();
		//set methode to set value get method to get value (trishna146)
		profile.setUserid(request.getParameter("userid"));
		profile.setName(request.getParameter("name"));
		profile.setEmail(request.getParameter("email"));
		profile.setMobile(Long.parseLong(request.getParameter("mobile")));
		// save in database
		int res = new ProfileDao().save(profile);
		request.setAttribute("RES", res);//set the attribute (trishna146)
		//for disparching the request to another resource (trishna146)
		request.getRequestDispatcher("/ProfileViewCtrl").forward(request, response);
	}

}

