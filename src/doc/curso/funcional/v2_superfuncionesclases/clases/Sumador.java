package doc.curso.funcional.v2_superfuncionesclases.clases;

import doc.curso.funcional.v2_superfuncionesclases.interfaces.FuncionBinaria;

public class Sumador implements FuncionBinaria{

	@Override
	public Integer aplicar(Integer valor1, Integer valor2) {
		return valor1 + valor2;
	}

}
