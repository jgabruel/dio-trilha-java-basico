package tentandorecriar;
import java.util.Scanner;
public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qntTotal;
        int qntImpar = 0;
        int qntPar = 0;
        int numero;

        System.out.println("Numeros a serem colocados: ");
        qntTotal = scan.nextInt();

        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();
            if(numero % 2 == 0){
                qntPar++;
            }
            else{
                qntImpar++;
            }
            qntTotal--;
        }while(qntTotal > 0);

        System.out.println("Numero de pares: " + qntPar + "\nNumero de impares: " + qntImpar);

    }
}
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.

1 - pede quantidade de numeros a serem colocados, scan
2 - do, pede numero
    if mode da divisao por 2 é 0, adiciona par, senao, impar
    qnttotal--
3 - faz o loop enquanto a quantidade de numeros total pedidos for maior que 0
*/