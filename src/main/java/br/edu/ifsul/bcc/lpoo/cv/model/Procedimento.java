/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.lpoo.cv.model;

import java.util.List;

/**
 *
 * @author jovita
 */
public class Procedimento {
    private Integer id;
    private String observacao;
    private Float valor;
    
    private List<Produto> produtos;
    private Status status;
    private Agenda agendamentos;
    private Pet pets;
    
    public Procedimento(){
        
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
     * @return the valor
     */
    public Float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Float valor) {
        this.valor = valor;
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
     * @return the agendamentos
     */
    public Agenda getAgendamentos() {
        return agendamentos;
    }

    /**
     * @param agendamentos the agendamentos to set
     */
    public void setAgendamentos(Agenda agendamentos) {
        this.agendamentos = agendamentos;
    }

    /**
     * @return the pets
     */
    public Pet getPets() {
        return pets;
    }

    /**
     * @param pets the pets to set
     */
    public void setPets(Pet pets) {
        this.pets = pets;
    }
}
