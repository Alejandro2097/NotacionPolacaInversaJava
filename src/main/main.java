package main;

import java.util.Scanner;
import java.util.Stack;

public class main {

	public static void main(String[] args) {
		Stack<String> pila = new Stack<>();
		boolean still = true;
			
		while(still == true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese el dato");
			String e1 = sc.next();
			String factor =" ";
			switch(e1) {
				case "+":
					String uno = pila.get(pila.size()-1);
					String dos = pila.get(pila.size()-2);
					double str = Double.parseDouble(uno) + Double.parseDouble(dos) ;
					factor = Double.toString(str);
					break;
				case "-":
					 uno = pila.get(pila.size()-1);
					 dos = pila.get(pila.size()-2);
					 str = Double.parseDouble(dos) - Double.parseDouble(uno) ;
					factor = Double.toString(str);
					break;
				case "*":
					 uno = pila.get(pila.size()-1);
					 dos = pila.get(pila.size()-2);
					 str = Double.parseDouble(uno) * Double.parseDouble(dos) ;
					factor = Double.toString(str);
					break;
				case "/":
					 uno = pila.get(pila.size()-1);
					 dos = pila.get(pila.size()-2);
					 str = Double.parseDouble(dos) / Double.parseDouble(uno) ;
					factor = Double.toString(str);
					break;
				default: 
					factor = null;
			}
			
			if(factor != null) {
				pila.pop();
				pila.pop();
				pila.push(factor);
			}else{
				pila.push(e1);
			}
			
			
			System.out.println(pila);
			
		}
		
		
	}
	
}
