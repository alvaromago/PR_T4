package es.studium.Ejemplos;

import java.awt.Color;
import java.awt.Frame;
import java.util.Random;

public class SegundoEjemplo
{
	Color colores[] = { Color.red, Color.green, Color.gray, Color.black, Color.darkGray, Color.blue };
	Random aleatorio = new Random();
	
	SegundoEjemplo()
	{
		Frame ventana = new Frame();
		ventana.setBackground(colores[aleatorio.nextInt(colores.length)]);
		ventana.setSize(500, 300);
		ventana.setResizable(false);
		ventana.setLocation(aleatorio.nextInt(2000), aleatorio.nextInt(1000));
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		final int CANTIDAD = 10;
		
		for(int i = 0; i < CANTIDAD; i++)
		{
			new SegundoEjemplo();
		}
	}

}
