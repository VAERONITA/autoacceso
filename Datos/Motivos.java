/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author VAERON
 */
public class Motivos implements Datos.Bean{
    private int IdMotivoEntrada;
    private String MotivoEntrada;
    
    public Motivos(String motivo)
    {
        this.MotivoEntrada=motivo;
    }
    public Motivos()
    {
        this.MotivoEntrada="Motivo 1";
    }
    
    public void SetMotivo(String motivo)
    {
        this.MotivoEntrada=motivo;
    }
    public void SetIdMotivo(int id)
    {
        this.IdMotivoEntrada=id;
    }
    public String GetMotivo()
    {
        return this.MotivoEntrada;
    }
    public int GetId()
    {
        return this.IdMotivoEntrada;
    }
}
