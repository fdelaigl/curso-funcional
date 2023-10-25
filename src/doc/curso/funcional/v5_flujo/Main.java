package doc.curso.funcional.v5_flujo;

import java.util.Random;

import doc.curso.funcional.v4_superfunciones_genericas.interfaces.OperadorBinario;
import doc.curso.funcional.v4_superfunciones_genericas.interfaces.OperadorUnario;
import doc.curso.funcional.v4_superfunciones_genericas.interfaces.Predicado;
import doc.curso.funcional.v4_superfunciones_genericas.interfaces.Proveedor;

public class Main {

	public static void main(String[] args) {
		new Main();

	}

	public Main() {

		Integer total2 = Flujo.proveer(10, new Proveedor<Integer>() {
			Random random = new Random();

			@Override
			public Integer obtener() {
				return random.nextInt(100);
			}
		}).filtrar(new Predicado<>() {
			@Override
			public Boolean test(Integer valor) {
				return valor % 2 == 0;
			}
		}).transformar(new OperadorUnario<>() {
			@Override
			public Integer aplicar(Integer valor) {
				return valor * valor;
			}
		}).reducir(1, new OperadorBinario<>() {
			@Override
			public Integer aplicar(Integer valor1, Integer valor2) {
				return valor1 + valor2;
			}
		});

		System.out.println("Total de la suma de cuadrados " + total2);
	}

}
