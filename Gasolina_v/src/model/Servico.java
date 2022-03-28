/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author finan
 */
public class Servico {


    private int id_servicos;
    private String name_sevicos;
    private String motivo_servicos;
    private String data_servicos;
    private double valortotal_servicos;
    private String prestadora_servicos;
    private String observacao_abastecimento;
    private Veiculo Veiculos_name_veiculo;
    private Motorista Motoristas_name_motorista;

    public Servico(int id_servicos, String name_sevicos, String motivo_servicos, String data_servicos, double valortotal_servicos, String prestadora_servicos, String observacao_abastecimento, Veiculo Veiculos_name_veiculo, Motorista Motoristas_name_motorista) {
        this.id_servicos = id_servicos;
        this.name_sevicos = name_sevicos;
        this.motivo_servicos = motivo_servicos;
        this.data_servicos = data_servicos;
        this.valortotal_servicos = valortotal_servicos;
        this.prestadora_servicos = prestadora_servicos;
        this.observacao_abastecimento = observacao_abastecimento;
        this.Veiculos_name_veiculo = Veiculos_name_veiculo;
        this.Motoristas_name_motorista = Motoristas_name_motorista;
    }



 

    public int getId_servicos() {
        return id_servicos;
    }

    public void setId_servicos(int id_servicos) {
        this.id_servicos = id_servicos;
    }

    public String getName_sevicos() {
        return name_sevicos;
    }

    public void setName_sevicos(String name_sevicos) {
        this.name_sevicos = name_sevicos;
    }

    public String getMotivo_servicos() {
        return motivo_servicos;
    }

    public void setMotivo_servicos(String motivo_servicos) {
        this.motivo_servicos = motivo_servicos;
    }

    public String getData_servicos() {
        return data_servicos;
    }

    public void setData_servicos(String data_servicos) {
        this.data_servicos = data_servicos;
    }

    public double getValortotal_servicos() {
        return valortotal_servicos;
    }

    public void setValortotal_servicos(double valortotal_servicos) {
        this.valortotal_servicos = valortotal_servicos;
    }

    public String getPrestadora_servicos() {
        return prestadora_servicos;
    }

    public void setPrestadora_servicos(String prestadora_servicos) {
        this.prestadora_servicos = prestadora_servicos;
    }

    public String getObservacao_abastecimento() {
        return observacao_abastecimento;
    }

    public void setObservacao_abastecimento(String observacao_abastecimento) {
        this.observacao_abastecimento = observacao_abastecimento;
    }

    public Veiculo getVeiculos_name_veiculo() {
        return Veiculos_name_veiculo;
    }

    public void setVeiculos_name_veiculo(Veiculo Veiculos_name_veiculo) {
        this.Veiculos_name_veiculo = Veiculos_name_veiculo;
    }

    public Motorista getMotoristas_name_motorista() {
        return Motoristas_name_motorista;
    }

    public void setMotoristas_name_motorista(Motorista Motoristas_name_motorista) {
        this.Motoristas_name_motorista = Motoristas_name_motorista;
    }

 





    
}
