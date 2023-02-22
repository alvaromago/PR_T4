package es.studium.Ejercicio2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class Ejercicio2
{
	Frame ventana = new Frame("Conversión de temperaturas");
	Button btn1 = new Button("Celsius a Fahrenheit");
	Button btn2 = new Button("Fahrenheit a Celsius");
	Label lblCelsius = new Label("Celsius");
	Label lblFahrenheit = new Label("Fahrenheit");
	TextField txt1 = new TextField(10);
	TextField txt2 = new TextField(10);
	
	Ejercicio2()
	{
		ventana.setSize(400,150);
		ventana.setLayout(new GridLayout(3,2));
		ventana.add(lblCelsius);
		ventana.add(txt1);
		ventana.add(lblFahrenheit);
		ventana.add(txt2);
		ventana.add(btn1);
		ventana.add(btn2);
		ventana.setVisible(true);
	}
	public static void main(String[] args)
	{
		new Ejercicio2();
	}

}
