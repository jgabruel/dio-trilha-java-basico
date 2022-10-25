package edu.joaogab.anatomiaclasses3;
public class MinhaClasse1 {
public static void main(String [] args) {
    String primeiroNome = "Joao";
    String segundoNome = "Gabriel";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
}


}
/* 
Anatomia de Classes - 3
Declarando variáveis e métodos

Estrutura método Java

TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

int somar (int numeroUm, int numero2)
String formatarCep (long cep)
 */