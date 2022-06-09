import java.util.Scanner;

public class Ahorcado {
	private static final String PALABRA = "MAMA";
	private static final char COMODIN = '_';
	
	public static void main(String[] args) {
		System.out.println("El Ahorcado");
		char[] nuevaPalabra = new char[PALABRA.length()];
		for (int i = 0; i < PALABRA.length(); i++) {
			nuevaPalabra[i] = COMODIN;
		}
		System.out.println(nuevaPalabra);
		Scanner s = new Scanner(System.in);
		boolean adivinado = false;
		do {
			System.out.println("Dime una letra");
			char letra = s.next().charAt(0);
			for (int i = 0; i < PALABRA.length(); i++) {
				if (PALABRA.charAt(i) == letra) {
					nuevaPalabra[i] = letra;
				}
			}
			adivinado = true;
			for (int i = 0; i < PALABRA.length(); i++) {
				adivinado &= nuevaPalabra[i] != COMODIN;
			}
			System.out.println(nuevaPalabra);
		} while(!adivinado);
		if (adivinado) {
			System.out.println("Enhorabuena, has resuelto la palabra buscada: " + PALABRA);
		} 
		s.close();
	}
}