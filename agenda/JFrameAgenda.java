import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrameAgenda extends JFrame implements ActionListener {
    JButton btnAltas, btnConsulta, btnBuscar, btnModificar, btnEliminar, btnSalir;

    public JFrameAgenda() {
        iniciarMenu(); 
    }
    public void iniciarMenu(){

        setLayout(new GridLayout(7, 2));
        btnAltas = new JButton("ALTAS");
        btnConsulta = new JButton("CONSULTAR");
        btnBuscar = new JButton("BUSCAR");
        btnModificar = new JButton("MODIFICAR");
        btnEliminar = new JButton("ELIMINAR");
        btnSalir = new JButton("SALIR");

        add(btnAltas);
        add(btnConsulta);
        add(btnBuscar);
        add(btnModificar);
        add(btnEliminar);
        add(btnSalir);
         
        btnAltas.addActionListener(this);
        btnConsulta.addActionListener(this);
        btnBuscar.addActionListener(this);
        btnEliminar.addActionListener(this);
        btnModificar.addActionListener(this);
        btnSalir.addActionListener(this);


        this.setBounds(500,100,475,335);
        setTitle("AGENDA_GUZMÁN HERNÁNDEZ DAIANA CORET");
        this.setResizable(isMaximumSizeSet());
    	  this.getContentPane().setBackground(Color.CYAN);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnAltas){
            new JFrameAltas();
        }
        
        if(e.getSource()==btnConsulta){
            if(ZPersona.Arrpersona.size()>0){
                new JFrameConsultas();
            }else{
                JOptionPane.showMessageDialog(null, "NO EXISTEN REGISTROS",
						"Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if(e.getSource()==btnBuscar){
            if(ZPersona.Arrpersona.size()>0){
                new JFrameBuscar();
            }else{
                JOptionPane.showMessageDialog(null, "NO EXISTEN REGISTROS",
						"Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if(e.getSource()==btnModificar){
            if(ZPersona.Arrpersona.size()>0){
                new JFrameModificar();
            }else{
                JOptionPane.showMessageDialog(null, "NO EXISTEN REGISTROS",
						"Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if(e.getSource()==btnEliminar){
            if(ZPersona.Arrpersona.size()>0){
                new JFrameEliminar();
            }else{
                JOptionPane.showMessageDialog(null, "NO EXISTEN REGISTROS",
						"Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if(e.getSource()==btnSalir){
            System.exit(0);
        }
    }
}