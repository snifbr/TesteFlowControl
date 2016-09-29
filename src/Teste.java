import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	void exercicio2ForTestMethod() {
		for (int i = 0; i <= 10; i++) {
			for (int j = 10; j < i; j--) {
				if (i == j) {
					break;
				} else {
					System.out.println(i + " + " + j);;
				}
			}	
		}
		
	}
	
	void separarParImpar(ArrayList<Integer> lista) {
		ArrayList<Integer> pares = null,impares = null;
		Integer i = 0;
		if (lista != null) {
			while (i < lista.size()) {
				switch (lista.get(i) % 2) {
				case 0:
					pares.add(lista.get(i));
					break;
				case 1:
					impares.add(lista.get(i));
				default:
					break;
				}
				i++;
			}
			System.out.println("Pares: " + pares + " Impares: " + impares);
		} else {
			System.out.println("Lista de numeros invalida.");
		}
		System.out.println("Fim");
	}

}
