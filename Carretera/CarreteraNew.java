package carreteras;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
public class Carreteras{
    static ArrayList<String> RutaA= new ArrayList<String>();
    static ArrayList<String> RutaB= new ArrayList<String>();
    static ArrayList<String> RutaC= new ArrayList<String>();
    
    static BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
    static BufferedWriter bw= new BufferedWriter (new OutputStreamWriter(System.out));
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
          
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
        
        
          int i=0;
        
        do{
            System.out.println("Menu\n" + "1. Camino con ciudad de origen y destino\n2. Camino con ciudad de origen, destino y hora\n3. Carretera que usara\n4. Lista de carreteras en mantenimiento con hora de duracion. \n5. Salir   ");
            System.out.print("Respuesta: ");
            i=sc.nextInt();
            switch(i){
                
            case 1:
                
                ArrayList <String> Camino = new ArrayList<String>();
                System.out.print("Digite La Ciudad De Destino: ");
                String Destino2;
                Destino2 = br.readLine();
                
                System.out.print("Digite La Ciudad De Origen: ");
                String Origen;
                Origen = br.readLine();
                
                if(RutaA.contains(Destino2) && RutaA.contains(Origen)){
                    Camino.clear();
                    int D2 = RutaA.indexOf(Destino2);
                    System.out.println(D2);
                    int O = RutaA.indexOf(Origen);
                    System.out.println(O);
                    for(int a=0;a>=D2;a++){
                        Camino.add(a,RutaA.get(a));
                        System.out.print( "["+ Camino.get(O) +"]");
                        O++;
                    }
                }
                
                if(RutaB.contains(Destino2) && RutaB.contains(Origen)){
                    Camino.clear();
                    int D2 = RutaB.indexOf(Destino2);
                    System.out.println(D2);
                    int O = RutaB.indexOf(Origen);
                    System.out.println(O);
                    for(int b=0;b<=D2;b++){
                        Camino.add(b,RutaB.get(O));
                        System.out.print( "["+ Camino.get(b) +"]");
                        O++;
                    }
                }
                        
                if(RutaC.contains(Destino2) && RutaC.contains(Origen)){
                    Camino.clear();
                    int D2 = RutaC.indexOf(Destino2);
                    System.out.println(D2);
                    int O = RutaC.indexOf(Origen);
                    System.out.println(O);

                    for(int a=0;a<=D2;a++){
                        Camino.add(a,RutaC.get(O));
                        O++;
                        System.out.print( "["+ Camino.get(a) +"]");                         
                    }
                }
                
                break;
                
            case 2:
                
              
                
                break;
            case 3:
                ArrayList <String> Camino2 = new ArrayList<String>();
                System.out.print("Digite La Ciudad De Destino: ");
                String Destino;
                Destino = br.readLine();
                
                System.out.print("Digite La Ciudad De Origen: ");
                String Origen2;
                Origen2 = br.readLine();
                
                if(RutaA.contains(Destino) && RutaA.contains(Origen2)){
                    Camino2.clear();
                    int D2 = RutaA.indexOf(Destino);
                    System.out.println(D2);
                    int O = RutaA.indexOf(Origen2);
                    System.out.println(O);
                    for(int a=0;a>=D2;a++){
                        Camino2.add(a,RutaA.get(a));
                        System.out.print( "["+ Camino2.get(O) +"]");
                        O++;
                    }
                }
                
                if(RutaB.contains(Destino) && RutaB.contains(Origen2)){
                    Camino2.clear();
                    int D2 = RutaB.indexOf(Destino);
                    System.out.println(D2);
                    int O = RutaB.indexOf(Origen2);
                    System.out.println(O);
                    for(int b=0;b<=D2;b++){
                        Camino2.add(b,RutaB.get(O));
                        System.out.print( "["+ Camino2.get(b) +"]");
                        O++;
                    }


                }
                        
                if(RutaC.contains(Destino) && RutaC.contains(Origen2)){
                    Camino2.clear();
                    int D2 = RutaC.indexOf(Destino);
                    System.out.println(D2);
                    int O = RutaC.indexOf(Origen2);
                    System.out.println(O);
                    for(int a=0;a<=D2;a++){
                        Camino2.add(a,RutaC.get(O));
                        O++;
                        System.out.print( "["+ Camino2.get(a) +"]");

                    }
                }
              //SEPARAR
//                if(RutaA.contains(Destino2) && RutaB.contains(Origen)){
//                    Camino2.clear();
//                    int D2 = RutaC.indexOf(Destino2);
//                    System.out.println(D2);
//                    int O = RutaC.indexOf(Origen);
//                    System.out.println(O);
//
//                    for(int a=0;a<=D2;a++){
//                        Camino2.add(a,RutaC.get(O));
//                        O++;
//                        System.out.print( "["+ Camino2.get(a) +"]");
//
//                    }
//                }
//                
//                if(RutaA.contains(Destino2) && RutaC.contains(Origen)){
//                    Camino2.clear();
//                    int D2 = RutaC.indexOf(Destino2);
//                    System.out.println(D2);
//                    int O = RutaC.indexOf(Origen);
//                    System.out.println(O);
//
//                    for(int a=0;a<=D2;a++){
//                        Camino2.add(a,RutaC.get(O));
//                        O++;
//                        System.out.print( "["+ Camino2.get(a) +"]");
//
//                    }
//                }
//                if(RutaB.contains(Destino2) && RutaA.contains(Origen)){
//                    Camino2.clear();
//                    int D2 = RutaC.indexOf(Destino2);
//                    System.out.println(D2);
//                    int O = RutaC.indexOf(Origen);
//                    System.out.println(O);
//
//                    for(int a=0;a<=D2;a++){
//                        Camino2.add(a,RutaC.get(O));
//                        O++;
//                        System.out.print( "["+ Camino2.get(a) +"]");
//
//                    }
//                }
//                if(RutaB.contains(Destino2) && RutaC.contains(Origen)){
//                    Camino2.clear();
//                    int D2 = RutaC.indexOf(Destino2);
//                    System.out.println(D2);
//                    int O = RutaC.indexOf(Origen);
//                    System.out.println(O);
//
//                    for(int a=0;a<=D2;a++){
//                        Camino2.add(a,RutaC.get(O));
//                        O++;
//                        System.out.print( "["+ Camino2.get(a) +"]");
//
//                    }
//                }
//                if(RutaC.contains(Destino2) && RutaA.contains(Origen)){
//                    Camino2.clear();
//                    int D2 = RutaC.indexOf(Destino2);
//                    System.out.println(D2);
//                    int O = RutaC.indexOf(Origen);
//                    System.out.println(O);
//
//                    for(int a=0;a<=D2;a++){
//                        Camino2.add(a,RutaC.get(O));
//                        O++;
//                        System.out.print( "["+ Camino2.get(a) +"]");
//
//                    }
//                }
//                if(RutaC.contains(Destino2) && RutaB.contains(Origen)){
//                    Camino2.clear();
//                    int D2 = RutaC.indexOf(Destino2);
//                    System.out.println(D2);
//                    int O = RutaC.indexOf(Origen);
//                    System.out.println(O);
//
//                    for(int a=0;a<=D2;a++){
//                        Camino2.add(a,RutaC.get(O));
//                        O++;
//                        System.out.print( "["+ Camino2.get(a) +"]");
//
//                    }
//                }
                break;
            case 4:
              	ArrayList<String> Rutas= new ArrayList<String>();
              
              	ArrayList<String> HoraMante= new ArrayList<String>(); 

              	Rutas.add("Riohacha");
              	Rutas.add("Santa Marta");
              	Rutas.add("Barranquilla");
              	Rutas.add("Cartagena");
              	Rutas.add("Sincelejo");
              	Rutas.add("Monteria");
              	Rutas.add("Valedupar");
              	Rutas.add("Plato");
              	Rutas.add("La Paz");
              	
              	HoraMante.add("2 pm A 6 pm");
              	HoraMante.add("1 am A 4 am");
              	HoraMante.add("3 pm A 9 pm");
              	HoraMante.add("11 pm A 3 am");
              	HoraMante.add("3 am A 6 am");
              	HoraMante.add("4 pm A 7 pm");
              	HoraMante.add("6 am A 11 am");
             	HoraMante.add("10 pm A 2 am");
             	HoraMante.add("10 am A 1 pm");
              System.out.println("Ciudad        Hora Mantenimiento");
              	for(int p = 0;p < Rutas.size()-1;p++){
              	
                System.out.print("["+ Rutas.get(p) +"]/");
                System.out.print("/["+ HoraMante.get(p)+"]\n");
                }
                
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

