package doc.curso.funcional.v5_flujo;

import java.util.ArrayList;
import java.util.List;

import doc.curso.funcional.v4_superfunciones_genericas.interfaces.Consumidor;
import doc.curso.funcional.v4_superfunciones_genericas.interfaces.Funcion;
import doc.curso.funcional.v4_superfunciones_genericas.interfaces.OperadorBinario;
import doc.curso.funcional.v4_superfunciones_genericas.interfaces.Predicado;
import doc.curso.funcional.v4_superfunciones_genericas.interfaces.Proveedor;

public class Flujo<T> {
	
	private final List<T> valores;
	
	
	public Flujo(List<T> valores) {
		this.valores = valores;
	}

	public  Flujo<T> filtrar(Predicado<T> predicado) {
		List<T> resultado = new ArrayList<>();
		for (T valor : valores) {
			if (predicado.test(valor)) {
				resultado.add(valor);
			}
		}
		return new Flujo<>(resultado);
	}

	public static <T> Flujo<T> proveer(int size, Proveedor<T> proveedor) {
		List<T> resultado = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			resultado.add(proveedor.obtener());
		}
		return new Flujo<>(resultado);
	}

	public  <R> Flujo<R> transformar(Funcion<T, R> funcion) {
		List<R> resultado = new ArrayList<>();
		for (T valor : valores) {
			resultado.add(funcion.aplicar(valor));
		}
		return new Flujo<>(resultado);
	}

	public Flujo<T> actuar(Consumidor<T> consumidor) {
		for (T valor : valores) {
			consumidor.aceptar(valor);
		}
		return new Flujo<>(valores);
	}

	public T reducir( T identidad, OperadorBinario<T> funcionBinaria) {
		T total = identidad;

		for (T numero : valores) {
			total = funcionBinaria.aplicar(total, numero);
		}
		return total;
	}

}
