package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckLogin
 */
@WebServlet(name = "checklogin", urlPatterns = { "/checklogin" })
public class CheckLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CheckLogin() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String user = request.getParameter("username");
		String password = request.getParameter("password");
		LoginBean lb = new LoginBean();
		lb.setName(user);
		lb.setPassword(password);
		
		request.setAttribute("bean", lb);
		
		boolean status = lb.validate();
		
		System.out.println(lb.getName());
		System.out.println(lb.getPassword());
		System.out.println(status);
		
		if(status)
		{
			RequestDispatcher rd = request.getRequestDispatcher("login-success.jsp");
			rd.forward(request, response);
		}
		
		else 
		{
			out.println("Login Failed");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
		}
		out.close();
	}

}
