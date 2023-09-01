public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Exemplos ex1 = new Exemplos();
        ex1.setAText("olá, mundo!");
        System.out.println(ex1.getAText());
        System.out.println(ex1.retonaInteiro());
        System.out.println(ex1.retornaLong(10000000));
        System.out.println(ex1.retorna());
        int num = 1;
        int num2 = 1;
        num++;
//|| ou && e !not 
        boolean isEqual = num == num2;
        System.out.println(isEqual);
    }
}