import java.util.Scanner;


public class ProblemaDOutraForma {
	public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int cont = 0;

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        do {
            if((n1%10)+(n2%10) >9){
                n1+=10;
                cont++;
            }
            n1/=10;
            n2/=10;
        }while (n1!=0);
        if(cont==0){
            System.out.println("No carry operation.");
        }else if(cont == 1){
            System.out.println("1 carry operation.");
        }else{
            System.out.println(cont+" carry operations.");
        }

    }
}
