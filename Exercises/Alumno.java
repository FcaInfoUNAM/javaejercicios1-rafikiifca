package Exercises;

public class Alumno extends Sobrecarga{

    public Alumno(String nombre, String materia, int calificacion){

        super(nombre, materia, calificacion);

    }

    public String reprobar(){

        if(this.calificacion>5)

            return ":)";

        else

            return ":(";
            
    }
    
}