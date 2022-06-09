package com.ces.ahorcado;

public class Partida {
	private static final char COMODIN = '_';

	private String objetivo;
	private char[] estadoPalabra;

	public Partida(String objetivo) {
		this.objetivo = objetivo;
		estadoPalabra = new char[objetivo.length()];
		for (int i = 0; i < objetivo.length(); i++) {
			estadoPalabra[i] = COMODIN;
		}
		System.out.println(estadoPalabra);
	}

	public void adivinar(char letra) {
		for (int i = 0; i < objetivo.length(); i++) {
			if (objetivo.charAt(i) == letra) {
				estadoPalabra[i] = letra;
			}
		}
		System.out.println(estadoPalabra);
	}

	public boolean isTerminada() {
		boolean terminada = true;
		for (int i = 0; i < objetivo.length(); i++) {
			terminada &= estadoPalabra[i] != COMODIN;
		}
		return terminada;
	}

	public String getObjetivo() {
		return objetivo;
	}

}
