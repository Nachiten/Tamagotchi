import miEstado.*;


public class Main {

    public static void main(String[] args) {
        Mascota miMascota = new Mascota( new Contenta() );

        miMascota.jugar();
        miMascota.jugar();
        miMascota.jugar();
        miMascota.jugar();
        miMascota.jugar();
        miMascota.jugar();
        miMascota.comer();
        miMascota.comer();
        miMascota.comer();

    }
}
