import java.util.Scanner ;


class NumberTriangle {

public static void main(String args[]) {

 int i;
 int n;
 
 System.out.print("Enter the number: ");
 
 Scanner s = new Scanner(System.in);
 
 
 n = s.nextInt();
 
 for(i = 1; i <= n; i++) {
	for ( int j =1; j<=i ; j++) {
		System.out.print(j);
		
		}
		System.out.println();
	}
	}
	}