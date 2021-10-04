import java.util.Scanner;

/*
 * Scrive un applicazione che calcoli l'importo di una tassa seguendo questa tabella:
 * 1 - fino a 10000€ la tassa è del 10%
 * 2 - fino a 20000€ la tassa è del 10% per i primi 10000€ e del 7% sul resto
 * 3 - fino a 30000€ la tassa è del 10% per i primi 10000€, del 7% fino a 20000€ e del 5% sul resto
 * 4 - oltre i 30000€ si aggiunge un ulteriore 3% sulla porzione oltre i 30000€
 */
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci l'importo ");
		double n = input.nextDouble();
		double tassa = 0;
		final double tassa10 = 10000 / 100 * 10;
		final double tassa20 = tassa10 + (10000 / 100 * 7);
		final double tassa30 = tassa20 + (10000 / 100 * 5);
		if(n <= 10000) {
			tassa = n / 100 * 10;
		} else if(n > 10000 && n <= 20000) {
			n -= 10000;
			tassa += tassa10 + (n / 100 * 7);
		} else if(n > 20000 && n <= 30000) {
			n -= 20000;
			tassa += tassa20 + (n / 100 * 5);
		} else {
			n -= 30000;
			tassa += tassa30 + (n / 100 * 3);
		}
		System.out.println("La tassa sull'importo è: " + tassa);
	}
}
