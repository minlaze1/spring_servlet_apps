package com.saraya.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/addYacht.do")
public class AddYacht extends HttpServlet {

YachtService ys=new YachtService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException,ServletException{
		
		request.getRequestDispatcher("/WEB-INF/views/addYacht.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException,ServletException{
		
		int year = Integer.parseInt(request.getParameter("yr"));
		String make = request.getParameter("mk");
		String model = request.getParameter("md");
		float length=Float.parseFloat(request.getParameter("ln"));
		String image = request.getParameter("im");
		ys.addYacht(year,make,model,length,image);

		request.getRequestDispatcher("/WEB-INF/views/addYacht.jsp").forward(request, response);
		
	}
}
