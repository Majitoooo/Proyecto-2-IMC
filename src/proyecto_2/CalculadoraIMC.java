package proyecto_2;

import java.util.LinkedList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;


class Persona{
    String nombre;
    double peso;
    double altura;
    
    public Persona(String nombre, double peso, double altura){
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }
}

class RegistroIMC {
    Persona persona;
    double imc;
    String consejoSalud;
    
    public RegistroIMC(Persona persona, double imc, String consejoSalud){
        this.persona = persona;
        this.imc = imc;
        this.consejoSalud = consejoSalud;
    }
    
        public String toString() {
        return String.format("Nombre: %s, IMC: %.2f, Consejo: %s",
   persona.nombre, imc, consejoSalud);
    }

}
  
public class CalculadoraIMC extends javax.swing.JFrame {
    
    private JTextArea resultadoArea;
    private LinkedList<RegistroIMC> historialIMC;
    private javax.swing.JLabel historialLabel;

    public CalculadoraIMC() {
        initComponents();
        historialIMC = new LinkedList<RegistroIMC>();
        resultadoArea = new JTextArea();
        
        resultadoLabel = new javax.swing.JLabel();
        resultadoLabel.setFont(new java.awt.Font("High Tower Text", 0, 18)); // Puedes ajustar el estilo según tus necesidades
        resultadoLabel.setBounds(50, 350, 400, 150);  // Ajusta las coordenadas y el tamaño según tus necesidades
        add(resultadoLabel);
        
        historialLabel = new javax.swing.JLabel();  // Nueva etiqueta para mostrar el historial
        historialLabel.setFont(new java.awt.Font("High Tower Text", 0, 18));
        historialLabel.setBounds(50, 400, 400, 150);
        add(historialLabel);

        historialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialButtonActionPerformed(evt);
            }
        });    
    }
    
private double CalcularIMC(double peso, double altura) {
    return peso / (altura * altura);
}
    
    private String obtenerConsejosSalud(double imc){
        if (imc < 18.5) {
            return "Estás bajo de peso. Es importante aumentar tu consumo calórico.";
        }else if (imc < 25) {
        return "Tu peso está dentro del rango saludable. ¡Sigue manteniendo un estilo de vida saludable!";
        } else if (imc < 30) {
        return "Tienes sobrepeso. Trabaja en tu dieta y aumenta la actividad física.";
        } else {
        return "Tienes obesidad. Es crucial hablar con un médico para desarrollar un plan de salud.";
        }
    }
    
    private String obtenerRangoPeso(double imc){
        if (imc < 18.5) {
            return "Estás bajo de peso. Es importante aumentar tu consumo calórico.";
        } else if (imc < 25) {
            return "Tu peso está dentro del rango saludable. ¡Sigue manteniendo un estilo de vida saludable!";
        } else if (imc < 30) {
            return "Tienes sobrepeso. Trabaja en tu dieta y aumenta la actividad física.";
        } else {
            return "Tienes obesidad. Es crucial hablar con un médico para desarrollar un plan de salud.";
        }        
    }
    
    
    private void mostrarResultado(String nombre, double imc, String consejoSalud) {
        String resultado = String.format("Hola %s, tu IMC es:"+ CalcularIMC(imc, imc) + "Consejo de salud: %s", nombre, imc, consejoSalud);

        String rangoPeso = obtenerRangoPeso(imc);
        JOptionPane.showMessageDialog(this, rangoPeso, "Rango de Peso", JOptionPane.INFORMATION_MESSAGE);
    }

    private void mostrarHistorial() {
    if (!historialIMC.isEmpty()) {
        StringBuilder historialText = new StringBuilder("Historial de IMC:\n");

        for (RegistroIMC registro : historialIMC) {
            historialText.append(String.format("- Nombre: %s, IMC: %.2f, Consejo: %s\n",
                    registro.persona.nombre, registro.imc, registro.consejoSalud));
        }

        historialLabel.setText(historialText.toString());  // Usa historialLabel en lugar de resultadoLabel
    } else {
        historialLabel.setText("Historial de IMC vacío.");  // Usa historialLabel en lugar de resultadoLabel
    }
}
    
    private void abrirVentanaTips() {
    JLabel tipsLabel = new JLabel("Selecciona tus tips de salud:");
    ventanaTips.add(tipsLabel);
    ventanaTips.setVisible(true);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        historialButton = new javax.swing.JButton();
        nombreTextField = new javax.swing.JTextField();
        resultadoLabel = new javax.swing.JLabel();
        ventanaTips = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        calcularIMCButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        alturaTextField = new javax.swing.JTextField();
        pesoTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        historialButton.setText("Historial");
        historialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialButtonActionPerformed(evt);
            }
        });
        jPanel1.add(historialButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 90, 30));

        nombreTextField.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        jPanel1.add(nombreTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 210, 40));

        resultadoLabel.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        jPanel1.add(resultadoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 300, 40));

        ventanaTips.setText("Tips");
        ventanaTips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventanaTipsActionPerformed(evt);
            }
        });
        jPanel1.add(ventanaTips, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 90, 30));

        jLabel7.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        jLabel7.setText("Ingresa tu nombre:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 150, 30));

        calcularIMCButton.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        calcularIMCButton.setText("Calcular IMC");
        calcularIMCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularIMCButtonActionPerformed(evt);
            }
        });
        jPanel1.add(calcularIMCButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 160, 40));

        jLabel6.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        jLabel6.setText("Kg");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 130, 30));

        jLabel5.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        jLabel5.setText("Ingresa tu altura:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 130, 30));

        jLabel4.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        jLabel4.setText("m");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 130, 30));

        jLabel1.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        jLabel1.setText("Ingresa tu peso:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 130, 30));

        jLabel3.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        jLabel3.setText("BIENVENDIO AL CALCULADOR DE IMC");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 380, 30));

        alturaTextField.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        alturaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(alturaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 120, 40));

        pesoTextField.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        jPanel1.add(pesoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 120, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alturaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alturaTextFieldActionPerformed

    private void calcularIMCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularIMCButtonActionPerformed
        
    System.out.println("Botón clickeado");
    String nombre = nombreTextField.getText();
    double peso = Double.parseDouble(pesoTextField.getText());
    double altura = Double.parseDouble(alturaTextField.getText());

    double imc = CalcularIMC(peso, altura);
    String consejoSalud = obtenerConsejosSalud(imc);

    RegistroIMC registro = new RegistroIMC(new Persona(nombre, peso, altura), imc, consejoSalud);
    historialIMC.addFirst(registro);
    
    mostrarResultado(nombre, imc, consejoSalud);
    mostrarHistorial();
        
    }//GEN-LAST:event_calcularIMCButtonActionPerformed

    private void ventanaTipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventanaTipsActionPerformed

    String tips = "Aquí van los tips de salud...";
    JOptionPane.showMessageDialog(this, tips, "Tips de Salud", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_ventanaTipsActionPerformed

    private void historialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialButtonActionPerformed

        mostrarHistorial();
        
        if (!historialIMC.isEmpty()) {
        StringBuilder historialText = new StringBuilder("Historial de IMC:\n");

        for (RegistroIMC registro : historialIMC) {
            historialText.append(String.format("- Nombre: %s, IMC: %.2f\n Consejo: %s \n",
                    registro.persona.nombre, registro.imc, registro.consejoSalud));
        }

        JOptionPane.showMessageDialog(this, historialText.toString(), "Historial de IMC", JOptionPane.INFORMATION_MESSAGE);
    }
        
    }//GEN-LAST:event_historialButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraIMC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alturaTextField;
    private javax.swing.JButton calcularIMCButton;
    private javax.swing.JButton historialButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JTextField pesoTextField;
    private javax.swing.JLabel resultadoLabel;
    private javax.swing.JButton ventanaTips;
    // End of variables declaration//GEN-END:variables

}
