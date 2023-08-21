import java.util.Scanner;


public class ProblemaHOutraForma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int quantidade = scanner.nextInt();
        float valorTotal=0;
        int QuantidadeDeItens;
        int codigo;
        for(int i=0;i<quantidade;i++){
            codigo = scanner.nextInt();
            QuantidadeDeItens = scanner.nextInt();
            valorTotal+=((codigo%10)+0.5)*QuantidadeDeItens;
        }
        System.out.printf("%.2f",valorTotal);

	}

}
