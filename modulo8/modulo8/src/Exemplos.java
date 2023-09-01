public class Exemplos {
    //tipos primitivos
    private int inteiro32Bits = 1;
    private float pfMenosPreciso = 10.0f;
    private boolean trueFalse;
    private String tipoTexto = "e ai!\n";
    private byte inteiro8Bits;
    private short inyeiros16Bits;
    private long inteiro64bits;
    private double pfMaisPreciso;
    private char letraUnica = 'e';

    public void setAText(String tipoTexto){
        this.tipoTexto += tipoTexto;
    }

    public String getAText(){
        return this.tipoTexto;
    }

    public int retonaInteiro(){
        return 10;
    }

    public long retornaLong(long inteiro)//parâmetro
    {
       return inteiro;
    }

    public int retorna(){
        int val = 10;
        return val;
    }
}

