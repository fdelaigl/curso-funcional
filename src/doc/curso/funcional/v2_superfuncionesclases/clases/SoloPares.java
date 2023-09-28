package doc.curso.funcional.v2_superfuncionesclases.clases;

import doc.curso.funcional.v2_superfuncionesclases.interfaces.Predicado;

public class SoloPares implements Predicado{

	@Override
	public Boolean test(Integer valor) {
		return valor % 2 == 0;
	}

}
