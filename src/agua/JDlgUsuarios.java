package agua;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class JDlgUsuarios extends javax.swing.JDialog
{
    public String clavess,usuarioss,contraseñass;
    public boolean archivoo,iniciarsesionn,cerrarsesionn,regitrodeusuarioo,salirdeaplicacionn,clientess,registrodeclientess;
    public boolean pagoss,registrodepagoss,emisionesordeness,reportess,reportedeingresoss,reportedepagoss,reportedeordeness;
    public boolean herramientass,calculadoraa,respaldarbdd,restaurarbdd;
    public String operacion;
    public String opera;
  
    public JDlgUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        operacion="GUARDAR";
        opera="EDITAR";
         db.Conectar();
         jTextField1.setVisible(false);
        JTblUsuarios.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            JTblUsuarios.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            this.jLabel1.setVisible(false);
            this.JTxtBuscar.setVisible(false);
        muestra();
        setLocationRelativeTo(null);   
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Gota.png")); setIconImage(icon);
    }

public void muestra()
    {
        contenido = db.Consultar("SELECT ClvUsuario,Usuario,Contraseña,Archivo,IniciarSesion,CerrarSesion,RegistroDeUsuario,SalirDeAplicacion,Clientes,RegistroDeClientes,Pagos,RegistroDePagos,EmisionesOrdenes,Reportes,ReporteDeIngresos,ReporteDePagos,ReporteDeOrdenes,Herramientas,Calculadora,RespaldarBd,RestaurarBd  FROM tblusuario ");
        titulos = new String[24];
        titulos[0] ="ClvUsuario";
        titulos[1] ="Usuario";
        titulos[2] ="Contraseña";
        titulos[3] ="Archivo";
        titulos[4] ="IniciarSesion";
        titulos[5] ="CerrarSesion";
        titulos[6] ="RegistroDeUsuario";
        titulos[7] ="SalirDeAplicacion";
        titulos[8] ="Clientes";
        titulos[9] ="RegistroDeClientes";
        titulos[10] ="Pagos";
        titulos[11] ="RegistroDePagos";
        titulos[12] ="EmisionesOrdenes";
        titulos[13] ="Reportes";
        titulos[14] ="ReporteDeIngresos";
        titulos[15] ="ReporteDePagos";
        titulos[16] ="ReporteDeOrdenes";
        titulos[17] ="Herramientas";
        titulos[18] ="Calculadora";
        titulos[19] ="RespaldarBd";
        titulos[20] ="RetaurarBd";
        JTblUsuarios.setModel(new javax.swing.table.DefaultTableModel(contenido, titulos));
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTlbOpciones = new javax.swing.JToolBar();
        JBtnNuevo = new javax.swing.JButton();
        JBtnEditar = new javax.swing.JButton();
        JBtnEliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        JTBtnBuscar = new javax.swing.JToggleButton();
        JBtnSalir = new javax.swing.JButton();
        JScllPnl = new javax.swing.JScrollPane();
        JTblUsuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JTxtBuscar = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(agua.AguaApp.class).getContext().getResourceMap(JDlgUsuarios.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        setResizable(false);

        JTlbOpciones.setBackground(resourceMap.getColor("JTlbOpciones.background")); // NOI18N
        JTlbOpciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTlbOpciones.setFloatable(false);
        JTlbOpciones.setRollover(true);
        JTlbOpciones.setName("JTlbOpciones"); // NOI18N

        JBtnNuevo.setBackground(resourceMap.getColor("JBtnNuevo.background")); // NOI18N
        JBtnNuevo.setFont(resourceMap.getFont("JBtnNuevo.font")); // NOI18N
        JBtnNuevo.setIcon(resourceMap.getIcon("JBtnNuevo.icon")); // NOI18N
        JBtnNuevo.setText(resourceMap.getString("JBtnNuevo.text")); // NOI18N
        JBtnNuevo.setToolTipText(resourceMap.getString("JBtnNuevo.toolTipText")); // NOI18N
        JBtnNuevo.setFocusable(false);
        JBtnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnNuevo.setName("JBtnNuevo"); // NOI18N
        JBtnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnNuevoActionPerformed(evt);
            }
        });
        JTlbOpciones.add(JBtnNuevo);

        JBtnEditar.setBackground(resourceMap.getColor("JBtnEditar.background")); // NOI18N
        JBtnEditar.setFont(resourceMap.getFont("JBtnEditar.font")); // NOI18N
        JBtnEditar.setIcon(resourceMap.getIcon("JBtnEditar.icon")); // NOI18N
        JBtnEditar.setText(resourceMap.getString("JBtnEditar.text")); // NOI18N
        JBtnEditar.setToolTipText(resourceMap.getString("JBtnEditar.toolTipText")); // NOI18N
        JBtnEditar.setFocusable(false);
        JBtnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnEditar.setName("JBtnEditar"); // NOI18N
        JBtnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnEditarActionPerformed(evt);
            }
        });
        JTlbOpciones.add(JBtnEditar);

        JBtnEliminar.setBackground(resourceMap.getColor("JBtnEliminar.background")); // NOI18N
        JBtnEliminar.setFont(resourceMap.getFont("JBtnEliminar.font")); // NOI18N
        JBtnEliminar.setIcon(resourceMap.getIcon("JBtnEliminar.icon")); // NOI18N
        JBtnEliminar.setText(resourceMap.getString("JBtnEliminar.text")); // NOI18N
        JBtnEliminar.setToolTipText(resourceMap.getString("JBtnEliminar.toolTipText")); // NOI18N
        JBtnEliminar.setFocusable(false);
        JBtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnEliminar.setName("JBtnEliminar"); // NOI18N
        JBtnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnEliminarActionPerformed(evt);
            }
        });
        JTlbOpciones.add(JBtnEliminar);

        jButton1.setBackground(resourceMap.getColor("jButton1.background")); // NOI18N
        jButton1.setFont(resourceMap.getFont("jButton1.font")); // NOI18N
        jButton1.setIcon(resourceMap.getIcon("jButton1.icon")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setToolTipText(resourceMap.getString("jButton1.toolTipText")); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setName("jButton1"); // NOI18N
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        JTlbOpciones.add(jButton1);

        JTBtnBuscar.setBackground(resourceMap.getColor("JTBtnBuscar.background")); // NOI18N
        JTBtnBuscar.setFont(resourceMap.getFont("JTBtnBuscar.font")); // NOI18N
        JTBtnBuscar.setIcon(resourceMap.getIcon("JTBtnBuscar.icon")); // NOI18N
        JTBtnBuscar.setText(resourceMap.getString("JTBtnBuscar.text")); // NOI18N
        JTBtnBuscar.setToolTipText(resourceMap.getString("JTBtnBuscar.toolTipText")); // NOI18N
        JTBtnBuscar.setFocusable(false);
        JTBtnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JTBtnBuscar.setName("JTBtnBuscar"); // NOI18N
        JTBtnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JTBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTBtnBuscarActionPerformed(evt);
            }
        });
        JTlbOpciones.add(JTBtnBuscar);

        JBtnSalir.setBackground(resourceMap.getColor("JBtnSalir.background")); // NOI18N
        JBtnSalir.setFont(resourceMap.getFont("JBtnSalir.font")); // NOI18N
        JBtnSalir.setIcon(resourceMap.getIcon("JBtnSalir.icon")); // NOI18N
        JBtnSalir.setText(resourceMap.getString("JBtnSalir.text")); // NOI18N
        JBtnSalir.setToolTipText(resourceMap.getString("JBtnSalir.toolTipText")); // NOI18N
        JBtnSalir.setFocusable(false);
        JBtnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnSalir.setName("JBtnSalir"); // NOI18N
        JBtnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnSalirActionPerformed(evt);
            }
        });
        JTlbOpciones.add(JBtnSalir);

        JScllPnl.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        JScllPnl.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        JScllPnl.setAutoscrolls(true);
        JScllPnl.setName("JScllPnl"); // NOI18N

        JTblUsuarios.setFont(resourceMap.getFont("JTblUsuarios.font")); // NOI18N
        JTblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JTblUsuarios.setName("JTblUsuarios"); // NOI18N
        JTblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTblUsuariosMouseClicked(evt);
            }
        });
        JScllPnl.setViewportView(JTblUsuarios);

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        JTxtBuscar.setFont(resourceMap.getFont("JTxtBuscar.font")); // NOI18N
        JTxtBuscar.setName("JTxtBuscar"); // NOI18N
        JTxtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTxtBuscarKeyTyped(evt);
            }
        });

        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setName("jTextField1"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JScllPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JTlbOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JTlbOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JScllPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnSalirActionPerformed
       
        this.dispose();
    }//GEN-LAST:event_JBtnSalirActionPerformed

    private void JBtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnNuevoActionPerformed

        jTextField1.setText(operacion);
        JDlgRegUsuario usuario=new JDlgRegUsuario(null,true);
        usuario.mostrar1(operacion);
        usuario.setVisible(true);
        
    }//GEN-LAST:event_JBtnNuevoActionPerformed

    private void JBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnEditarActionPerformed
        
         try
           {
             jTextField1.setText(opera);
        JDlgRegUsuario c=new JDlgRegUsuario(null,true);

        c.mostrar(clavess,usuarioss,contraseñass,archivoo,iniciarsesionn,cerrarsesionn,regitrodeusuarioo,salirdeaplicacionn,clientess,registrodeclientess,pagoss,registrodepagoss,emisionesordeness,reportess,reportedeingresoss,reportedepagoss,reportedeordeness,herramientass,calculadoraa,respaldarbdd,restaurarbdd);
        c.mostrar1(opera);
       c.setVisible(true);
        }catch (Exception ex) {
                       
        JOptionPane.showMessageDialog( null, "PARA PODER EDITAR UN REGISTRO,\nDEBE SELECCIONAR UNA FILA DE LA TABLA", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
                  }
    }//GEN-LAST:event_JBtnEditarActionPerformed

    private void JBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnEliminarActionPerformed

          try
           {
        bd_manager obj = new bd_manager();
                  String sql;
                    ResultSet rs;
        DefaultTableModel modelo = (DefaultTableModel)JTblUsuarios.getModel();
        int clave=0;
        int row = JTblUsuarios.getSelectedRow();
        String usuarios = JTblUsuarios.getValueAt(row,0).toString();
        clave=Integer.parseInt(usuarios);

           sql=("DELETE  FROM tblusuario WHERE ClvUsuario='" + usuarios + "'");

           obj.AbcProye(sql);
           try{

               modelo.removeRow(JTblUsuarios.getSelectedRow());
           }catch (Exception ex) {
                   
                    JOptionPane.showMessageDialog( null, "ERROR AL ELIMINAR LOS DATOS DE LA TABLA", "ERROR", JOptionPane.ERROR_MESSAGE);
                  }

        }catch (Exception ex) {
                    
        JOptionPane.showMessageDialog( null, "PARA PODER ELIMINAR UN REGISTRO,\nDEBE SELECCIONAR UNA FILA DE LA TABLA", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
                  }
    }//GEN-LAST:event_JBtnEliminarActionPerformed

    private void JTblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTblUsuariosMouseClicked
    this.clavess= String.valueOf(contenido[JTblUsuarios.getSelectedRow()][0].toString());
  this.usuarioss= String.valueOf(contenido[JTblUsuarios.getSelectedRow()][1].toString());
  this.contraseñass= String.valueOf(contenido[JTblUsuarios.getSelectedRow()][2].toString());
 this.archivoo= Boolean.valueOf(contenido[JTblUsuarios.getSelectedRow()][3].toString());
 this.iniciarsesionn= Boolean.valueOf(contenido[JTblUsuarios.getSelectedRow()][4].toString());
 this.cerrarsesionn= Boolean.valueOf(contenido[JTblUsuarios.getSelectedRow()][5].toString());
 this.regitrodeusuarioo= Boolean.valueOf(contenido[JTblUsuarios.getSelectedRow()][6].toString());
 this.salirdeaplicacionn= Boolean.valueOf(contenido[JTblUsuarios.getSelectedRow()][7].toString());
 this.clientess= Boolean.valueOf(contenido[JTblUsuarios.getSelectedRow()][8].toString());
 this.registrodeclientess= Boolean.valueOf(contenido[JTblUsuarios.getSelectedRow()][9].toString());
 this.pagoss= Boolean.valueOf(contenido[JTblUsuarios.getSelectedRow()][9].toString());
 this.registrodepagoss= Boolean.valueOf(contenido[JTblUsuarios.getSelectedRow()][10].toString());
 this.emisionesordeness= Boolean.valueOf(contenido[JTblUsuarios.getSelectedRow()][11].toString());
 this.reportess= Boolean.valueOf(contenido[JTblUsuarios.getSelectedRow()][12].toString());
 this.reportedeingresoss= Boolean.valueOf(contenido[JTblUsuarios.getSelectedRow()][13].toString());
 this.reportedepagoss= Boolean.valueOf(contenido[JTblUsuarios.getSelectedRow()][14].toString());
 this.reportedeordeness= Boolean.valueOf(contenido[JTblUsuarios.getSelectedRow()][15].toString());
 this.herramientass= Boolean.valueOf(contenido[JTblUsuarios.getSelectedRow()][16].toString());
 this.calculadoraa= Boolean.valueOf(contenido[JTblUsuarios.getSelectedRow()][17].toString());
 this.respaldarbdd= Boolean.valueOf(contenido[JTblUsuarios.getSelectedRow()][18].toString());
 this.restaurarbdd= Boolean.valueOf(contenido[JTblUsuarios.getSelectedRow()][19].toString());
    }//GEN-LAST:event_JTblUsuariosMouseClicked

    private void JTxtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxtBuscarKeyTyped
        getJTxtBuscar();
}//GEN-LAST:event_JTxtBuscarKeyTyped

    private void JTBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTBtnBuscarActionPerformed
        if(this.JTBtnBuscar.isSelected())
        {
            this.jLabel1.setVisible(true);
            this.getJTxtBuscar().setVisible(true);
            this.getJTxtBuscar().requestFocus();
        }
        else
        {
            this.jLabel1.setVisible(false);
            this.getJTxtBuscar().setVisible(false);
            this.getJTxtBuscar().setText("");
        }
    }//GEN-LAST:event_JTBtnBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        muestra();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgUsuarios dialog = new JDlgUsuarios(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtnEditar;
    private javax.swing.JButton JBtnEliminar;
    private javax.swing.JButton JBtnNuevo;
    private javax.swing.JButton JBtnSalir;
    private javax.swing.JScrollPane JScllPnl;
    private javax.swing.JToggleButton JTBtnBuscar;
    private javax.swing.JTable JTblUsuarios;
    private javax.swing.JToolBar JTlbOpciones;
    private javax.swing.JTextField JTxtBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

 private Object contenido [][];
     private String titulos[];
     bdDatos db = new bdDatos();

    public javax.swing.JTextField getJTxtBuscar()
    {
        if (JTxtBuscar.getText() != "")
        {
            JTxtBuscar.addKeyListener(new java.awt.event.KeyAdapter()
            {
                @Override
                public void keyTyped(java.awt.event.KeyEvent e)
                {
                    final TableRowSorter<TableModel> sorter =new TableRowSorter<TableModel>(JTblUsuarios.getModel());
                    JTblUsuarios.setRowSorter(sorter);
                    String nombre = JTxtBuscar.getText();
                    if (nombre.length() == 0)
                    {
                       sorter.setRowFilter(null);
                    }
                    else
                    {
                        try
                        {
                            sorter.setRowFilter(RowFilter.regexFilter("^" + nombre, 2));
                        }
                        catch (Exception ex)
                        {
                            JOptionPane.showMessageDialog( null, "NO EXISTEN DATOS QUE COINCIDAN\nCON LAS PALABRAS ESCRITAS", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                   }
                }
            });
       }
        return JTxtBuscar;
    }

    public void setJTxtBuscar(javax.swing.JTextField JTxtBuscar) {
        this.JTxtBuscar = JTxtBuscar;
    }

}