package es.studium.Ejemplos;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class QuintoEjemplo
{
	Frame ventana = new Frame("Grid");
	Button btnAceptar = new Button("Aceptar");
	Label lblNombre = new Label("Nombre:");
	TextField txtNombre = new TextField(20);
	
	QuintoEjemplo()
	{
		ventana.setSize(500, 65);
		ventana.setLayout(new GridLayout(1,3));
		ventana.add(lblNombre);
		ventana.add(txtNombre);
		ventana.add(btnAceptar);
		ventana.setVisible(true);
	}
	public static void main(String[] args)
	{
		new QuintoEjemplo();
	}

}
