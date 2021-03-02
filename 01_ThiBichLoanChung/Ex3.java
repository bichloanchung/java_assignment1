import java.util.Random;

/*
 * Thi Bich Loan Chung
 */
public class Ex3 {

	public static void main(String[] args) {
		double[] competitorA = new double[3];
		double[] competitorB = new double[3];
		double[] competitorC = new double[3];
		
		Random rd = new Random();
		for(int i = 0; i < 3; i++) {
			competitorA[i] = rd.nextDouble()*10;
			competitorB[i] = rd.nextDouble()*10;
			competitorC[i] = rd.nextDouble()*10;
		}
		//System.out.println("Competitor A: "+Arrays.toString(competitorA));
		//System.out.println("Competitor B: "+Arrays.toString(competitorB));
		//System.out.println("Competitor C: "+Arrays.toString(competitorC));
		
		double sumA =0, sumB=0, sumC=0;
		for (int i = 0; i < 3; i++) {
			sumA += competitorA[i];
			sumB += competitorB[i];
			sumC += competitorC[i];
		}
		System.out.println("The total points of competitor A: "+sumA);
		System.out.println("The total points of competitor B: "+sumB);
		System.out.println("The total points of competitor C: "+sumC);
		
		
		if (sumA > sumB && sumA > sumC) {
			System.out.println("\nThe competitor A won the tournament!");
		}else if(sumB > sumA && sumB > sumC) {
			System.out.println("\nThe competitor B won the tournament!");
		}else if(sumC > sumA && sumC > sumB) {
			System.out.println("\nThe competitor C won the tournament!");
		}else System.out.println("\nNo champion in the competition!");
		
	}

}
