package es.studium.Ejemplos;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class CuartoEjemplo //Posicionamiento absoluto
{
	Frame ventana = new Frame("Absoluto");
	Button btnAceptar = new Button("Aceptar");
	Label lblNombre = new Label("Nombre:");
	TextField txtNombre = new TextField(20); //El número indica el ancho del Text Field, no la cantidad de caracteres que caben
	
	CuartoEjemplo()
	{
		ventana.setSize(500, 300);
		ventana.setLayout(null);
		lblNombre.setBounds(30, 50, 50, 20);
		ventana.add(lblNombre);
		txtNombre.setBounds(85, 50, 100, 20);
		ventana.add(txtNombre);
		btnAceptar.setBounds(190, 50, 50, 20);
		ventana.add(btnAceptar);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new CuartoEjemplo();
	}

}
