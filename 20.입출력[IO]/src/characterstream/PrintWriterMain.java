package characterstream;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterMain {

	public static void main(String[] args)throws Exception {
		PrintWriter pw=new PrintWriter(new FileWriter("printWriter.txt"));
		pw.write(65);
		
		pw.print(65);
		pw.print('6');
		pw.print('5');
		
		pw.println("----------------");
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h1>안녕!!! HTML <h1>");
		pw.println("</body>");
		pw.println("</html>");
		pw.flush();
		pw.close();
		System.out.println("---------PrintWriter.prinr-->printWriter.txt");
	}

}