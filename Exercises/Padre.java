package Exercises;

public class Padre {

    String apellido;

    public Padre(String apellido){

        this.apellido = apellido;
    }

    public Boolean test () {

        Hijo hijo = new Hijo("Juan", this.apellido);

        EspirituSanto es = new EspirituSanto("Juan", this.apellido, "Lopez");

        return es.pruebaParternidad();

    }
   
}




 
