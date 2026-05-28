package br.com.etecia.myapp;

public class Service {

    static Pessoa var2 = new Pessoa("Lilian", "lilian@gmail.com", 18);//Chamar Objeto e já atribuir(sem set)
    static Pessoa ps = new Pessoa();//Chamar Objeto(com set, atribuição com set)


    public static void main(String[] args) {

      ps.setNome("Matheus");
      ps.setEmail("mat@gmaill.com");
      ps.setIdade(30);


        //Escrever no Objeto com get
        ps.getNome();
        ps.getEmail();
        ps.getIdade();


        //usando o instanciamento com argumentos já instanciado
        String minhacaixa = var2.getNome();
        String minhacaixa2 = var2.getEmail();
        int minhacaixa3 = var2.getIdade();
    };
}
