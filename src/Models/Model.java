
package Models;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import Views.View;

public class Model {
    
    View view;
       private String path;
       private String mensaje = "";
       boolean bandera = false;
       String caesar = "";

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public String getCaesar(){
        return caesar;
    }
    
    public void setCaesar(String caesar){
        this.caesar = caesar;
    }
    
    public void openFile(){
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        jfc.showOpenDialog(view);
        File archivo = jfc.getSelectedFile();
        if ((archivo == null) || (archivo.getName().equals(" "))){
            JOptionPane.showMessageDialog(view, "Nombre del archvio inválido");
        }
        else
            path = archivo.getAbsolutePath();
    }
    
    public void readFile(){
        try{
                String row; 
            try (FileReader file = new FileReader(path); BufferedReader bufferedReader = new BufferedReader(file)){
                while ((row = bufferedReader.readLine()) != null){    
                        mensaje = mensaje + row + "\n";
                }
            } 
        }catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(view,"No se econtró el archivo" + ex.getMessage());
        } catch (IOException ex) {
                JOptionPane.showMessageDialog(view,"Error" + ex.getMessage());
        }
    }
    
    public void writeFile(){
             try{
                File file = new File(path);
                FileWriter fileWriter = new FileWriter (file,bandera);
                try (PrintWriter printWriter  = new PrintWriter(fileWriter)){
                        printWriter.print(mensaje);
                        printWriter.close();
                        JOptionPane.showMessageDialog(view,"Se modificó correctamente");
            }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(view,"Error" + ex.getMessage());
                }
            }
    public void string2Caesar(){
        int ascii;
        for(int i=0; i < mensaje.length(); i++){
            if(mensaje.charAt(i) >= 'a' && mensaje.charAt(i) <= 'z'){
                if((mensaje.charAt(i) + 1) > 'z'){
                    ascii = ((int)mensaje.charAt(i));
                    ascii = ascii + 1 - 26;
                    caesar= caesar + ((char)ascii);
                }else{
                    ascii =((int)mensaje.charAt(i));
                    ascii = ascii + 1;
                    caesar = caesar + ((char)ascii);
                }
            }
            else if(mensaje.charAt(i)>= 'A' && mensaje.charAt(i) <='Z'){
                if((mensaje.charAt(i) + 1) > 'Z'){
                    ascii = ((int)mensaje.charAt(i));
                    ascii = ascii + 1 - 26;
                    caesar= caesar + ((char)ascii);
                }else{
                    ascii =((int)mensaje.charAt(i));
                    ascii = ascii + 1;
                    caesar = caesar + ((char)ascii);
                }
            }
            
        }
    }
    
    public void Caesar2String(){
        int ascii;
        for(int i=0; i < mensaje.length(); i++){
            if(mensaje.charAt(i) >= 'a' && mensaje.charAt(i) <= 'z'){
                if((mensaje.charAt(i) - 1) < 'a'){
                    ascii = ((int)mensaje.charAt(i));
                    ascii = ascii - 1 + 26;
                    caesar= caesar + ((char)ascii);
                }else{
                    ascii =((int)mensaje.charAt(i));
                    ascii = ascii - 1;
                    caesar = caesar + ((char)ascii);
                }
            }
            else if(mensaje.charAt(i)>= 'A' && mensaje.charAt(i) <='Z'){
                if((mensaje.charAt(i) - 1) < 'A'){
                    ascii = ((int)mensaje.charAt(i));
                    ascii = ascii - 1 + 26;
                    caesar= caesar + ((char)ascii);
                }else{
                    ascii =((int)mensaje.charAt(i));
                    ascii = ascii - 1;
                    caesar = caesar + ((char)ascii);
                }
            }
            
        }
    }

}
