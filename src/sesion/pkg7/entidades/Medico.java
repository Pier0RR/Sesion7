/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion.pkg7.entidades;

import java.util.List;

public class Medico {
    
    public String getTexto(){
        String especs= "";
        if(especialidad!=null){
            for(String es: especialidad){
                especs +=", "+es;
            }
        }
        return "Nombre" + nombre +" Cmp: "+ CMP +"Esp: "+especs;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCMP() {
        return CMP;
    }

    public void setCMP(String CMP) {
        this.CMP = CMP;
    }
    
    private String nombre;
    private String CMP;

    public List<String> getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(List<String> especialidad) {
        this.especialidad = especialidad;
    }
    private List<String> especialidad;
    
}
