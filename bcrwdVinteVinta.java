/*20|20 é um restaurante que se divide a partir da idade dos clientes. 
Caso ele tenha menos de 20 anos, será levado a área TAG, com pessoas da mesma faixa etária. Se ele for maior de 20, então irá para a área ABEND. 
Porém, caso o clinte tenha exatamente 20 anos, ele será levado à área VIP, com músicos e cardárpios exclusivos.

O dono do restaurante precisa da sua ajuda para determinar a qual área que cada cliente deve ser direcionado.*/
import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int idade = keyboard.nextInt();
	    if (idade<20){
	        System.out.println("TAG");
	    } else {
	        if (idade==20){
	            System.out.println("VIP");
	        } else {
	            System.out.println("ABEND");
	        }
	    }
	
	keyboard.close();
	}
}
