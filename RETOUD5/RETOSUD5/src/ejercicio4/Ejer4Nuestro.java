package ejercicio4;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//crear un array de 1000 persona
//introducir la misma persona pero con edad consecutivo.
//crear directorio "personas"
//crear un archuvo en directorio peronas llamado persona inicial.dart
//crear dos archivos "personasPAr.dar" y "personasImpar.dat"
//leer personas de personasInicial.dar y almacenar dependiendo del dni en uno y otro el q corresponda
public class Ejer4Nuestro {
    public static void main(String[] args) {
        //crear array y rellenarla de la persona(sumando uno a la edad)
        Persona persona=new Persona ("4532","pau","cubarsi", 0);
        Persona[] listaPersona=new Persona[1000];
         for (int i=0;i<listaPersona.length;i++){
        persona.setEdad(i);
        listaPersona[i]=persona;
}
        //crear directorio
       String directorio=".//RETOSUD5//src//ejercicio4";
       File nuevoDirectorio= new File(directorio+"//personas") ;
       nuevoDirectorio.mkdir();

      //crear un archivo en el directorio
      File fichero= new File (".//RETOSUD5//src//ejercicio4//personas");

       











    }
}
