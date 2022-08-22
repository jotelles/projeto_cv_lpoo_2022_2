/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.lpoo.cv.model;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author jovita
 */
public class Venda {
    private Integer id;
    private String observacao;
    private Float valor_total;
    private Calendar data;
    
    private List<Produto> produtos;
    private List<Consulta> consultas;
    private Pagamento pagamentos;
    private Cliente clientes;
    private Funcionario funcionarios;
    
    public Venda(){
        
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the observacao
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * @param observacao the observacao to set
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    /**
     * @return the valor_total
     */
    public Float getValor_total() {
        return valor_total;
    }

    /**
     * @param valor_total the valor_total to set
     */
    public void setValor_total(Float valor_total) {
        this.valor_total = valor_total;
    }

    /**
     * @return the data
     */
    public Calendar getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Calendar data) {
        this.data = data;
    }

    /**
     * @return the produtos
     */
    public List<Produto> getProdutos() {
        return produtos;
    }

    /**
     * @param produtos the produtos to set
     */
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    /**
     * @return the consultas
     */
    public List<Consulta> getConsultas() {
        return consultas;
    }

    /**
     * @param consultas the consultas to set
     */
    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    /**
     * @return the pagamentos
     */
    public Pagamento getPagamentos() {
        return pagamentos;
    }

    /**
     * @param pagamentos the pagamentos to set
     */
    public void setPagamentos(Pagamento pagamentos) {
        this.pagamentos = pagamentos;
    }

    /**
     * @return the clientes
     */
    public Cliente getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    /**
     * @return the funcionarios
     */
    public Funcionario getFuncionarios() {
        return funcionarios;
    }

    /**
     * @param funcionarios the funcionarios to set
     */
    public void setFuncionarios(Funcionario funcionarios) {
        this.funcionarios = funcionarios;
    }
}
