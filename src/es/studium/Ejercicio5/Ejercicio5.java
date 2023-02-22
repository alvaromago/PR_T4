package es.studium.Ejercicio5;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Ejercicio5
{
	Frame ventana = new Frame("Vehículos");
	Panel pnlNorte = new Panel();
	Panel pnlSur = new Panel();
	Button btnPresupuesto = new Button("Calcular presupuesto");
	Label lblMotorizacion = new Label("Tipo de motorización:");
	Label lblPuertas = new Label("Número de puertas:");
	Label lblPintura = new Label("Pintura Metalizada:");
	CheckboxGroup cgbMotorizacion = new CheckboxGroup();
	Checkbox chkGasolina = new Checkbox("Gasolina", cgbMotorizacion, false);
	Checkbox chkDiesel = new Checkbox("Diésel", cgbMotorizacion, false);
	Checkbox chkHibrido = new Checkbox("Híbrido", cgbMotorizacion, false);
	Checkbox chkElectrico = new Checkbox("Eléctrico", cgbMotorizacion, false);
	CheckboxGroup cgbPuertas = new CheckboxGroup();
	Checkbox chk3P = new Checkbox("3 puertas", cgbPuertas, false);
	Checkbox chk4P = new Checkbox("4 puertas", cgbPuertas, false);
	Checkbox chk5P = new Checkbox("5 puertas", cgbPuertas, false);
	CheckboxGroup cgbPintura = new CheckboxGroup();
	Checkbox chkSi = new Checkbox("Sí", cgbPintura, false);
	Checkbox chlNo = new Checkbox("No", cgbPintura, false);
	
	Ejercicio5()
	{
		ventana.setSize(452, 152);
		ventana.setLayout(new BorderLayout());
		pnlNorte.setLayout(new FlowLayout());
		pnlSur.setLayout(new FlowLayout());
		pnlNorte.add(lblMotorizacion);
		pnlNorte.add(chkGasolina);
		pnlNorte.add(chkDiesel);
		pnlNorte.add(chkHibrido);
		pnlNorte.add(chkElectrico);
		pnlNorte.add(lblPuertas);
		pnlNorte.add(chk3P);
		pnlNorte.add(chk4P);
		pnlNorte.add(chk5P);
		pnlNorte.add(lblPintura);
		pnlNorte.add(chkSi);
		pnlNorte.add(chlNo);
		pnlSur.add(btnPresupuesto);
		ventana.add(pnlNorte, "Center");
		ventana.add(pnlSur, "South");
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio5();
	}

}
