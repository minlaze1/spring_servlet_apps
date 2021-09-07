package com.saraya.model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.service.WatchService;

@WebServlet(urlPatterns="/watch.do")
public class WatchServlet extends HttpServlet {

WatchService ws=new WatchService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException,ServletException{
		request.setAttribute("watches", ws.getAllWatches());
		request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException,ServletException{
		int year = Integer.parseInt(request.getParameter("yr"));
		String brand = request.getParameter("bd");
		String model = request.getParameter("md");
		String image = request.getParameter("im");
		ws.addWatch(year,brand,model,image);
		
		response.sendRedirect("/watch.do");
	}
}
