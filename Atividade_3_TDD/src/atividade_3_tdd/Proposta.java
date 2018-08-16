/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_3_tdd;

/**
 *
 * @author jonatawilliam
 */
public class Proposta {
    
    private float total;
    private int numeroParcelas;
    private float valorParcela;
    
    
    Proposta(float pTotal, int pNumeroParcelas) {
        total = pTotal;
        numeroParcelas = pNumeroParcelas;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }

    /**
     * @return the numeroParcelas
     */
    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    /**
     * @param numeroParcelas the numeroParcelas to set
     */
    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    /**
     * @return the valorParcela
     */
    public float getValorParcela() {
        return total / numeroParcelas;
    }

    /**
     * @param valorParcela the valorParcela to set
     */
    public void setValorParcela(float valorParcela) {
        this.valorParcela = valorParcela;
    }
    
    
}
