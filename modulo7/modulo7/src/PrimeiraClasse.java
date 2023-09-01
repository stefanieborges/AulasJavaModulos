import pacote1.Classe1;

public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Cliente cliente = new Cliente();//instânciada
        cliente.setNome("Stéfanie");
        cliente.cadastrarEndereco("Rua dos bobos, n° 0");
        cliente.setCodigo(1);
        System.out.println(cliente.getNome());
        System.out.println(cliente.getEndereco());
        System.out.println(cliente.getCodigo());
        cliente.imprimirCadastro();


    }
}