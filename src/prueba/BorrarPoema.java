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
public class BorrarPoema {
    public static void main(String[] args) {
        poemaDT dto = new poemaDT();
        poemaDAO dao = new poemaDAO();
        dto.setIdPoema(2);
        try {
            dao.delete(dto);
            System.out.println("Poema Eliminado");
        } catch(Exception e) {
            
        }
    }
}
