package java;



public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie myCookie = new Cookie("Subject", "AdvancedJava");
		
		myCookie.setMaxAge(3600);
		
		response.addCookie(myCookie);
	    // set the response content type
	    response.setContentType("text/html");

	    // write the HTML response
	    PrintWriter out = response.getWriter();
	    out.println("<html>");
	    out.println("<head><title>Cookie Servlet</title></head>");
	    out.println("<body>");
	    out.println("<h1>Cookie Example</h1>");
	    out.println("<p>A cookie has been saved with the name 'Subject' and value 'AdvancedJava'.</p>");
	    out.println("</body></html>");
		
	}

}