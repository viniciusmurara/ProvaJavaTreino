public class Carro extends Veiculo{
    private int numeroPortas;
    private String tipoCombustivel;

    // metodo construtor de carros
    public Carro(String placa, String marca, String modelo, int ano, double valorDiaria, int numeroPortas, String tipoCombustivel) {
        super(placa, marca, modelo, ano, valorDiaria);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    // metodo de calculo de aluguel de um veiculo carro baseado no valor e nos dias
    @Override
    public double calcularAluguel(int dias) {
        // caso seja um aluguel de mais de 7 dias
        if(dias > 7){
            // retornando com acrecimo de 10%
            double valorComDias = getValorDiaria() * dias;
            return valorComDias + (valorComDias * 0.1) ;
        }
        // retornando o valor vezes os dias
        return getValorDiaria() * dias;
    }

    // metodo que mostra os detalhes (atributos) de um veiculo carro
    @Override
    public String detalhesVeiculo() {
        return "\nplaca: " + getPlaca() +
                "\nmarca: " + getMarca() +
                "\nmodelo: " + getModelo() +
                "\nano: " + getAno() +
                "\nvalor diaria: " + getValorDiaria() +
                "\nnumero portas: " + this.numeroPortas +
                "\ntipo de combustivel: " + this.tipoCombustivel;
    }
}