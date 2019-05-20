/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

import java.util.ArrayList;

/**
 *
 * @author matheus
 */
public class Marca {
    private int Codigo;
    private String Nome;
    ArrayList<Marca>ListaMarca;
    
    
    public Marca(){
        ListaMarca = new ArrayList();
    }
    public Marca (int Codigo, String Nome){
        this.Codigo = Codigo;
        this.Nome = Nome;
        ListaMarca = new ArrayList();
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public ArrayList<Marca> getListaMarc() {
        return ListaMarca;
    }

    public void setListaMarca(ArrayList<Marca> ListaMarca) {
        this.ListaMarca = ListaMarca;
    }
    
    public void addFunc (Marca F){
        F.setListaMarca(ListaMarca);
        ListaMarca.add(F);
    }
}
