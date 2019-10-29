package mydoc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PatSignUp")
public class PatSignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pass=request.getParameter("pass");
		String confPass=request.getParameter("confPass");
		if(pass==confPass)
			response.sendRedirect("index.html");
	}

}
