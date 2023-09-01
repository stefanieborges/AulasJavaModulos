package pacote1;

public class Classe2 {

    private String propriedadePrivada;
    public String propriedadePublica;

    String propriedadeDefault;

    protected String propriedadeProtected;

    /**
     * Método que faz o cálculo do valor total
     *
     * @return retorna o valor total
     *
     * @deprecated
     * @see int getValorTotal1()
     *
     */
    public int getValorTotal(){
        return 20;
    }
    public int getValorTotal1(int count){
        return 20;
    }


    public static void main(String[] args) {

        Classe2 classe2 = new Classe2();
        //classe1.
        classe2.getValorTotal(); //método ultrapassado
    }
}
