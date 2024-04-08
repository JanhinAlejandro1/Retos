//Crear un array de 10.000 elementos de tipo persona
//crear una lista de 10.000 elementos de tipo persona
//comparar el tiempo de insercion en cada caso
//todas las instancias a introducir son iguales.

import java.util.ArrayList;
import java.util.List;

public class ComparaArrayLista {
    // crear una persona
    // crear un array de 10.000 personas
    // introducir la misma persona 10.000 en el array

    // system.currentTimeMillis()

    public static void main(String[] args) {

        long inicio;
        long finall;
        long resultado;

        Persona persona = new Persona("267584e", "samuel", "umtiti", 65);

        inicio = System.nanoTime();
        Persona ListaPersona[] = new Persona[10000];
        finall = System.nanoTime();
        for (int i = 0; i < 10000; i++) { 
            ListaPersona[i] = persona;

        }
        resultado = finall - inicio;
        System.out.println(resultado);





        }
    }


class Persona {

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    // construcotr
    public Persona(String dni, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellido;
        this.edad = edad;
    }

    public Persona() {
        dni = null;
        nombre = null;
        String apellidos = null;
        edad = -1;
    }

    // getter y setter
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return ("DNI: " + dni + " " + "NOMBRE:" + nombre + " APELLIDOS: " + apellidos + " EDAD: " + edad);
    }

}