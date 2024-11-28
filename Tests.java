import Exercises.Colecciones;
import Exercises.DataTypes;
import Exercises.Padre;
import Exercises.Sobrecarga;
import Exercises.Alumno;



public class Tests{

    public static void main(String[] args) {
        boolean success = true;
        String errorMsg = "";
        //Data Types
        DataTypes emptyDataTypes = new DataTypes();
        DataTypes dataTypes = new DataTypes("String",5,3.2f,'B',true);

        if (! (emptyDataTypes.cadena == "Hola Mundo"))
            success = false;
        if (! (emptyDataTypes.caracter == 'A'))
            success = false;
        if (! (emptyDataTypes.entero == 10))
            success = false;
        if (! (emptyDataTypes.flotante == 5.9f))
            success = false;
        if (! (emptyDataTypes.boleano))
            success = false;
        if (! (dataTypes.cadena == "String"))
            success = false;
        if (! (dataTypes.entero == 5))
            success = false;
        if (! (dataTypes.flotante == 3.2f))
            success = false;
        if (! (dataTypes.caracter == 'B'))
            success = false;
        if (! (dataTypes.boleano))
            success = false;
        if(success == false)
            errorMsg.concat(" DataTypes");
        //Colecciones
        Colecciones coleccion = new Colecciones();
        coleccion.inicializar();
        coleccion.obtenerHash();
        if(coleccion.transport.size()!=10){
            success =false;
            errorMsg.concat(" Colecciones");
        }
        //Herencia
        Padre papa = new Padre("Perez");
        if(papa.test()){
            success =false;
            errorMsg.concat(" Padre");
        }

        //Sobrecarga
        Sobrecarga sbc = new Sobrecarga("Pepe", "Progra", 5);
        Alumno alumno = new Alumno("Pepe", "Progra", 0);
        if (alumno.reprobar()!=":("){
                success =false;
                errorMsg.concat(" Sobrecarga");
        }


        if (success)
            System.out.println(success);
        else
           System.out.println(errorMsg);    
    }
}