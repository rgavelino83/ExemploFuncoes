package aula5algorprog;

import java.util.Scanner;

    public class ExemploFuncao {
        static Scanner input = new Scanner(System.in);
        
        static int menu (){//FUNÇÃO MENU
            int opcao;
            System.out.println("1-Adição");
            System.out.println("2-Subtração");
            System.out.println("3-Multiplicação");
            System.out.println("4-Divisão");
            System.out.println("Escolha uma opção: ");
            opcao = input.nextInt();
            return opcao;
        }
        static int add (int n1, int n2){//FUNÇÃO ADIÇÃO
            System.out.println("**--ADIÇÃO--**");
            int resultado = n1 + n2;
            return resultado;
        }
        static int sub (int n1, int n2){//FUNÇÃO SUBTRAÇÃO
            System.out.println("**--SUBTRAÇÃO--**");
            int resultado = n1 - n2;
            return resultado;
        }
        static int multi (int n1, int n2){//FUNÇÃO MULTIPLICAÇÃO
            System.out.println("**--MULTIPLICAÇÃO--**");
            int resultado = n2 * n2;
            return resultado;
        }
        static double div (int n1, int n2){//FUNÇÃO DIVISÃO
            System.out.println("**--DIVISÃO--**");
            double resultado = n1 / n2;
            return resultado;
        }
        static double operacao(int opcao, int n1, int n2){//FUNÇÃO DE ESCOLHA DA OPERAÇÃO
            System.out.println("**--OPERAÇÃO--**");
            double r = 0;
            switch (opcao){
                case 1:
                    r = add(n1, n2);
                    break;
                case 2:
                    r = sub(n1, n2);
                    break;
                case 3:
                    r = multi(n1, n2);
                    break;
                case 4:    
                    r = div(n1, n2);
                    break;
            }
            return r;        
        }
                
        static int entradaDados(){//FUNÇÃO DE ENTRADA DE DADOS
            System.out.println("**--ENTRADA DE DADOS--**");
            System.out.print("Número: ");
            int n;
            n = input.nextInt();
            return n;
        }
        static void imprimir(double n){//FUNÇÃO PARA IMPRIMIR RESULTADO (VOID NÃO TEM RETORNO)
            System.out.println("**--IMPRIMIR--**");
            System.out.println("Resultado: " +n);
        }
            public static void main(String[] args) {//FUNÇÃO PARA CHAMAR AS FUNÇÕES
                int opcao = menu();
                int n1 = entradaDados();
                int n2 = entradaDados();
                double r = operacao(opcao, n1, n2);
                imprimir(r);
            
        }
}
