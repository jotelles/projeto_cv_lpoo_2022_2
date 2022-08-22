/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.lpoo.cv.model;

import java.util.Calendar;

/**
 *
 * @author jovita
 */
public class Agenda {
    private Integer id;
    private Calendar data_inicio;
    private Calendar data_fim;
    private String observacao;
    
    private Medico medicos;
    private Status status;
    private TipoProduto tipo;
    private Funcionario funcionarios;
    
    public Agenda(){
        
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
     * @return the data_inicio
     */
    public Calendar getData_inicio() {
        return data_inicio;
    }

    /**
     * @param data_inicio the data_inicio to set
     */
    public void setData_inicio(Calendar data_inicio) {
        this.data_inicio = data_inicio;
    }

    /**
     * @return the data_fim
     */
    public Calendar getData_fim() {
        return data_fim;
    }

    /**
     * @param data_fim the data_fim to set
     */
    public void setData_fim(Calendar data_fim) {
        this.data_fim = data_fim;
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
     * @return the medicos
     */
    public Medico getMedicos() {
        return medicos;
    }

    /**
     * @param medicos the medicos to set
     */
    public void setMedicos(Medico medicos) {
        this.medicos = medicos;
    }

    /**
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * @return the tipo
     */
    public TipoProduto getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoProduto tipo) {
        this.tipo = tipo;
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
