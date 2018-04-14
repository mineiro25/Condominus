/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio.frontend;

import condominio.Sistema;
import java.util.ArrayList;
import condominio.Condominio;
import condominio.Sistema;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Utilizador
 */
public class MenuCondomino extends javax.swing.JFrame {
private Sistema s;
    /**
     * Creates new form Condominio
     */
    public MenuCondomino(Sistema s) {
        initComponents();
        this.s =s;
        
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listcondominios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        newcondomino = new javax.swing.JButton();
        editcondomino = new javax.swing.JButton();
        listcondomino = new javax.swing.JButton();

        listcondominios.setText("Lista de Condomínios");
        listcondominios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listcondominiosActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Condómino");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/condominio/frontend/Imagens/Condómino_menu.png"))); // NOI18N

        newcondomino.setText("Adicionar Condómino");
        newcondomino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newcondominoActionPerformed(evt);
            }
        });

        editcondomino.setText("Editar Condómino");
        editcondomino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editcondominoActionPerformed(evt);
            }
        });

        listcondomino.setText("Lista de Condómino");
        listcondomino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listcondominoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(listcondomino, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editcondomino, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newcondomino, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(120, 120, 120))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(newcondomino, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editcondomino, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listcondomino, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newcondominoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newcondominoActionPerformed
        // TODO add your handling code here:
        AdicionarCondomino c = new AdicionarCondomino(s);
        c.setVisible(true);

    }//GEN-LAST:event_newcondominoActionPerformed

    private void editcondominoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editcondominoActionPerformed
        // TODO add your handling code here:
        EditarCondomino e = new EditarCondomino(s);
        e.setVisible(true);
    }//GEN-LAST:event_editcondominoActionPerformed

    private void listcondominiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listcondominiosActionPerformed
        // TODO add your handling code here:
        ListagemCondominos l = new ListagemCondominos(s);
        l.setVisible(true);
    }//GEN-LAST:event_listcondominiosActionPerformed

    private void listcondominoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listcondominoActionPerformed
        // TODO add your handling code here:
        ListagemCondominos l = new ListagemCondominos(s);
        l.setVisible(true);
    }//GEN-LAST:event_listcondominoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        setDefaultCloseOperation(MenuCondomino.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editcondomino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton listcondominios;
    private javax.swing.JButton listcondomino;
    private javax.swing.JButton newcondomino;
    // End of variables declaration//GEN-END:variables
}
