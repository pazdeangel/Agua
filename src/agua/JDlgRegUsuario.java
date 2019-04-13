package agua;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import java.sql.*;
public class JDlgRegUsuario extends javax.swing.JDialog
{
    public String claveclientess;
    public int clavenueva;
    public int num;
    public JDlgRegUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jTextField2.setVisible(false);
        ultimoregistro();
         setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Gota.png")); setIconImage(icon);
        this.JTxtUsuario.setDocument(new JTextFieldLimit(10));
     this.JTxtContraseña.setDocument(new JTextFieldLimit(10));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTxtClave = new javax.swing.JTextField();
        JTxtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTxtContraseña = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JBtnGuardar = new javax.swing.JButton();
        JBtnCancelar = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(agua.AguaApp.class).getContext().getResourceMap(JDlgRegUsuario.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        setResizable(false);

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        JTxtClave.setEditable(false);
        JTxtClave.setFont(resourceMap.getFont("JTxtClave.font")); // NOI18N
        JTxtClave.setText(resourceMap.getString("JTxtClave.text")); // NOI18N
        JTxtClave.setName("JTxtClave"); // NOI18N
        JTxtClave.setNextFocusableComponent(JTxtUsuario);
        JTxtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTxtClaveKeyTyped(evt);
            }
        });

        JTxtUsuario.setFont(resourceMap.getFont("JTxtClave.font")); // NOI18N
        JTxtUsuario.setText(resourceMap.getString("JTxtUsuario.text")); // NOI18N
        JTxtUsuario.setName("JTxtUsuario"); // NOI18N
        JTxtUsuario.setNextFocusableComponent(JTxtContraseña);
        JTxtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTxtUsuarioKeyTyped(evt);
            }
        });

        jLabel4.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        JTxtContraseña.setFont(resourceMap.getFont("JTxtClave.font")); // NOI18N
        JTxtContraseña.setText(resourceMap.getString("JTxtContraseña.text")); // NOI18N
        JTxtContraseña.setName("JTxtContraseña"); // NOI18N
        JTxtContraseña.setNextFocusableComponent(JBtnGuardar);
        JTxtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTxtContraseñaKeyTyped(evt);
            }
        });

        jLabel5.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        JBtnGuardar.setFont(resourceMap.getFont("JBtnGuardar.font")); // NOI18N
        JBtnGuardar.setIcon(resourceMap.getIcon("JBtnGuardar.icon")); // NOI18N
        JBtnGuardar.setText(resourceMap.getString("JBtnGuardar.text")); // NOI18N
        JBtnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnGuardar.setName("JBtnGuardar"); // NOI18N
        JBtnGuardar.setNextFocusableComponent(JBtnCancelar);
        JBtnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnGuardarActionPerformed(evt);
            }
        });
        JBtnGuardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JBtnGuardarKeyTyped(evt);
            }
        });

        JBtnCancelar.setFont(resourceMap.getFont("JBtnCancelar.font")); // NOI18N
        JBtnCancelar.setIcon(resourceMap.getIcon("JBtnCancelar.icon")); // NOI18N
        JBtnCancelar.setText(resourceMap.getString("JBtnCancelar.text")); // NOI18N
        JBtnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnCancelar.setName("JBtnCancelar"); // NOI18N
        JBtnCancelar.setNextFocusableComponent(JTxtClave);
        JBtnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnCancelarActionPerformed(evt);
            }
        });
        JBtnCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JBtnCancelarKeyTyped(evt);
            }
        });

        panel1.setBackground(resourceMap.getColor("panel1.background")); // NOI18N
        panel1.setName("panel1"); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setName("jPanel1"); // NOI18N

        jCheckBox1.setFont(resourceMap.getFont("jCheckBox1.font")); // NOI18N
        jCheckBox1.setText(resourceMap.getString("jCheckBox1.text")); // NOI18N
        jCheckBox1.setName("jCheckBox1"); // NOI18N
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });

        jCheckBox2.setFont(resourceMap.getFont("jCheckBox1.font")); // NOI18N
        jCheckBox2.setText(resourceMap.getString("jCheckBox2.text")); // NOI18N
        jCheckBox2.setName("jCheckBox2"); // NOI18N
        jCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox2MouseClicked(evt);
            }
        });
        jCheckBox2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCheckBox2KeyPressed(evt);
            }
        });

        jCheckBox3.setFont(resourceMap.getFont("jCheckBox1.font")); // NOI18N
        jCheckBox3.setText(resourceMap.getString("jCheckBox3.text")); // NOI18N
        jCheckBox3.setName("jCheckBox3"); // NOI18N
        jCheckBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox3MouseClicked(evt);
            }
        });

        jCheckBox4.setFont(resourceMap.getFont("jCheckBox1.font")); // NOI18N
        jCheckBox4.setText(resourceMap.getString("jCheckBox4.text")); // NOI18N
        jCheckBox4.setName("jCheckBox4"); // NOI18N
        jCheckBox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox4MouseClicked(evt);
            }
        });

        jCheckBox5.setFont(resourceMap.getFont("jCheckBox1.font")); // NOI18N
        jCheckBox5.setText(resourceMap.getString("jCheckBox5.text")); // NOI18N
        jCheckBox5.setName("jCheckBox5"); // NOI18N
        jCheckBox5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox5))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox5))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setName("jPanel2"); // NOI18N

        jCheckBox6.setFont(resourceMap.getFont("jCheckBox1.font")); // NOI18N
        jCheckBox6.setText(resourceMap.getString("jCheckBox6.text")); // NOI18N
        jCheckBox6.setName("jCheckBox6"); // NOI18N
        jCheckBox6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox6MouseClicked(evt);
            }
        });

        jCheckBox7.setFont(resourceMap.getFont("jCheckBox1.font")); // NOI18N
        jCheckBox7.setText(resourceMap.getString("jCheckBox7.text")); // NOI18N
        jCheckBox7.setName("jCheckBox7"); // NOI18N
        jCheckBox7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jCheckBox7)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jCheckBox6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox7)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setName("jPanel3"); // NOI18N

        jCheckBox8.setFont(resourceMap.getFont("jCheckBox1.font")); // NOI18N
        jCheckBox8.setText(resourceMap.getString("jCheckBox8.text")); // NOI18N
        jCheckBox8.setName("jCheckBox8"); // NOI18N
        jCheckBox8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox8MouseClicked(evt);
            }
        });

        jCheckBox9.setFont(resourceMap.getFont("jCheckBox1.font")); // NOI18N
        jCheckBox9.setText(resourceMap.getString("jCheckBox9.text")); // NOI18N
        jCheckBox9.setName("jCheckBox9"); // NOI18N
        jCheckBox9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox9MouseClicked(evt);
            }
        });

        jCheckBox10.setFont(resourceMap.getFont("jCheckBox1.font")); // NOI18N
        jCheckBox10.setText(resourceMap.getString("jCheckBox10.text")); // NOI18N
        jCheckBox10.setName("jCheckBox10"); // NOI18N
        jCheckBox10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox8)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox10)
                            .addComponent(jCheckBox9))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jCheckBox8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox10)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setName("jPanel4"); // NOI18N

        jCheckBox11.setFont(resourceMap.getFont("jCheckBox1.font")); // NOI18N
        jCheckBox11.setText(resourceMap.getString("jCheckBox11.text")); // NOI18N
        jCheckBox11.setName("jCheckBox11"); // NOI18N
        jCheckBox11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox11MouseClicked(evt);
            }
        });

        jCheckBox12.setFont(resourceMap.getFont("jCheckBox1.font")); // NOI18N
        jCheckBox12.setText(resourceMap.getString("jCheckBox12.text")); // NOI18N
        jCheckBox12.setName("jCheckBox12"); // NOI18N
        jCheckBox12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox12MouseClicked(evt);
            }
        });

        jCheckBox13.setFont(resourceMap.getFont("jCheckBox1.font")); // NOI18N
        jCheckBox13.setText(resourceMap.getString("jCheckBox13.text")); // NOI18N
        jCheckBox13.setName("jCheckBox13"); // NOI18N
        jCheckBox13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox13MouseClicked(evt);
            }
        });

        jCheckBox14.setFont(resourceMap.getFont("jCheckBox1.font")); // NOI18N
        jCheckBox14.setText(resourceMap.getString("jCheckBox14.text")); // NOI18N
        jCheckBox14.setName("jCheckBox14"); // NOI18N
        jCheckBox14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox11)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox12)
                            .addComponent(jCheckBox14)
                            .addComponent(jCheckBox13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jCheckBox11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setName("jPanel5"); // NOI18N

        jCheckBox15.setFont(resourceMap.getFont("jCheckBox1.font")); // NOI18N
        jCheckBox15.setText(resourceMap.getString("jCheckBox15.text")); // NOI18N
        jCheckBox15.setName("jCheckBox15"); // NOI18N
        jCheckBox15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox15MouseClicked(evt);
            }
        });

        jCheckBox16.setFont(resourceMap.getFont("jCheckBox1.font")); // NOI18N
        jCheckBox16.setText(resourceMap.getString("jCheckBox16.text")); // NOI18N
        jCheckBox16.setName("jCheckBox16"); // NOI18N
        jCheckBox16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox16MouseClicked(evt);
            }
        });

        jCheckBox17.setFont(resourceMap.getFont("jCheckBox1.font")); // NOI18N
        jCheckBox17.setText(resourceMap.getString("jCheckBox17.text")); // NOI18N
        jCheckBox17.setName("jCheckBox17"); // NOI18N
        jCheckBox17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox17MouseClicked(evt);
            }
        });

        jCheckBox18.setFont(resourceMap.getFont("jCheckBox1.font")); // NOI18N
        jCheckBox18.setText(resourceMap.getString("jCheckBox18.text")); // NOI18N
        jCheckBox18.setName("jCheckBox18"); // NOI18N
        jCheckBox18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox15)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox17)
                            .addComponent(jCheckBox16)
                            .addComponent(jCheckBox18))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jCheckBox15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField2.setText(resourceMap.getString("jTextField2.text")); // NOI18N
        jTextField2.setName("jTextField2"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(7, 7, 7)
                                .addComponent(JTxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTxtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(216, 216, 216)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JBtnGuardar)
                        .addGap(15, 15, 15)
                        .addComponent(JBtnCancelar)
                        .addGap(21, 21, 21)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JTxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(JTxtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(JTxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBtnGuardar)
                    .addComponent(JBtnCancelar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void mostrar(String cla,String usu,String contr,boolean ara,boolean b,boolean c,boolean d,boolean e,boolean f,boolean g,boolean h,boolean i,boolean j,boolean k,boolean l,boolean m,boolean n,boolean o,boolean p,boolean q,boolean r )
{
        this.JTxtClave.setText(cla.trim());
        this.JTxtUsuario.setText(usu.trim());
         this.JTxtContraseña.setText(contr.trim());
        this.jCheckBox1.setSelected(ara);
        this.jCheckBox2.setSelected(b);
        this.jCheckBox3.setSelected(c);
        this.jCheckBox4.setSelected(d);
        this.jCheckBox5.setSelected(e);
        this.jCheckBox6.setSelected(f);
        this.jCheckBox7.setSelected(g);
        this.jCheckBox8.setSelected(h);
        this.jCheckBox9.setSelected(i);
        this.jCheckBox10.setSelected(j);
        this.jCheckBox11.setSelected(k);
        this.jCheckBox12.setSelected(l);
        this.jCheckBox13.setSelected(m);
        this.jCheckBox14.setSelected(n);
        this.jCheckBox15.setSelected(o);
        this.jCheckBox16.setSelected(p);
        this.jCheckBox17.setSelected(q);
        this.jCheckBox18.setSelected(r);
        
    }

public void mostrar1(String guar)
{
    jTextField2.setText(guar.trim());
}

public void ultimoregistro()
     {
    try
            {
               bd_manager obj = new bd_manager();
               String sql;
               ResultSet rs;
               sql=("select ClvUsuario FROM tblusuario ");
               rs= obj.consultar(sql);

              int a;
             
               while (rs.next())
               {
                   claveclientess=rs.getString(1);
                  a= Integer.parseInt(claveclientess);
                      clavenueva=a+1;
               }
                  this.JTxtClave.setText(Integer.toString(clavenueva));
            }catch (Exception ex) {
                       JOptionPane.showMessageDialog( null, "ERROR AL ABRIR LA TABLA", "ERROR", JOptionPane.ERROR_MESSAGE);
                  }
}
    private void JBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnGuardarActionPerformed
        
   boolean a=true;
        JFrmMdi m=new JFrmMdi();
        if (jCheckBox1.isValid())
        {
          
           m.getJMenuBar().getMenu(0).setEnabled(true);
        }
        else
        {
            num=0;
            m.getJMenuBar().getMenu(0).setEnabled(false);
        }
        if (jCheckBox2.isSelected())
         {
            num=1;
            m.getJMenuBar().getMenu(0).getItem(0).setEnabled(true);
         }
          else
          {
            num=0;
            m.getJMenuBar().getMenu(0).getItem(0).setEnabled(false);
          }
       if (jCheckBox3.isSelected())
        {
           num=1;
              m.getJMenuBar().getMenu(0).getItem(1).setEnabled(true);
        }
          else
          {
            num=0;
            m.getJMenuBar().getMenu(0).getItem(1).setEnabled(false);
          }
        if (jCheckBox4.isSelected())
        {
            num=1;
              m.getJMenuBar().getMenu(0).getItem(2).setEnabled(true);
        }
          else
          {
            num=0;
            m.getJMenuBar().getMenu(0).getItem(2).setEnabled(false);
          }
        if (jCheckBox5.isSelected())
        {
            num=1;
              m.getJMenuBar().getMenu(0).getItem(3).setEnabled(true);
        }
          else
          {
            num=0;
            m.getJMenuBar().getMenu(0).getItem(3).setEnabled(false);
          }

         if (jCheckBox6.isSelected())
        {
             num=1;
              //m.getJMenuBar().getMenu(1).getItem(0).setEnabled(true);
              m.getJMenuBar().getMenu(1).setEnabled(true);
        }
        else
          {
            num=0;
             //m.getJMenuBar().getMenu(1).getItem(0).setEnabled(true);
             m.getJMenuBar().getMenu(1).setEnabled(false);
          }
         if (jCheckBox7.isSelected())
        {
             num=1;
              m.getJMenuBar().getMenu(1).getItem(0).setEnabled(true);
        }
        else
          {
            num=0;
            m.getJMenuBar().getMenu(1).getItem(0).setEnabled(true);
          }

        if (jCheckBox8.isSelected())
        {
            num=1;
              m.getJMenuBar().getMenu(2).setEnabled(true);
        }
        else
          {
            num=0;
            m.getJMenuBar().getMenu(2).setEnabled(false);
          }
        if (jCheckBox9.isSelected())
         {
            num=1;
            m.getJMenuBar().getMenu(2).getItem(0).setEnabled(true);
         }
          else
          {
            num=0;
            m.getJMenuBar().getMenu(2).getItem(0).setEnabled(false);
          }
         if (jCheckBox10.isSelected())
         {
             num=1;
            m.getJMenuBar().getMenu(2).getItem(1).setEnabled(true);
         }
          else
          {
            num=0;
            m.getJMenuBar().getMenu(2).getItem(1).setEnabled(false);
          }

        if (jCheckBox11.isSelected())
        {
            num=1;
              m.getJMenuBar().getMenu(3).setEnabled(true);
        }
         else
          {
            num=0;
            m.getJMenuBar().getMenu(3).setEnabled(false);
          }
        if (jCheckBox12.isSelected())
         {
            num=1;
            m.getJMenuBar().getMenu(3).getItem(0).setEnabled(true);
         }
          else
          {
            num=0;
            m.getJMenuBar().getMenu(3).getItem(0).setEnabled(false);
          }
        if (jCheckBox13.isSelected())
         {
            num=1;
            m.getJMenuBar().getMenu(3).getItem(1).setEnabled(true);
         }
          else
          {
            num=0;
            m.getJMenuBar().getMenu(3).getItem(1).setEnabled(false);
          }
        if (jCheckBox14.isSelected())
         {
            num=1;
            m.getJMenuBar().getMenu(3).getItem(2).setEnabled(true);
         }
          else
          {
            num=0;
            m.getJMenuBar().getMenu(3).getItem(2).setEnabled(false);
          }

        if (jCheckBox15.isSelected())
        {
            num=1;
              m.getJMenuBar().getMenu(4).setEnabled(true);
        }
         else
          {
            num=0;
            m.getJMenuBar().getMenu(4).setEnabled(false);
          }
         if (jCheckBox16.isSelected())
         {
             num=1;
            m.getJMenuBar().getMenu(4).getItem(0).setEnabled(true);
         }
          else
          {
            num=0;
            m.getJMenuBar().getMenu(4).getItem(0).setEnabled(false);
          }
         if (jCheckBox17.isSelected())
         {
             num=1;
            m.getJMenuBar().getMenu(4).getItem(1).setEnabled(true);
         }
          else
          {
            num=0;
            m.getJMenuBar().getMenu(4).getItem(1).setEnabled(false);
          }
         if (jCheckBox18.isSelected())
         {
             num=1;
            m.getJMenuBar().getMenu(4).getItem(2).setEnabled(true);
         }
          else
          {
            num=0;
            m.getJMenuBar().getMenu(4).getItem(2).setEnabled(false);
          }

//  /////////////////////////menu6////////////////////////////////////////////

      if(     this.JTxtUsuario.getText().equals(""))
       {
       JOptionPane.showMessageDialog( null, "DEBE ESCRIBIR EL NOMBRE DEL USUARIO", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
       this.JTxtUsuario.requestFocus();
       }
        else
        {
             if(     this.JTxtContraseña.getText().equals(""))
               {
               JOptionPane.showMessageDialog( null, "DEBE ESCRIBIR LA CONTRASEÑA", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
               this.JTxtContraseña.requestFocus();
               }
             else
             {
   if(    jTextField2.getText().equals("GUARDAR"))
   {
         try
        {
        bd_manager obj = new bd_manager();
        String sql;
        sql = ("INSERT INTO tblusuario (ClvUsuario,Usuario,Contraseña,Archivo,IniciarSesion,CerrarSesion,RegistroDeUsuario,SalirDeAplicacion,Clientes,RegistroDeClientes,Pagos,RegistroDePagos,EmisionesOrdenes,Reportes,ReporteDeIngresos,ReporteDePagos,ReporteDeOrdenes,Herramientas,Calculadora,RespaldarBd,RestaurarBd) Values (" + JTxtClave.getText() + ",'" + JTxtUsuario.getText() + "','" + JTxtContraseña.getText() + "'," + this.jCheckBox1.isSelected() + "," + this.jCheckBox2.isSelected() + "," + this.jCheckBox3.isSelected() + "," + this.jCheckBox4.isSelected() + "," + this.jCheckBox5.isSelected() + "," + this.jCheckBox6.isSelected() + "," + this.jCheckBox7.isSelected() + "," + this.jCheckBox8.isSelected() + "," + this.jCheckBox9.isSelected() + "," + this.jCheckBox10.isSelected() + "," + this.jCheckBox11.isSelected() + "," + this.jCheckBox12.isSelected() + "," + this.jCheckBox13.isSelected() + "," + this.jCheckBox14.isSelected() + "," + this.jCheckBox15.isSelected() + "," + this.jCheckBox16.isSelected() + "," + this.jCheckBox17.isSelected() + "," + this.jCheckBox18.isSelected() + ","  + ")");
        obj.AbcProye(sql);
        JOptionPane.showMessageDialog( null, "REGISTRO GUARDADO CORRECTAMENTE", "GUARDANDO", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog( null, "ERROR AL GUARDAR EL REGISTRO", "VERIFICAR", JOptionPane.ERROR_MESSAGE);
        }
   }else
   {
            if(    jTextField2.getText().equals("EDITAR"))
            {
             try
        {
        bd_manager obj = new bd_manager();
        String sql;
        sql = ("UPDATE tblusuario SET Usuario='" + JTxtUsuario.getText() + "',Contraseña='" + JTxtContraseña.getText() + "',Archivo=" + this.jCheckBox1.isSelected() + ",IniciarSesion=" + this.jCheckBox2.isSelected() + ",CerrarSesion=" + this.jCheckBox3.isSelected() + ",RegistroDeUsuario=" + this.jCheckBox4.isSelected() + ",SalirDeAplicacion=" + this.jCheckBox5.isSelected() + ",Clientes=" + this.jCheckBox6.isSelected() + ",RegistroDeClientes=" + this.jCheckBox7.isSelected() + ",Pagos=" + this.jCheckBox8.isSelected() + ",RegistroDePagos=" + this.jCheckBox9.isSelected() + ",EmisionesOrdenes=" + this.jCheckBox10.isSelected() + ",Reportes=" + this.jCheckBox11.isSelected() + ",ReporteDeIngresos=" + this.jCheckBox12.isSelected() + ",ReporteDePagos=" + this.jCheckBox13.isSelected() + ",ReporteDeOrdenes=" + this.jCheckBox14.isSelected() + ",Herramientas=" + this.jCheckBox15.isSelected() + ",Calculadora=" + this.jCheckBox16.isSelected() + ",RespaldarBd=" + this.jCheckBox17.isSelected() + ",RestaurarBd=" + this.jCheckBox18.isSelected() + " where ClvUsuario=" + JTxtClave.getText() + "");
        obj.AbcProye(sql);
        JOptionPane.showMessageDialog( null, "REGISTRO ACTUALIZADO CORRECTAMENTE", "ACTUALIZANDO", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog( null, "ERROR AL ACTUALIZAR EL REGISTRO", "VERIFICAR", JOptionPane.ERROR_MESSAGE);
        }
            }
   }
             }
        }
    }//GEN-LAST:event_JBtnGuardarActionPerformed

    private void JBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBtnCancelarActionPerformed

    private void jCheckBox2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCheckBox2KeyPressed
       
    }//GEN-LAST:event_jCheckBox2KeyPressed

    private void jCheckBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox2MouseClicked
       
       if(jCheckBox2.isSelected()==true)
      {
        jCheckBox1.setSelected(true);
      }
      else{
           jCheckBox1.setSelected(false);
      }
    }//GEN-LAST:event_jCheckBox2MouseClicked

    private void jCheckBox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox3MouseClicked
       
      if(jCheckBox3.isSelected()==true)
      {
        jCheckBox1.setSelected(true);
      }
      else{
           jCheckBox1.setSelected(false);
      }
    }//GEN-LAST:event_jCheckBox3MouseClicked

    private void jCheckBox4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox4MouseClicked
        
        if(jCheckBox4.isSelected()==true)
      {
        jCheckBox1.setSelected(true);
      }
      else{
           jCheckBox1.setSelected(false);
      }
    }//GEN-LAST:event_jCheckBox4MouseClicked

    private void jCheckBox5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox5MouseClicked
        
        if(jCheckBox5.isSelected()==true)
      {
        jCheckBox1.setSelected(true);
      }
      else{
           jCheckBox1.setSelected(false);
      }
    }//GEN-LAST:event_jCheckBox5MouseClicked

    private void jCheckBox7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox7MouseClicked
       
        if(jCheckBox7.isSelected()==true)
      {
        jCheckBox6.setSelected(true);
      }
      else{
           jCheckBox6.setSelected(false);
      }
    }//GEN-LAST:event_jCheckBox7MouseClicked

    private void jCheckBox9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox9MouseClicked
        
        if(jCheckBox9.isSelected()==true)
      {
        jCheckBox8.setSelected(true);
      }
      else{
           jCheckBox8.setSelected(false);
      }
    }//GEN-LAST:event_jCheckBox9MouseClicked

    private void jCheckBox10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox10MouseClicked
       
        if(jCheckBox10.isSelected()==true)
      {
        jCheckBox8.setSelected(true);
      }
      else{
           jCheckBox8.setSelected(false);
      }
    }//GEN-LAST:event_jCheckBox10MouseClicked

    private void jCheckBox12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox12MouseClicked
        
        if(jCheckBox12.isSelected()==true)
      {
        jCheckBox11.setSelected(true);
      }
      else{
           jCheckBox11.setSelected(false);
      }
    }//GEN-LAST:event_jCheckBox12MouseClicked

    private void jCheckBox13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox13MouseClicked
       
        if(jCheckBox13.isSelected()==true)
      {
        jCheckBox11.setSelected(true);
      }
      else{
           jCheckBox11.setSelected(false);
      }
    }//GEN-LAST:event_jCheckBox13MouseClicked

    private void jCheckBox14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox14MouseClicked
       
        if(jCheckBox14.isSelected()==true)
      {
        jCheckBox11.setSelected(true);
      }
      else{
           jCheckBox11.setSelected(false);
      }
    }//GEN-LAST:event_jCheckBox14MouseClicked

    private void jCheckBox16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox16MouseClicked
       
        if(jCheckBox16.isSelected()==true)
      {
        jCheckBox15.setSelected(true);
      }
      else{
           jCheckBox15.setSelected(false);
      }
    }//GEN-LAST:event_jCheckBox16MouseClicked

    private void jCheckBox17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox17MouseClicked
       
        if(jCheckBox17.isSelected()==true)
      {
        jCheckBox15.setSelected(true);
      }
      else{
           jCheckBox15.setSelected(false);
      }
    }//GEN-LAST:event_jCheckBox17MouseClicked

    private void jCheckBox18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox18MouseClicked
        
        if(jCheckBox18.isSelected()==true)
      {
        jCheckBox15.setSelected(true);
      }
      else{
           jCheckBox15.setSelected(false);
      }
    }//GEN-LAST:event_jCheckBox18MouseClicked

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        
        if(jCheckBox1.isSelected()==true)
      {
        jCheckBox2.setSelected(true);
        jCheckBox3.setSelected(true);
        jCheckBox4.setSelected(true);
        jCheckBox5.setSelected(true);
      }
      else{
           jCheckBox2.setSelected(false);
           jCheckBox3.setSelected(false);
           jCheckBox4.setSelected(false);
           jCheckBox5.setSelected(false);
      }
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void jCheckBox6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox6MouseClicked
        
        if(jCheckBox6.isSelected()==true)
      {
        jCheckBox7.setSelected(true);
      }
      else{
           jCheckBox7.setSelected(false);
      }
    }//GEN-LAST:event_jCheckBox6MouseClicked

    private void jCheckBox8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox8MouseClicked
       
        if(jCheckBox8.isSelected()==true)
      {
        jCheckBox9.setSelected(true);
        jCheckBox10.setSelected(true);
      }
      else{
           jCheckBox9.setSelected(false);
           jCheckBox10.setSelected(false);
      }
    }//GEN-LAST:event_jCheckBox8MouseClicked

    private void jCheckBox11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox11MouseClicked
        
        if(jCheckBox11.isSelected()==true)
      {
        jCheckBox12.setSelected(true);
        jCheckBox13.setSelected(true);
        jCheckBox14.setSelected(true);
      }
      else{
           jCheckBox12.setSelected(false);
           jCheckBox13.setSelected(false);
           jCheckBox14.setSelected(false);
      }
    }//GEN-LAST:event_jCheckBox11MouseClicked

    private void jCheckBox15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox15MouseClicked
       
        if(jCheckBox15.isSelected()==true)
      {
        jCheckBox16.setSelected(true);
        jCheckBox17.setSelected(true);
        jCheckBox18.setSelected(true);
      }
      else{
           jCheckBox16.setSelected(false);
           jCheckBox17.setSelected(false);
           jCheckBox18.setSelected(false);
      }
    }//GEN-LAST:event_jCheckBox15MouseClicked

    private void JTxtClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxtClaveKeyTyped
        
        char numero=  evt.getKeyChar();
      if(!(numero>='0' && numero<='9'))
      {
          evt.consume();
      }
      if(numero==10)
      {
          this.JTxtUsuario.requestFocus();
      }
    }//GEN-LAST:event_JTxtClaveKeyTyped

    private void JTxtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxtUsuarioKeyTyped
        
        char letra=  evt.getKeyChar();
      if(letra>='0' && letra<='9')
      {
          evt.consume();
      }
      if(letra==10)
      {
          this.JTxtContraseña.requestFocus();
      }
    }//GEN-LAST:event_JTxtUsuarioKeyTyped

    private void JTxtContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxtContraseñaKeyTyped
        
        char numlet=  evt.getKeyChar();
        if(numlet==10)
      {
          this.JBtnGuardar.requestFocus();
      }
    }//GEN-LAST:event_JTxtContraseñaKeyTyped

    private void JBtnGuardarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JBtnGuardarKeyTyped
        
        char numlet=  evt.getKeyChar();
        if(numlet==10)
      {
          this.JBtnCancelar.requestFocus();
      }
    }//GEN-LAST:event_JBtnGuardarKeyTyped

    private void JBtnCancelarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JBtnCancelarKeyTyped
        
    }//GEN-LAST:event_JBtnCancelarKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgRegUsuario dialog = new JDlgRegUsuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton JBtnCancelar;
    private javax.swing.JButton JBtnGuardar;
    private javax.swing.JTextField JTxtClave;
    private javax.swing.JTextField JTxtContraseña;
    private javax.swing.JTextField JTxtUsuario;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField2;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
