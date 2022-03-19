import java.lang.*;
public class Ejercicio42{
	public static void main(String[] args){
		
		int ingEne=15000;
		int gastEne=8000;
		int ingFeb=16000;
		int gastFeb=9000;
		int ingMar=10000;
		int gastMar=11000;
		int ingAbr=9000;
		int gastAbr=10000;
		int ingMay=12000;
		int gastMay=12000;
		int ingJun=13000;
		int gastJun=10000;
		int ingJul=7000;
		int gastJul=9000;
		int ingAgo=6000;
		int gastAgo=8000;
		int ingSep=11000;
		int gastSep=9000;
		int ingOct=13000;
		int gastOct=9000;
		int ingNov=14000;
		int gastNov=12000;
		int ingDic=15000;
		int gastDic=14000;
		
		//a)
		int balanEne=ingEne-gastEne;
		int balanFeb=ingFeb-gastFeb;
		int balanMar=ingMar-gastMar;
		int balanAbr=ingAbr-gastAbr;
		int balanMay=ingMay-gastMay;
		int balanJun=ingJun-gastJun;
		int balanJul=ingJul-gastJul;
		int balanAgo=ingAgo-gastAgo;
		int balanSep=ingSep-gastSep;
		int balanOct=ingOct-gastOct;
		int balanNov=ingNov-gastNov;
		int balanDic=ingDic-gastDic;
		System.out.println("Enero "+balanEne);
		System.out.println("Febrero "+balanFeb);
		System.out.println("Marzo "+balanMar);
		System.out.println("Abril "+balanAbr);
		System.out.println("Mayo "+balanMay);
		System.out.println("Junio "+balanJun);
		System.out.println("Julio "+balanJul);
		System.out.println("Agosto "+balanAgo);
		System.out.println("Septiembre "+balanSep);
		System.out.println("Octubre "+balanOct);
		System.out.println("Noviembre "+balanNov);
		System.out.println("Diciembre "+balanDic);
		
		//b)
		double mediaIng=(ingEne+ingFeb+ingMar+ingAbr+ingMay+ingJun+ingJul+ingAgo+ingSep+ingOct+ingNov+ingDic)/12;
		System.out.println("La media de ingresos anual es "+mediaIng);
		double mediaGast=(gastEne+gastFeb+gastMar+gastAbr+gastMay+gastJun+gastJul+gastAgo+gastSep+gastOct+gastNov+gastDic)/12;
		System.out.println("La media de gastos anual es "+mediaGast);
		
		//c)
		double balanAnu=balanEne+balanFeb+balanAbr+balanMay+balanJun+balanJul+balanAgo+balanSep+balanOct+balanNov+balanDic;
		boolean positivo=balanAnu>0;
		System.out.println("True= +; False=- "+positivo);
	}
}