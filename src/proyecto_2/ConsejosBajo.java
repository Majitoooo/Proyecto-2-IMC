package proyecto_2;

import javax.swing.JOptionPane;

public class ConsejosBajo extends javax.swing.JFrame {

    public ConsejosBajo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnHistorial = new javax.swing.JButton();
        btnSaludable = new javax.swing.JButton();
        btnAlimentacion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnGraficos = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnEjercicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("¡Hola!");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 120, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Tu rango es bajo peso:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        btnHistorial.setText("Ver Historial");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });
        jPanel2.add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 160, 60));

        btnSaludable.setText("Vida Saludable");
        btnSaludable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaludableActionPerformed(evt);
            }
        });
        jPanel2.add(btnSaludable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 120, 90));

        btnAlimentacion.setText("Alimentación");
        btnAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlimentacionActionPerformed(evt);
            }
        });
        jPanel2.add(btnAlimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 120, 90));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("¿Que deseas hacer?");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 180, -1));

        btnGraficos.setText("Ver Gráficos y tablas");
        btnGraficos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficosActionPerformed(evt);
            }
        });
        jPanel2.add(btnGraficos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 210, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WhatsApp Image 2023-06-18 at 11.18.32 AM.jpeg"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 290));

        btnEjercicio.setText("Ejercicio");
        btnEjercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjercicioActionPerformed(evt);
            }
        });
        jPanel2.add(btnEjercicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 120, 90));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed


    }//GEN-LAST:event_btnHistorialActionPerformed

    private void btnSaludableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaludableActionPerformed

        JOptionPane.showMessageDialog(null,"Come porciones más grandes \n Ingiere alimentos con más frecuencia \n Incluye refrigerios nutritivos (como batidos de frutas, nueces y barras de granola)");

        
    }//GEN-LAST:event_btnSaludableActionPerformed

    private void btnAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlimentacionActionPerformed

        JOptionPane.showMessageDialog(null, "Prioriza los alimentos altos en nutrientes como: \n -Frutas \n -Verduras \n -Proteínas \n -Grasas saludables");
        
    }//GEN-LAST:event_btnAlimentacionActionPerformed

    private void btnGraficosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficosActionPerformed

        
  
    }//GEN-LAST:event_btnGraficosActionPerformed

    private void btnEjercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjercicioActionPerformed

        JOptionPane.showMessageDialog(null, "Realiza ejercicios de fuerza para desarrollar músculo y aumentar la masa corporal\n Implementa ejercicios cardiovasculares en tu rutina \n Realiza una rutina de 150 minutos \n Ve a un nutricionista \n Sigue las recomendaciones de tu médico ");
        
    }//GEN-LAST:event_btnEjercicioActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsejosBajo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlimentacion;
    private javax.swing.JButton btnEjercicio;
    private javax.swing.JButton btnGraficos;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnSaludable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}