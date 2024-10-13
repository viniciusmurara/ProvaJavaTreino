public class Aluguel {
    private Cliente cliente;
    private Veiculo veiculo;
    private int diasAlugados;

    public Aluguel(Cliente cliente, Veiculo veiculo, int diasAlugados) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.diasAlugados = diasAlugados;
    }

    public double calcularValorTotal(){
        return veiculo.calcularAluguel(this.diasAlugados);
    }

    public void adicionarAluguel(){
        cliente.addAluguel(this);
    }

    // metodos getters
    public Cliente getCliente() {
        return cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public int getDiasAlugados() {
        return diasAlugados;
    }
}
