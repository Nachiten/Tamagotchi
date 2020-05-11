import miEstado.*;

public class Mascota {
    int nivelFelicidad = 70;
    Estado estado;
    int cantVecesSeguidasComi;
    int cantMinutosAburrida;
    int cantVecesSeguidasJugue;

    public Mascota(Estado elEstado){
        estado = elEstado;
    }

    void jugar(){
        if (estado.puedeJugar()){
            System.out.println("Jugando..");
            switch(estado.getMiEstado()){
                case "Aburrida":
                    setEstado( new Contenta() );

                    break;
                case "Contenta":
                    if (cantVecesSeguidasJugue > 5){
                        setEstado( new Hambrienta() );
                        cantVecesSeguidasJugue = 0;
                        return;
                    }

                    aumentarFelicidadEn(2);

                    break;
            }
            cantVecesSeguidasJugue++;
        } else {
            System.out.println("No pude jugar");
        }
    }

    void comer(){
    System.out.println("Comiendo..");
        switch(estado.getMiEstado()){
            case "Aburrida":
                if (cantMinutosAburrida == 80){
                    setEstado( new Contenta() );
                }
                System.out.println("El estado es aburrida");
                break;
            case "Contenta":

                aumentarFelicidadEn(1);
                if (cantVecesSeguidasComi == 3){
                    setEstado( new Aburrida());
                    cantVecesSeguidasComi = 0;
                }
                System.out.println("El estado es contenta");
                break;
            case "Hambrienta":

                setEstado( new Contenta() );
                System.out.println("El estado es hambrienta");
                break;
        }

        cantVecesSeguidasComi++;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
        System.out.println("Ahora mi estado es: " + estado);
    }

    void aumentarFelicidadEn(int unValor){
        nivelFelicidad+= unValor;
        System.out.println("Mi nivel de felicidad ha aumentado en: " + unValor + " :D");
    }

}
