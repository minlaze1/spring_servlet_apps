package com.saraya.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/addPhone.do")
public class AddPhone extends HttpServlet{

PhoneService ps=new PhoneService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException,ServletException{
		
		request.getRequestDispatcher("/WEB-INF/views/addPhone.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException,ServletException{
		
		int year = Integer.parseInt(request.getParameter("yr"));
		String make = request.getParameter("mk");
		String model = request.getParameter("md");
		String color=request.getParameter("cl");
		String image = request.getParameter("im");
		ps.addPhone(year,make,model,color,image);

		request.getRequestDispatcher("/WEB-INF/views/addPhone.jsp").forward(request, response);
		
	}
}
