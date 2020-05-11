package miEstado;

public class Hambrienta extends Estado {

    public Hambrienta(){
        miEstado = "Hambrienta";
    }

    public boolean puedeJugar(){
        return false;
    }
}
