package com.saraya.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/addWatch.do")
public class AddWatch extends HttpServlet{

WatchService ws=new WatchService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException,ServletException{
		
		request.getRequestDispatcher("/WEB-INF/views/addWatch.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException,ServletException{
		
		int year = Integer.parseInt(request.getParameter("yr"));
		String brand = request.getParameter("bd");
		String model = request.getParameter("md");
		String image = request.getParameter("im");
		ws.addWatch(year,brand,model,image);

		request.getRequestDispatcher("/WEB-INF/views/addWatch.jsp").forward(request, response);
		
	}
}
