package javaaula4.Atvds;

public class Ex1 {
    public static void main(String[] args) {
        int Nome1_1b = 9;
        int Nome1_2b = 10;
        int Nome1_3b = 10;
        int media1 = (Nome1_1b + Nome1_2b + Nome1_3b) / 3;

        int Nome2_1b = 10;
        int Nome2_2b = 4;
        int Nome2_3b = 0;
        int media2 = (Nome2_1b + Nome2_2b + Nome2_3b) / 3;

        int Nome3_1b = 5;
        int Nome3_2b = 5;
        int Nome3_3b = 4;
        int media3 = (Nome3_1b + Nome3_2b + Nome3_3b) / 3;

        String nome1 = "Maicon";
        String nome2 ="Mag";
        String nome3 = "Matheus";

        String[] nomes = {nome1, nome2, nome3};

        int[] medias = {media1, media2, media3};


        System.out.println(nomes[0] + " tirou a media " + medias[0]);
        System.out.println(nomes[1] + " tirou a media " + medias[1]);
        System.out.println(nomes[2] + " tirou a media " + medias[2]);
    }
}
