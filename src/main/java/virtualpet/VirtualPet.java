package virtualpet;

public class VirtualPet {
	private int full;
	private int happy;
	private int clean;
	private int tc;
	private int tick = 0;
	private String menu;
	private String leave;
	private String valid;

	public VirtualPet(int full, int happy, int clean) {
		this.full = full;
		this.happy = happy;
		this.clean = clean;
	}
	
	
	public int getFull() {
		return full;
	}

	public int getHappy() {
		return happy;
	}

	public int getClean() {
		return clean;
	}

	public void menu() {
		System.out.println("Hiya! My name is Turky Chiken! \nWhat would you like to do?");
		System.out.println("    _____________");
		System.out.println("   /      ~    ~ \\");
		System.out.println("  /       o    0  \\	");
		System.out.println(" /	           \\");
		System.out.println("/	            >>>>>");
		System.out.println("|		    /");
		System.out.println("|		   /");
		System.out.println("|		  |");
		System.out.println("Full: " + getFull() + " Happy: " + getHappy() + " Clean: " + getClean());
		System.out.println("Press 1 to Throw the kernel");
		System.out.println("Press 2 to Play tic-tac-toe");
		System.out.println("Press 3 to Clean the pen");
		System.out.println("Press 4 to Just chill");
		System.out.println("Press 5 to Quit");
	}

	public void throwTheKernel() {
		System.out.println("Throw the kernel");
		System.out.println("         *");
		System.out.println("       *    *");
		System.out.println("     *        *");
		System.out.println("    *           *");
		System.out.println("  *              *");
		System.out.println("*                 *");
		int number = 50;
		int number3 = 40;
		if (getFull() + number < 100) {
			full += number;
		} else {
			full = 100;
		}

		if (getClean() - number3 < 100 && getClean() - number3 > 0) {
			clean -= number3;
		} else {
			clean = 0;
		}
	}

	public void playTicTacToe() {
		System.out.println("Play tic-tac-toe");
		System.out.println("      |      |");
		System.out.println("      |      |");
		System.out.println("------|------|------");
		System.out.println("      |      |");
		System.out.println("      |      |");
		System.out.println("------|------|------");
		System.out.println("      |      |");
		System.out.println("      |      |");
		int number2 = 30;
		if (getHappy() + number2 < 100) {
			happy += number2;
		} else {
			happy = 100;
		}

	}

	public void cleanThePen() {
		System.out.println("Clean the pen");
		System.out.println("    _____________");
		System.out.println("   /      ~    ~ \\");
		System.out.println("  /        @   @  \\	");
		System.out.println(" /	           \\");
		System.out.println("/	            >>>>>");
		System.out.println("|		    /");
		System.out.println("|		   /");
		System.out.println("|		  |");
		int number3 = 100;
		int number2 = 45;
		if (getHappy() - number2 <= 100 && getHappy() - number2 > 0) {
			happy -= number2;
		} else {
			happy = 0;
		}

		if (getClean() + number3 < 100) {
			clean += number3;
		} else {
			clean = 100;
		}
	}

	public void justChill() {
		System.out.println("Just chill");
		System.out.println("    _____________");
		System.out.println("   /    ~     ~  \\");
		System.out.println("  /     ==    ==  \\	");
		System.out.println(" /	           \\");
		System.out.println("/	            >>>>>");
		System.out.println("|		    /");
		System.out.println("|		   /");
		System.out.println("|		  |");
		int number = 25;
		int number3 = 20;

		if (getFull() - number <= 100 && getFull() - number > 0) {
			full -= number;
		} else {
			full = 0;
		}
	
		if (getClean() - number3 <= 100 && getClean() - number3 > 0) {
			clean -= number3;
		} else {
			clean = 0;
		}
	}
	
	public void tc() {
		full = 100;
		happy = 100;
		clean = 100;
		System.out.println("BONUS!");
		System.out.println("    _____________");
		System.out.println("   /    ~     ~  \\");
		System.out.println("  /     ^     ^   \\	");
		System.out.println(" /	           \\");
		System.out.println("/	            >>>>>");
		System.out.println("|		    /");
		System.out.println("|		   /");
		System.out.println("|		  |");
	}

	public void tick() {
		{
			int getFull;
			int getHappy;
			int getClean;
			if (full == 0 && happy == 0 && clean == 0) {
				System.out.println("******************");
				System.out.println("Full: " + getFull() + " Happy: " + getHappy() + " Clean: " + getClean());
				System.out.println("Turky Chiken has flown the coop.");
				System.out.println("    _____________");
				System.out.println("   /    ~     ~ \\");
				System.out.println("  /     x     X  \\	");
				System.out.println(" /	          \\");
				System.out.println("/	            >>>>>");
				System.out.println("|		   /");
				System.out.println("|		  /");
				System.out.println("|		  |");
				System.exit(0);
			} else {
				System.out.println("******************");
				System.out.println("Full: " + getFull() + " Happy: " + getHappy() + " Clean: " + getClean());
				System.out.println("Press 1 to Throw the kernel");
				System.out.println("Press 2 to Play tic-tac-toe");
				System.out.println("Press 3 to Clean the pen");
				System.out.println("Press 4 to Just chill");
				System.out.println("Press 5 to Quit");
			}
		}
	}

	public void leave() {
		{
			System.out.println("Catch ya later!");
			System.out.println("    _____________");
			System.out.println("   /      ~    ~ \\");
			System.out.println("  /       o    0  \\	");
			System.out.println(" /	           \\");
			System.out.println("/	            >>>>>");
			System.out.println("|		    /");
			System.out.println("|		   /");
			System.out.println("|		  |");
		}
	}

	public void valid() {
		{
			System.out.println("Please enter a valid selection");
		}
	}
}
	
		
	
