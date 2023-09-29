package doc.curso.funcional.v2_superfuncionesclases.clases;

import doc.curso.funcional.v2_superfuncionesclases.interfaces.Funcion;

public class AlCubo implements Funcion{

	@Override
	public Integer aplicar(Integer valor) {
		
		return valor * valor * valor;
	}

}
