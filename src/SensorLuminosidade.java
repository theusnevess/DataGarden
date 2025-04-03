public class SensorLuminosidade extends Sensor {

    // Metodo construtor do sensor de luminosidade
    public SensorLuminosidade() {
        super();
        lerDados();
    }

    // Reescrita do metodo de atribuição dos dados, para a luminosidade os valores poderão ser de 0lx até 1023lx
    @Override
    public int lerDados() {
        setValor(random.nextInt(1023));
        return getValor();
    }

    // Exibe os dados no console de acordo com o valor gerado pelo metodo lerDados()
    @Override
    public void exibirDados() {
        System.out.println("Luminosidade no local: " + getValor());
        if(getValor() < 200) {
            System.out.println("Luminosidade baixa");
        } else if(getValor() < 700) {
            System.out.println("Ambiente moderadamente iluminado");
        } else {
            System.out.println("Alta incidência de luz");
        }
    }
}