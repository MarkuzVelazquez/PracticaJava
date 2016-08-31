/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba;


import escritorDAO.poetaDAO;
import escritorDT.poetaDT;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author SALA-1
 */
public class MostrarPoetaALL {
     public static void main(String[] args) {
        poetaDT dto = new poetaDT();
        poetaDAO dao = new poetaDAO();
        List lista;
        try {
           lista = dao.selectall();
           Iterator it = lista.iterator();
           System.out.println("Lista general");
           while(it.hasNext()) {
                dto = (poetaDT) it.next();
                System.out.println(
                dto.getIdPoeta()+" | "+
                dto.getNombre()+" | "+
                dto.getaPaterno()+" | "+
                dto.getaMaterno()+" | "+
                dto.getEmail()+" | "+
                dto.getPseudonimo()+" | "+
                dto.getSexo()+" | "+
                dto.getNacionalidad());
          }
        } catch(Exception e) {
            
        }
    }
}
