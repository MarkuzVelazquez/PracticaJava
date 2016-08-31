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
public class borrarPoeta {
    public static void main(String[] args) {
        poetaDT dto = new poetaDT();
        poetaDAO dao = new poetaDAO();
        dto.setIdPoeta(1);
        try {
            dao.delete(dto);
            System.out.println("Poeta borrado");
        } catch(Exception e) {
            
        }
    }
}
