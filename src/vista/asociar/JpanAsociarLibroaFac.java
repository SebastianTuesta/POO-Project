/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.asociar;

import capadenegocio.GestorPrincipal;
import entidad.Facultad;
import entidad.Libro;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.ComboItem;
import util.UtilSwing;

/**
 *
 * @author THINKPAD
 */
public class JpanAsociarLibroaFac extends javax.swing.JPanel {

    /**
     * Creates new form JpanAsociarLibUsuaFac
     */
    public JpanAsociarLibroaFac() {
        initComponents();
        iniciarComponentes();
    }

    public void iniciarComponentes() {
          ArrayList<Facultad> lsFacultades = GestorPrincipal.getGestorFacultad().listar();
        JcombFacultad.removeAllItems();
        
        Facultad facultad = null;
        for(int i=0; i<lsFacultades.size(); i++){
            facultad = lsFacultades.get(i);
            JcombFacultad.addItem(new ComboItem(facultad.getNombre(), facultad));
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxfIsbn = new javax.swing.JTextField();
        JcombFacultad = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("Asociar:");

        jLabel2.setText("Isbn Libro");

        jLabel3.setText("Facultad");

        JcombFacultad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Asociar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxfIsbn)
                            .addComponent(JcombFacultad, 0, 238, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(28, 28, 28)
                .addComponent(jButton2)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxfIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JcombFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
/*Leemos los datos*/
        String Isbn = jtxfIsbn.getText();
        Facultad facultad = (Facultad) ((ComboItem) (JcombFacultad.getSelectedItem())).getObjeto();
        String nombFacultad = facultad.getNombre();
        
        /*Realizamos la asociacion*/
        boolean estado = GestorPrincipal.getGestorBibliotecario().asignarle_libro_aFacultad(nombFacultad, Isbn);
        
        /*Verificamos el estado*/
        if(estado == true){
            JOptionPane.showMessageDialog(this, "El libro de isbn "+Isbn+" fue asociado en la facultad de nombre "+nombFacultad, "Asociado", 1);
        }else{
            JOptionPane.showMessageDialog(this, "No se ha podido asociar al libro de isbn "+Isbn+" en la facultad de nombre "+nombFacultad+". Verifique que el libro y la facultad existan."+nombFacultad, "Error", JOptionPane.ERROR_MESSAGE);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 UtilSwing.quitarPanel(this);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox JcombFacultad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jtxfIsbn;
    // End of variables declaration//GEN-END:variables
}
