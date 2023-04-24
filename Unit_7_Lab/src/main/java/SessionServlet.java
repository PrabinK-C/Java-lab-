import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SessionServlet", value = "/SessionServlet")
public class SessionServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get the session object
        HttpSession session = request.getSession();

        // Check if the session is new or not
        if (session.isNew()) {
            out.println("Welcome, new user!");
        } else {
            out.println("Welcome back, " + session.getAttribute("username"));
        }

        // Set the session attributes
        session.setAttribute("username", "Prabin kc");
        session.setMaxInactiveInterval(30 * 60); // Set the session timeout to 30 minutes
    }
}
