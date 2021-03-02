/*
 * Thi Bich Loan Chung
 */
public class Ex2 {

	public static void main(String[] args) {
		String str = "It is very fun to write programs in java!";
		char[] vowelsArr = {'a', 'o', 'e','u','i','y'};
		
		for (int i = 0; i < vowelsArr.length; i++) {
			char token = vowelsArr[i];
			str = str.replace(token, 'a');
		}
		System.out.println("The new string is : "+str);
	}

}
