package mundo;

public class Familia{
    
    // Atributos de Instancia
    private String nombre;
    private double estatura;
    private int edad;
    
    // Atributos de Clase
    private static String apellido;
    
    public Familia(String nombre,double estatura,int edad){
    this.nombre = nombre;
    this.estatura = estatura;
    this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static String getApellido() {
        return apellido;
    }

    public static void setApellido(String apellido) {
        Familia.apellido = apellido;
    }

    
}
