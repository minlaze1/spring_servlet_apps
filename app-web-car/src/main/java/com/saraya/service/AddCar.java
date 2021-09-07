package com.saraya.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/addCar.do")
public class AddCar extends HttpServlet{

	CarService cs=new CarService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException,ServletException{
		
		request.getRequestDispatcher("/WEB-INF/views/addCar.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException,ServletException{
		int year = Integer.parseInt(request.getParameter("yr"));
		String make = request.getParameter("mk");
		String model = request.getParameter("md");
		String image = request.getParameter("im");
		cs.addCar(year,make,model,image);

		request.getRequestDispatcher("/WEB-INF/views/addCar.jsp").forward(request, response);
		
	}
}
