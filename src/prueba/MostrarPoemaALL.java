/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba;


import escritorDAO.poemaDAO;
import escritorDT.poemaDT;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author SALA-1
 */
public class MostrarPoemaALL {
     public static void main(String[] args) {
        poemaDT dto = new poemaDT();
        poemaDAO dao = new poemaDAO();
        List lista;
        try {
           lista = dao.selectall();
           Iterator it = lista.iterator();
           System.out.println("Lista general");
           while(it.hasNext()) {
                dto = (poemaDT) it.next();
                System.out.println(
                dto.getIdPoema()+" | "+
                dto.getIdPoeta()+" | "+
                dto.getTitulo()+" | "+
                dto.getTipo()+" | "+
                dto.getFecha()+" | "+
                dto.getNacionalidad());
          }
        } catch(Exception e) {
            
        }
    }
}
