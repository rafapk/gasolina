/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author finan
 */
public class Veiculo{
    


   
        private String name_veiculos;
        private String  placa_veiculos;
        private int km_total_veiculos;
        private String doc_vencimento_veiculos;
        private String obs_veiculos;

    public Veiculo(String name_veiculos, String placa_veiculos, int km_total_veiculos, String doc_vencimento_veiculos, String obs_veiculos) {
        this.name_veiculos = name_veiculos;
        this.placa_veiculos = placa_veiculos;
        this.km_total_veiculos = km_total_veiculos;
        this.doc_vencimento_veiculos = doc_vencimento_veiculos;
        this.obs_veiculos = obs_veiculos;
    }






    public String getName_veiculos() {
        return name_veiculos;
    }

    public void setName_veiculos(String name_veiculos) {
        this.name_veiculos = name_veiculos;
    }

    public String getPlaca_veiculos() {
        return placa_veiculos;
    }

    public void setPlaca_veiculos(String placa_veiculos) {
        this.placa_veiculos = placa_veiculos;
    }

    public int getKm_total_veiculos() {
        return km_total_veiculos;
    }

    public void setKm_total_veiculos(int km_total_veiculos) {
        this.km_total_veiculos = km_total_veiculos;
    }

    public String getDoc_vencimento_veiculos() {
        return doc_vencimento_veiculos;
    }

    public void setDoc_vencimento_veiculos(String doc_vencimento_veiculos) {
        this.doc_vencimento_veiculos = doc_vencimento_veiculos;
    }

    public String getObs_veiculos() {
        return obs_veiculos;
    }

    public void setObs_veiculos(String obs_veiculos) {
        this.obs_veiculos = obs_veiculos;
    }

 

 


 
}
