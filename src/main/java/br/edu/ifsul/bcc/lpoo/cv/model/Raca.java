/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.lpoo.cv.model;

/**
 *
 * @author jovita
 */
public class Raca {
    private Integer id;
    private String nome;
    
    private Especie especies;
    
    public Raca(){
        
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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the especies
     */
    public Especie getEspecies() {
        return especies;
    }

    /**
     * @param especies the especies to set
     */
    public void setEspecies(Especie especies) {
        this.especies = especies;
    }
}
