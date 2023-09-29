package doc.curso.funcional.v2_superfuncionesclases.clases;

import doc.curso.funcional.v2_superfuncionesclases.interfaces.Proveedor;

public class Naturales implements Proveedor{
	private static int next = 0;
	@Override
	public Integer obtener() {return next++;}
}
