public class Usuario {
    public static void main(String [] args) throws Exception{
        SmartTv smartTv  = new SmartTv();

        System.out.println(smartTv.ligada);
        System.out.println(smartTv.volume);
        System.out.println(smartTv.canal);
        System.out.println("MUDANDO TODOS OS PARAMETROS \n");
        smartTv.ligar();
        int x = 1;        
while (x < 6){
x++;
smartTv.aumentarVolume();
}
smartTv.mudarCanal(666);
System.out.println(smartTv.ligada);
System.out.println(smartTv.volume);
System.out.println(smartTv.canal);
}
    }

