package pendule;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class jeu {
public static void main(String[] args) throws FileNotFoundException {
   choix();
}



public static void choix() throws FileNotFoundException {
	String mot;
	 File dictionnary =new File("francais.txt");
		

		Scanner sc = new Scanner (dictionnary);
		ArrayList<String> mots = new ArrayList<String>();
		while(sc.hasNextLine())
			mots.add(sc.nextLine());
	    mot =mots.get((int) (Math.random()*mots.size())) ;
	//String pendu ="";
	ArrayList <String> Mot = new ArrayList<String>(); //c'est l'ArrayList du mot choisi
	for (int i=0;i<mot.length();i++) {
		
	    Mot.add(""+mot.charAt(i));
	}
	
//System.out.println(Mot);

	
	ArrayList<String> pendu = new ArrayList<String>();
	for (int i=0;i<mot.length();i++) {
		
		pendu.add("_ ");
	}


	int vie=10;
	
	while(!(Mot.equals(pendu))&&vie>0) {//tant que la partie n'est pas finie...
	
	System.out.println("Chosir le caractère");	
	Scanner sc2= new Scanner(System.in);
	String saisie= sc2.next();  // choix du caractère
	
	
	String b = new String();
 
	if(mot.indexOf(saisie)<0){
		vie--;
	    for(String s: pendu) {
	    	b+=s;
	   
	    }
		System.out.println(b);	
		System.out.println("Il vous reste : "+vie+" vies.");	
		bonhomme.bonhomme(vie);
	}else {
		ArrayList<Integer> a =new ArrayList<Integer>();
		a = test.indices(Mot, saisie);         //tableau d'entier pour lequel il y a le string saisie dans Mot
		for(int index :a) {
		//System.out.println(index);
		pendu.remove(index);
		pendu.add(index,saisie);
		}
       for(String s: pendu) {
    	 b+=s;
   
    }
    System.out.println(b);	
	System.out.println("Il vous reste : "+vie+" vies.");	
	bonhomme.bonhomme(vie);

	}
	


}
if (vie==0) {
	System.out.println("Vous avez perdu ! Le mot était : "+mot);
	restart();
}else {
	System.out.println("Vous avez gagné ! ");
	restart();
}
}



	public static void restart() throws FileNotFoundException {
	System.out.println("Voulez -vous recommencez ? (Y si oui N si non.) ");
	Scanner sc3 = new Scanner(System.in);
	String restart = sc3.next();
	

	if(restart.equals("Y")||restart.equals("y")) {
		choix();
	}else {
		System.out.println("Dommage"); ;
	}
	
//System.out.println("Vous avez gagné ! ");
}
}
