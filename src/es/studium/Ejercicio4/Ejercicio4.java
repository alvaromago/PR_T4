package es.studium.Ejercicio4;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class Ejercicio4
{
	Frame ventana = new Frame("Aficiones");
	Panel pnlNorte = new Panel();
	Panel pnlSur = new Panel();
	Button btnComprobar = new Button("Comprobar");
	Checkbox chkCorrer = new Checkbox("Correr");
	Checkbox chkNadar = new Checkbox("Nadar");
	Checkbox chkAndar = new Checkbox("Andar");
	Checkbox chkLeer = new Checkbox("Leer");
	Checkbox chkCine = new Checkbox("Ir al Cine");
	Checkbox chkBailar = new Checkbox("Bailar");
	Checkbox chkFútbol = new Checkbox("Fútbol");
	Checkbox chkTenis = new Checkbox("Tenis");
	Checkbox chkBaloncesto = new Checkbox("Baloncesto");
	Checkbox chkVela = new Checkbox("Deportes de Vela");
	
	Ejercicio4()
	{
		ventana.setSize(300,150);
		ventana.setLayout(new BorderLayout());
		pnlNorte.setLayout(new FlowLayout());
		pnlSur.setLayout(new FlowLayout());
		pnlNorte.add(chkCorrer);
		pnlNorte.add(chkNadar);
		pnlNorte.add(chkLeer);
		pnlNorte.add(chkCine);
		pnlNorte.add(chkBailar);
		pnlNorte.add(chkFútbol);
		pnlNorte.add(chkTenis);
		pnlNorte.add(chkBaloncesto);
		pnlNorte.add(chkVela);
		pnlSur.add(btnComprobar);
		ventana.add(pnlNorte, "Center");
		ventana.add(pnlSur, "South");
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio4();
	}

}
