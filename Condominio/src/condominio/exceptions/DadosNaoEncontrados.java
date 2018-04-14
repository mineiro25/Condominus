package condominio.exceptions;

/**
 * Representa uma exceção que é usada/lançada quando há dados que nao foram
 * encontrados.
 */
public class DadosNaoEncontrados extends Exception {
    
    /**
     * Constrói uma instância de DadosNaoEncontrados com a mensagem "Dados
     * nao econtrados!"
     */
    public DadosNaoEncontrados() {
        super("Dados nao econtrados!");
    }

    /**
     * Constrói DadosNaoEncontrados contendo a mensagem recebida por
     * parametro
     */
    public DadosNaoEncontrados(String msg) {
        super(msg);
    }
}
