package agua;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
public class JDlgOrdenes extends javax.swing.JDialog {


    public String clvcliente,nocuenta,nombre,dire,tele;
    public String rfc,colonia,inspector,muni;
    public String noorden,fecha,tipo,moti;
    public String operacion;
    public String opera;

    public JDlgOrdenes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
            JTblOrdenes.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            JTblOrdenes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            this.jLabel1.setVisible(false);
            this.JTxtBuscar.setVisible(false);
            jTextField1.setVisible(false);
            operacion="GUARDAR";
            opera="EDITAR";
            db.Conectar();
            muestra();
        setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Gota.png")); setIconImage(icon);
    }

    public void muestra()
    {
        contenido = db.Consultar("SELECT tblorden.NoOrden,tblorden.Fecha,tblorden.Tipo,tblorden.Inspector,tblorden.NoCuenta,tblcliente.Nombre,tblcliente.Direccion,tblcliente.Colonia,tblcliente.Municipio,tblcliente.Telefono,tblcliente.Rfc,tblorden.MotivoCorte FROM tblcliente,tblorden where tblorden.NoCuenta=tblcliente.NoCuenta");
        titulos = new String[12];
        titulos[0] ="NoOrden";
        titulos[1] ="Fecha";
        titulos[2] ="Tipo";
        titulos[3] ="Inspector";
      //  titulos[4] ="ClvCliente";
        titulos[4] ="NoCuenta";
        titulos[5] ="Nombre";
        titulos[6] ="Direccion";
        titulos[7] ="Colonia";
        titulos[8] ="Municipio";
        titulos[9] ="Telefono";
        titulos[10] ="Rfc";
        titulos[11] ="MotivoCorte";
        JTblOrdenes.setModel(new javax.swing.table.DefaultTableModel(contenido, titulos));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        JBtnNuevo = new javax.swing.JButton();
        JBtnEditar = new javax.swing.JButton();
        JBtnEliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        JTBtnBuscar = new javax.swing.JToggleButton();
        JBtnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTblOrdenes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JTxtBuscar = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(agua.AguaApp.class).getContext().getResourceMap(JDlgOrdenes.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jToolBar1.setBackground(resourceMap.getColor("jToolBar1.background")); // NOI18N
        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setName("jToolBar1"); // NOI18N

        JBtnNuevo.setBackground(resourceMap.getColor("JBtnNuevo.background")); // NOI18N
        JBtnNuevo.setFont(resourceMap.getFont("JBtnEditar.font")); // NOI18N
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
        jToolBar1.add(JBtnNuevo);

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
        jToolBar1.add(JBtnEditar);

        JBtnEliminar.setBackground(resourceMap.getColor("JBtnEliminar.background")); // NOI18N
        JBtnEliminar.setFont(resourceMap.getFont("JBtnEditar.font")); // NOI18N
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
        jToolBar1.add(JBtnEliminar);

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
        jToolBar1.add(jButton1);

        JTBtnBuscar.setBackground(resourceMap.getColor("JTBtnBuscar.background")); // NOI18N
        JTBtnBuscar.setFont(resourceMap.getFont("JTBtnBuscar.font")); // NOI18N
        JTBtnBuscar.setIcon(resourceMap.getIcon("JTBtnBuscar.icon")); // NOI18N
        JTBtnBuscar.setText(resourceMap.getString("JTBtnBuscar.text")); // NOI18N
        JTBtnBuscar.setToolTipText(resourceMap.getString("JTBtnBuscar.toolTipText")); // NOI18N
        JTBtnBuscar.setFocusPainted(false);
        JTBtnBuscar.setFocusable(false);
        JTBtnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JTBtnBuscar.setName("JTBtnBuscar"); // NOI18N
        JTBtnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JTBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTBtnBuscarActionPerformed(evt);
            }
        });
        jToolBar1.add(JTBtnBuscar);

        JBtnSalir.setBackground(resourceMap.getColor("JBtnSalir.background")); // NOI18N
        JBtnSalir.setFont(resourceMap.getFont("JBtnEditar.font")); // NOI18N
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
        jToolBar1.add(JBtnSalir);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setName("jScrollPane1"); // NOI18N

        JTblOrdenes.setFont(resourceMap.getFont("JTblOrdenes.font")); // NOI18N
        JTblOrdenes.setModel(new javax.swing.table.DefaultTableModel(
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
        JTblOrdenes.setName("JTblOrdenes"); // NOI18N
        JTblOrdenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTblOrdenesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTblOrdenes);

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
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_JBtnSalirActionPerformed

    private void JBtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnNuevoActionPerformed
       jTextField1.setText(operacion);
        JDlgRegOrdenes orden=new JDlgRegOrdenes(null,true);
        orden.mostrar1(operacion);
        orden.setVisible(true);
    }//GEN-LAST:event_JBtnNuevoActionPerformed

    private void JTblOrdenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTblOrdenesMouseClicked
        
  this.noorden= String.valueOf(contenido[JTblOrdenes.getSelectedRow()][0].toString());
  this.fecha= String.valueOf(contenido[JTblOrdenes.getSelectedRow()][1].toString());
  this.tipo= String.valueOf(contenido[JTblOrdenes.getSelectedRow()][2].toString());
  this.inspector= String.valueOf(contenido[JTblOrdenes.getSelectedRow()][3].toString());
 // this.clvcliente= String.valueOf(contenido[JTblOrdenes.getSelectedRow()][4].toString());
  this.nocuenta= String.valueOf(contenido[JTblOrdenes.getSelectedRow()][4].toString());
  this.nombre= String.valueOf(contenido[JTblOrdenes.getSelectedRow()][5].toString());
  this.dire= String.valueOf(contenido[JTblOrdenes.getSelectedRow()][6].toString());
  this.colonia= String.valueOf(contenido[JTblOrdenes.getSelectedRow()][7].toString());
  this.muni= String.valueOf(contenido[JTblOrdenes.getSelectedRow()][8].toString());
  this.tele= String.valueOf(contenido[JTblOrdenes.getSelectedRow()][9].toString());
  this.rfc= String.valueOf(contenido[JTblOrdenes.getSelectedRow()][10].toString());
  this.moti= String.valueOf(contenido[JTblOrdenes.getSelectedRow()][11].toString());
    }//GEN-LAST:event_JTblOrdenesMouseClicked

    private void JBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnEditarActionPerformed
        
         try
           {
              jTextField1.setText(opera);
        JDlgRegOrdenes c=new JDlgRegOrdenes(null,true);

        c.mostrar(noorden,fecha,tipo,inspector,nocuenta,nombre,dire,colonia,muni,tele,rfc,moti);
         c.mostrar1(opera);
       c.setVisible(true);
        }catch (Exception ex)
         {
            JOptionPane.showMessageDialog( null, "selecciona una fila", "error", JOptionPane.PLAIN_MESSAGE);
         }
          operacion="EDITAR";
    }//GEN-LAST:event_JBtnEditarActionPerformed

    private void JBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnEliminarActionPerformed
       
         try
           {
        bd_manager obj = new bd_manager();
                  String sql;
                    ResultSet rs;
        DefaultTableModel modelo = (DefaultTableModel)JTblOrdenes.getModel();
        int clave=0;
        int row = JTblOrdenes.getSelectedRow();
        String usuarios = JTblOrdenes.getValueAt(row,0).toString();
        clave=Integer.parseInt(usuarios);
           sql=("DELETE  FROM tblorden WHERE NoOrden='" + usuarios + "'");

           obj.AbcProye(sql);
           try{
               modelo.removeRow(JTblOrdenes.getSelectedRow());
           }catch (Exception ex) {
                    JOptionPane.showMessageDialog( null, "error al eliminar los datos de la tabla", "error", JOptionPane.PLAIN_MESSAGE);
                  }

        }catch (Exception ex) {
              
        JOptionPane.showMessageDialog( null, "selecciona una fila", "error", JOptionPane.PLAIN_MESSAGE);
                  }
    }//GEN-LAST:event_JBtnEliminarActionPerformed

    private void JTxtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxtBuscarKeyTyped
        getJTxtBuscar();
}//GEN-LAST:event_JTxtBuscarKeyTyped

    private void JTBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTBtnBuscarActionPerformed
        if(this.JTBtnBuscar.isSelected())
        {
            this.jLabel1.setVisible(true);
            this.JTxtBuscar.setVisible(true);
            this.JTxtBuscar.requestFocus();
        }
        else
        {
            this.jLabel1.setVisible(false);
            this.JTxtBuscar.setVisible(false);
            this.JTxtBuscar.setText("");
        }
    }//GEN-LAST:event_JTBtnBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         muestra();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgOrdenes dialog = new JDlgOrdenes(new javax.swing.JFrame(), true);
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
    private javax.swing.JToggleButton JTBtnBuscar;
    private javax.swing.JTable JTblOrdenes;
    private javax.swing.JTextField JTxtBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
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
                    final TableRowSorter<TableModel> sorter =new TableRowSorter<TableModel>(JTblOrdenes.getModel());
                    JTblOrdenes.setRowSorter(sorter);
                    String nombre = JTxtBuscar.getText();
                    if (nombre.length() == 0)
                    {
                       sorter.setRowFilter(null);
                    }
                    else
                    {
                        try
                        {
                            sorter.setRowFilter(RowFilter.regexFilter("^" + nombre, 5));
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
