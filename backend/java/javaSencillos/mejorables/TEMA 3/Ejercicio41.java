import java.text.*;
public class Ejercicio41 {

	public static void main(String[] args) {
		double pi= 4*Math.atan(1); 
		NumberFormat form= NumberFormat.getInstance();
		form.setMaximumFractionDigits(4);
		String pi2=form.format(pi);
		System.out.println("PI:"+pi2);
	}

}
