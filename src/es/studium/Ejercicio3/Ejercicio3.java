package es.studium.Ejercicio3;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Ejercicio3
{
	Frame ventana = new Frame("Calcular el IVA");
	Button btnCalcular = new Button("Calcular");
	Label lblCantidad = new Label("Introduzca la cantidad");
	Label lblPorcentaje = new Label("Introduzca el porcentaje");
	Label lblResultado = new Label("Resultado");
	TextField txt1 = new TextField(15);
	TextField txt2 = new TextField(15);
	TextField txt3 = new TextField (15);
	
	Ejercicio3()
	{
		ventana.setSize(900, 70);
		ventana.setLayout(new FlowLayout());
		ventana.add(lblCantidad);
		ventana.add(txt1);
		ventana.add(lblPorcentaje);
		ventana.add(txt2);
		ventana.add(lblResultado);
		ventana.add(btnCalcular);
		ventana.add(lblResultado);
		ventana.add(txt3);
		txt3.setEnabled(false);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio3();
	}

}
