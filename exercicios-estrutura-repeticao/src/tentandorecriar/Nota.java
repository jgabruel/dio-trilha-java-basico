package tentandorecriar;
import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nota entre 0 a 10: ");
        int nota = scan.nextInt();

while(nota < 0 || nota > 10){
        System.out.println("Nota invalida, insira uma nota entre 0 a 10 ");
        nota = scan.nextInt();
        }
        System.out.println("Nota final: "+nota);
    }
}

/* 
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.

 * 1 - pede nota, scan
 * 2 - while nota estiver menor que 0 e maior que 10, exibe nota invalida e
 *     pede pra scannear nota novamente
 * 3 - exibe a nota final quando valida
 */