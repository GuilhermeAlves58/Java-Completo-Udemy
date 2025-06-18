package secao16.exemplos16;

public class DiffeInterfaceHeranca {
    public static void main(String[] args) {
        CarroEletrico tesla = new CarroEletrico("Tesla Model S");

        tesla.ligarMotor();           // Herança
        tesla.carregarBateria();      // Interface
        System.out.println("Bateria: " + tesla.nivelBateria() + "%");
    }
}
interface Eletrico{
    void carregarBateria();
    int nivelBateria();
}

class Veiculo{
    protected String modelo;
    public Veiculo(String modelo){
        this.modelo = modelo;
    }
    public void ligarMotor(){
        System.out.println(modelo + " Ligando motor");
    }
}

class CarroEletrico extends Veiculo implements Eletrico{

    private int bateria = 100;
    public CarroEletrico(String modelo){
        super(modelo);
    }
    @Override
    public void carregarBateria(){
        bateria = 100;
        System.out.println(modelo + "Está carregando a bateria");
    }
    @Override
    public int nivelBateria(){
        return bateria;
    }

    @Override
    public void ligarMotor(){
        System.out.println(modelo + " Ligando motor Elétrico");
    }
}

