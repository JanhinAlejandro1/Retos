import java.time.LocalTime;

public class Jugador {
    //atributo
private String nombre;
private String arma;
private String habitacion;
private LocalTime horaPartida;
    //constructor

    public Jugador (){
this.nombre=null;
this.arma=null;
this.habitacion=null;
this.horaPartida=null;
}
//getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public LocalTime getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida() {
        this.horaPartida =LocalTime.now();
    }
public static void main(String[] args) {
    
    Jugador jugador= new Jugador();
    jugador.setArma("Espada");
    jugador.setHabitacion("1ºb");
    jugador.setNombre("Pau cubarsi");
    jugador.setHoraPartida();

    System.out.println(jugador.getArma() +" "+jugador.getHoraPartida()+" "+ jugador.getHabitacion()+" "+ jugador.getNombre());
}

}