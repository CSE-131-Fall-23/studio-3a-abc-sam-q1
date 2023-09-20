package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is number n?");
		int n = in. nextInt() ;
		boolean[]prime= new boolean[n+1];
		for (int i=2;i<=n;i++) {
			if (prime[i]==false) {
				System.out.print(i+" ");
				for (int j=1;i*j<=n;j++) {
					prime[i*j]=true;											
				}
			}
			
		}
	}

}
