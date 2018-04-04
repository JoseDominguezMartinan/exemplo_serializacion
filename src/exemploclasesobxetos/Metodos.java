/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploclasesobxetos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jdominguezmartinan
 */
public class Metodos
{
    public void escribirFicheiro(String ficheiro)
    {
        ObjectOutputStream fich=null;
        
        try
        {
            fich=new ObjectOutputStream(new FileOutputStream(ficheiro));
            for(int i=0;i<3;i++) // como exemplo gardamos tres obxetos
            {
              Ordenador o=new Ordenador(new Cpu(enteiro("velocidade: "),enteiro("memoria: ")),new Pantalla(cadea("marca: "),decimais("pulgadas: ")),new Rato(cadea("tipo: ")));
              fich.writeObject(o);
            }
        } catch(Exception e)
        {
            e.printStackTrace();
        }
        finally{
         if(fich != null)
                try {
                    fich.close();
            } catch (IOException ex) {
                Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        }
    public void engadeFicheiro(String ficheiro)
    {
        MeuObjectOutputStream esc=null;
        ObjectOutputStream fich=null;

        try
        {
            esc=new MeuObjectOutputStream(new FileOutputStream(ficheiro,true));
            for(int i=0;i<2;i++) // engadimos dous obxetos para o exemplo
            {
              Ordenador o=new Ordenador(new Cpu(enteiro("velocidade: "),enteiro("memoria: ")),new Pantalla(cadea("marca: "),decimais("pulgadas: ")),new Rato(cadea("tipo: ")));
              esc.writeObject(o);
            }
        } catch(Exception e)
        {
            e.printStackTrace();
        }
        finally{
            if(esc !=null)
                try{
                    esc.close();
                }catch(IOException ex){
                   Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex); 
                }
        }
        
    }
    public String cadea(String s){
     return JOptionPane.showInputDialog(s);
 }
 public int enteiro(String s){
     return Integer.parseInt(JOptionPane.showInputDialog(s));
 }
 public float decimais(String s){
     return Float.parseFloat(JOptionPane.showInputDialog(s));
}
  public void lerFicheiro(String ficheiro){
     ObjectInputStream ler = null;
     Ordenador aux = null;
        try {
            ler = new ObjectInputStream(new FileInputStream(ficheiro));
       
             aux=(Ordenador)ler.readObject();
             while(aux!= null){
                 System.out.println(aux.toString());
                 aux=(Ordenador)ler.readObject();
             }
        }    
          catch (ClassNotFoundException ex) {
              System.out.println("erro 1" +ex.getMessage());      
                    
           } catch (IOException ex) {
            System.out.println("erro 2" +ex.getMessage());
        }
     finally{
            if(ler != null)
                try {
                    ler.close();
            } catch (IOException ex) {
                    System.out.println("erro de peche "+ex.getMessage());
            }
        }
 }
}