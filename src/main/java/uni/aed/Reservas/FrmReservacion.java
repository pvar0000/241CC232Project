/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uni.aed.Reservas;

import java.util.Random;

/**
 *
 * @author hp
 */
public class FrmReservacion extends javax.swing.JFrame {
    private final String CADENA_VACIA="";
    Reservacion reservacion;
    Reserva reserva;
    Pasajero pasajero;
    Vuelo vuelo;
    Boleto boleto;
    /**
     * Creates new form FrmReservacion
     */
    public FrmReservacion() {
        initComponents();
        reservacion=new Reservacion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jPPasajero = new javax.swing.JPanel();
        jTFNombre = new javax.swing.JTextField();
        jTFApellidos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPVuelo = new javax.swing.JPanel();
        jCBVuelo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPData = new javax.swing.JPanel();
        jTFData = new javax.swing.JTextField();
        jLData = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAResultado = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jRBReservarVuelo = new javax.swing.JRadioButton();
        jRBCancelarReserva = new javax.swing.JRadioButton();
        jRBConsultarBoleto = new javax.swing.JRadioButton();
        jRBReporteVuelo = new javax.swing.JRadioButton();
        jRBReporteReservas = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jBRegistrar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBCerrar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jBConsultar = new javax.swing.JButton();
        jBReporte = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Reserva de Pasajes");

        jPPasajero.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion del Pasajero:"));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellidos:");

        javax.swing.GroupLayout jPPasajeroLayout = new javax.swing.GroupLayout(jPPasajero);
        jPPasajero.setLayout(jPPasajeroLayout);
        jPPasajeroLayout.setHorizontalGroup(
            jPPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPasajeroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPPasajeroLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTFApellidos, jTFNombre});

        jPPasajeroLayout.setVerticalGroup(
            jPPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPasajeroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPVuelo.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion del Vuelo:"));

        jCBVuelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V100", "V101", "V102", "V103" }));

        jLabel3.setText("Vuelo:");

        javax.swing.GroupLayout jPVueloLayout = new javax.swing.GroupLayout(jPVuelo);
        jPVuelo.setLayout(jPVueloLayout);
        jPVueloLayout.setHorizontalGroup(
            jPVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPVueloLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jCBVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPVueloLayout.setVerticalGroup(
            jPVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPVueloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPData.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion del Boleto:"));

        jTFData.setEditable(false);

        jLData.setText("Boleto:");

        javax.swing.GroupLayout jPDataLayout = new javax.swing.GroupLayout(jPData);
        jPData.setLayout(jPDataLayout);
        jPDataLayout.setHorizontalGroup(
            jPDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDataLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLData, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTFData, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPDataLayout.setVerticalGroup(
            jPDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLData))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTAResultado.setColumns(20);
        jTAResultado.setRows(5);
        jScrollPane1.setViewportView(jTAResultado);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones:"));

        buttonGroup1.add(jRBReservarVuelo);
        jRBReservarVuelo.setSelected(true);
        jRBReservarVuelo.setText("Reservar Vuelo");
        jRBReservarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBReservarVueloActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBCancelarReserva);
        jRBCancelarReserva.setText("Cancelar Reserva");
        jRBCancelarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBCancelarReservaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBConsultarBoleto);
        jRBConsultarBoleto.setText("Consultar Boleto");
        jRBConsultarBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBConsultarBoletoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBReporteVuelo);
        jRBReporteVuelo.setText("Reporte de Vuelo");
        jRBReporteVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBReporteVueloActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBReporteReservas);
        jRBReporteReservas.setText("Reporte de Reservas");
        jRBReporteReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBReporteReservasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBReporteReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBReporteVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBConsultarBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBCancelarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBReservarVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jRBCancelarReserva, jRBConsultarBoleto, jRBReporteVuelo, jRBReservarVuelo});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jRBReservarVuelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRBCancelarReserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRBConsultarBoleto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRBReporteVuelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRBReporteReservas)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jBRegistrar.setText("Registrar");
        jBRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarActionPerformed(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBCerrar.setText("Cerrar");
        jBCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarActionPerformed(evt);
            }
        });

        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBConsultar.setText("Consultar");
        jBConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarActionPerformed(evt);
            }
        });

        jBReporte.setText("Ver Reporte");
        jBReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jBRegistrar)
                    .addComponent(jBNuevo)
                    .addComponent(jBCancelar)
                    .addComponent(jBCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBConsultar)
                    .addComponent(jBReporte))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCancelar, jBCerrar, jBNuevo, jBRegistrar});

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBConsultar, jBReporte});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jBNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBReporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBCerrar)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPVuelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPPasajero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jPPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void reservarVuelo(){
        String nombre=jTFNombre.getText();        
        String apellidos=jTFApellidos.getText();      
        pasajero=new Pasajero(nombre, apellidos);
        String codigoVuelo=(String)jCBVuelo.getSelectedItem();
        vuelo=new Vuelo(codigoVuelo);
        Random random=new Random();
        boleto=new Boleto("T"+String.valueOf(random.nextInt(100)));
        jTFData.setText(boleto.getNumeroTicket());        
        reserva=new Reserva("R"+String.valueOf(random.nextInt(100)),pasajero,vuelo,boleto);
        reservacion.reservarVuelo(reserva);       
        jTAResultado.setText("Gracias por Reservar, Su N° de Reserva es:"+ reserva.getCodigo());
    }
    private void clearEntry(){
        jTFNombre.setText(CADENA_VACIA);
        jTFApellidos.setText(CADENA_VACIA);
        jCBVuelo.setSelectedIndex(0);
        jTFData.setText(CADENA_VACIA);          
        jLData.setText("Boleto:");
        jPData.setName("Informacion del Boleto");        
    }
    private void clearAll(){
        clearEntry();
        jTFData.setEditable(false);
        jRBReservarVuelo.setSelected(true);
        jTAResultado.setText(CADENA_VACIA);        
    }    
    private void consultarBoleto(){
        String numeroTicket=jTFData.getText();
        boleto=new Boleto(numeroTicket);
        pasajero=reservacion.consultarBoleto(boleto);
        jTAResultado.setText(pasajero.toString());  
    }    
    private void jBCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBCerrarActionPerformed

    private void jRBReporteReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBReporteReservasActionPerformed
        // TODO add your handling code here:
        clearEntry();
    }//GEN-LAST:event_jRBReporteReservasActionPerformed

    private void jRBReservarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBReservarVueloActionPerformed
        // TODO add your handling code here:
        clearEntry();
    }//GEN-LAST:event_jRBReservarVueloActionPerformed

    private void jBRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarActionPerformed
        // TODO add your handling code here:
         if (jRBReservarVuelo.isSelected())
             reservarVuelo();                  
    }//GEN-LAST:event_jBRegistrarActionPerformed
    private void cancelarReserva(){                
        String codigoReserva=jTFData.getText();
        reserva=new Reserva(codigoReserva,null,null,null);                
        jTAResultado.setText("Se ha cancelado la Reserva: " +reservacion.cancelarVuelo(reserva).toString());            
    }
    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        // TODO add your handling code here:
         if (jRBCancelarReserva.isSelected())
             cancelarReserva();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarActionPerformed
        // TODO add your handling code here:
        if (jRBConsultarBoleto.isSelected())
             consultarBoleto();         
    }//GEN-LAST:event_jBConsultarActionPerformed

    private void jBReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBReporteActionPerformed
        // TODO add your handling code here:
        if (jRBReporteVuelo.isSelected()) {                    
            String numeroVuelo=(String)jCBVuelo.getSelectedItem();
            String pasajeros="Lista de Pasajeros del Vuelo "+numeroVuelo;
            vuelo=new Vuelo(numeroVuelo);        
            for(Object o:(reservacion.listarPasajeros(vuelo)).toArray())                
                pasajeros=pasajeros+"\n"+((Pasajero)o).toString();
            jTAResultado.setText(pasajeros);                        
        }else if (jRBReporteReservas.isSelected()) {
                jTAResultado.setText(reservacion.toString());            
        }
    }//GEN-LAST:event_jBReporteActionPerformed

    private void jRBCancelarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBCancelarReservaActionPerformed
        // TODO add your handling code here:
        clearEntry();
        jTFData.setEditable(true);
        jLData.setText("Reserva:");
        jPData.setName("Informacion de la Reserva");
    }//GEN-LAST:event_jRBCancelarReservaActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        // TODO add your handling code here:
        clearAll();
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jRBConsultarBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBConsultarBoletoActionPerformed
        // TODO add your handling code here:
        clearEntry();
        jTFData.setEditable(true);
    }//GEN-LAST:event_jRBConsultarBoletoActionPerformed

    private void jRBReporteVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBReporteVueloActionPerformed
        // TODO add your handling code here:
        clearEntry();
    }//GEN-LAST:event_jRBReporteVueloActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReservacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBCerrar;
    private javax.swing.JButton jBConsultar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBRegistrar;
    private javax.swing.JButton jBReporte;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCBVuelo;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPData;
    private javax.swing.JPanel jPPasajero;
    private javax.swing.JPanel jPVuelo;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRBCancelarReserva;
    private javax.swing.JRadioButton jRBConsultarBoleto;
    private javax.swing.JRadioButton jRBReporteReservas;
    private javax.swing.JRadioButton jRBReporteVuelo;
    private javax.swing.JRadioButton jRBReservarVuelo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAResultado;
    private javax.swing.JTextField jTFApellidos;
    private javax.swing.JTextField jTFData;
    private javax.swing.JTextField jTFNombre;
    // End of variables declaration//GEN-END:variables
}
