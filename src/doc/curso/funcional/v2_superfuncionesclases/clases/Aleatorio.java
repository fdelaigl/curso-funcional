package doc.curso.funcional.v2_superfuncionesclases.clases;

import java.util.Random;

import doc.curso.funcional.v2_superfuncionesclases.interfaces.Proveedor;

public class Aleatorio implements Proveedor{
	
	Random random = new Random();

	@Override
	public Integer obtener() {
		return random.nextInt(100);
	}

}
