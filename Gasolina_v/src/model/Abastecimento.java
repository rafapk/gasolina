/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author finan
 */
public class Abastecimento {

    private int id_abastecimento;
    private String data_abastecimento;
    private String combustivel_abastecimento;
    private double litros_abastecidos_abastecimento;
    private int hodometro_abastecimento;
    private boolean tanque_cheio_abastecimento;
    private String distancia_abastecimento;
    private double media_abastecimento;
    private String observacao_abastecimento;
    private double valor_total_abastecimento;
    private Veiculo Veiculos_name_veiculos;
    private Motorista Motoristas_name_motorista;

    public Abastecimento(int id_abastecimento, String data_abastecimento, String combustivel_abastecimento, double litros_abastecidos_abastecimento, int hodometro_abastecimento, boolean tanque_cheio_abastecimento, String distancia_abastecimento, double media_abastecimento, String observacao_abastecimento, double valor_total_abastecimento, Veiculo Veiculos_name_veiculos, Motorista Motoristas_name_motorista) {
        this.id_abastecimento = id_abastecimento;
        this.data_abastecimento = data_abastecimento;
        this.combustivel_abastecimento = combustivel_abastecimento;
        this.litros_abastecidos_abastecimento = litros_abastecidos_abastecimento;
        this.hodometro_abastecimento = hodometro_abastecimento;
        this.tanque_cheio_abastecimento = tanque_cheio_abastecimento;
        this.distancia_abastecimento = distancia_abastecimento;
        this.media_abastecimento = media_abastecimento;
        this.observacao_abastecimento = observacao_abastecimento;
        this.valor_total_abastecimento = valor_total_abastecimento;
        this.Veiculos_name_veiculos = Veiculos_name_veiculos;
        this.Motoristas_name_motorista = Motoristas_name_motorista;
    }





    public int getId_abastecimento() {
        return id_abastecimento;
    }

    public void setId_abastecimento(int id_abastecimento) {
        this.id_abastecimento = id_abastecimento;
    }

    public String getData_abastecimento() {
        return data_abastecimento;
    }

    public void setData_abastecimento(String data_abastecimento) {
        this.data_abastecimento = data_abastecimento;
    }

    public String getCombustivel_abastecimento() {
        return combustivel_abastecimento;
    }

    public void setCombustivel_abastecimento(String combustivel_abastecimento) {
        this.combustivel_abastecimento = combustivel_abastecimento;
    }

    public double getLitros_abastecidos_abastecimento() {
        return litros_abastecidos_abastecimento;
    }

    public void setLitros_abastecidos_abastecimento(double litros_abastecidos_abastecimento) {
        this.litros_abastecidos_abastecimento = litros_abastecidos_abastecimento;
    }

    public int getHodometro_abastecimento() {
        return hodometro_abastecimento;
    }

    public void setHodometro_abastecimento(int hodometro_abastecimento) {
        this.hodometro_abastecimento = hodometro_abastecimento;
    }

    public boolean isTanque_cheio_abastecimento() {
        return tanque_cheio_abastecimento;
    }

    public void setTanque_cheio_abastecimento(boolean tanque_cheio_abastecimento) {
        this.tanque_cheio_abastecimento = tanque_cheio_abastecimento;
    }

    public String getDistancia_abastecimento() {
        return distancia_abastecimento;
    }

    public void setDistancia_abastecimento(String distancia_abastecimento) {
        this.distancia_abastecimento = distancia_abastecimento;
    }

    public double getMedia_abastecimento() {
        return media_abastecimento;
    }

    public void setMedia_abastecimento(double media_abastecimento) {
        this.media_abastecimento = media_abastecimento;
    }

    public String getObservacao_abastecimento() {
        return observacao_abastecimento;
    }

    public void setObservacao_abastecimento(String observacao_abastecimento) {
        this.observacao_abastecimento = observacao_abastecimento;
    }

    public double getValor_total_abastecimento() {
        return valor_total_abastecimento;
    }

    public void setValor_total_abastecimento(double valor_total_abastecimento) {
        this.valor_total_abastecimento = valor_total_abastecimento;
    }

    public Veiculo getVeiculos_name_veiculos() {
        return Veiculos_name_veiculos;
    }

    public void setVeiculos_name_veiculos(Veiculo Veiculos_name_veiculos) {
        this.Veiculos_name_veiculos = Veiculos_name_veiculos;
    }

    public Motorista getMotoristas_name_motorista() {
        return Motoristas_name_motorista;
    }

    public void setMotoristas_name_motorista(Motorista Motoristas_name_motorista) {
        this.Motoristas_name_motorista = Motoristas_name_motorista;
    }



}
