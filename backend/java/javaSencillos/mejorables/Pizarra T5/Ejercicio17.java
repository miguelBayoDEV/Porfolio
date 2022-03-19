import java.lang.*;
import bpc.daw.consola.*;
import java.time.*;
public class Ejercicio17 {

	public static void main(String[] args) {

		Consola c = new Consola("Consola", 200, 200);
		CapaTexto ct = c.getCapaTexto();
		for(int i=0;i<30;i++) {
			LocalTime time = LocalTime.now();
			int h = time.getHour();
			int m = time.getMinute();
			int s = time.getSecond();
			ct.print(3,1,h+":"+m+":"+s);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException error) {
				ct.print("Interrupción.");
			}
			ct.cls();
		}
		Teclado t = c.getTeclado();
		t.setTipoCursor(Teclado.CURSOR_NULO);
		t.leerCadenaCaracteres();
	}

}
