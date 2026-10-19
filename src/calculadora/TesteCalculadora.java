package calculadora;

/**
 * Classe de testes da {@link Calculadora}.
 *
 * <p>Cada teste exibe a entrada utilizada, o resultado esperado, o resultado
 * obtido e se o teste passou ou falhou.</p>
 *
 * @author Matheus Nardi
 * @version 2.0
 */
public class TesteCalculadora {
    /**
     * Cria uma nova instância da classe de testes.
     */
    public TesteCalculadora() {
    }

    /**
     * Executa todos os testes da calculadora.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Testes das operações válidas
        testarOperacao(calc, 2, 3, "+", 5);
        testarOperacao(calc, 10, 4, "-", 6);
        testarOperacao(calc, 3, 5, "*", 15);
        testarOperacao(calc, 8, 2, "/", 4);

        // Testes dos casos de erro (exceções esperadas)
        testarExcecao(calc, 8, 0, "/", "Divisão por zero não é permitida.");
        testarExcecao(calc, 5, 5, "x", "Operador inválido: x");
    }

    /**
     * Testa uma operação válida e compara o resultado obtido com o esperado.
     *
     * @param calc instância da calculadora
     * @param a primeiro operando
     * @param b segundo operando
     * @param operador operador da operação
     * @param esperado resultado esperado
     */
    private static void testarOperacao(Calculadora calc, int a, int b,
                                       String operador, int esperado) {

        // Executa a operação e compara o resultado obtido com o esperado
        int obtido = calc.calcular(a, b, operador);
        String status = (obtido == esperado) ? "PASSOU" : "FALHOU";
        System.out.println("Entrada: " + a + " " + operador + " " + b
                + " | Esperado: " + esperado
                + " | Obtido: " + obtido
                + " -> " + status);
    }

    /**
     * Testa uma operação que deve lançar {@link IllegalArgumentException}.
     *
     * @param calc instância da calculadora
     * @param a primeiro operando
     * @param b segundo operando
     * @param operador operador da operação
     * @param mensagemEsperada mensagem esperada na exceção
     */
    private static void testarExcecao(Calculadora calc, int a, int b,
                                      String operador, String mensagemEsperada) {
        String entrada = "Entrada: " + a + " " + operador + " " + b;
        // O teste só passa se a exceção for lançada com a mensagem esperada
        try {
            calc.calcular(a, b, operador);
            System.out.println(entrada + " | Esperado: exceção | Obtido: nenhuma exceção -> FALHOU");
        } catch (IllegalArgumentException e) {
            String status = e.getMessage().equals(mensagemEsperada) ? "PASSOU" : "FALHOU";
            System.out.println(entrada
                    + " | Esperado: " + mensagemEsperada
                    + " | Obtido: " + e.getMessage()
                    + " -> " + status);
        }
    }
}