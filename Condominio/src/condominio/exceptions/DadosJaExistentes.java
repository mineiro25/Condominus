package condominio.exceptions;

/**
 * Representa uma exceção que é usada/lançada quando há dados que ja foram
 * introduzidos.
 */
public class DadosJaExistentes extends Exception {
    
    /**
     * Constrói uma instância de DadosJaExistentes com a mensagem "Dados
     * ja existentes!"
     */
    public DadosJaExistentes() {
        super("Dados ja existentes!");
    }

    /**
     * Constrói DadosJaExistentes contendo a mensagem recebida por
     * parametro
     */
    public DadosJaExistentes(String msg) {
        super(msg);
    }
}