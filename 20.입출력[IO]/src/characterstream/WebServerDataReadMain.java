package characterstream;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class WebServerDataReadMain {

	public static void main(String[] args) throws Exception {
		String urlStr = "https://www.aladin.co.kr/";
		URL url = new URL(urlStr);
		InputStream in = url.openStream();
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		
		while(true) {
			String readLine = br.readLine();
			if(readLine == null)break;
			System.out.println(readLine);
			
			
			
		}
		
	}

}
