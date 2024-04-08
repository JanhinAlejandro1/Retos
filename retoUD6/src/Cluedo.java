public class Cluedo {
    public static void main(String[] args) {

        String[] personajesArray = { "Amapola", "Celeste", "Prado", "Mora", "Rubio", "Blanco" };// 6 elemnetos
        String[] armasArray = { "bate", "pistola", "candelabro", "cuchillo", "cuerda", "hacha", "pesa", "veneno",
                "ramon" };// 9 elementos
        String[] habitacionesArray = { "casa de invitados", "teatro", "spa", "observatorio", "comedor", "terraza",
                "salon", "cocina", "vesticulo" }; //9 elementos

                Jugador jugador= new Jugador();
                jugador.setHabitacion(armasArray[1]);
                jugador.setArma(habitacionesArray[1]);
                jugador.setNombre(personajesArray[1]);

                System.out.println(jugador.getArma()+" "+ );
    }
}
