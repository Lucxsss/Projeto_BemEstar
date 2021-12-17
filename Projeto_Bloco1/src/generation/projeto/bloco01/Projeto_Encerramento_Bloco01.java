package generation.projeto.bloco01;

import javax.swing.JOptionPane;

import java.util.Scanner;

public class Projeto_Encerramento_Bloco01 {
	
	public static void main(String[] args) throws InterruptedException {

		Scanner question = new Scanner(System.in);
		
		Perguntas p = new Perguntas();
		Respostas r = new Respostas();
		Presencial pre = new Presencial();
		int soma;
		
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

		soma = r.getQ1() + r.getQ2() + r.getQ3() + r.getQ4() + r.getQ5();
		
		Thread.sleep(1000);

		if (soma > 9 && soma <=15) {
			System.out.println(
				"\n" + "|---------------------------------------------------------|"
				+ "\n Queride, procure nossos serviços, nós queremos te ajudar!\n"
				+ "|---------------------------------------------------------|\n"
		    	+ "\n" + pre.getClinon1() + "\n" + pre.getClinon2()  + "\n" + pre.getClinon3() + "\n" + pre.getClinon4() 
		    	+ "\n" + pre.getClinon7() + "\n" + pre.getClinon6()  + "\n" + pre.getClinon5() + "\n" + pre.getClinon8()
		    	+ "\n" + pre.getClinon9() + "\n" + pre.getClinon10() + "\n" + pre.getClinon11());
		}
		
		if (soma > 5 && soma <10 ) {
			System.out.println(
					  "\n" +"|---------------------------------------------------------|"
					+ "\n            Hoje você não está muito bem!\r\n"
				    + "   Seria interessante você procurar alguém pra conversar."
					+ "\n|---------------------------------------------------------|\n"
				    + "\nSe quiser,procure um de nossos parceiro:\n"
				    + "\n" + pre.getClinon1() + "\n" + pre.getClinon2()  + "\n" + pre.getClinon3() + "\n" + pre.getClinon4() 
			    	+ "\n" + pre.getClinon7() + "\n" + pre.getClinon6()  + "\n" + pre.getClinon5() + "\n" + pre.getClinon8()
			    	+ "\n" + pre.getClinon9() + "\n" + pre.getClinon10() + "\n" + pre.getClinon11());
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

