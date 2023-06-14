/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.ups.edu.junio;

import java.util.Arrays;

/**
 *
 * @author Sofi Peña
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("Colas y Pilas implementacion generica");
        
        //instancia de las clases
        
        //clases colaTarea
        ColaTarea<String> colaTarea = new ColaTarea<>();
        ColaTarea<Integer> colaTareaInt = new ColaTarea<>();
        ColaTarea<int[]>colaTareaArregloEnteros = new ColaTarea<>();
        ColaTarea<String[]>colaTareaArregloString= new ColaTarea<>();
        
        
        
        //clases pilaTareas
        PilaTarea<Integer> pilaTarea = new PilaTarea<>();
        PilaTarea<ColaTarea> pilaTareaDeCola = new PilaTarea<>();
        
        
        
        
        //insercion de tareas a la cola
        colaTarea.agregarTarea(new Tarea(1,"Tarea 1"));
        colaTarea.agregarTarea(new Tarea(2,"Tarea 2"));
        colaTarea.agregarTarea(new Tarea(3,"Tarea 3"));
        colaTarea.agregarTarea(new Tarea(5,"Tarea 5"));
        colaTarea.agregarTarea(new Tarea(6,"Tarea 6"));
        
        
        colaTareaInt.agregarTarea(new Tarea(6,6));
        colaTareaInt.agregarTarea(new Tarea(7,7));
        colaTareaInt.agregarTarea(new Tarea(8,8));
     
        //int[] a =[1,2,3];
        
        Tarea<int[]> t2= new Tarea(8, new int []{212,21,});
        colaTareaArregloEnteros.agregarTarea(t2);
        colaTareaArregloEnteros.agregarTarea(new Tarea(9, new int []{212,21,}));
        
        
        
        //insercion de tareas a la pila
        pilaTarea.agregarTarea(new Tarea(6,6));
        pilaTarea.agregarTarea(new Tarea(7,7));
        pilaTarea.agregarTarea(new Tarea(8,8));
        
        
        //prosesar las tareas de la cola <Strign>
         while (!colaTarea.estaVacia()) {
            Tarea<String> tareaProcesada = colaTarea.procesarTarea();

            //prosesar tareas de las pila<Integer>
            System.out.println("Procesando tarea de la cola: \n\t Sale-->" + tareaProcesada.getId() + "-" + tareaProcesada.getAtributo());
        }
        System.out.println("-------------------------------------------------");

        while (!colaTareaInt.estaVacia()) {
            Tarea<Integer> tareaProcesadaInt = colaTareaInt.procesarTarea();
            System.out.println("Procesando tarea cola: \n\t Sale-->" + tareaProcesadaInt.getId() + "-" + tareaProcesadaInt.getAtributo());
        }
        System.out.println("-------------------------------------------------");
        while (!colaTareaArregloEnteros.estaVacia()) {
            Tarea<int[]> tProceAE = colaTareaArregloEnteros.procesarTarea();
            System.out.println("Procesando \n\t Sale-->" + tProceAE.getId() + "-" + Arrays.toString(tProceAE.getAtributo()));
        }
        
        System.out.println("---------------------------------------------------------");
        while(!colaTareaArregloString.estaVacia()){
            Tarea<String[]> tProAS = colaTareaArregloString.procesarTarea();
            System.out.println("Procesando \n\t Sale-->" + tProAS.getId() + "-" + Arrays.toString(tProAS.getAtributo()));
        }
        
        System.out.println("---------------------------------------------------");
        while (!pilaTarea.estaVacia()) {
            Tarea<Integer> tareaProcesadaP = pilaTarea.procesarTarea();
            System.out.println("Procesando tarea de pila: \n\t Sale-->" + tareaProcesadaP.getId() + "-" + tareaProcesadaP.getAtributo());
        }
        
        System.out.println("------------------------------------------");
    }
    
}

