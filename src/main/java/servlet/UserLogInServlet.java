package servlet;
import dao.UserDao;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpSession;
import model.UserModel;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

@WebServlet("/log")
public class UserLogInServlet extends HttpServlet{
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
        try{
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            UserDao userDao = new UserDao();
            boolean user = userDao.logIn(email,password);

            if(user){
                HttpSession httpSession = request.getSession();
                httpSession.setAttribute("userEmail",email);
                response.sendRedirect("home.jsp");
            }else{
                response.sendRedirect("index.jsp");
            }

        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
