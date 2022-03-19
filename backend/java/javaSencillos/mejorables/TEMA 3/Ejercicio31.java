import bpc.daw.reproductor.*;
public class Ejercicio31 {
	public static void main(String[] args) {
		
		ArchivoMP3 m1 = new ArchivoMP3("C:\\Users\\msiev\\Desktop\\Mp3\\aunque-tu-no-lo-sepas-el-canto-del-loco-letra.mp3");
		Reproductor r = new Reproductor(m1,false,true);
		String autor = m1.getAutor();
		String titulo = m1.getTitulo();
		long duracion = m1.getDuracion();
		System.out.println(titulo+" de "+autor+" [ "+duracion+" ms] ");
		r.play();
	
	}
}
