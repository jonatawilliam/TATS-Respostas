/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_2_complementar_1;

/**
 *
 * @author jonatawilliam
 */
public class Extremos {

    int menor, maior, indiceMenor, indiceMaior;

    public Extremos(int menor, int indiceMenor,
            int maior, int indiceMaior) {
        this.menor = menor;
        this.maior = maior;
        this.indiceMenor = indiceMenor;
        this.indiceMaior = indiceMaior;
    }

    public int getMenor() {
        return menor;
    }

    public int getMaior() {
        return maior;
    }

    public int getIndiceMenor() {
        return indiceMenor;
    }

    public int getIndiceMaior() {
        return indiceMaior;
    }
}
