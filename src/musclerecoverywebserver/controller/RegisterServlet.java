package musclerecoverywebserver.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import musclerecoverywebserver.model.Tbluser;
import musclerecoverywebserver.service.Register;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet(name = "RegisterServlet", urlPatterns = { "/RegisterServlet" })
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String emailaddress = request.getParameter("emailaddress");
		String name = request.getParameter("name");
		String firstname = request.getParameter("firstname");
		String nickname = request.getParameter("nickname");
		String imei = request.getParameter("imei");
		String password = request.getParameter("password");
		Tbluser user = new Tbluser();
		user.setEmailaddress(emailaddress);
		user.setName(name);
		user.setFirstname(firstname);
		user.setNickname(nickname);
		user.setImei(imei);
		user.setPassword(password);
		try {
			Register reg = new Register();
			boolean result = reg.register(user);
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Registrierung erfolgreich</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<center>");
			if (result) {
				out.println("<h1>Registrierung erfolgreich</h1>");
				out.println("Um sich mit Ihrer emailAdresse und Ihrem Passwort anzumelden<a href=MuscleRecovery_Login.jsp>Klicken Sie hier</a>");
			} else {
				out.println("</center>");
				out.println("</body>");
				out.println("</html>");
			}
		} finally {
			out.close();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	public String getServletInfo() {
		return "Short description";
	}

}
