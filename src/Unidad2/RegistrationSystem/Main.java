// http://codeforces.com/contest/4

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HashMap<String,Integer> user = new HashMap<String,Integer>();
		
		Scanner entrada = new Scanner(System.in);
		
		int cant = entrada.nextInt();
		
		for(int i=0; i < cant; i++) {
			
			String name = entrada.next();
			
			// Verificamos si el usuario ya existe
			if(user.containsKey(name)) {
				user.put(name, user.get(name) + 1);
				System.out.println(name+""+user.get(name));
			}
			else {
				user.put(name, 0);
				System.out.println("OK");
			}
			
		}
		
		entrada.close();		
	}
}
