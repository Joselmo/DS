package gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.*;

public class PanelBotones extends JPanel{
	
	private javax.swing.JButton BotonAcelerar;
	private JToggleButton BotonEncender;
	private javax.swing.JLabel EtiqMostrarEstado;
	
	private String ENCENDER = "Encender";
	private String ACELERAR = "Acelerar";
	private String APAGAR = "Apagar";
	private String ACELERANDO = "Acelerando";
	private String APAGADO = "Apagado";
	
	
	public PanelBotones(){
		BotonAcelerar = new JButton(ACELERAR);
		BotonAcelerar.setSelected(false);
		
		BotonEncender = new JToggleButton(ENCENDER);
		BotonEncender.setForeground(Color.RED);
		BotonEncender.setSelected(false);
		
		
		EtiqMostrarEstado = new JLabel(APAGADO);
		EtiqMostrarEstado.setForeground(Color.RED);
		
		
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		Panel panel_inferior = new Panel();
		
		panel_inferior.setLayout(new FlowLayout());
		
		this.add(EtiqMostrarEstado);
		
		panel_inferior.add(BotonEncender);
		panel_inferior.add(BotonAcelerar);
		
		this.add(panel_inferior);
		
		
	};//constructor
	
	synchronized private void
	BotonAcelerarActionPerformed(java.awt.event.ActionEvent evt){
		if(BotonEncender.isSelected()){ // Si está encendido
				
				
		}
		
		
	};
	
	
	synchronized private void
	BotonEncenderActionPerformed(java.awt.event.ActionEvent evt){
		if(BotonEncender.isSelected()){ // Si está encendido
			
			// Estado del boton
			EtiqMostrarEstado.setText(ACELERANDO);
			BotonEncender.setText(APAGAR);
			BotonEncender.setForeground(Color.BLUE);
			
		}else{
			
			// Estado del boton
			EtiqMostrarEstado.setText(APAGADO);
			BotonEncender.setText(ENCENDER);
			BotonEncender.setForeground(Color.RED);
			
		}
		
	};

}
