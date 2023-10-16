import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
    Integer parametroUm = null;
    Integer parametroDois = null;

        boolean valoresValidos = false;
        while(!valoresValidos) {
            try {
                Scanner terminal = new Scanner(System.in);
                if (parametroUm == null) {
                    System.out.println("Digite o primeiro parâmetro");
                    parametroUm = terminal.nextInt();
                }
                if (parametroDois == null) {
                    System.out.println("Digite o segundo parâmetro");
                    parametroDois = terminal.nextInt();
                }
                valoresValidos = true;
                contar(parametroUm, parametroDois);
            }
            catch (ParametrosInvalidosException e) {
                System.err.println(e.getMessage());
            }
            catch (Exception e){
                System.out.println("Digite um numero inteiro");
            }
        }
        //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        int contagem = parametroDois - parametroUm;

        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        }
        //realizar o for para imprimir os números com base na variável contagem
        for (int indice=1;indice<=contagem;indice++){
            System.out.println(indice);
        }


    }


}

