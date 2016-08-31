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
public class ActualizarPoeta {
    public static void main(String[] args) {
        poetaDT dto = new poetaDT();
        poetaDAO dao = new poetaDAO();
        dto.setNombre("asdd");
        dto.setaPaterno("Soura");
        dto.setaMaterno("eqw");
        dto.setEmail("Brasileña");
        dto.setPseudonimo("Brasileña");
        dto.setSexo("M");
        dto.setNacionalidad("Brasileña");
        dto.setIdPoeta(1);
        try {
            dao.upDate(dto);
            System.out.println("Poeta actualizado");
        } catch(Exception e) {
            
        }
    }
}
