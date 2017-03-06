package gui;

import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;


public class GUI extends JFrame {

	private static final GUI instance = new GUI();
	
	private PanelBotones panel;

	private GUI() {
		initComponents();
	}

	public static GUI getInstance() {
		return instance;
	}

	private void initComponents() {
		
		setTitle("Practica-1.4: SCACV");
		
		// Cerrar correctamente la ventana
		this.addWindowListener (new WindowAdapter(){
     	   public void windowClosing(WindowEvent e){
     	     System.exit(0);
     	   }
		});
		
		panel = new PanelBotones();
		panel.setPreferredSize(new Dimension(450,150));
		
		// Añadimos el panel de botones
		getContentPane().add(panel);
		
	}
	
	public void ejecutar(double peticion){
		this.pack();
		this.setVisible(true);
		System.out.println("Para un numero de vueltas iniciales del eje= "+peticion);
	}

}
