package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.AhorcadoUI;

public class ParaUI extends AhorcadoUI {
	private AhorcadoController ahorcadoController;
	private boolean estado = true;

	public ParaUI() {
		super();
		ahorcadoController = new AhorcadoController();
		txtLetra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (estado) {
					ahorcadoController.buscaLetra(txtLetra.getText().charAt(0));
					txtAciertos.setText(ahorcadoController.getParcial());
					txtFallos.setText(ahorcadoController.getFallos());
					if(hay 6 fallos) {
						estado=false;
					}
				}
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
