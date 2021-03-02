import java.util.Random;
/*
 * Thi Bich Loan Chung
 */

public class Player {
	private String name = " ";
	private int scores = 0;
	
	public Player(String nameP) {
		this.name = nameP;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScores() {
		return scores;
	}

	public void play() {
		Random rd = new Random();
		for(int i = 0; i < 4; i++) {
			int pts = rd.nextInt(5)+1;
			System.out.println(pts);
			scores+=pts;
		}
		
	}
	
}