package doc.curso.funcional.v2_superfuncionesclases.clases;

import doc.curso.funcional.v2_superfuncionesclases.interfaces.Consumidor;

public class Impresor implements Consumidor{

	@Override
	public void aceptar(Integer valor) {
		System.out.println(valor);		
	}

}
