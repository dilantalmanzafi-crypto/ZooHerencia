package zooherencia;

public class Veterinaria {
    public void atender(Animal a) {
        System.out.println("Atendiendo a " + a.getNombre());
        a.sonido();
    }
}
