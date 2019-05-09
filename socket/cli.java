import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class cli{
	public static void main(String[] args) {
		Socket socket = null;
		try{
			socket = new Socket();
			System.out.println("[[Connecting]]");
			socket.connect(new InetSocketAddress("192.168.10.18", 8888));
			System.out.println("[[Connected]]");
			byte[] bytes = null;
			String message = null;
			
			//Tag Throwing
			OutputStream os = socket.getOutputStream();
			Scanner scan = new Scanner(System.in);
			message = scan.nextLine();//Tag Num...
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("[[TagNum Throwing Success]]");

			//Menu Throwing
			message = scan.nextLine();//Menu..
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("[[Menu Throwing Success]]");
			InputStream is = socket.getInputStream();
			
			//bytes = new byte[100];
			//int readByteCount = is.read(bytes);
			//message = new String(bytes, 0, readByteCount, "UTF-8");
			//System.out.println("[[Data receving Success]]" + message);
			os.close();
			is.close();
		}catch(Exception e) {}
		
		if(!socket.isClosed()){
			try{
				socket.close();
			}catch(IOException e1) {}
		}
		
	}
}
