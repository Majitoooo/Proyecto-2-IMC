package proyecto_2;

import javax.swing.JOptionPane;
import java.util.LinkedList;

public class ConsejosObesidad extends javax.swing.JFrame {
    
    private LinkedList<String> historialRecomendaciones = new LinkedList<>();
    
    private String nombre;
    private double resultadoIMC;

    public ConsejosObesidad() {
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
        tlbResultadoIMC1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JLabel();
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

        tlbResultadoIMC1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(tlbResultadoIMC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 120, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Tu IMC es ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 312, -1, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("¡Hola!");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 120, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Tu rango es Obesidad:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        txtNombre1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 90, 30));

        btnHistorial.setText("Ver Informe");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });
        jPanel2.add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 160, 60));

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
        jPanel2.add(btnGraficos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 210, 60));

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

              StringBuilder mensajeHistorial = new StringBuilder();
        for (String recomendacion : historialRecomendaciones) {
            mensajeHistorial.append(recomendacion).append("\n");
        }

        if (mensajeHistorial.length() == 0) {
            mensajeHistorial.append("No se ha oprimido ningún botón.");
        }

        mensajeHistorial.append("\n\n"); // Agregar dos saltos de línea al final

        JOptionPane.showMessageDialog(null, mensajeHistorial.toString());
        
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void btnSaludableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaludableActionPerformed

         String Recomendacion;
        Recomendacion = " \nRecomendaciones para una vida saludable \n - Implementa el ejercicio para alcanzar un déficit calórico saludable. \n - Consulta a un profesional de la salud para obtener orientación específica para tu situación. \n - Define metas realistas a corto plazo y metas más amplias a largo plazo. \n - Mantente enfocado. \n - Educa a ti mismo sobre nutrición y hábitos alimenticios saludables.";
        JOptionPane.showMessageDialog(null," - Implementa el ejercicio para alcanzar un déficit calórico saludable. \n - Consulta a un profesional de la salud para obtener orientación específica para tu situación. \n - Define metas realistas a corto plazo y metas más amplias a largo plazo. \n - Mantente enfocado. \n - Educa a ti mismo sobre nutrición y hábitos alimenticios saludables.");
         historialRecomendaciones.add(Recomendacion);
        
    }//GEN-LAST:event_btnSaludableActionPerformed

    private void btnAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlimentacionActionPerformed

         String Recomendacion;
         Recomendacion= " \nRecomendaciones para una la alimentacion  \n - Aprende a reconocer porciones adecuadas y evita las porciones grandes. \n - Disminuye el consumo de azúcares agregados y grasas saturadas. \n - Opta por fuentes más saludables de carbohidratos y grasas, como frutas, verduras y aceites saludables. \n - Bebe suficiente agua a lo largo del día.";
                 
        JOptionPane.showMessageDialog(null, " - Aprende a reconocer porciones adecuadas y evita las porciones grandes. \n - Disminuye el consumo de azúcares agregados y grasas saturadas. \n - Opta por fuentes más saludables de carbohidratos y grasas, como frutas, verduras y aceites saludables. \n - Bebe suficiente agua a lo largo del día.");
                 historialRecomendaciones.add(Recomendacion);
                 
    }//GEN-LAST:event_btnAlimentacionActionPerformed

    private void btnGraficosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficosActionPerformed

    TablasObesidad tablasObesidad = new TablasObesidad();
    tablasObesidad.setVisible(true);      
  
    }//GEN-LAST:event_btnGraficosActionPerformed

    private void btnEjercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjercicioActionPerformed

              String Recomendacion;
        Recomendacion = " \nRecomendaciones para hacer ejercicio   \n  - Comienza con ejercicios de bajo impacto, como caminar o nadar. \n - A medida que te vuelvas más fuerte, considera aumentar gradualmente la intensidad de tus ejercicios. \n - Establece un horario regular para el ejercicio y adhiérete a él tanto como sea posible. \n - La consistencia es clave. ";
        JOptionPane.showMessageDialog(null, " - Comienza con ejercicios de bajo impacto, como caminar o nadar. \n - A medida que te vuelvas más fuerte, considera aumentar gradualmente la intensidad de tus ejercicios. \n - Establece un horario regular para el ejercicio y adhiérete a él tanto como sea posible. \n - La consistencia es clave. ");
        historialRecomendaciones.add(Recomendacion);
        
    }//GEN-LAST:event_btnEjercicioActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsejosObesidad().setVisible(true);
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
