import java.nio.file.attribute.FileAttribute;

public class MainCoche {
   public static void main(String[] args) {
       Coche coche1=new Coche("Fiat", 140);

       coche1.acelerar(50);
       coche1.mostrarVelocidad();
       coche1.acelerar(20);
       coche1.mostrarVelocidad();
       coche1.frenar(40);
       coche1.mostrarVelocidad();




    }
}
