public class MainLuchador {
    public static void main(String[] args) {
        // Creamos a los dos combatientes
        Luchador luchador1 = new Luchador("Ryu", 100, 25, 10);
        Luchador luchador2 = new Luchador("Ken", 100, 22, 12);

        boolean victoria = false;

        while (!victoria) {
            System.out.println(luchador1.getNombre() + " ataca");
            if (luchador2.recibeDanho(luchador1.ataca())) {
                System.out.println("\n" + luchador2.getNombre() + " pierde");
                System.out.println("Gana " + luchador1.getNombre());
                victoria = true;
                break;
            }

            System.out.println(luchador2.getNombre() + " contraataca");
            if (luchador1.recibeDanho(luchador2.ataca())) {
                System.out.println("\n" + luchador1.getNombre() + " pierde");
                System.out.println("Gana " + luchador2.getNombre());
                victoria = true;
            }
        }
    }
}
