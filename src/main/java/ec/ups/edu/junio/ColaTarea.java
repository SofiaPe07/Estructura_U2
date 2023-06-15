/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.ups.edu.junio;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Sofi Peña
 */
public class ColaTarea<T> {
    
    private Queue <Tarea<T>> colaTarea;
    
    
    public ColaTarea(){
        colaTarea = new LinkedList();
    }
    
    public void agregarTarea (Tarea<T> tarea){
        colaTarea.offer(tarea);
        
    }
    public Tarea<T> procesarTarea(){
        Tarea<T> tareaProsesada = colaTarea.poll();
        return tareaProsesada;
    }
    public boolean estaVacia(){
        return colaTarea.isEmpty();
    }
    
}
