import java.util.Scanner;


public class ProblemaE {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int ano, mes, dia;
		dia=entrada.nextInt();
		
		ano=dia/365;
		mes=dia%365/30;
		dia=dia%365%30;
		
		System.out.print(ano+" ano(s)\n"+mes+" mes(es)\n"+dia+" dia(s)");

	}

}
