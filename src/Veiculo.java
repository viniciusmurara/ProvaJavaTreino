public abstract class Veiculo {
    private String placa, marca, modelo;
    private int ano;
    private double valorDiaria;

    // metodo construtor de veiculos
    public Veiculo(String placa, String marca, String modelo, int ano, double valorDiaria) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
    }

    // metodo abstrato que calcula o aluguel do carro baseado no valor e na quantidade de dias
    public abstract double calcularAluguel(int dias);
    // metodo abstrato que mostra os detalhes do veiculo
    public abstract String detalhesVeiculo();

    // metodos getter pra retornar no metodo detalhesVeiculo
    public String getPlaca() {
        return placa;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
    public double getValorDiaria() {
        return valorDiaria;
    }
}
