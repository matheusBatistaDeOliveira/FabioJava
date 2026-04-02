package javaaula5;

public class Ex4 {
    public static void main(String[] args) {

        //Farenhigt slá oq, cálculo que soma com o resultado anterior

        int c=1, resp=0, e;
        
        while(c<=1000){
            e = resp;
            resp += c;
            System.out.print("A Soma de " +c+ " + " +e+ " é: ");
            System.out.println(resp);
            c++;
        }
    }
}