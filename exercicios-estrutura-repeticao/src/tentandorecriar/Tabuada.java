package tentandorecriar;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    System.out.println("Numero a ser gerado a tabuada entre 1 e 10: ");
    int numero = scan.nextInt();
    if(numero > 0 && numero < 11){
        for(int i = 1; i <=10; i++){
            System.out.println(numero + " x " + i + " = " + (numero*i));
        } 
    }
    else{
        while(numero < 1 || numero > 10){
            System.out.println("Numero nao entre 1 e 10, insira novamente: ");
            numero = scan.nextInt();
           if(numero >=1 && numero <=10){ for(int i = 1; i <=10; i++){
                System.out.println(numero + " x " + i + " = " + (numero*i));
           }
        }
    }

}
}
}
/*
 *
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
 */
