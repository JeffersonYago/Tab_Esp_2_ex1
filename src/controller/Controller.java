package controller;
import model.Lista;
public class Controller{

	Lista<Integer>[] numeros;
	
	@SuppressWarnings("unchecked")
	public Controller() {
		numeros = new Lista[100];
		iniciatabela();
	}
	public void hash(int valor) {
		int Hash = (int) (100 *((((Math.sqrt(7-1)/2)*valor))%1));
		adiciona(Hash, valor);
	}
	public void adiciona(int Hash, int valor) {
		numeros[Hash].addFirst(valor);
	}
	public void iniciatabela() {
		int tamanho = numeros.length;
		for (int i = 0; i < tamanho; i++) {
			numeros[i] = new Lista<Integer>();
	}
}
}