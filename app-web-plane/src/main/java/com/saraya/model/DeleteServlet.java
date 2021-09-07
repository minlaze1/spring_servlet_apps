package com.saraya.model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.service.PlaneService;



@WebServlet(urlPatterns="/delete.do")
public class DeleteServlet extends HttpServlet {

	PlaneService ps=new PlaneService();
	
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
		throws IOException,ServletException{
			
			int id=Integer.parseInt(request.getParameter("id"));
			ps.deletePlane(id);
			response.sendRedirect("/plane.do ");
			
			}
}
