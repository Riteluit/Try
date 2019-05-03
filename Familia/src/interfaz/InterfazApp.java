package interfaz;
import mundo.Familia;

public class InterfazApp {
    private Familia miF;    
    
    public static void main(String[] args) {
        Familia obj1= new Familia("Camilo",1.64,6);
        Familia obj2= new Familia("andres",1.34,16);
        Familia obj3= new Familia("migel",1.94,26);
        
        
        
        System.out.println(obj1.getNombre());
        System.out.println(obj2.getNombre());
        System.out.println(obj3.getNombre());
        
        obj3.setNombre("Miguel Andres");
        System.out.println(obj1.getNombre());
        System.out.println(obj2.getNombre());
        System.out.println(obj3.getNombre());
        
        obj3.setApellido("Alvarez");
        System.out.println(obj1.getApellido());
        System.out.println(obj2.getApellido());
        System.out.println(obj3.getApellido());
     
        Familia.setApellido("Gomez");
        System.out.println(obj1.getApellido());
        System.out.println(obj2.getApellido());
        System.out.println(obj3.getApellido());
    }
    
}
