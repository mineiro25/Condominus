/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio.frontend;
import condominio.Sistema;
/**
 *
 * @author Miguel
 */
public class MenuFracoes extends javax.swing.JFrame {
private Sistema s;
    /**
     * Creates new form AdicionarFracao
     */
    public MenuFracoes(Sistema s) {
        initComponents();
        this.s=s;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newcondomino = new javax.swing.JButton();
        newcondomino1 = new javax.swing.JButton();
        newcondomino2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        newcondomino.setText("Adicionar Fracao");
        newcondomino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newcondominoActionPerformed(evt);
            }
        });

        newcondomino1.setText("Editar Fracao");
        newcondomino1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newcondomino1ActionPerformed(evt);
            }
        });

        newcondomino2.setText("Lista Fracoes");
        newcondomino2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newcondomino2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newcondomino, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newcondomino2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newcondomino1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(newcondomino, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newcondomino1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newcondomino2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newcondominoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newcondominoActionPerformed
        // TODO add your handling code here:
        AdicionarFracao c = new AdicionarFracao(s);
        c.setVisible(true);
    }//GEN-LAST:event_newcondominoActionPerformed

    private void newcondomino1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newcondomino1ActionPerformed
        // TODO add your handling code here:
        EditarFracao m = new EditarFracao(s);
        m.setVisible(true);
    }//GEN-LAST:event_newcondomino1ActionPerformed

    private void newcondomino2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newcondomino2ActionPerformed
        // TODO add your handling code here:
        ListagemFracoes f = new ListagemFracoes(s);
        f.setVisible(true);
        
        
    }//GEN-LAST:event_newcondomino2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        setDefaultCloseOperation(MenuCondomino.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton newcondomino;
    private javax.swing.JButton newcondomino1;
    private javax.swing.JButton newcondomino2;
    // End of variables declaration//GEN-END:variables
}