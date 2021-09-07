package com.saraya.model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.service.PlaneService;

@WebServlet(urlPatterns="/plane.do")
public class PlaneServlet extends HttpServlet{

PlaneService ps=new PlaneService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException,ServletException{
		request.setAttribute("planes", ps.getAllPlanes());
		request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException,ServletException{
		int year = Integer.parseInt(request.getParameter("yr"));
		String make = request.getParameter("mk");
		String model = request.getParameter("md");
		float length=Float.parseFloat(request.getParameter("ln"));
		String image = request.getParameter("im");
		ps.addPlane(year,make,model,length,image);
		
		response.sendRedirect("/plane.do");
	}

}
