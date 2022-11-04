package tentandorecriar;
import java.util.Scanner;

public class Fatorial{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Calcular fatorial de: ");
    int fatorial = scan.nextInt();
    int multiplicacao = 1;
    System.out.print(fatorial + "!= ");
    for(int i = fatorial ; i > 0 ; i--){
        multiplicacao = multiplicacao * i;
        if (i!=1){
            System.out.print(i + ".");
        }
        else{
            System.out.print(i + "=" + (multiplicacao));

        }
    }
    
}}

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120




NORMAL sem ir ditando os numeros:
package tentandorecriar;
import java.util.Scanner;

public class Fatorial{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Calcular fatorial de: ");
    int numero = scan.nextInt();
    int fatorial = 1;
    for(int i = numero ; i > 1 ; i--){
        fatorial = fatorial * i;
    }
    System.out.println(fatorial);
}}
*/