package tentandorecriar;
import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
        System.out.println("Nome do aluno: ");
        nome = scan.next();

        if (nome.equals("0")) {
            break;
        }
        System.out.println("Idade do aluno: ");
        idade = scan.nextInt();

        System.out.println(nome + ", " + idade + " anos");
        }
    }
}
/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare inserindo o valor 0 no campo nome)

 * 1 - pergunta nome, scan 
 *     pergunta idade, scan
 * 2 - bota dentro de um while sendo sempre true
 * 3 - depois de perguntar nome um if se for "0" da um break no loop
 */
