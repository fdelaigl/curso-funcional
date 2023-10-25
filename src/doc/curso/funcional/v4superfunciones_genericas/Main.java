package doc.curso.funcional.v4superfunciones_genericas;

import java.util.List;
import java.util.Random;

import doc.curso.funcional.v4superfunciones_genericas.interfaces.Funcion;
import doc.curso.funcional.v4superfunciones_genericas.interfaces.OperadorBinario;
import doc.curso.funcional.v4superfunciones_genericas.interfaces.OperadorUnario;
import doc.curso.funcional.v4superfunciones_genericas.interfaces.Predicado;
import doc.curso.funcional.v4superfunciones_genericas.interfaces.Proveedor;

public class Main {

	public static void main(String[] args) {
		new Main();

	}

	public Main() {
		/*
		 * Que queremos hacer? 1.- Crear lista de numeros enteros 2.- Quedarme solo con
		 * los pares 3.- Pasar cada numero a cuadrado 4.- Mostrar cuadrado por pantalla
		 * 5.- Obtener la suma de cuadrados
		 */
		// 1.- Crear lista de numeros enteros
		List<Integer> numeros = Superfunciones.proveer(10, new Proveedor<>() {
			Random random = new Random();

			@Override
			public Integer obtener() {
				return random.nextInt(100);
			}
		});
		System.out.println(numeros);
		// 2.- Quedarme solo con los pares
		List<Integer> pares = Superfunciones.filtrar(numeros, new Predicado<>() {
			@Override
			public Boolean test(Integer valor) { 
				return valor % 2  == 0;
			}
		});
		System.out.println(pares);	
		// 3.- Pasar cada numero a cuadrado
		List<Integer> transformados = Superfunciones.transformar(pares, new OperadorUnario<>() {
			@Override
			public Integer aplicar(Integer valor) { 
				return valor * valor;
			}
		});
		System.out.println(transformados);
		Integer total = Superfunciones.reducir(transformados, 1, new OperadorBinario<>() {
			@Override
			public Integer aplicar(Integer valor1, Integer valor2) {
				return valor1 + valor2;
			}
		});
		System.out.println("Total de la suma de cuadrados " + total);
	}

}
