/**
 * 
 */
package GUI;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import observable.Simulador;
import observable.Temperatura;
import observable.Tiempo;
import observador.GraficaTemperatura;
import observador.TiempoSateital;

/**
 * @author Jose-laptop
 *
 */
public class GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GraficaTemperatura pantalla;
	private Temperatura temperatura;


	private static final GUI instance = new GUI();


	/**
	 * Variables de GUI
	 */
    private javax.swing.ButtonGroup bg_temperatura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jl_tiempo;
    private javax.swing.JLabel jl_temperatura;
    
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    
    private javax.swing.JButton jb_cambiar_temp;
    
    private javax.swing.JRadioButton jrb_celsius;
    private javax.swing.JRadioButton jrb_farhrenheit;
    
    private javax.swing.JTextField jt_temp_maxima;
    private javax.swing.JTextField jt_temp_minima;

	/**
	 * Constructor de la interfaz Gr�fica
	 */
	private GUI() {
		initComponents();
	}
	
	
    public static GUI getInstance(){
        return instance;
    } 
    
    public void setGraficaTemperatura(GraficaTemperatura graf){
    	pantalla = graf;
    }
    
    public void setTemperatura(Temperatura temp){
    	temperatura = temp;
    }
    
	
	/**
	 * M�todos de la interfaz Gr�fica
	 */
    private void initComponents() {

        bg_temperatura = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jl_temperatura = new javax.swing.JLabel();
        jrb_celsius = new javax.swing.JRadioButton();
        jrb_farhrenheit = new javax.swing.JRadioButton();
        
        jPanel2 = new javax.swing.JPanel();
        jb_cambiar_temp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jt_temp_minima = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jt_temp_maxima = new javax.swing.JTextField();
        
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jl_tiempo = new javax.swing.JLabel();

        this.addWindowListener (new WindowAdapter(){
        	   public void windowClosing(WindowEvent e){
        	     System.exit(0);
        	   }
        });
        
        setTitle("Meteo");
        getContentPane().setLayout(new java.awt.GridLayout(4, 0));

        // PANEL 1 - TEMPERATURA VISOR 
        jLabel2.setText("Temperatura:");
        jPanel1.add(jLabel2);

        jl_temperatura.setText("20 �");
        jl_temperatura.setPreferredSize(new java.awt.Dimension(40, 14));
        jPanel1.add(jl_temperatura);

        bg_temperatura.add(jrb_celsius);
        jrb_celsius.setSelected(true);
        jrb_celsius.setText("Celsius");
        jrb_celsius.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrb_celsiusItemStateChanged(evt);
            }
        });
        jPanel1.add(jrb_celsius);

        bg_temperatura.add(jrb_farhrenheit);
        jrb_farhrenheit.setText("fahrenheit");
        jrb_farhrenheit.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrb_farhrenheitItemStateChanged(evt);
            }
        });

        jPanel1.add(jrb_farhrenheit);

        getContentPane().add(jPanel1);

        // PANEL 2 TEMPERATURA CAMBIO
        jb_cambiar_temp.setText("Cambiar rango");
        jb_cambiar_temp.setPreferredSize(new java.awt.Dimension(120,20));
        jb_cambiar_temp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cambiar_tempActionPerformed(evt);
            }
        });
        jPanel2.add(jb_cambiar_temp);

        jLabel1.setText("Temperatura m�nima :");
        jPanel2.add(jLabel1);

        jt_temp_minima.setText("10");
        jt_temp_minima.setPreferredSize(new java.awt.Dimension(25, 20));
        jt_temp_minima.setEnabled(false);
        jPanel2.add(jt_temp_minima);

        jLabel3.setText("Temperatura m�xima:");
        jPanel2.add(jLabel3);

        jt_temp_maxima.setText("20");
        jt_temp_maxima.setPreferredSize(new java.awt.Dimension(25, 20));
        jt_temp_maxima.setEnabled(false);
        jPanel2.add(jt_temp_maxima);

        getContentPane().add(jPanel2);
        
        
        // PANEL 3  TIEMPO
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("El Tiempo"));
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 74));

        
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Previsi�n para Hoy:       ");
        jPanel3.add(jLabel4);

        jl_tiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_tiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icon/Cloud_50.png"))); 
        jl_tiempo.setText("Lluvia");
        jPanel3.add(jl_tiempo);

        getContentPane().add(jPanel3);

        pack();
    }

    /**
     * Selecciona la temperatura en unidades Celsius
     * @param evt
     */
	private void jrb_celsiusItemStateChanged(java.awt.event.ItemEvent evt) {
		if(pantalla != null)
			pantalla.setUnit(0);
		else{
			System.out.println("pantalla nulo");
		}
		
	}

	/**
	 * Selecciona la temperatura en unidades Fahrenheit
	 * @param evt
	 */
	private void jrb_farhrenheitItemStateChanged(java.awt.event.ItemEvent evt) {
		// Evento de boton farhrenheit
		if(pantalla != null)
			pantalla.setUnit(1);
		else{
			System.out.println("pantalla nulo");
		}
	}
	
	/**
	 * Cambia el rango de temperaturas que generar� el Sensor de temperatura
	 * @param evt
	 */
	private void jb_cambiar_tempActionPerformed(java.awt.event.ActionEvent evt) { 
		if(jb_cambiar_temp.getText().equals("Cambiar rango")){
	       //Evento de cambio de temperatuar
			jt_temp_minima.setEnabled(true);
			jt_temp_maxima.setEnabled(true);
			jb_cambiar_temp.setText("Aceptar");
		}else{
			jt_temp_minima.setEnabled(false);
			jt_temp_maxima.setEnabled(false);
			jb_cambiar_temp.setText("Cambiar rango");
			
			temperatura.setTemperaturaMax(Integer.valueOf(jt_temp_maxima.getText()));
			temperatura.setTemperaturaMin(Integer.valueOf(jt_temp_minima.getText()));
		}
	}
	
	/**
	 * Actualiza los valores de los campos en la interfaz gr�fica
	 * @param temp tengo a poner en la interfaz gr�fica
	 */
	public void actualizarTemperatura(String temp){
		jl_temperatura.setText(temp);
	}
	
	/**
	 * Actualiza la previsi�n del tiempo de hoy.
	 * @param tiempo :String que indica la previsi�n para hoy
	 */
	public void actualizarTiempo(String tiempo){
		String icon="Sun_50";
		
		switch (tiempo) {
		case "Lluvia":icon = "Rain_50";	break;
		case "Nubloso":icon = "Cloud_50";	break;
		case "Despejado":icon = "Sun_50";	break;
		case "Tormenta":icon = "Storm_50";	break;
		case "Nieve":icon = "Snow_50";	break;
		case "Granizo":icon = "Hail_50";	break;

		}
		jl_tiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icon/"+icon+".png"))); 
        jl_tiempo.setText(tiempo);
		
	}

}
