package interfaz;
import mundo.Estudiante;

public class InterfazApp {
    private Estudiante miE;
    
    public static void main(String[] args) {
        Estudiante Estd1= new Estudiante("Ing. Sistemas", 3, "Camilo","Rojas", 18, 1000899846);
        Estudiante Estd2= new Estudiante("Aux. Medicia", 1, "Sofia","Gomez", 19, 1001879652);
        Estudiante Estd3= new Estudiante("Ing. Civil", 4, "Migel","Perez", 21, 1000354683);
        
        
        System.out.println("Nombre: ");
        System.out.println(Estd1.getNombre());
        System.out.println(Estd2.getNombre());
        System.out.println(Estd3.getNombre()+"\n");
                
        System.out.println("Apellido: ");
        System.out.println(Estd1.getApellido());
        System.out.println(Estd2.getApellido());
        System.out.println(Estd3.getApellido()+"\n"); 
        
        System.out.println("Edad: ");
        System.out.println(Estd1.getEdad());
        System.out.println(Estd2.getEdad());
        System.out.println(Estd3.getEdad()+"\n"); 
        
        System.out.println("Carrera: ");
        System.out.println(Estd1.getCarrera());
        System.out.println(Estd2.getCarrera());
        System.out.println(Estd3.getCarrera()+"\n"); 
        
        System.out.println("Semestre: ");
        System.out.println(Estd1.getSemestre());
        System.out.println(Estd2.getSemestre());
        System.out.println(Estd3.getSemestre()+"\n"); 
        
        System.out.println("Cedula: ");
        System.out.println(Estd1.getCedula());
        System.out.println(Estd2.getCedula());
        System.out.println(Estd3.getCedula()+"\n"); 
        
    }
   
}
