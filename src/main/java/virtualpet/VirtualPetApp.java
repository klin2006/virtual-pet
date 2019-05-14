package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPet turkyChiken = new VirtualPet(100, 100, 100);
		
		turkyChiken.menu();

		String selection = null;
		selection = input.next();

		while (!selection.equals("ESC")) {
			
			if (selection.equals("1")) {
				turkyChiken.throwTheKernel();
				turkyChiken.tick();
				
			} else if (selection.equals("2")) {
				turkyChiken.playTicTacToe();
				turkyChiken.tick();;
				
			} else if (selection.contentEquals("3")) {
				turkyChiken.cleanThePen();
				turkyChiken.tick();
				
			} else if (selection.equals("4")) {
				turkyChiken.justChill();
				turkyChiken.tick();
				
			} else if (selection.equals("5")) {
				turkyChiken.leave();
				System.exit(0);
				
			} else if (selection.equals("tc")) {
				turkyChiken.tc();
				turkyChiken.tick();
				
			} else {
				turkyChiken.tick();
				turkyChiken.valid();
			}
			
			selection = input.next();
		}

		input.close();

	}
}
