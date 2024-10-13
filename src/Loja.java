import java.util.ArrayList;

public class Loja {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Veiculo> veiculosDisponiveis = new ArrayList<>();
    private ArrayList<Aluguel> alugueis = new ArrayList<>();
    private Veiculo veiculo;

    public void adicionarVeiculos(Veiculo veiculo){
        veiculosDisponiveis.add(veiculo);
    }

    public void cadastrarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void realizarAluguel(Aluguel aluguel){
        aluguel.adicionarAluguel();
        alugueis.add(aluguel);
    }

    public String listarVeiculosDisponiveis(){
        String lista = "\nVeiculos Disponível:";
        for(Veiculo veiculo : veiculosDisponiveis){
            lista += "\n" + veiculo.getModelo();
        }
        return lista;
    }

    public String listarClientes(){
        String lista = "\nClientes: ";
        for(Cliente cliente : clientes){
            lista += "\n" + cliente.getNome();
        }
        return lista;
    }

    public String gerarRelatorio(){
        String lista = "\nRelatório de Alugueis: ";
        for(Aluguel aluguel : alugueis){
            lista += "\nCliente: " + aluguel.getCliente().getNome();
            lista += "\nAlugou um " + aluguel.getVeiculo().getMarca() +" "+ aluguel.getVeiculo().getModelo() +" "+ aluguel.getVeiculo().getAno();
            lista += "\nPor " + aluguel.getDiasAlugados() + " dias";
            lista += "\nTotalizando um valor de R$" + aluguel.calcularValorTotal() + " reais";
        }
        return lista;
    }
}
