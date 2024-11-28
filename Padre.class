package Exercises;

public class Padre {
    String apellido;
    public Padre(String apellido){
        this.apellido = apellido;
    }
   
}
public class Hijo extends Padre{
    String nombre;
    public Hijo(String nombre, String apellido){
        super(apellido);
        this.nombre=nombre;
    }
}
public class EspirituSanto extends Hijo {
    String apellidoReal;
    public EspirituSanto(String nombre, String apellido, String apellidoReal){
        super(nombre, apellido);
        this.apellidoReal = apellidoReal;
    }
    public Boolean pruebaParternidad(){
        return this.apellido == this.apellidoReal;
    }
    
}