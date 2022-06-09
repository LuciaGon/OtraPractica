package com.ces.ahorcado;

import java.util.Scanner;

public class AhorcadoInteractivo {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("El Ahorcado");
		Partida p = new Partida(args[0]);
		do {
			System.out.println("Di tu letra, por favor: ");
			char letra = s.next().charAt(0);
			p.adivinar(letra);
		} while (!p.isTerminada());
		System.out.println("Enhorabuena, has resuelto la palabra buscada: " + p.getObjetivo());
		s.close();
	}

}
