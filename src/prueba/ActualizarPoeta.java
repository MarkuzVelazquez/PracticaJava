/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba;

import escritorDAO.poemaDAO;
import escritorDAO.poetaDAO;
import escritorDT.poemaDT;
import escritorDT.poetaDT;
import java.sql.Date;

/**
 *
 * @author SALA-1
 */
public class ActualizarPoeta {
    public static void main(String[] args) {
        poemaDT dto = new poemaDT();
        poemaDAO dao = new poemaDAO();
        dto.setIdPoeta(1);
        dto.setTitulo("asdd");
        dto.setTipo("Soura");
        dto.setFecha(Date.valueOf("2015-06-21"));
        dto.setNacionalidad("Brasileña");
        dto.setIdPoema(1);
        try {
            dao.upDate(dto);
            System.out.println("Poema actualizado");
        } catch(Exception e) {
            
        }
    }
}
