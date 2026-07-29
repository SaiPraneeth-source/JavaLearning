import java.util.Scanner;


class NumberTriangle2{

public static void main(String args[]){

int i;
int j;
int rows;

Scanner s = new Scanner(System.in);

rows = s.nextInt();

for(i = 1; i <= rows; i++) {
	for(j = 1; j < i; j++){
	
	
	System.out.print(" ");
	}
		for(j = i; j<=rows;j++){
			
			System.out.print(j+ " ");
			
			
		}
	
	System.out.println();

	
	}
	
	
	for(i = rows-1; i>=1; i--){
	
		for(j =1;j<i;j++){
			System.out.print(" ");

		
		}
		
		for(j=i;j<=rows;j++){
			
			System.out.print(j + " ");
			
		}
			System.out.println();

	
	}
	
	}
	}
	