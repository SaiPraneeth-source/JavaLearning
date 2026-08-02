import java.util	.Scanner;

class AplhabetPat {

public static void main (String args[]) { 

int n;

Scanner sc = new Scanner(System.in);

System.out.print("Enter n: ");

n = sc.nextInt();

for (int i = n; i > 0; i--) {
	
	for (int j = 0; j < i; j++) {
		
		System.out.print((char) ('A' + j ) );
		
	}	
	for ( int l = 1; l < 2 * (n - i)  ; l++){
		System.out.print(" ");
	}
	
		for (int k = (i == n) ? i - 1 : i; k > 0; k--) {
			System.out.print((char) ('A' + k - 1 ) );
		}
		
		System.out.println();
	}
	
	
}



}





