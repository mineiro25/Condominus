package condominio.exceptions;

/**
 * Representa uma exceção que é usada/lançada quando há dados de algo por
 * preencher.
 */
public class DadosInvalidos extends Exception {

    /**
     * Constrói uma instância de DadosEmBrancoException com a mensagem "Tem
     * dados em branco!"
     */
    public DadosInvalidos() {
        super("Dados invalidos.");
    }

    /**
     * Constrói DadosEmBrancoException contendo a mensagem recebida por
     * parametro
     */
    public DadosInvalidos(String msg) {
        super(msg);
    }
}
