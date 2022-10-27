public class Operadores4 {
 public static void main(String [] args) {
    String nomeUm = "Gleyson";
    String nomeDois = new String("Gleyson");

    System.out.println(nomeUm.equals(nomeDois));




    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;

    if(numero1 == numero2){
        System.out.println("a nossa condicao é verdadeira");
    }

    System.out.println("numeroUm é igual a numeroDois? " + simNao);

    simNao = numero1 != numero2;
    System.out.println("numeroUm é diferente a numeroDois? " + simNao);
    
   simNao = numero1 > numero2;
    System.out.println("numeroUm é maior que numeroDois? " + simNao);
 }


}
/* Operadores 6 - 

Relacionais 
avalaiar relacoes, condicoes entre duas variaveis ou expressao

== Quando desejamos verificar se uma variavel é igual a outra
!= variavel é diferente da outra
> queremos verificar se uma variavel é maior q a outra
> = maior ou igual
< menor
<= menor ou igual
 */