public class Moto extends Veiculo{
    private int cilindradas;

    // metodo construtor
    public Moto(String placa, String marca, String modelo, int ano, double valorDiaria, int cilindradas) {
        super(placa, marca, modelo, ano, valorDiaria);
        this.cilindradas = cilindradas;
    }

    // metodo de calculo de aluguel de um veiculo moto baseado no valor e nos dias
    @Override
    public double calcularAluguel(int dias) {
        // caso seja um aluguel de mais de 5 dias
        if(getValorDiaria() > 5){
            // retornando com acrecimo de 15%
            double valorComDias = getValorDiaria() * dias;
            return valorComDias + (valorComDias * 0.15);
        }
        // retornando o valor vezes os dias
        return getValorDiaria() * dias;
    }

    // metodo que mostra os detalhes de um veiculo moto
    @Override
    public String detalhesVeiculo() {
        return "\nplaca: " + getPlaca() +
                "\nmarca: " + getMarca() +
                "\nmodelo: " + getModelo() +
                "\nano: " + getAno() +
                "\nvalor diaria: " + getValorDiaria() +
                "\ncilindradas: " + this.cilindradas;
    }
}