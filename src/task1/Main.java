package task1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 2, 3, 4, 510, 32, 25, 74);
        System.out.println("количество вхождений цифры 1: " + countDigitOccurrences(list));
        System.out.println("два элемента начиная со второго: " + twoElementsStartingFromTheSecond(list));
        System.out.println("третий элемент коллекции по порядку : " + thirdCollectionElementInOrder(list));
        System.out.println("найти элемент в коллекции равный 100: " + findItem(list));
    }

    public static long countDigitOccurrences(List<Integer> list) {
        return list.toString().chars().filter(ch -> ch == '1').count();
    }

    public static int findItem(List<Integer> list) {
        return Optional.of(list.stream().filter(i -> i == 100)
                .findFirst()
                .orElseThrow(RuntimeException::new))
                .get();
    }

    public static List<Integer> twoElementsStartingFromTheSecond(List<Integer> list) {
        return list.subList(2, 3);
    }

    public static int thirdCollectionElementInOrder(List<Integer> collection) {
        return collection.get(2);
    }
}
