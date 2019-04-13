package agua;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Image;
import java.awt.Toolkit;

public class frmSplash extends javax.swing.JFrame implements ActionListener{
    private Timer timer;
    JFrmMdi main;
    int i=0;
    
    public frmSplash()
    {
        initComponents();
        setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Gota.png")); setIconImage(icon);
    
        timer = new Timer(100,new ActionListener()
        {
            public void actionPerformed(ActionEvent o)
            {
                //contador
                i+=1;
                //al progresbar se le pasa como parametro el contador
                pBar.setValue(i);
                //cuando llega a 100 pone un stop
                cek();
            }
        });
        timer.start();
    }
    //metodo para hacer que haga un stop antes de llegar a 100
    public void cek(){
        if(pBar.getPercentComplete()==1.0){
            timer.stop();            
            main = new JFrmMdi();
            main.show();
            //main.login();
            this.dispose();
        }        
    }       
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setTitle("CARGANDO...");
        setForeground(java.awt.Color.white);
        setUndecorated(true);
        getContentPane().setLayout(null);

        pBar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pBar.setForeground(new java.awt.Color(102, 189, 255));
        pBar.setDoubleBuffered(true);
        pBar.setStringPainted(true);
        getContentPane().add(pBar);
        pBar.setBounds(0, 370, 510, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Backgroundsplash.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(640, 480));
        jLabel1.setMinimumSize(new java.awt.Dimension(640, 480));
        jLabel1.setPreferredSize(new java.awt.Dimension(640, 480));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 370);

        setSize(new java.awt.Dimension(498, 390));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            frmSplash a;
            public void run() {
                a = new frmSplash();
                a.setVisible(true);
            }
        });
    }
    
    public void actionPerformed(ActionEvent e) {
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar pBar;
    // End of variables declaration//GEN-END:variables
}
