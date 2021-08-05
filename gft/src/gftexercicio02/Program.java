package gftexercicio02;

import java.util.Scanner;

import gftexercicio02Hospedagem.Hospedagem;
import gftexercicio02Hospedagem.HospedagemVip;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		HospedagemVip hospV = new HospedagemVip();

		System.out.print("Enter the number: ");
		int reais = sc.nextInt();
		
		System.out.println("Result: " + reais);
		
		System.out.print("Enter the Additional Value: ");
		double valorAdicional = sc.nextDouble();
		
		Hospedagem hosp = new HospedagemVip();
		
		
		System.out.println(reais + valorAdicional);
		
		

	}

}
