package musclerecoverywebserver.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import musclerecoverywebserver.model.Tbluser;
import musclerecoverywebserver.service.Login;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
    	
    	String emailaddress = request.getParameter("emailaddress");
    	String password = request.getParameter("password");
    	Login login = new Login();
    	boolean result = login.checkLoginCredentials(emailaddress, password);
    	Tbluser user = login.getUserByMailAddress(emailaddress);
    	if(result == true){
    		request.getSession().setAttribute("user", user);
    		response.sendRedirect("MuscleRecovery_Home.jsp");
    	}
    	else{
    		response.sendRedirect("MuscleRecovery_Login.jsp");
    	}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
