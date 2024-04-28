
package com.techsoft;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.techsoft.DAO.UserDAO;
import com.techsoft.DTO.UserDTO;
/**
 *
 * @author dell
 */
@WebServlet(name = "UserloginServlet", urlPatterns = {"/UserloginServlet"})
public class UserloginServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String name = request.getParameter("name");
         String email=request.getParameter("email");       
        String password=request.getParameter("password");
     
        UserDAO userDAO = new UserDAO();
        HttpSession session=request.getSession();
      UserDTO user = userDAO.loginCheck(name,email, password);
  
        //System.out.println(user);
           if (user.getId() != 0) {
               session.setAttribute("login",user);
            response.sendRedirect("welcome.jsp"); // 
         
        } else {
            session.setAttribute("error","Inavlid Id and Password");
            response.sendRedirect("userlogin.jsp"); // 
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
