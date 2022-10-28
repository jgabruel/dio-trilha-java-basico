public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}

/*
1 -  criar classe SmartTv e variavel com seus estados iniciais
2 - criar nova classe usuario com o qual interagira com a smarttv
3 - determinar que precisa de uma smarttv no usuario
SmartTv smartTv = new SmartTv(); criar uma classe pra ilustrar a iteracao dos metodos e atributos
4 - no usuario prints para exibir estado atual da tv
5 - criar metodos em SmartTv.java para manipular os estados iniciais
ligar, desligar, aumentar volume, diminuir volume, subir canal, descer canal, definir canal
UNICO DIFERENTE -> DEFINIR CANAL
public void mudarCanal(int novoCanal){
	canal = novoCanal;
}
cria o metodo mudar canal, com parametro inteiro novoCanal, e declara canal = novoCanal
para mudar o canal dessa forma em Usuario interagindo, smartTv.mudarCanal(13)
6 - fazer as devidas alteracoes e manipulacoes desejavas no Usuario.java

 */