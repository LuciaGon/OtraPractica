package com.ces.ahorcado;

public class AhorcadoAutomatico {
	private static final String PALABRA = "MAMA";
	private static final char[] INTENTOS = {'A', 'C', 'E', 'M', 'X'};
	
	public static void main(String[] args) {
		System.out.println("El Ahorcado");
		Partida p = new Partida(PALABRA);
		int i = 0;
		do {
			char letra = INTENTOS[i++];
			System.out.println("¿hay " + letra + "s?");
			p.adivinar(letra);
		} while (!p.isTerminada());
		System.out.println("Enhorabuena, has resuelto la palabra buscada: " + p.getObjetivo());
	}

}
