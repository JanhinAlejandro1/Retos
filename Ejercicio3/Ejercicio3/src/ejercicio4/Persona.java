package ejercicio4;

public class Persona {
    //(esta clase la tendras que haber definido antes,
    //minimo 4 atributos y un condtructor para inicializar el objeto)
    //ATRIBBUTOS
    //dni , nombre, apellidos ,edad
    //contrusctor
    //getter y setter

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    //construcotr
    public Persona(String dni, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellido;
        this.edad = edad;
    }
        public Persona(){
            dni= null;
            nombre=null;
           String apellidos = null;
            edad=-1;
        }
    
    //getter y setter
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public  void setNombre(String nombre) {
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
        return("DNI: " + dni+" "+ "NOMBRE:"+nombre+ " APELLIDOS: "+ apellidos + " EDAD: "+edad );
    }
    
}