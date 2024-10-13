import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    // lista de alugueis que representa o historico de alugueis do cliente
    private ArrayList<Aluguel> historicoAlugueis;

    // metodo construtor que inicializa um cliente
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.historicoAlugueis = new ArrayList<Aluguel>();
        this.cpf = cpf;
    }

    // metodo que retorna o historico de alugueis do cliente
    public String listarHistoricoAlugueis(){
        String lista = "\nHistorico de Alugueis do cliente " + this.nome;
        for(Aluguel aluguel : historicoAlugueis){
            lista += aluguel.getVeiculo().getMarca() +" "+ aluguel.getVeiculo().getModelo() +" "+ aluguel.getVeiculo().getAno();
            lista += "\npor " + aluguel.getDiasAlugados() + " dias";
            lista += "\ntotalizando um valor de R$" + aluguel.calcularValorTotal() + " reais\n";
        }
        return lista;
    }

    public void addAluguel(Aluguel aluguel){
        historicoAlugueis.add(aluguel);
    }

    public String getNome() {
        return nome;
    }
}
