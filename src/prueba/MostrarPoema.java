/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba;


import escritorDAO.poemaDAO;
import escritorDT.poemaDT;
import java.sql.Date;

/**
 *
 * @author SALA-1
 */
public class MostrarPoema {
     public static void main(String[] args) {
        poemaDT dto = new poemaDT();
        poemaDAO dao = new poemaDAO();
        dto.setTitulo("asd");
        dto.setTipo("Soura");
        try {
            dto = dao.select(dto);
            if(dto != null) {
                System.out.println("Encontrado");
                System.out.println(dto.getIdPoema());
                System.out.println(dto.getIdPoeta());
                System.out.println(dto.getTitulo());
                System.out.println(dto.getTipo());
                System.out.println(dto.getFecha());
                System.out.println(dto.getNacionalidad());
          }
           else {
               System.out.println("NO Encontrado");
           }
        } catch(Exception e) {
            
        }
    }
}
