package collections;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
public class WordCounter {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Koala");
        words.add("Tiger");
        words.add("Wolf");
        words.add("Cat");
        words.add("Zebra");
        words.add("Crocodile");
        words.add("Snake");
        words.add("Penguin");
        words.add("Mouse");
        words.add("Deer");
        words.add("Cat");
        words.add("Cat");
        words.add("Horse");
        words.add("Pig");
        words.add("Sheep");
        words.add("Donkey");
        words.add("Giraffe");
        words.add("Monkey");
        words.add("Swan");
        words.add("Swan");
        words.add("Swan");
        words.add("Swan");
        words.add("Swan");
        // Находим уникальные слова
        List<String> uniqueWords = new ArrayList<>();
        for (String word : words) {
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            }
        }

        // Подсчитываем сколько раз каждое слово встречается в списке
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            Integer count = wordCount.get(word);
            if (count == null) {
                count = 0;
            }
            wordCount.put(" " + word + " ", count + 1);
        }

        System.out.println("Все слова: " + words);
        System.out.println("Уникальные слова: " + uniqueWords);
        System.out.println("Количество повторений: " + wordCount);
    }
}
