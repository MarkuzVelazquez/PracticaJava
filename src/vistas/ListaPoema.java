/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vistas;


import escritorDAO.poemaDAO;
import escritorDT.poemaDT;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SALA-1
 */
public class ListaPoema extends javax.swing.JInternalFrame {
    poemaDT dto = new poemaDT();
    poemaDAO dao = new poemaDAO();
    

    /**
     * Creates new form ListaPoeta
     */
    public ListaPoema() {
        initComponents();
        llenado();
    }

    public void llenado() {
        String [] columnas = {"Clave Poema", "Clave poeta", "Titulo", "Tipo", "Fecha", "Nacionalidad", "Actualizar", "Eliminar"};
        List lista;
        int fila = -1;
        try { 
           Object[][] data = new Object[dao.selectall().size()][8];
           lista = dao.selectall();
           Iterator it = lista.iterator();
           while(it.hasNext()) {
                fila++;
                dto = (poemaDT) it.next();
                data[fila][0] = dto.getIdPoema();
                data[fila][1] = dto.getIdPoeta();
                data[fila][2] = dto.getTitulo();
                data[fila][3] = dto.getTipo();
                data[fila][4] = dto.getFecha();
                data[fila][5] = dto.getNacionalidad();
                data[fila][6] = "Actualizar";
                data[fila][7] = "Eliminar";
                jTable1.setModel(new javax.swing.table.DefaultTableModel(data, columnas));
          }
          jTable1.setModel(new javax.swing.table.DefaultTableModel(data, columnas));
        }  catch(SQLException e) {
            Logger.getLogger(ListaPoema.class.getName()).log(Level.SEVERE, "");
        } catch(Exception e) {
            Logger.getLogger(ListaPoema.class.getName()).log(Level.SEVERE, "");
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("ListaPoema");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        dto.setIdPoema(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));
        dto.setIdPoeta(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString()));
        dto.setTitulo(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        dto.setTipo(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        dto.setFecha(Date.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString()));
        dto.setNacionalidad(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
        if(jTable1.getSelectedColumn() == 6) {
            if(JOptionPane.showConfirmDialog(this, "Esta seguro que decea actualiza?", "Actualizar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    dao.upDate(dto);
                    llenado();
                } catch(SQLException e) {
                    Logger.getLogger(ListaPoema.class.getName()).log(Level.SEVERE, "");
                } catch(Exception e) {
                    Logger.getLogger(ListaPoema.class.getName()).log(Level.SEVERE, "");
                }
            }
        }
        if(jTable1.getSelectedColumn() == 7) {
            if(JOptionPane.showConfirmDialog(this, "Esta seguro que decea Eliminar?", "Eliminar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    dao.delete(dto);
                    llenado();
                } catch(SQLException e) {
                    Logger.getLogger(ListaPoeta.class.getName()).log(Level.SEVERE, "");
                } catch(Exception e) {
                    Logger.getLogger(ListaPoeta.class.getName()).log(Level.SEVERE, "");
                }
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
