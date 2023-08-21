import java.util.Scanner;


public class ProblemaD {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x, y, cx, dx, ux, cy, dy, uy, cont=0;
		x=entrada.nextInt();
		y=entrada.nextInt();
		cx=x/100;
		dx=x%100/10;
		ux=x%10;
		
		cy=y/100;
		dy=y%100/10;
		uy=y%10;
		
		if (ux+uy>=10)
		{
			cont++;
			dx++;
		}
		if (dx+dy>=10)
		{
			cont++;
			cx++;
		}
		if (cx+cy>=10)
			cont++;
		
		if (cont==0)
			System.out.print("No carry operation.");
		else
			if (cont==1)
				System.out.print(cont+" carry operation.");
			else
				System.out.print(cont+" carry operations.");
				

	}

}
