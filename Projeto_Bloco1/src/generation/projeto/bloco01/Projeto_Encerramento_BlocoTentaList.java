package generation.projeto.bloco01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Projeto_Encerramento_BlocoTentaList {
		
	public static void main(String[]args) throws InterruptedException {
	Presencial pre1 = new Presencial(clinon1, clinon2, clinon3, clinon4, clinon5, clinon6, clinon7, clinon8, clinon9, clinon10, clinon11);
	
	Scanner question = new Scanner(System.in);
	
	Perguntas p = new Perguntas();
	Respostas r = new Respostas();
	
		do {
			r.setQ1(Integer.parseInt(JOptionPane.showInputDialog(null,p.getP1())));
			} while (r.q1 > 3  || r.q1 < 1);

		do {
			r.setQ2(Integer.parseInt(JOptionPane.showInputDialog(null,p.getP2())));
		} while (r.q2 > 3 || r.q2 < 1);

		do {
			r.setQ3(Integer.parseInt(JOptionPane.showInputDialog(null,p.getP3())));
		} while (r.q3 > 3 || r.q3 < 1);

		do {
			r.setQ4(Integer.parseInt(JOptionPane.showInputDialog(null,p.getP4())));
		} while (r.q4 > 3  || r.q4< 1);

		do {
			r.setQ5(Integer.parseInt(JOptionPane.showInputDialog(null,p.getP5())));
		} while (r.q5 > 3  || r.q5 < 1);

		do {
			r.setQ6(Integer.parseInt(JOptionPane.showInputDialog(null,p.getP6())));
		} while (r.q6 > 3  || r.q6 < 1);

		int soma;
		soma = r.getQ1() + r.getQ2() + r.getQ3() + r.getQ4() + r.getQ5();
		
		ArrayList<String> lista = new ArrayList<String>() ;
		lista.add(pre1.clinon1);
		lista.add(pre1.clinon2);
		lista.add(pre1.clinon3);
		lista.add(pre1.clinon4);
		lista.add(pre1.clinon5);
		lista.add(pre1.clinon6);
		lista.add(pre1.clinon7);
		lista.add(pre1.clinon8);
		lista.add(pre1.clinon9);
		lista.add(pre1.clinon10);
		lista.add(pre1.clinon11);
		
		Collections.sort(lista);
		
		Thread.sleep(1000);

		if (soma > 9 && soma <=15) {
			for(String pr: lista) {
				System.out.println(pr);
				
			System.out.println(
				"\n" + "|---------------------------------------------------------|"
				+ "\n Queride, procure nossos serviços, nós queremos te ajudar!\n"
				+ "|---------------------------------------------------------|\n");
			}
		    	
		}
		
		if (soma > 5 && soma <10 ) {
			for(String pr: lista) {
				System.out.println(pr);
			
			System.out.println(
					  "\n" +"|---------------------------------------------------------|"
					+ "\n        Hoje você não está muito bem hoje!\r\n"
				    + "   Seria interessante você procurar alguém pra conversar."
					+ "\n|---------------------------------------------------------|\n"
				    + "Se quiser conversar com alguém, procure um de nossos parceiro:\n");
			}    
		}
		if (soma <=5) {
			System.out.println(
					"\n" +
					  "|--------------------------| "
					  + "\n    Hum que maravilha!"
					+ "\n Você esta com tudo hoje!"
					+ "\n|--------------------------|");
		} 
		question.close();
	}

	private static int showInputDialog() {
		// TODO Auto-generated method stub
		return 0;
	}
}

