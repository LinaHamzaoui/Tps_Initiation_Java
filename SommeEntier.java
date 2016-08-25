package paquet;

import java.lang.Integer;
import java.util.Arrays;

public class SommeEntier {

	public static void main(String[] args) {
		if(args.length > 0){
			
			for(String arg : args){
				System.out.println(arg);
			}
			
			System.out.println(Arrays.toString(tabCharToTabInt(args)));
			
			int somme = sommeTabEntiers(tabCharToTabInt(args));
			
			System.out.println(somme);
		}

	}

	public static int[] tabCharToTabInt(String[] strings){
		int tab[] = new int [strings.length];

		for( int i=0; i< strings.length; i++){
			try{
			tab[i] = Integer.parseInt(a[i]); 
			}catch(NumberFormatException e){ 
				System.out.println(a[i] + " n'est pas un nombre !");
			}
		}		
		return tab;
	}

	public static int sommeTabEntiers(int[] entiers){
		int somme = 0;
		for(int n : entiers) 
			somme += n;
		return somme;
	}
}
