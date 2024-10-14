public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("qjh223", "honda", "civic", 2023, 120.0, 4, "flex");
        Veiculo moto = new Moto("hgr123", "honda", "bis", 2022, 70.0, 100);

        Cliente cliente1 = new Cliente("Vinicius", "987.685.765-85");
        Cliente cliente2 = new Cliente("Stéfany", "123.456.789-99");

        Loja loja = new Loja();

        loja.adicionarVeiculos(carro);
        loja.adicionarVeiculos(moto);

        loja.cadastrarCliente(cliente1);
        loja.cadastrarCliente(cliente2);

        System.out.println(loja.listarVeiculosDisponiveis());
        System.out.println(loja.listarClientes());

        Aluguel aluguel1 = new Aluguel(cliente1, carro, 3);
        Aluguel aluguel2 = new Aluguel(cliente2, moto, 6);
        Aluguel aluguel3 = new Aluguel(cliente2, carro, 10);

        loja.realizarAluguel(aluguel1);
        loja.realizarAluguel(aluguel2);
        loja.realizarAluguel(aluguel3);
        System.out.println(loja.gerarRelatorio());

        System.out.println(carro.detalhesVeiculo());
        System.out.println(moto.detalhesVeiculo());

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
