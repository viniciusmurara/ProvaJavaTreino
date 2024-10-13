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
    public String listarHistoricoAlugueis() {
        String lista = "Historico de Alugueis do(a) cliente " + this.nome;

        for (Aluguel aluguel : historicoAlugueis) {
            // adicionando verificações para Carro e Moto
            if (aluguel.getVeiculo() instanceof Carro) {
                lista += "\nCarro: " + aluguel.getVeiculo().getMarca() +" "+ aluguel.getVeiculo().getModelo() +" "+ aluguel.getVeiculo().getAno();
            } else if (aluguel.getVeiculo() instanceof Moto) {
                lista += "\nMoto: " + aluguel.getVeiculo().getMarca() +" "+ aluguel.getVeiculo().getModelo() +" "+ aluguel.getVeiculo().getAno();
            }
            lista += "\nPor " + aluguel.getDiasAlugados() + " dias";
            lista += "\nTotalizando um valor de R$" + aluguel.calcularValorTotal() + " reais\n";
        }

        return lista;
    }

    public void addAluguel(Aluguel aluguel){
        historicoAlugueis.add(aluguel);
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "\nCliente: " +
                "\nnome: " + nome +
                "\ncpf: " + cpf +
                "\n" + listarHistoricoAlugueis();
    }
}
