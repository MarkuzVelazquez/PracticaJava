/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba;

import escritorDAO.poetaDAO;
import escritorDT.poetaDT;

/**
 *
 * @author SALA-1
 */
public class CrearPoeta {
    public static void main(String[] args) {
        poetaDT dto = new poetaDT();
        poetaDAO dao = new poetaDAO();
        dto.setNombre("Paulo");
        dto.setaPaterno("Coelho");
        dto.setaMaterno("Soura");
        dto.setEmail("asdasdasd");
        dto.setPseudonimo("Coelho");
        dto.setSexo("M");
        dto.setNacionalidad("Brasileña");
        try {
            dao.create(dto);
            System.out.println("Poeta agregado");
        } catch(Exception e) {
            
        }
    }
            
}
