package doc.curso.funcional.v2_superfuncionesclases;

import java.util.ArrayList;
import java.util.List;

import doc.curso.funcional.v2_superfuncionesclases.interfaces.Consumidor;
import doc.curso.funcional.v2_superfuncionesclases.interfaces.Funcion;
import doc.curso.funcional.v2_superfuncionesclases.interfaces.Predicado;
import doc.curso.funcional.v2_superfuncionesclases.interfaces.Proveedor;

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

	public static List<Integer> proveer(Integer size, Proveedor proveedor) {
		List<Integer> resultado = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			resultado.add(proveedor.obtener());
		}
		return resultado;
	}

	public static List<Integer> transformar(List<Integer> valores, Funcion funcion) {
		List<Integer> resultado = new ArrayList<>();
		for (Integer valor : valores) {
			resultado.add(funcion.aplicar(valor));
		}
		return resultado;
	}
	
	public static List<Integer> actuar(List<Integer> valores, Consumidor consumidor) {	
		for (Integer valor : valores) {
			consumidor.aceptar(valor);
		}
		return valores;
	}

}
