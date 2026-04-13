package javaaula6;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner ops = new Scanner(System.in);
        int op = 0, idade, febre, tosse, dor, coriza, ar;
        String nome;
        boolean reiniciar = true;
        while (reiniciar) {
            System.out.println("---------------------------------");
            System.out.println("Qual o nome?");
            System.out.print("Digite aqui:");
            nome = ops.next();
            System.out.println("---------------------------------");
            System.out.println("Qual a idade?");
            System.out.print("Digite aqui:");
            idade = ops.nextInt();
            System.out.println("---------------------------------");
            System.out.println("está com febre?");
            System.out.println("Responda com '1' para sim ou '2' para não");
            System.out.print("Digite aqui:");
            febre = ops.nextInt();
            System.out.println("---------------------------------");

            System.out.println("está com tosse?");
            System.out.println("Responda com '1' para sim ou '2' para não");
            System.out.print("Digite aqui:");
            tosse = ops.nextInt();
            System.out.println("---------------------------------");
            System.out.println("está com dor de garganta?");
            System.out.println("Responda com '1' para sim ou '2' para não");
            System.out.print("Digite aqui:");
            dor = ops.nextInt();
            System.out.println("---------------------------------");
            System.out.println("está com coriza?");
            System.out.println("Responda com '1' para sim ou '2' para não");
            System.out.print("Digite aqui:");
            coriza = ops.nextInt();
            System.out.println("---------------------------------");
            System.out.println("está com falta de ar?");
            System.out.println("Responda com '1' para sim ou '2' para não");
            System.out.print("Digite aqui:");
            ar = ops.nextInt();

            System.out.println("---------------------------------");
            System.out.println("----------------MENU-------------");
            System.out.println("---------------------------------");
            System.out.println("1 - Ver Diagnóstico");
            System.out.println("2 - Ver Recomendações");
            System.out.println("3 - Informar novos sintomas");
            System.out.println("4 - Sair");
            System.out.println("---------------------------------");
            System.out.print("Responda aqui:");
            op = ops.nextInt();
            switch (op) {
                case 1:
                    if (ar == 1) {
                        System.out.println("Nome: " + nome);
                        System.out.println("Situação: Falta de ar");
                        System.out.println("!ALERTA!");
                    } else if (febre == 1 && tosse == 1 && dor == 1) {
                        System.out.println("Nome: " + nome);
                        System.out.println("Situação: Está com Gripe");
                    } else if (coriza == 1 && tosse == 1) {
                        System.out.println("Nome: " + nome);
                        System.out.println("Situação: Está com Resfriado");
                    } else if (coriza == 1 && febre == 2) {
                        System.out.println("Nome: " + nome);
                        System.out.println("Situação: Está com Alergia");
                    } else if (tosse == 1 && febre == 1) {
                        System.out.println("Nome: " + nome);
                        System.out.println("Situação: Não há dados, situação inválida");
                    } else {
                        System.out.println("Erro");
                        reiniciar = false;
                    }
                    break;
                case 2:
                    //requisito não funcional - adicionar um if else aqui
                    if (ar == 1) {
                        System.out.println("Nome: " + nome);
                        System.out.println("Recomendação: VEJA UM MÉDICO, URGENTE! ");
                        System.out.println("!ALERTA!");
                    } else if (febre == 1 && tosse == 1 && dor == 1) {
                        System.out.println("Nome: " + nome);
                        System.out.println("Recomendação: Beber bastante líquido");
                    } else if (coriza == 1 && tosse == 1) {
                        System.out.println("Nome: " + nome);
                        System.out.println("Recomendação: Evitar locais fechados");
                    } else if (coriza == 1 && febre == 2) {
                        System.out.println("Nome: " + nome);
                        System.out.println("Recomendação: Manter Higiene");
                    } else if (tosse == 1 && febre == 1) {
                        System.out.println("Nome: " + nome);
                        System.out.println("Recomendação: Procure um médico, recomendação fora de sistema");
                    } else {
                        System.out.println("Erro");
                        reiniciar = false;
                    }
                    System.out.println("");
                    System.out.println("Procurar um médico");
                    System.out.println("");
                    System.out.println("");
                    break;
                case 3:
                    reiniciar = false;
                    break;
                case 4:
                    reiniciar = false;
                    break;
                default:
                    System.out.println("Erro");
                    System.out.println("Reiniciando...");
                    reiniciar = false;
            }
        }
        if (op != 4) {
            reiniciar = true;
        }
    }
}
