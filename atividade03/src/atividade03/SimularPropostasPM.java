/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

import java.util.List;

/**
 *
 * @author jonatawilliam
 */
public class SimularPropostasPM {
    private String nome;
    private float salario;
    private int idade;
    private float valorDoEmprestimo;
    private String MsgDeErro;
    Calculadora c = new Calculadora();

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @param valorDoEmprestimo the valorDoEmprestimo to set
     */
    public void setValorDoEmprestimo(float valorDoEmprestimo) {
        this.valorDoEmprestimo = valorDoEmprestimo;
    }

    /**
     * @param MsgDeErro the MsgDeErro to set
     */
    public void setMsgDeErro(String MsgDeErro) {
        this.MsgDeErro = MsgDeErro;
    }

    public MostrarPropostasPM pressionarBotaoElaborar() {
        validar();
        
        if(MsgDeErro.equals("")) {
            List<Proposta> propostas = c.calcular(salario, valorDoEmprestimo);
            return new MostrarPropostasPM(propostas);
        }
        else {
            return null;
        }
        
        
    }

    public void validar() {
        
        MsgDeErro = "";
        
        if(nome.equals(""))
            MsgDeErro  += "nomevazio\n";
        
        if(salario <= 0)
            MsgDeErro = "salario vazio\n";
        
        if(idade <= 0)
            MsgDeErro = "idade vazia\n";
        
        else if(idade < 18 || idade > 70)
            MsgDeErro += "idade invalida\n";
        
        if(valorDoEmprestimo <= 0)
            MsgDeErro = "valor vazio\n";
    }

    /**
     * @return the MsgDeErro
     */
    public String getMsgDeErro() {
        return MsgDeErro;
    }

}
