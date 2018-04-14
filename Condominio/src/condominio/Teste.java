/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio;


/**
 *
 * @author Miguel
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fracao a1 = new Fracao (1,150,"T3",1,123);
        Fracao a2 = new Fracao (1,150,"T2",1,132);
        Condominio b1 = new Condominio (1000,"Porto",4765-343,424);
        Condominio b2= new Condominio (500,"Braga",4765-122,333);
        Despesa d1 = new Despesa("Limpeza", 500,"01-02-1997",1);
        Despesa d2 = new Despesa("Jardinagem", 114,"04-12-2012",1);
        Colaborador f1 = new Colaborador ("Iniesta",121,"Rua de Miegsi","Jardineiro",121);
        Colaborador f2 = new Colaborador ("Coutinho",121,"Rua 25 de Abril","Electricista",121);
        ListaColaborador g1 = new ListaColaborador ();
        g1.addColaborador(f2);
        g1.addColaborador(f1);
        Orcamento e1 = new Orcamento (200,"Recusado",1,321,1,5,1);
        Orcamento e2 = new Orcamento (600,"Aceite",2,321,1,2,1);
        e2.addorçamento(d1);
        e2.somadespesas();
        e2.totalorçamento();
        e1.totalorçamento();
        e1.addorçamento(d2);
        e1.somadespesas();
        e1.totalorçamento();
        ListaOrçamentos l1=new ListaOrçamentos();
        l1.addOrcamento(e2);
        l1.addOrcamento(e1);
        ListaManutencoes h1 = new ListaManutencoes ();
        h1.addmanutencao(d1);
        h1.addmanutencao(d2);
        h1.calendario();
        Condomino j1 = new Condomino(114141,"Rua da escola","Jorge Jesus");
        Pagamento j = new Pagamento ("Aceite","01/01/2016",12314213,"Rua de Miegsi","Jorge Jesus",1,500);
        ListaPagamentos w1 = new ListaPagamentos ();
        w1.addPagamento(j);
        w1.pagamentosperiodo("02/11/1997");
        Reuniao i = new Reuniao (1,"Manutenção",1,12,"04");
    }
}
    