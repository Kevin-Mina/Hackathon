import java.util.Scanner;


public class ProblemaI {

	public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        int total =0;
        for(int i=valor;i>0;i--){
            total+=i*i;
        }
        System.out.println(total);
    }


}
