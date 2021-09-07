package com.saraya.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet {
	UserValidation Uv= new UserValidation();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException,ServletException{
		
		String usr=request.getParameter("username");
		String pw=request.getParameter("password");
		
		boolean validation=Uv.isValid(usr, pw);
		
		if(validation) {
			
			request.getSession().setAttribute("username",usr);
			request.getSession().setAttribute("pass",pw);
		
			
			response.sendRedirect("/watch.do");
		}
		else {

			request.setAttribute("errorMessage","Sorry wrong credential");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
		}
	}
	
	
	
}
