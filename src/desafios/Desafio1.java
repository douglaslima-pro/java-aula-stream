package desafios;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <li><strong>Desafio 1</strong> - Mostre a lista na ordem numérica:</li>
 * <p>
 * Crie um programa que utilize a Stream API para ordenar a lista de números em
 * ordem crescente e a exiba no console.
 * </p>
 */
public class Desafio1 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// consumer
		Consumer<Integer> imprimirLista = elemento -> {
			System.out.print(" " + elemento + " ");
		};

		System.out.print("[");
		numeros.forEach(imprimirLista);
		System.out.println("]");

		List<Integer> numerosOrdenados = numeros
				.stream()
				.sorted()
				.collect(Collectors.toList());

		System.out.println();
		System.out.println("Ordem crescente:");
		System.out.print("[");
		numerosOrdenados.forEach(imprimirLista);
		System.out.println("]");
	}

}