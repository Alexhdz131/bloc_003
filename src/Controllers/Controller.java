
package Controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Views.View;
import Models.Model;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Controller {
    View view;
    Model model;
    ActionListener ac = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == view.jm_abrir)
                    abrir();
            else if(e.getSource() == view.jm_guardar)
                    guardar();
            else if (e.getSource() == view.jmcifrar)
                    cifrar();
            else if(e.getSource() == view.jmdes)
                descifrar();
        }
    };
    
    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        this.view.jm_guardar.addActionListener(ac);
        this.view.jm_abrir.addActionListener(ac);
        this.view.jmcifrar.addActionListener(ac);
        this.view.jmdes.addActionListener(ac);
        initComponents();
        
    }        
        public void abrir(){
        model.openFile();
        leer();
    }
    public void leer(){
        model.readFile();
        view.jta_texto.setText(model.getMensaje());
    }
    public void cifrar(){
        model.setMensaje(view.jta_texto.getText());
        model.string2Caesar();
        view.jta_texto.setText(model.getCaesar());
    }
    public void descifrar(){
        model.setMensaje(view.jta_texto.getText());
        model.Caesar2String();
        view.jta_texto.setText(model.getCaesar());
    }
    public void guardar(){
        model.setMensaje(view.jta_texto.getText());
        model.writeFile();
        view.jta_texto.setText("");
    }
    private void initComponents(){
        view.setVisible(true);
    }
        
    }
  
