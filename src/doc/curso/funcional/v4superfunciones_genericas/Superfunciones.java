package doc.curso.funcional.v4superfunciones_genericas;

import java.util.ArrayList;
import java.util.List;

import doc.curso.funcional.v4superfunciones_genericas.interfaces.Consumidor;
import doc.curso.funcional.v4superfunciones_genericas.interfaces.Funcion;
import doc.curso.funcional.v4superfunciones_genericas.interfaces.OperadorBinario;
import doc.curso.funcional.v4superfunciones_genericas.interfaces.Predicado;
import doc.curso.funcional.v4superfunciones_genericas.interfaces.Proveedor;

public class Superfunciones {
	public static <T> List<T> filtrar(List<T> valores, Predicado<T> predicado) {
		List<T> resultado = new ArrayList<>();
		for (T valor : valores) {
			if (predicado.test(valor)) {
				resultado.add(valor);
			}
		}
		return resultado;
	}

	public static <T> List<T> proveer(int size, Proveedor<T> proveedor) {
		List<T> resultado = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			resultado.add(proveedor.obtener());
		}
		return resultado;
	}

	public static <T, R> List<R> transformar(List<T> valores, Funcion<T, R> funcion) {
		List<R> resultado = new ArrayList<>();
		for (T valor : valores) {
			resultado.add(funcion.aplicar(valor));
		}
		return resultado;
	}

	public static <T> List<T> actuar(List<T> valores, Consumidor<T> consumidor) {
		for (T valor : valores) {
			consumidor.aceptar(valor);
		}
		return valores;
	}

	public static <T> T reducir(List<T> valores, T identidad, OperadorBinario<T> funcionBinaria) {
		T total = identidad;

		for (T numero : valores) {
			total = funcionBinaria.aplicar(total, numero);
		}
		return total;
	}

}
