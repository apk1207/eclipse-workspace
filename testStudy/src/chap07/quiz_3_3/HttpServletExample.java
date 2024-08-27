package chap07.quiz_3_3;

public class HttpServletExample {

	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());
	}

	
	public static void method(httpServlet servlet) {
		servlet.service();
	}
}
