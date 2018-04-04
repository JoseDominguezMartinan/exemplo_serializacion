/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploclasesobxetos;

import java.io.Serializable;

/**
 *
 * @author jdominguezmartinan
 */
public class Cpu implements Serializable
{
    private int velocidade;
    private int memoria;

    public Cpu(int velocidade,int memoria)
    {
        this.velocidade = velocidade;
        this.memoria = memoria;
    }

    public Cpu()
    {
    }

    public int getVelocidade()
    {
        return velocidade;
    }

    public void setVelocidade(int velocidade)
    {
        this.velocidade = velocidade;
    }

    public int getMemoria()
    {
        return memoria;
    }

    public void setMemoria(int memoria)
    {
        this.memoria = memoria;
    }

    @Override
    public String toString()
    {
        return "velocidade="+velocidade+", memoria="+memoria;
    }
    
}
