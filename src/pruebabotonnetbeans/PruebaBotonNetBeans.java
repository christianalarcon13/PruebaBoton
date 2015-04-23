/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebabotonnetbeans;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class PruebaBotonNetBeans extends JFrame{
    private JButton cerrar;
    public PruebaBotonNetBeans()
    {
        super("Prueba Boton");
        cerrar=new JButton("Cerrar");
        
        Manejador manejador=new Manejador();
        cerrar.addActionListener(manejador);
        
        add(cerrar);
        setSize(200,200);       
        setVisible(true);
        
    }
    
    private class Manejador implements ActionListener
    {
        public void actionPerformed(ActionEvent evento)
        {
            if(evento.getSource()==cerrar)
                System.exit(0);
        }//fin del metodo actionPerformed
    }//fin de la clase privada Manejador
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new PruebaBotonNetBeans();
        
    }
    
}
