public class Cliente {//classe
    //atributos
    private int codigo; //variável
    private  String nome;
    private  String endereco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void cadastrarEndereco(String endereco){
        setEndereco(endereco);
    }

    public void imprimirCadastro(){
        System.out.println(this.nome);
        System.out.println(this.codigo);
        System.out.println(this.endereco);
    }


}
