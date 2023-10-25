package doc.curso.funcional.v4_superfunciones_genericas.interfaces;

public interface Funcion<T, R> {
	R aplicar(T valor);
}
