import java.util.Scanner;
/*
 * Thi Bich Loan Chung
 */

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.print("Enter the first side of the triangle, a = ");
		a = sc.nextInt();
		System.out.print("Enter the second side of the triangle, b = ");
		b = sc.nextInt();
		System.out.print("Enter the threeth side of the triangle, a = ");
		c = sc.nextInt();
		
		if (a > 0 && b > 0 && c > 0) {
			//System.out.println("\nThree sides of a triangle were informed!");
		
			if ((a + b > c) && (a + c > b) && (b + c > a)) {
				System.out.println("\nThose values can form a triangle!");

				if((a == b) && (b == c) && (a == c)) {
					System.out.println("And ...This is an equilateral triangle!");	
				}else if((a == b) || (b == c) || (a == c)) {
					System.out.println("And ...This is an isosceles triangle!");
				}else {
					System.out.println("And ...This is an escalene triangle!");
				}
			}
			else {
				System.out.println("\nThose values can not form a triangle!");
			}
		}
		else {
			System.out.println("\nPlease enter again with positive values!");
		}
	}

}
