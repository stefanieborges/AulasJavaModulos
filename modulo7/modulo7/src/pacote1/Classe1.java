package pacote1;

public class Classe1 {
    private String propriedadePrivada;//somente dentro da propria classe ou atraves de get e set

    public String getPropriedadePrivada() {
        return propriedadePrivada;
    }

    public void setPropriedadePrivada(String propriedadePrivada) {
        this.propriedadePrivada = propriedadePrivada;
    }

    public String propriedadePublica;

    String propriedadeDefault;

    protected String propriedadeProtected;

}
