package practicasClase;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import java.util.Iterator;

import ejercicio4.Persona;

public class ListasYconjuntos {

    public static void main(String[] args) {

        // vamos a crear una lista de personas,
        // rellenamos con 100 personas
        // creamos un set de personas
        // le introducimos los elementros de la lista

        List<Persona> listapersonas = new ArrayList<Persona>();
        Persona persona = null;
        for (int i = 0; i < 100; i++) {
            persona = new Persona("3432", "pau", "cubarsi", i);
            listapersonas.add(persona);

        }
        HashSet<Persona> setPersona = new HashSet<Persona>();
        for (int i = 0; i < 10; i++) {
            persona = new Persona("3432", "pau", "cubarsi", i);
            setPersona.add(listapersonas.get(i));
        }

      Iterator<Persona> iteradorSet=setPersona.iterator();
      while (iteradorSet.hasNext() ){
        System.out.println(((Persona) iteradorSet.next()).getEdad());

       // for(int i=0;i<listaPersona.size();i++){
        //    System.out.println("LISTA,elem: "+listaPersonas.get(i) );
         //   System.out.println("///");
          //  System.out.println("SET,elem: "+setPersona);
      





}









    }
}
