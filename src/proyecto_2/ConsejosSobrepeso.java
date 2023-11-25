package proyecto_2;

import javax.swing.JOptionPane;

public class ConsejosSobrepeso extends javax.swing.JFrame {

    private String nombre;
    private double resultadoIMC;

    public ConsejosSobrepeso() {
        initComponents();
    }
    
    public void setNombre(String nombre){
     this.nombre = nombre;
     txtNombre1.setText(nombre);
    }
    
    public void setResultadoIMC(double resultadoIMC){
        this.resultadoIMC = resultadoIMC;
        tlbResultadoIMC1.setText(String.valueOf(resultadoIMC));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtNombre1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tlbResultadoIMC1 = new javax.swing.JLabel();
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

        txtNombre1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 90, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("¡Hola!");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 120, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Tu rango es Sobrepeso:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Tu IMC es ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 312, -1, 20));

        tlbResultadoIMC1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(tlbResultadoIMC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 120, 30));

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

        JOptionPane.showMessageDialog(null,"- Presta atención al tamaño de las porciones \n - Opta por alimentos más saludables \n - Pequeñas modificaciones pueden tener un impacto significativo con el tiempo.");

        
    }//GEN-LAST:event_btnSaludableActionPerformed

    private void btnAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlimentacionActionPerformed

        JOptionPane.showMessageDialog(null, " - Evita comer por estrés o aburrimiento. \n - Enfócate en la alimentación consciente \n - Planifica tus comidas con anticipación para evitar decisiones impulsivas.  \n - Incluye frutas, verduras, proteínas magras y granos enteros en tu dieta para satisfacer las necesidades nutricionales.");
        
    }//GEN-LAST:event_btnAlimentacionActionPerformed

    private void btnGraficosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficosActionPerformed

        
  
    }//GEN-LAST:event_btnGraficosActionPerformed

    private void btnEjercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjercicioActionPerformed

        JOptionPane.showMessageDialog(null, " - Incrementa gradualmente la actividad física. \n - Busca un equilibrio entre cardio y entrenamiento de fuerza. \n - Elige actividades físicas que disfrutes para hacer el ejercicio más sostenible. \n - Considera la posibilidad de consultar a un profesional de la salud o a un entrenador personal para obtener orientación personalizada y segura.");
        
    }//GEN-LAST:event_btnEjercicioActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsejosSobrepeso().setVisible(true);
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel tlbResultadoIMC1;
    private javax.swing.JLabel txtNombre1;
    // End of variables declaration//GEN-END:variables
}
