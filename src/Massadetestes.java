import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

public class Massadetestes {

    @Test
    public void testInsertionSort() {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        int[] arrCopy = arr.clone();

        long startTime = System.nanoTime(); // Captura o tempo de início

        AlgoritmosDeOrdenacao.insertionSort(arr);

        long endTime = System.nanoTime(); // Captura o tempo de término

        // Verifica se o array foi ordenado corretamente
        Arrays.sort(arrCopy);
        assertArrayEquals(arrCopy, arr);

        // Imprime as métricas de desempenho
        System.out.println("Insertion Sort - Trocas de Posicao: " + AlgoritmosDeOrdenacao.getNumSwapsInsertionSort());
        System.out.println(
                "Insertion Sort - Numero de Comparacoes: " + AlgoritmosDeOrdenacao.getNumComparisonsInsertionSort());
        System.out.println("Insertion Sort - Tempo de Execucao: " + (endTime - startTime) + " nanossegundos");
    }

    @Test
    public void testSelectionSort() {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        int[] arrCopy = arr.clone();

        long startTime = System.nanoTime(); // Captura o tempo de início

        AlgoritmosDeOrdenacao.selectionSort(arr);

        long endTime = System.nanoTime(); // Captura o tempo de término

        // Verifica se o array foi ordenado corretamente
        Arrays.sort(arrCopy);
        assertArrayEquals(arrCopy, arr);

        // Imprime as métricas de desempenho
        System.out.println("Selection Sort - Trocas de Posicao: " + AlgoritmosDeOrdenacao.getNumSwapsSelectionSort());
        System.out.println(
                "Selection Sort - Numero de Comparacoes: " + AlgoritmosDeOrdenacao.getNumComparisonsSelectionSort());
        System.out.println("Selection Sort - Tempo de Execucao: " + (endTime - startTime) + " nanossegundos");
    }

    @Test
    public void testBubbleSort() {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        int[] arrCopy = arr.clone();

        long startTime = System.nanoTime(); // Captura o tempo de início

        AlgoritmosDeOrdenacao.bubbleSort(arr);

        long endTime = System.nanoTime(); // Captura o tempo de término

        // Verifica se o array foi ordenado corretamente
        Arrays.sort(arrCopy);
        assertArrayEquals(arrCopy, arr);

        // Imprime as métricas de desempenho
        System.out.println("Bubble Sort - Trocas de Posicao: " + AlgoritmosDeOrdenacao.getNumSwapsBubbleSort());
        System.out
                .println("Bubble Sort - Numero de Comparacoes: " + AlgoritmosDeOrdenacao.getNumComparisonsBubbleSort());
        System.out.println("Bubble Sort - Tempo de Execucao: " + (endTime - startTime) + " nanossegundos");
    }
}
