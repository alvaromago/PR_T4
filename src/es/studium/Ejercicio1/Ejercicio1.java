package es.studium.Ejercicio1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class Ejercicio1
{
	Frame ventana = new Frame("Horas");
	Button btnCalcular = new Button("Calcular");
	Label lblHH1 = new Label("HH");
	Label lblHH2 = new Label("HH");
	Label lblMM1 = new Label("MM");
	Label lblMM2 = new Label("MM");
	TextField txtNumero1 = new TextField(10);
	TextField txtNumero2 = new TextField(10);
	TextField txtNumero3 = new TextField(10);
	TextField txtNumero4 = new TextField(10);
	TextField txtResultado = new TextField(10);
	
	Ejercicio1()
	{
		ventana.setSize(300, 150);
		ventana.setLayout(new GridLayout(3,4));
		ventana.add(lblHH1);
		ventana.add(txtNumero1);
		ventana.add(lblMM1);
		ventana.add(txtNumero2);
		ventana.add(lblHH2);
		ventana.add(txtNumero3);
		ventana.add(lblMM2);
		ventana.add(txtNumero4);
		ventana.add(btnCalcular);
		ventana.add(txtResultado);
		txtResultado.setEnabled(false);
		ventana.setResizable(false);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio1();
	}

}
