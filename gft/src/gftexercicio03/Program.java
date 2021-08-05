package gftexercicio03;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Digite o dia do seu aniversário: ");
		String dia = sc.nextLine();
		System.out.println("Digite o mês do seu aniversário: ");
		String mes = sc.nextLine();
		System.out.println("Digite o ano do seu aniversário: ");
		String ano = sc.nextLine();

		int day = Integer.parseInt(dia);
		int month = Integer.parseInt(mes);
		int year = Integer.parseInt(ano);

		if ((day < 1) || (day > 31)) {
			System.out.println("Dia invalido\n");
		} else { // se o dia for válido
			if ((month < 1) || (month > 12)) {
				System.out.println("Mes invalido\\n");
			} else { // além do dia, o mês for válido
				if (year > 2020 || year < 2020)
					System.out.println("Ano invalido\n");
				else // se além do dia e mês, o ano for válido
					System.out.println("Data valida\n");
			}
		}

	}
}
