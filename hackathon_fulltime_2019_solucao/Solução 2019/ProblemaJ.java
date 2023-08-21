package maratona;

import java.util.Scanner;

public class ProblemaJOutraForma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int pos = scanner.nextInt();
        int a=1, b=1, c=1, i;
        for (i=2;i<=pos;i++)
        {
        	c=a+b;
        	a=b;
        	b=c;
        }
        System.out.println(c);

	}

}
