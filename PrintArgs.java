package tp1;

public class PrintArgs {

	public static void main(String[] args) {
		
		// on affiche le 1er argument ss faire de verif
		System.out.println(args[0]);
		
		for( int i=0; i<args.length; i++){
			System.out.println(args[i]);
		}
		
		for(String argument : args){ 
			System.out.println(argument.toString());
		}	
	}	
}
