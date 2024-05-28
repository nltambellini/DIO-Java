public class Usuario {
 
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();

        System.out.println("Novo status: " + smartTv.ligada);

        smartTv.aumentarVolume();

        System.out.println("Volume: " + smartTv.volume);

        smartTv.mudarCanal(30);

        System.out.println("Canal atual: " + smartTv.canal);





        

    }
}
