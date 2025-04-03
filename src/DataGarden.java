import java.util.Scanner;

public class DataGarden {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Instância da classe Scanner, usada para entrada de dados

        while(true) {
            System.out.println("------------ DATA GARDEN ------------");
            System.out.println("1 - Obter temperatura");
            System.out.println("2 - Obter luminosidade do local");
            System.out.println("3 - Obter umidade do solo");
            System.out.println("4 - encerrar programa");
            System.out.println("Escolha uma opção: ");
            while (!scan.hasNextInt()) { // caso o input não seja de inteiros, a mensagem de erro será exibida
                System.out.println("Erro: Entrada inválida. Digite um número válido.");
                scan.next();
            }
            try {
                int escolha = scan.nextInt(); // Input da escolha dentre as alternativas do menu
                switch (escolha) {
                    case 1:
                        Sensor sensorTemperatura = new SensorTemperatura(); // Cria uma instância da classe SensorTemperatura
                        sensorTemperatura.exibirDados(); // A partir da instância será exibido um output da temperatura em graus celcius com os dados simulados pelo Math.Random
                        break;
                    case 2:
                        Sensor sensorLuminosidade = new SensorLuminosidade(); // Cria uma instância da classe SensorLuminosidade
                        sensorLuminosidade.exibirDados(); // Exibe o valor da luminosidade na unidade de medida lx
                        break;
                    case 3:
                        Sensor sensorUmidadeSolo = new SensorUmidadeSolo(); // Cria uma instância da classe SensorUmidadeSolo
                        sensorUmidadeSolo.exibirDados(); // Exibe o valor da umidade do solo em %
                        break;
                    case 4:
                        System.out.println("Encerrando programa..."); // Fecha a aplicação
                        return;
                    default:
                        throw new Exception("Opção inválida!"); // Caso não seja inserido nenhuma das opções válidas, então será lançado um erro com a mensagem da excessão
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage()); // Captura a excessão e exibe a mensagem
            }
        }
    }
}
