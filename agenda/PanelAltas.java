import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelAltas extends JPanel implements ActionListener {
	private JButton btnGuardar, btnMostrar;
	private JTextField txtNombre, txtApellidos, txtTelefono, txtCorreoe, txtFechaN;

	ZPersona mpa = new ZPersona();

	public PanelAltas() {
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

		JLabel lblFechaN = new JLabel("CUMPLEAÑOS (DD/MM/AA): ", JLabel.RIGHT);
		txtFechaN = new JTextField(30);
		add(lblFechaN);
		add(txtFechaN);

		btnGuardar = new JButton("GUARDAR DATOS");
		btnGuardar.addActionListener(this);
		btnMostrar = new JButton("MOSTRAR");
		btnMostrar.addActionListener(this);

		add(btnGuardar);
		add(btnMostrar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGuardar) {
			if (txtNombre.getText() == null || txtNombre.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "PORFAVOR INGRESA EL NOMBRE",
						"Aviso", JOptionPane.INFORMATION_MESSAGE);
				txtNombre.requestFocus();
			} else if (txtTelefono.getText() == null || txtTelefono.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "PORFAVOR INGRESA EL No. CELULAR",
						"Aviso", JOptionPane.INFORMATION_MESSAGE);
				txtTelefono.requestFocus();
			} else {
				mpa.agregar(txtNombre.getText(), txtApellidos.getText(), txtTelefono.getText(),
						txtCorreoe.getText(), txtFechaN.getText());
				JOptionPane.showMessageDialog(null, "SE GUARDARAN LOS DATOS INGRESADOS",
						"Aviso", JOptionPane.INFORMATION_MESSAGE);
				txtNombre.setText(null);
				txtApellidos.setText(null);
				txtTelefono.setText(null);
				txtCorreoe.setText(null);
				txtFechaN.setText(null);
				txtNombre.requestFocus();
			}

		}
		if (e.getSource() == btnMostrar) {
			new JFrameConsultas();
		}
	}
}
