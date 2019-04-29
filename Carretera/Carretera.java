package carretera;
import java.util.ArrayList;
import java.io.*;
public class Carretera {
    static ArrayList<String> RutaA= new ArrayList<String>();
    static ArrayList<String> RutaB= new ArrayList<String>();
    static ArrayList<String> RutaC= new ArrayList<String>();
    
    static BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
    static BufferedWriter wr= new BufferedWriter (new OutputStreamWriter(System.out));
    
    public static void main(String[] args) {
        try{
        //Ruta A
        RutaA.add("Santa Marta");
        RutaA.add("La Paz");
        RutaA.add("Monteria");
        RutaA.add("Sincelejo");
        RutaA.add("Cartagena");
        RutaA.add("Barranquilla");
        
        //Ruta B
        RutaB.add("Cartagena");
        RutaB.add("Riohacha");
        RutaB.add("Valledupar");
        RutaB.add("La Paz");
        RutaB.add("San Benito");
        
        //Ruta C
        RutaC.add("Valle Dupar");
        RutaC.add("Plato");
        RutaC.add("San Benito");
        RutaC.add("Monteria");
        RutaC.add("Santa Marta");
        
        
        int i=1;    
        
        do{
            System.out.println("Menu\n" + "1. Camino con ciudad de origen y destino\n2. Camino con ciudad de origen, destino y hora\n3. Carretera que usara\n4. Lista de carreteras en mantenimiento con hora de duracion. \n5.Salir   ");
            System.out.print("Respuesta: ");
            //i = br.read();
            System.out.println(i);
            switch(i){
                
            case 1:
                
                ArrayList <String> Camino = new ArrayList<String>();
                ArrayList <String> Camino2 = new ArrayList<String>();
                ArrayList <String> Camino3 = new ArrayList<String>();
                System.out.print("Digite La Ciudad De Destino: ");
                String Destino2;
                Destino2 = br.readLine();
                
                System.out.print("Digite La Ciudad De Origen: ");
                String Origen;
                Origen = br.readLine();
                
//                if(RutaA.contains(Destino2) && RutaA.contains(Origen)){
//                    Camino.clear();
//                    int D2 = RutaA.indexOf(Destino2);
//                    System.out.println(D2);
//                    int O = RutaA.indexOf(Origen);
//                    System.out.println(O);
//                    for(int a=0;a>=D2;a++){
//                        Camino.add(a,RutaA.get(a));
//                        System.out.print( "["+ Camino.get(O) +"]");
//                        O++;
//                    }
//                }else{
                    if(RutaB.contains(Destino2) && RutaB.contains(Origen)){
                        
                        int D2 = RutaB.indexOf(Destino2);
                        System.out.println(D2);
                        int O = RutaB.indexOf(Origen);
                        System.out.println(O);
                        for(int b=0;b<=D2;b++){
                            Camino.add(RutaB.get(O));
                            O++;
                            System.out.print( "["+ Camino2.get(O) +"]");
                        }
                    }
                        
                        if(RutaC.contains(Destino2) && RutaC.contains(Origen)){
                            Camino.clear();
                            int D2 = RutaC.indexOf(Destino2);
                            System.out.println(D2);
                            int O = RutaC.indexOf(Origen);
                            System.out.println(O);
                            
                            for(int a=0;a<=D2;a++){
                                Camino.add(a,RutaC.get(a));
                                O++;
                                System.out.print( "["+ Camino3.get(O) +"]");

                            }
                        }
                    
                
                
                
                
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
                
            default:
                if(i>5)
                System.out.println("Respuesta no valida\n");
                break;
            
            }
        }while(i != 5);
    
        }catch(Exception ex){}
    
    }
}
