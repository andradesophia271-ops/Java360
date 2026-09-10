public class AlgoritmoTrinta {
    public void main() {
        int numero = Integer.parseInt(IO.readln("Digite um número: "));

        long[] etapas = new long[numero];
        long resultados = 1;

        for (int i = 1; i <= numero; i++) {
            resultados = resultados * i;
            etapas[i - 1] = resultados;
        }

        System.out.println("Etapas (cálculos parciais):");
        for (int i = 0; i < etapas.length; i++) {
            System.out.println("Passo " + (i + 1) + ": " + etapas[i]);
        }

        System.out.println("Resultado final: " + resultados);
    }
}