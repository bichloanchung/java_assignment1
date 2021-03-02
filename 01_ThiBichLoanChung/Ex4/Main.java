import java.util.Scanner;
/*
 * Thi Bich Loan Chung
 */

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, inform name of the first player");
		Player pl1 = new Player(sc.nextLine());
		pl1.play();
		System.out.println("The first player got: "+pl1.getScores()+" pts");
		
		System.out.println("Please, inform name of the second player");
		Player pl2 = new Player(sc.nextLine());
		pl2.play();
		System.out.println("The second player got: "+pl2.getScores()+" pts");
		System.out.println("-----------------------------");
		
		if(pl1.getScores() > pl2.getScores()) {
			System.out.println(pl1.getName()+" won the game!");
		}else if(pl2.getScores() > pl1.getScores()) {
			System.out.println(pl2.getName()+" won the game!");	
		}else System.out.println("No winner this time!");
	}

}
