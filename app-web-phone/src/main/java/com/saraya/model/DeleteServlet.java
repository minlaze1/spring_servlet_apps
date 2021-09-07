package com.saraya.model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.service.PhoneService;



@WebServlet(urlPatterns="/delete.do")
public class DeleteServlet extends HttpServlet {

	PhoneService ps=new PhoneService();
	
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
		throws IOException,ServletException{
			
			int id=Integer.parseInt(request.getParameter("id"));
			ps.deletePhone(id);
			response.sendRedirect("/phone.do ");
			
			}
}
