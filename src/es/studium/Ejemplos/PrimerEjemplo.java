package es.studium.Ejemplos;

import java.awt.Color;
import java.awt.Frame;

public class PrimerEjemplo
{
	Frame ventana = new Frame();
	
	PrimerEjemplo()
	{
		ventana.setResizable(false);
		ventana.setSize(500, 300);
		ventana.setBackground(Color.GRAY);
		ventana.setLocationRelativeTo(null);
		ventana.setTitle("Nueva Ventana");
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new PrimerEjemplo();
	}

}
