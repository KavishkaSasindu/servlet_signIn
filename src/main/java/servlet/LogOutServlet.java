package servlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/delete")
public class LogOutServlet extends HttpServlet{
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
        HttpSession session  = request.getSession(false);
        if(session!=null){
            session.removeAttribute("userEmail");
            session.invalidate();
            response.sendRedirect("signIn.jsp");
        }else{
            System.out.println("Error");
        }
    }
}
