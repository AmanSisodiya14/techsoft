/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techsoft;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.techsoft.DAO.UserDAO;
import com.techsoft.DTO.UserDTO;
/**
 *
 * @author dell
 */
@WebServlet(name = "UserregisterServlet", urlPatterns = {"/UserregisterServlet"})
public class UserregisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String name = request.getParameter("name");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
               
                String phone = request.getParameter("phone");
              String gender=request.getParameter("gender");
                String qualification = request.getParameter("qualification");
               
                String domain = request.getParameter("domain");
                String date=request.getParameter("date");
                String password=request.getParameter("password");
               
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";
                
                      UserDTO userdto=new UserDTO();
                 userdto.setName(name);
              userdto.setAddress(address);
              userdto.setEmail(email);
              userdto.setPhone(phone);
            userdto.setQualification(qualification);
              userdto.setGender(gender);
             
             
              userdto.setDomain(domain);
                 userdto.setDate(date);
              userdto.setPassword(password);
              
              
              UserDAO userdao=new UserDAO();
              System.out.println(userdto);
              int i = userdao.UserRegister(userdto);

				System.out.println("i");
				if (i< 0) {
					response.sendRedirect("userregistration.jsp");
				} else {
					response.sendRedirect("userlogin.jsp");
				}

                
                 
               
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
