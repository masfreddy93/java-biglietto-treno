package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
		
/*		TODO:

			Ciao!
			Esercitazione di oggi: Biglietto del treno
			Nome repo: java-biglietto-treno
			Il programma dovrà chiedere all'utente il numero di chilometri che vuole percorrere e l'età del passeggero. 
			Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole:
			il prezzo del biglietto è definito in base ai km (0.21 € al km)
			va applicato uno sconto del 20% per i minorenni
			va applicato uno sconto del 40% per gli over 65
			Come sempre create un progetto java con lo stesso nome del repo (java-biglietto-treno), 
			aggiungete un package org.generation.italy e una classe CalcolaBiglietto. 
			Il programma va implementato nel metodo main della classe CalcolaBiglietto.
			Per acquisire l'input dell'utente usate la classe Scanner, come visto stamattina a lezione.
			Buon lavoro!

			-------------------------------------

			BONUS1: i minori di 12 anni viaggiano gratis
			BONUS2: ogni km costa 1 centesimo piu' del precedente (es: 1km = 0.21E, 2km = 0.43, 3km = 0.66E, ecc)  */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Km da percorrere: ");
		int kmDaPercorrere = sc.nextInt();
		System.out.print("Età passeggero: ");
		int etaPasseggero = sc.nextInt();
		
		sc.close();
		
		double prezzoBigliettoStandard = (double) kmDaPercorrere * 0.21d;
//		System.out.println("Prezzo del biglietto standard: " + prezzoBigliettoStandard);
		
		
		double sconto = 0;
		
		if(etaPasseggero < 18) {
			sconto = prezzoBigliettoStandard * 20 / 100;
		} else if (etaPasseggero >= 65) {
			sconto = prezzoBigliettoStandard * 40 / 100;
		}
		
		
		double prezzoFinaleBiglietto;
		prezzoFinaleBiglietto = prezzoBigliettoStandard - sconto;
		System.out.printf("Prezzo del biglietto al netto di sconti: " + prezzoFinaleBiglietto);
		
		
	}
	
}
