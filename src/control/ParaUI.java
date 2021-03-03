package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.AhorcadoUI;

public class ParaUI extends AhorcadoUI {
	private AhorcadoController ahorcadoController;
	public ParaUI() {
		super();
		ahorcadoController=new AhorcadoController();
		txtLetra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLetra.getText().charAt(0);
//				if(true) txtAciertos.setText(damePAlabra);
//				else txtFallos.setText(dameFallos);
			}
		});
		btnYa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visibilizarPanelJuego(true);
				visibilizarMenuSecreto(false);
				ahorcadoController.guardarSecreta(txtPalabraSecreta.getText());
			}
		});
	}
}
