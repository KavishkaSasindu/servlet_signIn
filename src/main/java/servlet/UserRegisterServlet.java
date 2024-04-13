package servlet;
import dao.UserDao;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import model.UserModel;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

@WebServlet("/register")
public class UserRegisterServlet extends HttpServlet{
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
        try{
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String password_1 = request.getParameter("password-1");

            UserModel userModel = new UserModel();

            userModel.setName(name);
            userModel.setEmail(email);
            if(Objects.equals(password, password_1)){
                userModel.setPassword(password);
            }else{
                System.out.println("passwords do not match");
            }

            UserDao userDao = new UserDao();
            boolean success = userDao.addUser(userModel);

            if(success){
                response.sendRedirect("signIn.jsp");
                System.out.println(userModel.getEmail());
            }else{
                response.sendRedirect("index.jsp");
                System.out.println("user not register");
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
