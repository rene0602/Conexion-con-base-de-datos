/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdejercicio1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventana extends JFrame{
    
    private JPanel panel = new JPanel();

    public ventana() {
        //Mostrar Pantalla
        this.show();
        //Titulo de la venta
        this.setTitle("Ventana");
        //Tamanio Inicial de la venta
        this.setSize(800,800);
        //Se agregar un layout distribuir los componentes.
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("VENTA DE REGISTRO DE PERSONAS.");  
        JButton button = new JButton();  
        button.setText("REGISTRAR PERSONAS");  
        panel.add(label);
        panel.add(button);
        //Agrege el panel al Jframe
        this.add(panel);
        //Centrar la pantalla
        this.setLocationRelativeTo(null);  
        //Fin al programa.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        iniciarComponentes();
    }
    
    public void iniciarComponentes() {
        colocarPanel();
        colocarEtiquetas();
        colocarTexto();
    }
    
    public void colocarPanel() {
        panel = new JPanel();
        panel.setBackground(Color.red);
        this.getContentPane().add(panel);
        panel.setLayout(null);
    }
    
    public void colocarEtiquetas() {
        
        JLabel etiqueta = new JLabel();
        etiqueta.setBounds(200, 30, 380, 40);
        etiqueta.setText("Reguistro de Personas");
        etiqueta.setFont(new Font("forte", 1, 34));
        etiqueta.setBackground(Color.BLACK);
        etiqueta.setForeground(Color.WHITE);
        panel.add(etiqueta);
        
        
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setBounds(90, 100, 300, 40);
        etiqueta1.setText("Cédula: ");
        etiqueta1.setFont(new Font("Cooper black", 1, 24));
        etiqueta1.setBackground(Color.BLACK);
        etiqueta1.setForeground(Color.WHITE);
        panel.add(etiqueta1);
        
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(90, 190, 300, 40);
        etiqueta2.setText("Nombres: ");
        etiqueta2.setFont(new Font("Cooper black", 1, 24));
        etiqueta2.setBackground(Color.BLACK);
        etiqueta2.setForeground(Color.WHITE);
        panel.add(etiqueta2);
        
        JLabel etiqueta3 = new JLabel();
        etiqueta3.setBounds(90, 270, 300, 40);
        etiqueta3.setText("Apellidos: ");
        etiqueta3.setFont(new Font("Cooper black", 1, 24));
        etiqueta3.setBackground(Color.BLACK);
        etiqueta3.setForeground(Color.WHITE);
        panel.add(etiqueta3);
        
        JLabel etiqueta4 = new JLabel();
        etiqueta4.setBounds(90, 350, 300, 40);
        etiqueta4.setText("Dirección: ");
        etiqueta4.setFont(new Font("Cooper black", 1, 24));
        etiqueta4.setBackground(Color.BLACK);
        etiqueta4.setForeground(Color.WHITE);
        panel.add(etiqueta4);
        
        JLabel etiqueta5 = new JLabel();
        etiqueta5.setBounds(90, 430, 300, 40);
        etiqueta5.setText("Correo: ");
        etiqueta5.setFont(new Font("Cooper black", 1, 24));
        etiqueta5.setBackground(Color.BLACK);
        etiqueta5.setForeground(Color.WHITE);
        panel.add(etiqueta5);
        
        JLabel etiqueta6 = new JLabel();
        etiqueta6.setBounds(90, 510, 300, 40);
        etiqueta6.setText("Teléfono: ");
        etiqueta6.setFont(new Font("Cooper black", 1, 24));
        etiqueta6.setBackground(Color.BLACK);
        etiqueta6.setForeground(Color.WHITE);
        panel.add(etiqueta6);
    }
    
    public void colocarTexto() {
        JTextField cuadroTexto1 = new JTextField();
        cuadroTexto1.setBounds(250, 110, 400, 40);
        cuadroTexto1.setFont(new Font("constantia", 1, 26));
        cuadroTexto1.setBackground(Color.WHITE);
        cuadroTexto1.setForeground(Color.BLACK);
        panel.add(cuadroTexto1);
        
        JTextField cuadroTexto2 = new JTextField();
        cuadroTexto2.setBounds(250, 200, 400, 40);
        cuadroTexto2.setFont(new Font("constantia", 1, 26));
        cuadroTexto2.setBackground(Color.WHITE);
        cuadroTexto2.setForeground(Color.ORANGE);
        panel.add(cuadroTexto2);
        
        JTextField cuadroTexto3 = new JTextField();
        cuadroTexto3.setBounds(260, 280, 400, 40);
        cuadroTexto3.setFont(new Font("constantia", 1, 26));
        cuadroTexto3.setBackground(Color.WHITE);
        cuadroTexto3.setForeground(Color.ORANGE);
        panel.add(cuadroTexto3);
        
        JTextField cuadroTexto4 = new JTextField();
        cuadroTexto4.setBounds(260, 350, 400, 40);
        cuadroTexto4.setFont(new Font("constantia", 1, 26));
        cuadroTexto4.setBackground(Color.WHITE);
        cuadroTexto4.setForeground(Color.ORANGE);
        panel.add(cuadroTexto4);
        
        JTextField cuadroTexto5 = new JTextField();
        cuadroTexto5.setBounds(260, 430, 400, 40);
        cuadroTexto5.setFont(new Font("constantia", 1, 26));
        cuadroTexto5.setBackground(Color.WHITE);
        cuadroTexto5.setForeground(Color.ORANGE);
        panel.add(cuadroTexto5);
        
        JTextField cuadroTexto6 = new JTextField();
        cuadroTexto6.setBounds(260, 510, 400, 40);
        cuadroTexto6.setFont(new Font("constantia", 1, 26));
        cuadroTexto6.setBackground(Color.WHITE);
        cuadroTexto6.setForeground(Color.ORANGE);
        panel.add(cuadroTexto6);
        
    }
}
      
