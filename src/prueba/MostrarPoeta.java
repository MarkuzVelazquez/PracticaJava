/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba;


import escritorDAO.poetaDAO;
import escritorDT.poetaDT;
import java.sql.Date;

/**
 *
 * @author SALA-1
 */
public class MostrarPoeta {
     public static void main(String[] args) {
        poetaDT dto = new poetaDT();
        poetaDAO dao = new poetaDAO();
        dto.setNombre("Paulo");
        dto.setaPaterno("Coelho");
        try {
            dto = dao.select(dto);
            if(dto != null) {
                System.out.println("Encontrado");
                System.out.println(dto.getIdPoeta());
                System.out.println(dto.getNombre());
                System.out.println(dto.getaPaterno());
                System.out.println(dto.getaMaterno());
                System.out.println(dto.getEmail());
                System.out.println(dto.getPseudonimo());
                System.out.println(dto.getSexo());
                System.out.println(dto.getNacionalidad());
          }
           else {
               System.out.println("NO Encontrado");
           }
        } catch(Exception e) {
            
        }
    }
}
