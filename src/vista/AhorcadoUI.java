package vista;


import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Aqui solo va la UI sin comportameinto
public class AhorcadoUI extends JFrame {

	protected JPanel contentPane;
	protected JTextField txtPalabraSecreta;
	protected JTextField txtLetra;
	protected JTextField txtAciertos;
	protected JTextField txtFallos;
	protected JTextField txtMensaje;
	protected JLabel lblTitulo;
	protected JButton btnYa;
	protected JLabel lblPalabraSecreta; 
	private JLabel lblLetra;
	private JLabel lblAciertos;
	private JLabel lblFallos;

	/**
	 * Create the frame.
	 */
	public AhorcadoUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//LeerPalabra
		lblPalabraSecreta = new JLabel("Palabra Secreta");
		lblPalabraSecreta.setBounds(10, 11, 94, 14);
		contentPane.add(lblPalabraSecreta);
		
		txtPalabraSecreta = new JTextField();
		txtPalabraSecreta.setBounds(111, 8, 252, 20);
		contentPane.add(txtPalabraSecreta);
		txtPalabraSecreta.setColumns(10);
		
		btnYa = new JButton("Ya!");		
		
		btnYa.setBounds(368, 7, 56, 23);
		contentPane.add(btnYa);
		
		//LeerLetra
		lblLetra = new JLabel("letra");
		lblLetra.setBounds(26, 84, 36, 14);
		contentPane.add(lblLetra);
		
		txtLetra = new JTextField();
		txtLetra.setBounds(69, 81, 49, 20);
		contentPane.add(txtLetra);
		txtLetra.setColumns(1);
		
		//MostrarAciertos
		txtAciertos = new JTextField();
		txtAciertos.setEditable(false);
		txtAciertos.setBounds(69, 156, 302, 20);
		contentPane.add(txtAciertos);
		txtAciertos.setColumns(10);
		
		lblAciertos = new JLabel("Aciertos");
		lblAciertos.setBounds(69, 131, 56, 14);
		contentPane.add(lblAciertos);
		
		lblFallos = new JLabel("Fallos");
		lblFallos.setBounds(69, 187, 46, 14);
		contentPane.add(lblFallos);
		
		txtFallos = new JTextField();
		txtFallos.setEditable(false);
		txtFallos.setBounds(125, 187, 56, 20);
		contentPane.add(txtFallos);
		txtFallos.setColumns(10);
		
		JLabel lblMensaje = new JLabel("Mensaje");
		lblMensaje.setBounds(16, 237, 64, 14);
		contentPane.add(lblMensaje);
		
		txtMensaje = new JTextField();
		txtMensaje.setEditable(false);
		txtMensaje.setBounds(79, 234, 345, 20);
		contentPane.add(txtMensaje);
		txtMensaje.setColumns(10);
		
		lblTitulo = new JLabel("El juego del Ahorcado");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTitulo.setBounds(69, 11, 302, 39);		
		contentPane.add(lblTitulo);
		visibilizarPanelJuego(false);
	}

	protected void visibilizarMenuSecreto(boolean bandera) {
		lblPalabraSecreta.setVisible(bandera);
		txtPalabraSecreta.setVisible(bandera);
		btnYa.setVisible(bandera);
	}
	protected void visibilizarPanelJuego(boolean bandera) {
		lblTitulo.setVisible(bandera);
		lblLetra.setVisible(bandera);
		txtLetra.setVisible(bandera);
		lblAciertos.setVisible(bandera);
		txtAciertos.setVisible(bandera);
		lblFallos.setVisible(bandera);
		txtFallos.setVisible(bandera);
	}
}
