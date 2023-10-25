package doc.curso.funcional.v2_superfuncionesclases;

import java.util.List;

import doc.curso.funcional.v2_superfuncionesclases.clases.AlCuadrado;
import doc.curso.funcional.v2_superfuncionesclases.clases.Aleatorio;
import doc.curso.funcional.v2_superfuncionesclases.clases.Impresor;
import doc.curso.funcional.v2_superfuncionesclases.clases.Multiplicador;
import doc.curso.funcional.v2_superfuncionesclases.clases.SoloPares;

public class Main {

	public static void main(String[] args) {
		new Main();

	}

	public Main() {
		/*
		 * Que queremos hacer?
		 * 1.- Crear lista de numeros enteros
		 * 2.- Quedarme solo con los pares
		 * 3.- Pasar cada numero a cuadrado
		 * 4.- Mostrar cuadrado por pantalla
		 * 5.- Obtener la suma de cuadrados
		 */
		//1.- Crear lista de numeros enteros
		List<Integer> numeros = Superfunciones.proveer(10, new Aleatorio());
		System.out.println(numeros);
		// 2.- Quedarme solo con los pares
		List<Integer> pares =	Superfunciones.filtrar(numeros, new SoloPares());
		System.out.println(pares);
		// 3.- Pasar cada numero a cuadrado
		List<Integer> transformados = Superfunciones.transformar(pares, new AlCuadrado());
		System.out.println(transformados);
		List<Integer> mostrados  = Superfunciones.actuar(pares, new Impresor());
		//5.- Obtener la suma de cuadrados
		Integer total = Superfunciones.reducir(mostrados, 1, new Multiplicador());
		System.out.println("Total de la suma de cuadrados " + total);
	}




//	@Deprecated
//	private List<Integer> crearLista() {
//		return List.of(0,1,2,3,4,5,6,7,13,21,34,55,89,144);
//	}
//	@Deprecated
//	private List<Integer> filtrarPares(List<Integer> numeros) {
//		List<Integer> resultado = new ArrayList<>();
//		// rrecorrer lista
//		for (Integer numero : numeros) {
//			if (numero % 2 == 0) {
//				resultado.add(numero);
//			}
//		}
//		return resultado;
//	}
//	
//	@Deprecated
//	private List<Integer> elevarAlCuadrado(List<Integer> pares) {
//		List<Integer> resultado = new ArrayList<>();
//		for (Integer numero : pares) {
//			resultado.add(numero * numero);
//		}
//		return resultado;
//	}
//
//	private List<Integer> mostrarLista(List<Integer> cuadrados) {
//		// rrecorrer lista
//		for (Integer numero : cuadrados) {
//			System.out.println(numero);
//		}
//		return null;
//	}
//	
//	
//	private Integer sumarLista(List<Integer> mostrados) {
//		Integer total = 0;
//		
//		for (Integer numero : mostrados) {
//			total += numero;
//		}
//		return total;
//	}
}
