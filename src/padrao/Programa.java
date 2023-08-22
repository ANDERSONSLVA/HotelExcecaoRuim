package padrao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Reservas;

public class Programa {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		System.out.print("Numero do Quarto: ");
		int n = sc.nextInt();
		System.out.print("Data de Entrada: ");
		Date d = sdf.parse(sc.next());
		System.out.print("Data de Saida: ");
		Date s = sdf.parse(sc.next());

		if (!s.after(d)) {
			System.out.println("a Data de Saida deve ser depois da Entrada!");

		} else {

			Reservas r = new Reservas(d, s, n);
			r.duracao();
			System.out.print(r);
			System.out.println("Atualizar a Reserva!");
			System.out.print("Data de Entrada: ");
			d = sdf.parse(sc.next());
			System.out.print("Data de Saida: ");
			s = sdf.parse(sc.next());
			
			Date now = new Date();
			// IF A DATA FOR ANTES DA DATA QUE COLOQUEI AGORA-
			if (s.before(now) || d.before(now)) {
				System.out.println("Erro, As reservas Tem que ser Data Futura!");
			} else if(!s.after(d)){
				System.out.println("a Data de Saida deve ser depois da Entrada!");
			}else {
				r.setDataS(s, d);
				System.out.print(r);
			}

		}

		sc.close();

	}

}
