//Cash.java
import java.util.Scanner;

public class Cash{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int amount;
		do{
			System.out.println("��������(1-100):");
			amount=scan.nextInt();
		}while(amount<1||amount>100);
		for(int one=0;one<=amount;++one)
			for(int five=0;five<=amount/5;++five)
				for(int ten=0;ten<=amount/10;++ten)
					for(int twenty=0;twenty<=amount/20;++twenty)
						if(one+five*5+ten*10+twenty*20==amount)
							System.out.println(one+"��1Ԫ,"+five+"��5Ԫ,"+ten+"��10Ԫ��"+twenty+"��20Ԫ->"+amount);
	}
}