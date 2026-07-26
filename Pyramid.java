class Pyramid{

public static void main(String args[]){


int i;
int j;
int rows = 6;

 

for( i = 2; i <= rows; i+=2 ) {
	
	for( j = 1; j <= 2; j++ ) {
		
			for(int s = rows; s >= i; s--) {
		System.out.print(" ");
		}
		
		for(int k = 1; k <= i; k++) {
		System.out.print("* ");
		}
		
	
			
			System.out.println();
	}

	
		
}
}
}

