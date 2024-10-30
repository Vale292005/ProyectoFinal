import java.util.Queue;

public class Activities {
    // Nodo simple
    String name;
    Queue<Tarea> dato;
    Activities anterior;
    Activities siguiente;

    public Activities(String name) {
        this.name = name;
        this.anterior = null; // Inicialmente, el nodo anterior es null
        this.siguiente = null; // Inicialmente, el nodo siguiente es null
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Activities getAnterior() {
        return anterior;
    }

    public void setAnterior(Activities anterior) {
        this.anterior = anterior;
    }

    public Activities getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Activities siguiente) {
        this.siguiente = siguiente;
    }
    //crear actividad
    //eliminar actividad
    //editar actividad
}

