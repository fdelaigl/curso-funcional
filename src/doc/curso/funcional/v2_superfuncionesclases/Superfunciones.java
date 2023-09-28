package doc.curso.funcional.v2_superfuncionesclases;

import java.util.ArrayList;
import java.util.List;

import doc.curso.funcional.v2_superfuncionesclases.interfaces.Predicado;

public class Superfunciones {
	public static List<Integer> filtrar(List<Integer> valores, Predicado predicado) {
		List<Integer> resultado = new ArrayList<>();
		for (Integer valor : valores) {
			if (predicado.test(valor)) {
				resultado.add(valor);
			}
		}
		return resultado;
	}
}
