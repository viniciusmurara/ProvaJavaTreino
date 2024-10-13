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
    public ArrayList<Aluguel> listarHistoricoAlugueis(){
        return this.historicoAlugueis;
    }

    public void addAluguel(Aluguel aluguel){
        historicoAlugueis.add(aluguel);
    }

    public String getNome() {
        return nome;
    }
}
