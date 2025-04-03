public class SensorUmidadeSolo extends Sensor{

    // Metodo construtor do sensor de umidade do solo
    public SensorUmidadeSolo() {
        super();
        lerDados();
    }

    // Reescrita do metodo de atribuição dos dados, para a umidade do solo os valores poderão ser de 0% até 100%
    @Override
    public int lerDados() {
        setValor(random.nextInt(101));
        return getValor();
    }

    // Exibe os dados no console com mensagens de alerta e de ação, de acordo com o valor gerado pelo metodo lerDados()
    @Override
    public void exibirDados() {
        System.out.println("Umidade do solo: " + getValor() + "%");
        if(getValor() < 30) {
            System.out.println("ALERTA: SOLO EXTREMAMENTE SECO!");
            System.out.println("Ação: ligar irrigação");
        } else if(getValor() > 80) {
            System.out.println("ALERTA: SOLO MUITO ÚMIDO!");
            System.out.println("Ação: desligar irrigação");
        } else {
            System.out.println("UMIDADE ADEQUADA!");
            System.out.println("Ação: manter irrigação");
        }
    }
}
