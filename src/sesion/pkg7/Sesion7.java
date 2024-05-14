/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion.pkg7;

import java.util.ArrayList;
import java.util.List;
import sesion.pkg7.entidades.Cita;
import sesion.pkg7.entidades.Medico;
import sesion.pkg7.entidades.Paciente;
import sesion.pkg7.pantallas.PantallaListarMedico;


public class Sesion7 {

        public static List<Cita> citasGlobal= new ArrayList<>();
        
        public static List<Medico> medicosGlobal= new ArrayList<>();
                
        public static List<Paciente> pacientesGlobal= new ArrayList<>();



    public static void main(String[] args) {
        
         PantallaListarMedico pantalla= new PantallaListarMedico();
    }
    
}
