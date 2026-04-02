package javaaula4.paranoias;

public class BatataPotatoes {
    public static void main(String [] args){
        System.out.println("Fala Potatas");
        int uvaNumber = uva();
        mensagem(uvaNumber);
    }

    //ResponseEntity<?>
    public static int uva(){
        int uvaNumber = 1;

        String msg = "Uva é a melhor fruta do mundo";
        System.out.print("uva e bom demais");
        System.out.println(" quero mais, " + msg);

        return uvaNumber;
    }

    public static void mensagem(int uvaNumber){
        int numero = 20;
        numero += uvaNumber;
        System.out.println("Comi " + numero);
    }
}
