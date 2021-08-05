package gftexercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<String> list = new ArrayList<>();

		System.out.println("Valor inteiro com 4 digitos entre 1000 e 9999: ");
		int value = sc.nextInt();
		int cont = 0;
		
		if (cont < 9999 && cont > 1000) {
        		System.out.println(value);
        } else {
        	System.out.println("Digite um numero entre 1000 e 9999, Example: 1234");
        }

		String pri = String.valueOf(value).substring(0, 1);
		String seg = String.valueOf(value).substring(1, 2);
		String ter = String.valueOf(value).substring(2,3);
		String quart = String.valueOf(value).substring(3,4);
		
		int number1 = Integer.parseInt(pri);
		int number2 = Integer.parseInt(seg);
		int number3 = Integer.parseInt(ter);
		int number4 = Integer.parseInt(quart);
		
		if (number1 % 2 == 0) {
			System.out.println(pri);
		}
		
		if (number2 % 2 == 0) {
			System.out.println(seg);
		}
		
		if (number3 % 2 == 0) {
			System.out.println(ter);
		}
		
		if (number4 % 2 == 0) {
			System.out.println(quart);
		}
				
		// Poderia usar stream também
		
		// value = list.stream().filter(x -> x.toCharArray(0) == /
		// 2).findFirst().orElse(null);

	}

}
