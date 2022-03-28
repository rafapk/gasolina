/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author finan
 */
public class Motorista {



   
        private String name_motorista;
        private String  id_motorista;
        private int km_rodados_motorista;
        private String doc_vencimento_motorista;
        private String obs_motorista;

    public Motorista(String name_motorista, String id_motorista, int km_rodados_motorista, String doc_vencimento_motorista, String obs_motorista) {
        this.name_motorista = name_motorista;
        this.id_motorista = id_motorista;
        this.km_rodados_motorista = km_rodados_motorista;
        this.doc_vencimento_motorista = doc_vencimento_motorista;
        this.obs_motorista = obs_motorista;
    }
 


    public String getName_motorista() {
        return name_motorista;
    }

    public void setName_motorista(String name_motorista) {
        this.name_motorista = name_motorista;
    }

    public String getId_motorista() {
        return id_motorista;
    }

    public void setId_motorista(String id_motorista) {
        this.id_motorista = id_motorista;
    }

    public int getKm_rodados_motorista() {
        return km_rodados_motorista;
    }

    public void setKm_rodados_motorista(int km_rodados_motorista) {
        this.km_rodados_motorista = km_rodados_motorista;
    }

    public String getDoc_vencimento_motorista() {
        return doc_vencimento_motorista;
    }

    public void setDoc_vencimento_motorista(String doc_vencimento_motorista) {
        this.doc_vencimento_motorista = doc_vencimento_motorista;
    }

    public String getObs_motorista() {
        return obs_motorista;
    }

    public void setObs_motorista(String obs_motorista) {
        this.obs_motorista = obs_motorista;
    }

 






    
}
