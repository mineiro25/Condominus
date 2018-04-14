package condominio.exceptions;

/**
 * Representa uma exceção que é usada/lançada quando há dados de algo por
 * preencher.
 */
public class DadosEmBranco extends Exception {

    /**
     * Constrói uma instância de DadosEmBranco com a mensagem "Tem
     * dados em branco!"
     */
    public DadosEmBranco() {
        super("Tem dados em branco.");
    }

    /**
     * Constrói DadosEmBranco contendo a mensagem recebida por
     * parametro
     */
    public DadosEmBranco(String msg) {
        super(msg);
    }
}