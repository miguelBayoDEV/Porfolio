import java.lang.*;
public class ej50{
	public static void main(String[] args){
		//ponemos los kb que se descargan en esos segundos
		int min10=128;
		int resto=64;
		//multiplicamos los kb por 10*60 que son 10 min
		int min10_1p=min10*10*60;
		//restamos 5242880 por min10_1p ya que este numero son 5g pasados a kb y al restarlo quitamos de enmedio los 10min
		int kb=5*1024*1024-min10_1p;
		//finalmente se calculan los segundo dividiendo los kb restantes por los 64kb por segundo el resto del tiempo
		int segundos=(kb/resto)+10*60;
		System.out.println("el archivo se descarga en: "+segundos+" Segundos");

	}
}