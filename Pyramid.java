class Pyramid{

public static void main(String args[]){


int i;
int j;
int s; 
 

for( i = 1 ; i <= 6 ; i++ ) {
	
	for( j = 6; j > i; j--) {
		if( i == 1 || i == 2) {
			System.out.print(" ");
		}
		
		else if ( i == 3 || i == 4) {
			
		System.out.print("* ");
	}
	
	else if (i == 5 || i == 6) {
		System.out.print(" ");
	}

	
}
}
}
}