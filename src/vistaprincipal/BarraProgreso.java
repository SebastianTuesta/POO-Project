/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vistaprincipal;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jheremy
 */
public class BarraProgreso extends javax.swing.JFrame implements Runnable {

    int num = 0;

    public BarraProgreso() {
        initComponents();
        this.setSize(500, 350);
    }
  
   
    public void run() {

        

        try {
         
      
            while (num < 100) {
                
                Thread.sleep(50);
                num = num + 1;
                cargando.setText("cargando..");
                if(num%2==0){
                 cargando.setText("cargando. ");
                }
                barraProgreso.setValue(num);
                porcentaje.setText(num + " %");
               
            }
        } catch (Exception e) {
        }
       this.setVisible(false);
       JfrmPrincipal menu=new JfrmPrincipal();
       menu.setTitle("MENU PRINCIPAL - CRUZ DEL SUR ");
       menu.setVisible(true);
       menu.setLocationRelativeTo(null);
     //menu.inicializar();
     
      menu.animar();
    }
      

    
   public void empezar() {
        Thread progreso = new Thread(this);
        progreso.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraProgreso = new javax.swing.JProgressBar();
        porcentaje = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cargando = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(300, 300));
        setUndecorated(true);
        getContentPane().setLayout(null);

        barraProgreso.setBackground(new java.awt.Color(255, 255, 255));
        barraProgreso.setForeground(new java.awt.Color(0, 0, 255));
        barraProgreso.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        getContentPane().add(barraProgreso);
        barraProgreso.setBounds(80, 170, 290, 30);

        porcentaje.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        porcentaje.setForeground(new java.awt.Color(255, 255, 255));
        porcentaje.setText("0 %");
        getContentPane().add(porcentaje);
        porcentaje.setBounds(200, 180, 130, 80);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 330);
        
       


        cargando.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        cargando.setForeground(new java.awt.Color(51, 51, 255));
        cargando.setText(" ");
        getContentPane().add(cargando);
        cargando.setBounds(10, 80, 210, 44);
        
         
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("biblioteca12.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 3, new java.awt.Color(102, 51, 0)));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 60, 500, 290);
        
        
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("logo.jpg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 0, 3, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 500, 68);


   
      

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraProgreso;
    private javax.swing.JLabel cargando;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel porcentaje;
    // End of variables declaration//GEN-END:variables
}
