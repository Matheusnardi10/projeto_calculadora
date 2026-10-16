package calculadora;

/**
 * <p><strong>Projeto Calculadora</strong></p>
 *
 * <p>Esta classe fornece operações matemáticas básicas (soma, subtração,
 * multiplicação e divisão), além de um método principal que seleciona a
 * operação desejada com base em um operador informado pelo usuário.</p>
 *
 * <p>Este projeto é utilizado para demonstrar:</p>
 * <ul>
 *     <li>Testes funcionais e unitários</li>
 *     <li>Tratamento de erros com exceções</li>
 *     <li>Aplicação de refatoração em código Java</li>
 *     <li>Documentação com JavaDoc</li>
 * </ul>
 *
 * <p>Após a refatoração, os métodos desta classe são <strong>métodos
 * puros</strong>, sem efeitos colaterais, permitindo maior legibilidade e
 * facilitando testes unitários.</p>
 *
 * @author Seu Nome
 * @version 2.0
 */
public class Calculadora {

    /**
     * Soma dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da soma de {@code a} e {@code b}
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai o segundo número inteiro do primeiro.
     *
     * @param a primeiro operando (minuendo)
     * @param b segundo operando (subtraendo)
     * @return o resultado de {@code a - b}
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado do produto de {@code a} por {@code b}
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide o primeiro número inteiro pelo segundo (divisão inteira).
     *
     * @param a dividendo
     * @param b divisor
     * @return o resultado de {@code a / b}
     * @throws IllegalArgumentException se o divisor for zero
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    /**
     * Executa a operação matemática solicitada com base no operador informado.
     *
     * <p>Operadores aceitos:</p>
     * <ul>
     *     <li>"+": Soma</li>
     *     <li>"-": Subtração</li>
     *     <li>"*": Multiplicação</li>
     *     <li>"/": Divisão</li>
     * </ul>
     *
     * <p>Qualquer operador inválido resulta em exceção.</p>
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @param operador símbolo da operação desejada
     * @return o resultado da operação correspondente ao operador informado
     * @throws IllegalArgumentException se o operador não for um símbolo válido
     *         ou se houver tentativa de divisão por zero
     */
    public int calcular(int a, int b, String operador) {
        if (operador == null) {
            throw new IllegalArgumentException("Operador não informado.");
        }

        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador inválido: " + operador);
        };
    }
}