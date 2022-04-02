import javax.swing.*;
public class JFrameLogin extends JFrame{
   PanelLogin mostrar = new PanelLogin();   
    public JFrameLogin(){ 
     initComponents();
   }
   
   private void initComponents(){
      this.setEnabled(true);
      this.setBounds(580,180,350,200);
      setSize(350, 200);
      setTitle("USUARIO Y CONTRASEÑA");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setContentPane(mostrar);
      setVisible(true);       
   }   
}