public class  Operadores1 {
    public static void main(String [] args) {
        String concatenacao = "?";
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
    }
}
/*Operadores 2 - 
 Atribuição   =
 String nome = "João";
 int idade = 22;

 Aritméticos
 double soma = 10.6 + 15.7
 int multiplicacao = 20 * 7;
 int modulo = 18 % 3 ( verificar se a divisao dessa expressao vai ser numero fracionario)

 ATENÇAO! O operador de adicao quando utilizado em variáveis do tipo texto, 
 realizará a "concatenação de textos"
String nomeCompleto = "LINGUAGEM" + "JAVA";
LINGUAGEMJAVA
 */