package ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        // pedir por pantalla tantas persona como se quiere.
        // al final de cada persona pregunatr si se quiere introducir en otra [s/n]
        // guardar las Personas introducidads en una lista de tipo list

        List<Persona> personas = new ArrayList<Persona>();

        Scanner teclado = new Scanner(System.in);
        Persona persona = null;
        char continuar = 'S';

        System.out.println("Quieres introduducir una persona [s/N]");
        continuar = teclado.nextLine().toUpperCase().charAt(0);

        while (continuar == 'S') {
            persona = new Persona();
            // DNI

            System.out.println("Introduce el DNI: ");
            persona.setDni(teclado.nextLine());
            // NOMBRE
            System.out.println("Introduce el NOMBRE: ");
            persona.setNombre(teclado.nextLine());
            // APELLIDOS
            System.out.println("Introduce el APELLIDOS: ");
            persona.setApellidos(teclado.nextLine());
            // EDAD
            System.out.println("Introduce la EDAD: ");
            persona.setEdad(teclado.nextInt());

            teclado.nextLine();

            personas.add(persona);System.err.println();

            System.out.println("Quieres introduducir una persona [s/N]");
            continuar = teclado.nextLine().toUpperCase().charAt(0);

        }
        for (Persona personaActual : personas) {
            System.out.println(personaActual.toString());
        }
        teclado.close();

    }

}