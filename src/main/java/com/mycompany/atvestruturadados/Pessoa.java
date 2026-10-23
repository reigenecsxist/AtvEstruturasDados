/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atvestruturadados;

import java.util.Base64;

/**
 *
 * @author Gabriel de Moura
 */

public class Pessoa {
    String nome;
    byte[] foto;
    byte[] curriculo;

    public Pessoa() {
    }
    
    public Pessoa(String nome, byte[] foto, byte[] curriculo) {
        this.nome = nome;
        this.foto = foto;
        this.curriculo = curriculo;
    }

    public String getFotoBase64(){
        if(foto != null){
            return Base64.getEncoder().encodeToString(foto);
        }
        else return "";
    }
    
    public String getCurriculoBase64(){
        if(curriculo != null){
            return Base64.getEncoder().encodeToString(curriculo);
        }
        else return "";
    }
    
    public String getNome() {
        return nome;
    }

    public byte[] getFoto() {
        return foto;
    }

    public byte[] getCurriculo() {
        return curriculo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public void setCurriculo(byte[] curriculo) {
        this.curriculo = curriculo;
    }
}
