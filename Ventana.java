

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

 
public class Ventana extends JFrame implements ActionListener
{
    private JLabel texto; 
    private JLabel texto2;
    private JLabel texto3;                 
    private JButton boton;
    
    public Ventana()
    {
    	super();                    
        VentanaPrincipal();        
        inicializarComponentes();
    }
    
    private void VentanaPrincipal()
   	{
   		this.setTitle("Practica1");                   
        this.setSize(400, 220);                                
        this.setLocationRelativeTo(null);                       
        this.setLayout(null);                                   
        this.setResizable(false);                               
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void inicializarComponentes()
    {
    	texto2=new JLabel();
    	texto3=new JLabel();
        texto = new JLabel();
        boton = new JButton(); 
        texto.setText("ERNESTO DIAZ MADRIGAL");    
        texto.setBounds(40, 40, 200, 25);  
        texto2.setText("INGENERIA EN SISTEMAS COM");    
        texto2.setBounds(40, 60, 200, 25); 
        texto3.setText("Nº 181160473");    
        texto3.setBounds(40, 80, 200, 25);   
        boton.setText("Mensaje");   
        boton.setBounds(50, 150, 200, 30);  
        boton.addActionListener(this);       
        this.add(texto);
         this.add(texto2);
          this.add(texto3);
        this.add(boton);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        JOptionPane.showMessageDialog(this, " Direccion:San Isidro Limon Pochtla Oaxaca\n Telefono: 9581190995. \nSexo: Masculino");
    }
    
    public static void main(String[] args) {
    	
    	Ventana V=new Ventana();
    	V.setVisible(true);
    }
}