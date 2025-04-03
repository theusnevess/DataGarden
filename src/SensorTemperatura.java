public class SensorTemperatura extends Sensor{

    // Metodo construtor do sensor de temperatura
    public SensorTemperatura() {
        super();
        lerDados();
    }

    // Reescrita do metodo de atribuição dos dados, para a temperatura os valores poderão ser de -10 até 45 graus celsius
    @Override
    public int lerDados() {
        setValor(random.nextInt(45) - 10);
        return getValor();
    }

    // Exibe os dados no console de acordo com o valor gerado pelo metodo lerDados()
    @Override
    public void exibirDados() {
        System.out.println("Temperatura atual: " + getValor());
        if(getValor() < 0){
            System.out.println("Temperatura extremamente baixa!");
        } else if(getValor() < 15) {
            System.out.println("Temperatura moderadamente baixa!");
        } else if(getValor() < 25) {
            System.out.println("Temperatura amena!");
        } else if (getValor() <= 30) {
            System.out.println("Temperatura moderadamente alta!");
        } else {
            System.out.println("Temperatura muito alta!");
        }
    }
}
