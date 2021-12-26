import entities.ContaCorrente;

import java.util.ArrayList;
import java.util.Scanner;

public class ContasMultiplas {

    public static void main(String[] args) {
        Scanner leTecleado = new Scanner(System.in);
        String aux;
        int opcao, numero, numero2;
        double valor;
        ArrayList<ContaCorrente> lc = new ArrayList();
        ContaCorrente c1, c2;

        do {
            System.out.println("--- MENU ---");
            System.out.println("(1) Criar Conta");
            System.out.println("(2) Dados Bancários");
            System.out.println("(3) Depósito");
            System.out.println("(4) Saldo Atualizado");
            System.out.println("(5) Saque");
            System.out.println("(6) Transferir");
            System.out.println("(0) Sair");

            System.out.println("Digite a opção desejada: ");
            opcao = leTecleado.nextInt();
            leTecleado.nextLine();

            switch (opcao){

                case 1:
                    System.out.println("Digite o nome do titular: ");
                    aux = leTecleado.nextLine();

                    c1 = new ContaCorrente(aux);
                    lc.add(c1);

                    System.out.println("Conta criada com Sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o número da conta: ");
                    numero = leTecleado.nextInt();

                    c1 = lc.get(numero-1);
                    c1.DadosBancarios();
                    break;
                case 3:
                    System.out.println("Digite o número da conta: ");
                    numero = leTecleado.nextInt();

                    c1 = lc.get(numero-1);

                    System.out.println("Digite o valor do depósito: ");
                    valor = leTecleado.nextDouble();

                    c1.Depositar(valor);
                    break;
                case 4:
                    System.out.println("Digite o número da conta: ");
                    numero = leTecleado.nextInt();

                    c1 = lc.get(numero-1);
                    c1.Mostrar();
                    break;
                case 5:
                    System.out.println("Digite o número da conta: ");
                    numero = leTecleado.nextInt();

                    c1 = lc.get(numero-1);

                    System.out.println("Digite o valor do saque: ");
                    valor = leTecleado.nextDouble();

                    c1.Sacar(valor);
                    break;
                case 6:
                    System.out.println("Digite o número da conta de origem: ");
                    numero = leTecleado.nextInt();
                    c1 = lc.get(numero-1);

                    System.out.println("Digite o número da conta de destino: ");
                    numero2 = leTecleado.nextInt();
                    c2 = lc.get(numero2-1);

                    System.out.println("Digite o valor da Transferência: ");
                    valor = leTecleado.nextDouble();

                    c1.Transferir(c2, valor);
                    break;
                default:
                    if(opcao != 0)
                        System.out.println("Opção Inválida");
                        break;
            }

            System.out.println("");
        }while (opcao != 0);

        System.out.println("Operação Finalizada!");

    }
}
