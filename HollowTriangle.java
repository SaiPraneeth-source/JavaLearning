import java.util.Scanner;

class HollowTriangle{

public static void main(String args[]){


int i;
int j;
int rows;
int k;

Scanner s = new Scanner(System.in);

rows = s.nextInt();

for( i = 1; i <= rows; i++) {
	
	System.out.print("* ");
}

   System.out.println();
   
   for (j = 1; j < rows; j++) {
    for (k = 1; k <= j; k++) {
        System.out.print(" ");
    }
    System.out.print("* ");
	
	for (int l = rows-2; l > j; l--) {
    
        System.out.print("  ");
    }
    if(j!=rows-1){
		System.out.print("* ");
	}    System.out.println();
}
	
   }


   

}

