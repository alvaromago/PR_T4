package es.studium.Ejemplos;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class SextoEjemplo
{
	Frame ventana = new Frame("Border Layout");
	Button btnNorte = new Button("Norte");
	Button btnSur = new Button("Sur");
	Button btnEste = new Button("Este");
	Button btnOeste = new Button("Oeste");
	Button btnCentro = new Button("Centro");
	Panel pnlNorte = new Panel();
	Panel pnlSur = new Panel();
	Panel pnlEste = new Panel();
	Panel pnlOeste = new Panel();
	Panel pnlCenter = new Panel();
	
	SextoEjemplo()
	{
		ventana.setSize(210,140);
		ventana.setLayout(new BorderLayout());
		pnlNorte.add(btnNorte);
		ventana.add(pnlNorte, "North");
		pnlEste.add(btnEste);
		ventana.add(pnlEste, "East");
		pnlCenter.add(btnCentro);
		ventana.add(pnlCenter, "Center");
		pnlSur.add(btnSur);
		ventana.add(pnlSur, "South");
		pnlOeste.add(btnOeste);
		ventana.add(pnlOeste, "West");
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new SextoEjemplo();
	}

}
