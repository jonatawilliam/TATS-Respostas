/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04;

/**
 *
 * @author jonatawilliam
 */
public class Funcionario {
    private String nome;
    private String email;
    private String cargo;
    private float salarioBase;
    private String MensagemErro;
    private String MensagemCargoVazio;

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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the salarioBase
     */
    public float getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param salarioBase the salarioBase to set
     */
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    
    public void validarCampos() {
        
        MensagemErro = "";
        MensagemCargoVazio = "";
        
        if(nome.equals(""))
            MensagemErro  += "Nome vazio\n";
        
        if(email.equals(""))
            MensagemErro += "E-mail vazio\n";
        
        if(cargo.equals(""))
            MensagemErro += "Cargo vazio\n";
        
        if(!cargo.equals("") || !cargo.equals("Gerente") || 
                                !cargo.equals("Desenvolvedor") || 
                                !cargo.equals("Dba") || 
                                !cargo.equals("Testador"))
            MensagemCargoVazio += "Cargo não existe\n";
        
        if(salarioBase <= 0)
            MensagemErro += "Salario Base vazio\n";
  
    }
    
    public boolean salvar() {
        validarCampos();
        
        if(MensagemErro != "")
            return false;
        else
            return true;
        
    }
        
    public String getMensagemErro() {
        return MensagemErro;
    }
    
    public String getMensagemCargoVazio() {
        return MensagemCargoVazio;
    }
    
}
