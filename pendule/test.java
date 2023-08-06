package pendule;
import java.util.*;
public class test {
public static String mrot = "suuuu";

public static void main(String[] args) {
	
	
	ArrayList<String> s=new ArrayList<String>();
	s.add("y");
	s.add("y");
	s.add("comment");
	s.add("y");
	System.out.println(indices(s,"y"));
}
ArrayList<String> s= new ArrayList<String>();

public static ArrayList<Integer> indices(ArrayList<String> s, String a) {
	ArrayList<Integer> indice =new ArrayList<Integer>();
	int j=-1;
	for(String element :s) {
		j++;
		if(element.equals(a)) {
			indice.add(j);
		}
	}
	
	return indice;
}
}
