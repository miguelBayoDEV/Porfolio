import java.awt.Dimension;
import java.awt.Toolkit;
import java.lang.*;
import java.util.*;
import bpc.daw.mario.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		
		List<Mario> lista = new ArrayList<>();
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension d = tool.getScreenSize();
		double h = d.getHeight();
		int x = 20;
		Mario m = null;
		
		for(int i=0;i<10;i++) {
			m=new Mario(x,(int)h/2);
			lista.add(m);
			x+=120;
		}
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException error) {
			System.out.println(error.getMessage());
		}
		
		for(int i=0;i<lista.size();i++) {
			if(i%2==0) {
				m=lista.get(i);
				m.andarHacia(0, 0);
			}else if(i%2!=0) {
				m=lista.get(i);
				m.andarHacia(1024, 0);
			}
		}
	}

}
