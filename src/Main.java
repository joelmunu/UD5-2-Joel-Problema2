public class Main {
    public static void main(String[] args) {
        VeredaGT vereda3000GT = new VeredaGT("8128KLS", 5000, 5000, 1000);
        vereda3000GT.move();
        vereda3000GT.move();
        vereda3000GT.move();
        vereda3000GT.move();
        vereda3000GT.move();
        System.out.println("");
        System.out.println("*******************************************************");
        System.out.println("Nivel de batería actual: " + vereda3000GT.energyLevel());
        System.out.println("*******************************************************");
        System.out.println("");
        vereda3000GT.move();
        System.out.println("");
        System.out.println("****************************** ESTADO DEL VEHÍCULO ******************************");
        System.out.println(vereda3000GT.status());
        System.out.println("*********************************************************************************");
        System.out.println("");
        vereda3000GT.recharge();
        System.out.println("");
        System.out.println("*******************************************************");
        System.out.println("Nivel de batería actual: " + vereda3000GT.energyLevel());
        System.out.println("*******************************************************");
        System.out.println("");
        vereda3000GT.move();
        System.out.println("");
        System.out.println("****************************** ESTADO DEL VEHÍCULO ******************************");
        System.out.println(vereda3000GT.status());
        System.out.println("*********************************************************************************");
    }
}