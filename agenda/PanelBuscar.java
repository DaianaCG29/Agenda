import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class PanelBuscar extends JPanel implements ActionListener {
	private JButton btnBuscar;
	private JTextField txtNombre, txtApellidos, txtTelefono, txtCorreoe, txtFechaN;
   ZPersona mp = new ZPersona();
	ArrayList<Persona> datosPer = new ArrayList<Persona>();
   private int pos = 0;

	public PanelBuscar() {
        datosPer = mp.Datos();
        
		setLayout(new GridLayout(7, 2));
		JLabel lblNombre = new JLabel("NOMBRE: ", JLabel.RIGHT);
		txtNombre = new JTextField(30);
		add(lblNombre);
		add(txtNombre);

		JLabel lblApellidos = new JLabel("APELLIDOS: ", JLabel.RIGHT);
		txtApellidos = new JTextField(30);
		add(lblApellidos);
		add(txtApellidos);

		JLabel lblTelefono = new JLabel("No. CELULAR: ", JLabel.RIGHT);
		txtTelefono = new JTextField(15);
		add(lblTelefono);
		add(txtTelefono);

		JLabel lblCorreoe = new JLabel("Email: ", JLabel.RIGHT);
		txtCorreoe = new JTextField(30);
		add(lblCorreoe);
		add(txtCorreoe);

		JLabel lblFechaN = new JLabel("CUMPLEAŅOS (DD/MM/AA): ", JLabel.RIGHT);
		txtFechaN = new JTextField(30);
		add(lblFechaN);
		add(txtFechaN);

		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(this);

		add(btnBuscar);

        txtNombre.setEditable(true);
        txtApellidos.setEditable(false);
        txtTelefono.setEditable(false);
        txtCorreoe.setEditable(false);
		txtFechaN.setEditable(false);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBuscar) {
			if (txtNombre.getText() == null || txtNombre.getText().isEmpty()) {
				txtNombre.setEditable(true);
                JOptionPane.showMessageDialog(null, "PORFAVOR INGRESA EL NOMBRE",
						"Aviso", JOptionPane.INFORMATION_MESSAGE);
				txtNombre.requestFocus();
			} else {
                String info[][] = obtenerDatosBusqueda(txtNombre.getText());
                txtNombre.setText(null);
                txtApellidos.setText(null);
                txtTelefono.setText(null);
                txtCorreoe.setText(null);
				txtFechaN.setText(null);

				txtNombre.setEditable(true);
                txtApellidos.setEditable(true);
                txtTelefono.setEditable(true);
                txtCorreoe.setEditable(true);
				txtFechaN.setEditable(true);

                txtNombre.setText(info[pos][0]);
                txtApellidos.setText(info[pos][1]);
                txtTelefono.setText(info[pos][2]);
                txtCorreoe.setText(info[pos][3]);
				txtFechaN.setText(info[pos][4]);

                txtNombre.requestFocus();
                txtApellidos.setEditable(false);
                txtTelefono.setEditable(false);
                txtCorreoe.setEditable(false);
				txtFechaN.setEditable(false);
                
            }   
		}
	}

    private String[][] obtenerDatosBusqueda(String name){
		int x = 0;
		String informacion[][] = new String[datosPer.size()][5];
		Iterator<Persona> itrPersona = datosPer.iterator();
		while(itrPersona.hasNext()){
			Persona persona = itrPersona.next();
			if(persona.getNombre().equals(name)){
				informacion[x][0] = persona.getNombre();
				informacion[x][1] = persona.getApellidos();
				informacion[x][2] = persona.getTelefono();
				informacion[x][3] = persona.getCorreoe();
				informacion[x][4] = persona.getFechaN();
                pos=x;
			}else{
				x++;
			}
		}
		return informacion;
	}

    private void Mod(String name){
		boolean a = false;
		Iterator<Persona> itrPersona = datosPer.iterator();
		
		while(itrPersona.hasNext() && a == false)
		{
			Persona persona = itrPersona.next();
			if(persona.getNombre().equals(name)){
				datosPer.remove(persona);
				a=true;
			}
		}
        
    }
}
