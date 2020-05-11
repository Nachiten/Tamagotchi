package miEstado;

public abstract class Estado {
    protected String miEstado;

    public String getMiEstado() {
        return miEstado;
    }

    public abstract boolean puedeJugar();
}
