/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_2_complementar_3;

/**
 *
 * @author jonatawilliam
 */
public class TurmaController {

    TurmaDAO turmaDao;
    VerificadorDeCodigos verificador;

    public TurmaController(TurmaDAO pTurmaDao) {
        turmaDao = pTurmaDao;
    }

    public void setVerificador(VerificadorDeCodigos verificador) {
        this.verificador = verificador;
    }

    public String cadastrarTurma(Turma t) {
        if (!verificador.verificarCodigoDisciplina(t.getCodDisciplina())) {
            return "codigo disciplina invalido";
        }

        if (!verificador.verificarCodigoTurma(t.getCodTurma())) {
            return "codigo turma invalido";
        }

        if (turmaDao.existe(t)) {
            return "turma ja existe";
        }

        if (turmaDao.salvar(t)) {
            return "turma salva com sucesso";
        } else {
            return "turma nao salva. Erro no BD";
        }
    }

}
