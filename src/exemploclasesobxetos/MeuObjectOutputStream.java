/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploclasesobxetos;

import java.io.*;


/**
 *
 * @author jdominguezmartinan
 */
public class MeuObjectOutputStream extends ObjectOutputStream
{
     public MeuObjectOutputStream()throws IOException{
        
    }
    public MeuObjectOutputStream(OutputStream ou)throws IOException{
        super(ou);
    }
  
     @Override
    protected void writeStreamHeader() throws IOException
    {
    }

}
