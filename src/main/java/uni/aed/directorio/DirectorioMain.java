/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.directorio;

import javax.swing.JOptionPane;
import uni.aed.model.Persona;
import uni.aed.sort.SortObject;
/**
 *
 * @author hp
 */
public class DirectorioMain {
    public static void main(String[] args) {
        DirectorioMain tester = new DirectorioMain();
        tester.heapSortPersona();
        tester.heapSortEnteros();
    }
    //1PC:demostracion 1a)
    private void heapSortPersona(){
        Directorio directorio=new DirectorioV1(4);
        Persona p1=new Persona("Sonya Smith",30,'F');
        Persona p2=new Persona("Barack Obama",60,'M');
        Persona p3=new Persona("Dina Boluarte",50,'F');
        Persona p4=new Persona("Mick Jagger",75,'M');
        
        directorio.add(p1);
        directorio.add(p2);
        directorio.add(p3);
        directorio.add(p4);
        
        System.out.println("Data Persona Origen en Directorio ");
        System.out.println(directorio.toString());
        
        System.out.println("Heapsort:Ordenando por Nombre ");
        Object[] sortedlist = directorio.sort( Persona.NAME,"HEAPSORT");        
        for(Object p: sortedlist)
            System.out.println( ((Persona)p).toString( ) );
        
        System.out.println("Heapsort:Ordenando por Edad ");
        sortedlist = directorio.sort( Persona.AGE,"HEAPSORT");        
        for(Object p: sortedlist)
            System.out.println( ((Persona)p).toString( ) );
    }
    //1PC:demostracion 1b)
    private void heapSortEnteros(){
        Integer X[]={5,14,24,39,43,65,84,45};        
        System.out.println("Heapsort:Lista origen de Enteros ");        
        for(Object p: X)
            System.out.println( ((Integer)p).toString( ) );
        
        SortObject sortObject=new SortObject();                 
        Object[]result=sortObject.HeapSort((Object[])X);     
        
        System.out.println("Heapsort:Ordenando Enteros ");        
        for(Object p: result)
            System.out.println( ((Integer)p).toString( ) );
    }


    private void start( ) {
        String[] name = {"ape", "cat", "bee", "bat", "eel",
                         "dog", "gnu", "yak", "fox", "cow",
                         "hen", "tic", "man"};
        Persona p;
        Directorio ab;

        int version = Integer.parseInt(
                        JOptionPane.showInputDialog(null,"Uso de Directorio Version #:"));

        switch (version) {
            case 1:  ab = new DirectorioV1(); break;
            case 2:  ab = new DirectorioV2(); break;            
            default: ab = new DirectorioV1(); break;
        }

        for (int i = 0; i < name.length; i++) {
            p = new Persona(name[i], random(10, 50),
                            random(0,1)==0?'M':'F'); //if(random(0,1) ==0) 'M' else 'F'
            ab.add(p);
        }
        System.out.println("Visualizando el Directorio");
        System.out.println( ab.toString());
        
        System.out.println(" ");
        
        Persona[] sortedlist = ab.sort( Persona.AGE );
        for (int i = 0; i < sortedlist.length; i++) {
            System.out.println( sortedlist[i].toString( ) );
        }
        
        System.out.println(" ");
        System.out.println("Visualizando el Directorio");
        System.out.println( ab.toString());
        
        System.out.println(" ");

        sortedlist = ab.sort( Persona.NAME );
        for (int i = 0; i < sortedlist.length; i++) {
            System.out.println( sortedlist[i].toString( ) );
        }
        
        System.out.println(" ");
        System.out.println("Visualizando el Directorio");
        System.out.println( ab.toString());
    }    
    

    /**
     * Returns a random integer between low
     * and high, inclusive.
     *
     * @param low  the low bound of the random number
     * @param high the high bound of the random number
     *
     * @return a random integer between low and high
     */
    private int random(int low, int high) {
        return (int) Math.floor(Math.random() * (high - low + 1)) + low;
    }
}
