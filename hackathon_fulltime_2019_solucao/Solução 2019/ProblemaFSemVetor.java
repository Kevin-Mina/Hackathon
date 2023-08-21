import java.util.Scanner;


public class ProblemaFSemVetor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int menor = 21;
        int quantidade = scanner.nextInt();
        int posicao=0;
        int valor;
        for(int i = 1;i<=quantidade;i++){
            valor =scanner.nextInt();
            if(menor>valor){
                menor=valor;
                posicao=i;
            }
        }
        System.out.println(posicao);

	}

}
