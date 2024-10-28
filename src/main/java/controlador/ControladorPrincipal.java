/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.GUIHistoria;
import vista.GUIIntrucciones;
import vista.GUIPrincipal;
import vista.GUIIntrucciones;

/**
 *
 * @author Anyeli Caraanza R
 */
public class ControladorPrincipal implements ActionListener {
private GUIPrincipal guipirncipal;
private GUIIntrucciones guiInstrucciones;
private GUIHistoria gUIHistoria;


    public ControladorPrincipal() {
    guipirncipal = new GUIPrincipal(this );
    guiInstrucciones = new GUIIntrucciones();
    guiInstrucciones.escuchar(this);
    gUIHistoria = new GUIHistoria();
    gUIHistoria.escuchar(this);
    guipirncipal.setVisible(true);
    
  
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "instrucciones":
                guiInstrucciones.setVisible(true);
                guipirncipal.setVisible(false);
                    break;
            case "historia":
                guipirncipal.setVisible(false);
                gUIHistoria.setVisible(true );
               
                break;
            case "jugar":
                JOptionPane.showMessageDialog( null, "preciono jugar");
                break;
            case "salir":
                System.exit(0);
            break;
            case "salirinstrucciones":
                guiInstrucciones.setVisible(false);
                guipirncipal.setVisible(true);
                
                break;
            case "salirhistoria":
                gUIHistoria.setVisible(false);
                guipirncipal.setVisible(true);
                
                break;
            
        
        
        }//fin del swich 
     
        }
    
}
