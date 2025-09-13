package zooherencia;

public class Caja<T> {
    private T contenido;

    public void set(T contenido) {
        this.contenido = contenido;
    }

    public T get() {
        return contenido;
    }
}
