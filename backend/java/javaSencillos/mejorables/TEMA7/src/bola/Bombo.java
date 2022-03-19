package daw.bola;

import java.util.ArrayDeque;
import java.util.Optional;
import java.util.Queue;
import java.util.Random;

public class Bombo {
	
	private Queue<Bola> bolas;
	
	public Bombo (int totalBolas) {
		
		bolas = new ArrayDeque<>();
		for (int i=0; i<totalBolas;i++) {
			bolas.add(new Bola ((1+new Random().nextInt(100))));
		}
		
	}
	public int getNumeroBolas () {
		return bolas.size();
	}
	public Optional<Bola> sacarBola(){
		
		return Optional.ofNullable(bolas.poll());
		
	}

	
}
