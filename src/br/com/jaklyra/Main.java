package br.com.jaklyra;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Bem vindo ao Sistema de Controle de Fluxo\n");

        menuPrincipal();

    }



    public static void menuPrincipal() {

            Scanner scanner = new Scanner(System.in);

            System.out.println("\n---------------------------------------------------------");
            System.out.println("MENU DO SISTEMA");
            System.out.println("---------------------------------------------------------\n");

            System.out.println("Informe a opção desejada:\n ");

            System.out.println("1 - IF - Com efeito flecha");
            System.out.println("2 - IF - Sem efeito flecha");
            System.out.println("3 - IF - Verificação de férias");
            System.out.println("4 - IF - Verificação de recebimento de benefício");
            System.out.println("5 - Switch - Seleção do dia da Semana");
            System.out.println("6 - Switch - Verificação de números");
            System.out.println("7 - Switch - verificação de férias");

            System.out.println("---------------------------------------------------------\n");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    ifFlecha();
                    break;
                case 2:
                    ifSemFlecha();
                    break;
                case 3:
                    ifferias();
                    break;
                case 4:
                    ifMenor();
                    break;
                case 5:
                    switchSemana();
                    break;
                case 6:
                    switchNumero();
                    break;
                case 7:
                    switchFerias();
                    break;
                default:
                    System.out.println("Opção Inválida");


            }
        }





    // VARIÁVEL DE DECISÃO - IF
        private static void ifFlecha(){

            Scanner scan = new Scanner(System.in);

            System.out.println("Informe o número referente ao mês que deseja -  1 a 12: ");

             int mes = scan.nextInt();

            if (mes == 1) {
                System.out.println("Janeiro");
            }else{
                if (mes == 2){
                    System.out.println("Fevereiro");

                }else{
                    if (mes == 3){
                        System.out.println("Março");
                    }else{
                        if (mes == 4){
                            System.out.println("Abril");
                    }else{
                        if (mes == 5){
                            System.out.println("Maio");
                        }else{
                            if (mes == 6){
                                System.out.println("Junho");
                            }else{
                                if (mes == 7){
                                    System.out.println("Julho");
                                }else{
                                    if (mes == 8){
                                        System.out.println("Agosto");
                                    }else{
                                        if (mes == 9){
                                            System.out.println("Setembro");
                                        }else{
                                            if (mes == 10){
                                                System.out.println("Outubro");
                                            }else{
                                                if (mes == 11){
                                                    System.out.println("Novembro");
                                                }else{
                                                    if (mes == 12){
                                                        System.out.println("Dezembro");
                                                    }else{
                                                        System.out.println("Mês indefinido");
                                                    }

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }

            menuPrincipal();
    }

        private static void ifSemFlecha(){

            Scanner scan = new Scanner(System.in);

            System.out.println("Informe o número referente ao mês que deseja -  1 a 12: ");

            int mes = scan.nextInt();

             if (mes == 1){
                System.out.println("Janeiro");
             }else if (mes == 2){
                System.out.println("Fevereiro");
            }else if (mes == 3){
                System.out.println("Março");
            }else if (mes == 4){
                System.out.println("Abril");
            }else if (mes == 5){
                System.out.println("Maio");
            }else if (mes == 6){
                System.out.println("Junho");
            }else if (mes == 7){
                System.out.println("Julho");
            }else if (mes == 8){
                System.out.println("Agosto");
            }else if (mes ==9){
                System.out.println("Setembro");
            }else if (mes == 10){
                System.out.println("Outubro");
            }else if (mes == 11){
            System.out.println("Novembro");
            }else if (mes == 12){
                System.out.println("Dezembro");
            }else{
                System.out.println("Mês Indefinido");
            }


            menuPrincipal();

        }

        //EXEMPLO DE MÁ PRÁTICA, EM CASOS DE VARIAVEIS COM VALOR FIXO, MELHOR UTILIZAR O SWITCH
        private static void ifferias(){


            Scanner scan = new Scanner(System.in);

            System.out.println("Informe o mês desejado: ");

            String convert = scan.next();

            String mes = convert.substring(0, 1).toUpperCase() + convert.substring(1);

               if (mes == "Julho" || mes == "Dezembro" || mes == "Janeiro"){
                System.out.println("Férias");
            }else{
                   System.out.println("Mês Letivo");
               }

               menuPrincipal();
        }

        private static void ifMenor(){

            Scanner leitor = new Scanner(System.in);

                System.out.println("Informe o Salário Mensal:");
                double salarioMensal = leitor.nextDouble();

                System.out.println("Informe a média salarial: ");
                double mediaSalario = leitor.nextDouble();

                System.out.println("Informe a quantidade de dependentes: ");
                int quantidadeDependentes = leitor.nextInt();

                System.out.println("Informe a média de dependentes: ");
                int mediaDependentes = leitor.nextInt();

            //PRIMEIRA SOLUÇÃO - NÃO RECOMENDADA
           if((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)){
               System.out.println("\nFuncionário deve receber auxílio");
           }

           //SEGUNDA SOLUÇÃO - CRIANDO VARIÁVEIS INTERMEDIARIAS
            boolean salarioBaixo = salarioMensal < mediaSalario;
            boolean muitosDependentes =  quantidadeDependentes >= mediaDependentes;

            if((salarioBaixo) && (muitosDependentes)){
                System.out.println("\nFuncionário deve receber auxílio");
            }

            boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);

            if(recebeAuxilio){
                System.out.println("\nFuncionário deve receber auxílio");
            }else {
                System.out.println("\nFuncionário não deve receber auxílio");
            }

            menuPrincipal();

        }

        //VARIÁVEL DE DECISÃO - SWITCH
        private static void switchSemana(){

            Scanner scan = new Scanner(System.in);

            System.out.println("Informe o dia da semana desejado: ");

            String convert = scan.next();

            String dia = convert.substring(0, 1).toUpperCase() + convert.substring(1);

            switch (dia){

                case "Segunda":
                    System.out.println(2);
                    break;
                case "Terça":
                    System.out.println(3);
                    break;
                case "Quarta":
                    System.out.println(4);
                    break;
                case "Quinta":
                    System.out.println(5);
                    break;
                case "Sexta":
                    System.out.println(6);
                    break;
                case "Sabado":
                    System.out.println(7);
                    break;
                case "Domingo":
                    System.out.println(1);
                    break;
                default:
                   System.out.println("Dia Inválido");
                    break;

            }

                menuPrincipal();
        }

        private static void switchNumero(){

            Scanner scan = new Scanner(System.in);

            System.out.println("Informe um número de 1 a 5: ");

            int numero = scan.nextInt();

            switch (numero){

                case 1:
                case 2:
                case 3:
                    System.out.println("Certo");
                    break;
                case 4:
                    System.out.println("Errado");
                    break;
                case 5:
                    System.out.println("Talvez");
                    break;
                default:
                    System.out.println("valor indefinido");
                    break;
            }

            menuPrincipal();
        }

        private static void switchFerias(){

            Scanner scan = new Scanner(System.in);

            System.out.println("Informe o mês desejado: ");

            String convert = scan.next();

            String mes = convert.substring(0, 1).toUpperCase() + convert.substring(1);

            switch (mes){

                case "Dezembro":
                case "Julho":
                case "Janeiro":
                    System.out.println("\nFérias");
                    break;
                case "Fevereiro":
                case "Março":
                case "Abril":
                case "Maio":
                case "Junho":
                case "Agosto":
                case "Setembro":
                case "Outubro":
                case "Novembro":
                    System.out.println("\nMês Letivo");
                    break;
                default:
                    System.out.println("\nMês Indefinido");
                    break;
            }

            menuPrincipal();

        }

}
