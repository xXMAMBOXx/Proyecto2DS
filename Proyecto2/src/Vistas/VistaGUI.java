package Vistas;

import Controladores.Controlador;
import Controladores.IControlador;
import DTOs.DTOCliente;
import DTOs.DTOServicioAmortizacion;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class VistaGUI extends javax.swing.JFrame {
    
    private ArrayList<Double> intereses=new ArrayList<Double>();
    DefaultTableModel modelo = new DefaultTableModel();
    private double [] cambios;
    String tipoServicio;
    
    public VistaGUI() {
        
        initComponents();
        this.añadirColumnas();   
        this.tablaMontos.setVisible(false);
        this.cambios=new double[2];
        this.setCambios();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        montoPrestamo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tipoMoneda = new javax.swing.JList();
        interes = new javax.swing.JSpinner();
        periodos = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tipoSistema = new javax.swing.JList();
        solicitar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMontos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        primerApellido = new javax.swing.JTextField();
        apellido2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        nombreResultado = new javax.swing.JLabel();
        primerResultado = new javax.swing.JLabel();
        segundoResultado = new javax.swing.JLabel();
        montoResultado = new javax.swing.JLabel();
        periodosResultado = new javax.swing.JLabel();
        sistemaResultado = new javax.swing.JLabel();
        interesResultado = new javax.swing.JLabel();
        monedaResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Monto Prestamo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Periodos (Años):");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("%");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tipo Sistema:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Tipo moneda:");

        tipoMoneda.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Colones", "Dólares" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        tipoMoneda.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tipoMoneda.setSelectedIndex(0);
        jScrollPane2.setViewportView(tipoMoneda);

        interes.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, 100.0d, 1.0d));

        periodos.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("Seleccione el tipo de Sistema y moneda a utilizar:");

        tipoSistema.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Alemán", "Francés", "Americano" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        tipoSistema.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tipoSistema.setSelectedIndex(0);
        jScrollPane3.setViewportView(tipoSistema);

        solicitar.setBackground(new java.awt.Color(153, 204, 255));
        solicitar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        solicitar.setText("Solicitar Préstamo");
        solicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitarActionPerformed(evt);
            }
        });

        tablaMontos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMontos);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Primer Apellido:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Segundo Apellido:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Tipo de cambio:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Datos de Consulta:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Interes:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Primer Apellido:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Segundo Apellido:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Nombre:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Monto Prestamo:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Periodos (Años):");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Interes:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Tipo Sistema:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Tipo moneda:");

        nombreResultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        primerResultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        segundoResultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        montoResultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        montoResultado.setText(" ");

        periodosResultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        sistemaResultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        interesResultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        monedaResultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(57, 57, 57)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel12))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(periodos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(montoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(interes, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(apellido2, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(primerApellido)))
                            .addComponent(solicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(13, 13, 13)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane3)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(montoResultado))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(interesResultado)
                                    .addComponent(periodosResultado)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel14))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(segundoResultado)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(nombreResultado)
                                                .addComponent(primerResultado))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel20))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(monedaResultado)
                                                        .addComponent(sistemaResultado)))
                                                .addComponent(jLabel10)))))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(primerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(montoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(sistemaResultado))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(monedaResultado)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(nombreResultado))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(primerResultado))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(segundoResultado))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(montoResultado))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(periodosResultado))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(interesResultado))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(periodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(interes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel19))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel6))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(solicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void solicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitarActionPerformed
        //Ingresando datos al DTOCliente
        DTOCliente dtoCliente=new DTOCliente();
        dtoCliente.setNombre(this.nombre.getText());
        dtoCliente.setPrimerApellido(this.primerApellido.getText());
        dtoCliente.setSegundoApellido(this.apellido2.getText());
        

        //Ingresando datos al DTOAmortización
        DTOServicioAmortizacion dtoAmortizacion=new DTOServicioAmortizacion();
        dtoAmortizacion.setTipo(this.eliminarAcento("Servicio"+this.tipoSistema.getSelectedValue()));this.tipoServicio=""+this.tipoSistema.getSelectedValue(); 
        dtoAmortizacion.setMontoPrestamo(Double.parseDouble(this.montoPrestamo.getText()));
        dtoAmortizacion.setPeriodos((int) this.periodos.getValue());
        dtoAmortizacion.setInteres((double)this.interes.getValue()/100.0);
        dtoAmortizacion.setMoneda((String)this.tipoMoneda.getSelectedValue());
        dtoAmortizacion.setCambio(this.cambioSeleccionado());
        
        
        IControlador controlador =new Controlador();///FACTORY
        controlador.solicitarPrestamo(dtoAmortizacion, dtoCliente);
           
        this.cargarTabla(dtoAmortizacion);
        this.resultadoConsulta(dtoAmortizacion, dtoCliente);
        
    }//GEN-LAST:event_solicitarActionPerformed

    private void resultadoConsulta(DTOServicioAmortizacion amortizacion,DTOCliente cliente){
        this.resetLabels();
        this.setLabels(amortizacion, cliente);
    }
    
    
    
    private void cargarTabla(DTOServicioAmortizacion dto){
        
        int nPeriodo=(Integer)this.periodos.getValue();
        this.tablaMontos.setModel(modelo);
        Double [] celdas = new Double[5];
        String [] resultado = new String[5];
        
        
        double nCelda=0;
        
        for(int i=0;i!=nPeriodo;i++){
            celdas[0]=nCelda+1; 
            celdas[1]=dto.getDeudas().get(i);
            celdas[2]=dto.getIntereses().get(i);
            celdas[3]=dto.getAmortizaciones().get(i);
            celdas[4]=dto.getCuotas().get(i);
            nCelda++;    
            modelo.addRow(celdas);
        }
            resultado[0]="Total"; 
            resultado[1]=" ";
            resultado[2]=String.valueOf(dto.getInteresTotal());
            resultado[3]=String.valueOf(dto.getAmortizacionVK());
            resultado[4]=String.valueOf(dto.getCuotaCK());
            modelo.addRow(resultado);
            this.tablaMontos.setVisible(true);
    }
    
     private void setLabels(DTOServicioAmortizacion servicio,DTOCliente cliente){
        this.nombreResultado.setText(cliente.getNombre());
        this.primerResultado.setText(cliente.getPrimerApellido());
        this.segundoResultado.setText(cliente.getSegundoApellido());
        this.monedaResultado.setText(servicio.getMoneda());
        this.montoResultado.setText(servicio.getMontoPrestamo()+"");
        this.periodosResultado.setText(""+servicio.getPeriodos());
        this.sistemaResultado.setText("Servicio "+this.tipoServicio);
        this.interesResultado.setText(""+servicio.getInteres());
        
    }
    
    private void resetLabels(){
        this.nombreResultado.setText("");
        this.primerResultado.setText("");
        this.segundoResultado.setText("");
        this.monedaResultado.setText("");
        this.periodosResultado.setText("");
        this.sistemaResultado.setText("");
        this.interesResultado.setText("");
        
    }
    
    private void setCambios(){
        this.cambios[0]=1;
        this.cambios[1]=537.6;
    }
    private double cambioSeleccionado(){
        return this.cambios[this.tipoMoneda.getSelectedIndex()];
    }
    
    public final void añadirColumnas(){
         modelo.addColumn("Periodo");
         modelo.addColumn("Deuda Inicial");
         modelo.addColumn("Intereses");
         modelo.addColumn("Amortización");
         modelo.addColumn("Cuota");
   }
    
    private  String eliminarAcento(String input) {
    String original = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ";
    String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
    String output = input;
    for (int i=0; i<original.length(); i++) {
        output = output.replace(original.charAt(i), ascii.charAt(i));
    }
    return output;
}
        
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
            java.util.logging.Logger.getLogger(VistaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido2;
    private javax.swing.JSpinner interes;
    private javax.swing.JLabel interesResultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel monedaResultado;
    private javax.swing.JTextField montoPrestamo;
    private javax.swing.JLabel montoResultado;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel nombreResultado;
    private javax.swing.JSpinner periodos;
    private javax.swing.JLabel periodosResultado;
    private javax.swing.JTextField primerApellido;
    private javax.swing.JLabel primerResultado;
    private javax.swing.JLabel segundoResultado;
    private javax.swing.JLabel sistemaResultado;
    private javax.swing.JButton solicitar;
    private javax.swing.JTable tablaMontos;
    private javax.swing.JList tipoMoneda;
    private javax.swing.JList tipoSistema;
    // End of variables declaration//GEN-END:variables
}
