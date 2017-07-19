import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
    
    }

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			//String username = request.getParameter("username");
			String password = request.getParameter("password");
			 if(password.equals("rohang"))
			 {
				 RequestDispatcher rd = request.getRequestDispatcher("/welcome");
				 rd.forward(request, response);
			 }
			 else{
				 
				 out.println("Sorry wrong password");
				 RequestDispatcher rd = request.getRequestDispatcher("/NewFile.html");
				 rd.include(request, response);
			 }
	}

}
