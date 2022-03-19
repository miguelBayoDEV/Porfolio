import java.lang.*;
import java.net.InetAddress;
import java.time.Duration;
import java.time.Instant;
import java.net.*;
import bpc.daw.consola.*;
import java.io.*;
public class Ejercicio16 {

	public static void main(String[] args) {
		
		boolean con = args[1].equals("");
		int n = 0;
		if(con) {
			n = 4;
		}else {
			n = Integer.parseInt(args[1]);
		}
		InetAddress ip = null;
		try {
			ip = InetAddress.getByName(args[0]);
		}catch(UnknownHostException error) {
			System.out.println("Host desconocido.");
		}
		String ip1 = ip.getHostAddress();
		System.out.println("Haciendo ping a "+args[0]+" ["+ip1+"]");
		for(int i=1; i<=n; i++) {
			try {
				Instant t = Instant.now();
				long timeout = (long)(1+(20-1)*Math.random());
				Thread.sleep(timeout);
				ip = InetAddress.getByName(ip1);
				boolean proceso = ip.isReachable((int) timeout);
				Instant t1 = Instant.now();
				Duration d = Duration.between(t, t1);
				long d1 = d.toMillis();
				System.out.println("Respuesta desde "+ip1+": tiempo="+d1+"ms");
			}catch(UnknownHostException error) {
				System.out.println("Host desconocido.");
			}catch(InterruptedException error) {
				System.out.println("Interrupción.");
			}catch(IOException error) {
				System.out.println("Fallo.");
			}
		}
	}

}
