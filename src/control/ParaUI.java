package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.AhorcadoUI;

public class ParaUI extends AhorcadoUI {
	private AhorcadoController ahorcado;
	public ParaUI() {
		super();
		ahorcado=new AhorcadoController();
		txtLetra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLetra.getText().charAt(0);
			}
		});
		btnYa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visibilizarPanelJuego(true);
				visibilizarMenuSecreto(false);
				ahorcado.guardarSecreta(txtPalabraSecreta.getText());
			}
		});
	}
}
