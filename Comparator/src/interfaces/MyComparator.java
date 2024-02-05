package interfaces;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product> {

	/*
	 * Em Java, o Comparator é uma interface funcional que é usada para definir a
	 * ordem de classificação de objetos. Ele fornece um meio de comparar dois
	 * objetos para determinar qual deles deve vir primeiro em uma ordenação. Isso é
	 * frequentemente usado em algoritmos de ordenação, como classificar uma lista
	 * de objetos.
	 * 
	 * A interface Comparator possui um único método chamado compare(), que compara
	 * dois objetos e retorna um valor inteiro que indica a relação entre eles. o1 e
	 * o2 são os objetos que serão comparados. O método retorna um número negativo
	 * se o1 deve vir antes de o2. Retorna zero se o1 e o2 são considerados iguais
	 * em termos de ordenação. Retorna um número positivo se o1 deve vir depois de
	 * o2.
	 */
	@Override
	public int compare(Product p1, Product p2) {

		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());// comparando os nomes dos produtos por
																				// nome idependete de letras maiúsculas
																				// ou menusculas
	}

}
