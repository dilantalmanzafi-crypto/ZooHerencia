package zooherencia;

public class Main {
    public static void main(String[] args) {
        Veterinaria vet = new Veterinaria();
        Perro perro = new Perro("Firu", new Collar("rojo"));
        Gato gato = new Gato("Misu");

        vet.atender(perro); // polimorfismo
        vet.atender(gato);  // polimorfismo

        Animal a = new Perro("Rocky", new Collar("azul")); // upcasting
        if (a instanceof Perro) {
            Perro p = (Perro) a; // downcasting
            p.saludar();
        }

        Caja<Animal> caja = new Caja<>();
        caja.set(gato);   // genérico sin colecciones
        Animal guardado = caja.get();
        vet.atender(guardado);
    }
}
