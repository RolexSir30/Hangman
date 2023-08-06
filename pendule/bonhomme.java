package pendule;
import java.util.*;
public class bonhomme {
public static void main(String[] args) {
	bonhomme(5);
}

public static void bonhomme(int vie) {
	
	String human[][]=new String[5][5];
	switch(vie) {
	case 0 :
	for(int j =0;j<5;j++) {
		human[0][j]="_";
	}
	for(int i =0;i<5;i++) {
		human[i][0]="|";
	}
	human[1][3]="|";
	human[2][3]="o";
	human[3][3]="|";
	human[4][2]="/";
	human[4][4]="\\"  ;
	human[1][1]="/";		
	human[3][2]="-";
	human[3][4]="-";
	
	for(int i =0;i<5;i++) {
		for(int j =0;j<5;j++) {
			if(human[i][j]==null)
				human[i][j]=" ";
				
		}
	}
	
	case 1:
	
		for(int j =0;j<5;j++) {
			human[0][j]="_";
		}
		for(int i =0;i<5;i++) {
			human[i][0]="|";
		}
		human[1][3]="|";
		human[2][3]="o";
		human[3][3]="|";
		human[4][2]="/";
		human[4][4]="\\"  ;
		human[1][1]="/";		
		human[3][2]="-";
	
	case 2 :

		for(int j =0;j<5;j++) {
			human[0][j]="_";
		}
		for(int i =0;i<5;i++) {
			human[i][0]="|";
		}
		human[1][3]="|";
		human[2][3]="o";
		human[3][3]="|";
		human[4][2]="/";
		human[4][4]="\\"  ;
		human[1][1]="/";		
		
	
	
	case 3 :
		for(int j =0;j<5;j++) {
			human[0][j]="_";
		}
		for(int i =0;i<5;i++) {
			human[i][0]="|";
		}
		human[1][3]="|";
		human[2][3]="o";
		human[3][3]="|";
		human[4][2]="/";
		human[4][4]="\\"  ;
	case 4 :
		for(int j =0;j<5;j++) {
			human[0][j]="_";
		}
		for(int i =0;i<5;i++) {
			human[i][0]="|";
		}
		human[1][3]="|";
		human[2][3]="o";
		human[3][3]="|";
		human[4][2]="/";
		
	case 5 :
		for(int j =0;j<5;j++) {
			human[0][j]="_";
		}
		for(int i =0;i<5;i++) {
			human[i][0]="|";
		}
		human[1][3]="|";
		human[2][3]="o";
		human[3][3]="|";
	
	
	case 6 :
		for(int j =0;j<5;j++) {
			human[0][j]="_";
		}
		for(int i =0;i<5;i++) {
			human[i][0]="|";
		}
		human[1][3]="|";
		human[2][3]="o";
	case 7 :
		for(int j =0;j<5;j++) {
			human[0][j]="_";
		}
		for(int i =0;i<5;i++) {
			human[i][0]="|";
		}
		human[1][3]="|";
	
	
	case 8 :
		for(int j =0;j<5;j++) {
			human[0][j]="_";
		}
		for(int i =0;i<5;i++) {
			human[i][0]="|";
		}

	
	
	case 9 :
		for(int i =0;i<5;i++) {
			human[i][0]="|";
		}

	case 10:
		
	}
		
/**
	switch(vie) {

	case 9 :
		for(int j =0;j<5;j++) {
			for(int j1 =0;j1<5;j1++) {
				human[0][j1]="-";
			}
		}
	case 8 :
		for(int i =0;i<5;i++) {
			human[i][0]="|";
		}
	case 7 :
		human[1][3]="|";
		
	case 6 :
		human[2][3]="o";
	
	
	case 5 :
		human[3][3]="|";
	case 4:
		human[4][2]="/";
	case 1 :
		human[4][4]="_"  ;
}
	**/
	
	
	for(int i =0;i<5;i++) {
		for(int j =0;j<5;j++) {
			if(human[i][j]==null)
				human[i][j]=" ";
				
		}
	}
	
	for (int i1=0;i1<5;i1++)
		
     System.out.println(human[i1][0]+human[i1][1]+human[i1][2]+human[i1][3]+human[i1][4]+"");
	
}

}