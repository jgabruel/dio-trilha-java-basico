package tentandorecriar;
import java.util.Scanner;
public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maior = 0;
        int total = 0;
        int count = 0;
        int numero;

        do{
            System.out.println("Insira um número: ");
            numero = scan.nextInt();

            if(numero > maior){
                maior = numero;
            }
            total += numero;
            count++;
        }while (count < 5);

        System.out.println("Maior numero: " + maior + "\nMédia dos numeros: " + (total/5));
}
}

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.

1 - do: pede numero, scan
    se o numero for maior que a variavel maior, ele se insere como valor
    soma com o total o numero de agr
    +1 no contador de controle
    while for menor que 5, pra chamar 5 vezes
2 - imprime o maior e a media (total/5)
*/
