package com.saraya.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/addPlane.do")
public class AddPlane extends HttpServlet{

PlaneService ps=new PlaneService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException,ServletException{
		
		request.getRequestDispatcher("/WEB-INF/views/addPlane.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException,ServletException{
		
		int year = Integer.parseInt(request.getParameter("yr"));
		String make = request.getParameter("mk");
		String model = request.getParameter("md");
		float length=Float.parseFloat(request.getParameter("ln"));
		String image = request.getParameter("im");
		ps.addPlane(year,make,model,length,image);

		request.getRequestDispatcher("/WEB-INF/views/addPlane.jsp").forward(request, response);
		
	}
}
