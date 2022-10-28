public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("O estado atual da TV é ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual:  " + smartTv.volume);

        System.out.println("MUDANDO  TODOS OS COISOS\n");
        smartTv.ligar();
        smartTv.mudarCanal(69);
        smartTv.diminuirVolume();

        System.out.println("O estado atual da TV é ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual:  " + smartTv.volume);
    }  
}
