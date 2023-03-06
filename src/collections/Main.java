package collections;

import javax.sound.midi.SysexMessage;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*ЗАДАЧА №1*/
//        ArrayList<Integer> list = new ArrayList<>();
//        int counter = 0;
//
//        for (int i = 0; i < 20; i++) {
//            list.add((int) (Math.random() * 10));
//        }
//        System.out.println(list);
//        Collections.sort(list);
//
//        for (int i = 0; i < list.size() - 1; i++) {
//            if (list.get(i).equals(list.get(i + 1))) {
//                counter++;
//            } else {
//                if (counter > 0) {
//                    System.out.println("Число " + list.get(i) + " повторяется " + (counter + 1) + " раз(а)");
//                }
//                counter = 0;
//            }
//        }
//        if (counter > 0) {
//            System.out.println("Число " + list.get(list.size() - 1) + " повторяется " + (counter + 1) + " раз(а)");
//        }

        /*ЗАДАЧА №2*/
/*        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add((int)(Math.random()*100));
            if(arrayList.get(i)<50 && arrayList.get(i)>20) {
                arrayList.set(i, -100);
            }
        }
        System.out.println(arrayList);
*/
        /* ЗАДАЧА №3 */

//        ArrayList<String> stringArrayList = new ArrayList<>();
//        stringArrayList.add("Uruguay");
//        stringArrayList.add("Eriiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitrea");
//        stringArrayList.add("Montenegroo");
//        stringArrayList.add("Trinidad");
//        stringArrayList.add("Bosnia");
//        stringArrayList.add("Arabia");
//        stringArrayList.add("Alooooooooooooooooooooooogeria");
//        stringArrayList.add("Senegaaaaaaaaaaaal");
//        stringArrayList.add("Malawiiiiiii");
//        stringArrayList.add("Portugal");
//        System.out.println(stringArrayList);
//        int max = countVowels(stringArrayList.get(0));
//        for (String s : stringArrayList) {
//            System.out.println("Количество гласных в слове " + s + " = " + countVowels(s));
//        }
//        int l;
//        for (l = 0; l < stringArrayList.size()-1; l++) {
//            if (countVowels(stringArrayList.get(l)) > max) {
//                max = countVowels(stringArrayList.get(l));
//                System.out.println("Слово с наибольшим количеством гласных: " + stringArrayList.get(l) + " со счётом = " + max);
//            }
//        }
//    }
//    public static int countVowels (String word){
//        int count = 0;
//        for (int i = 0; i < word.length(); i++) {
//            char c = Character.toLowerCase(word.charAt(i));
//            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//                count++;
//            }
//        }
//        return count;

        /*ЗАДАЧА №4*/
  /*      ArrayList<Integer> arraylist = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arraylist.add((int) (Math.random() * 100));
        }
        System.out.println(arraylist);
        for (int i = 0; i < arraylist.size(); i++) {
            if ((arraylist.get(i) % 2) == 0){
                arraylist.remove(i);
                i--;
            }
        }
        System.out.println(arraylist);

   */

//        ArrayList<String> words = new ArrayList<>();
//        words.add("Koala");
//        words.add("Tiger");
//        words.add("Wolf");
//        words.add("Cat");
//        words.add("Zebra");
//        words.add("Crocodile");
//        words.add("Snake");
//        words.add("Penguin");
//        words.add("Mouse");
//        words.add("Deer");
//        words.add("Cat");
//        words.add("Cat");
//        words.add("Horse");
//        words.add("Pig");
//        words.add("Sheep");
//        words.add("Donkey");
//        words.add("Giraffe");
//        words.add("Monkey");
//        words.add("Swan");
//        words.add("Swan");
//        words.add("Swan");
//        words.add("Swan");
//        words.add("Swan");
//                // Находим уникальные слова
//                List<String> uniqueWords = new ArrayList<>();
//                for (String word : words) {
//                    if (!uniqueWords.contains(word)) {
//                        uniqueWords.add(word);
//                    }
//                }
//
//                // Подсчитываем сколько раз каждое слово встречается в списке
//                Map<String, Integer> wordCount = new HashMap<>();
//                for (String word : words) {
//                    Integer count = wordCount.get(word);
//                    if (count == null) {
//                        count = 0;
//                    }
//                    wordCount.put(" " + word + " ", count + 1);
//                }
//
//                System.out.println("Все слова: " + words);
//                System.out.println("Уникальные слова: " + uniqueWords);
//                System.out.println("Количество повторений: " + wordCount);


        /*Счетчик букв*/
//        public static int countletters (String word){
//            int count = 0;
//            for (int i = 0; i < word.length(); i++) {
//                char c = Character.toLowerCase(word.charAt(i));
//                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'q'
//                        || c == 'w' || c == 'r' || c == 't' || c == 'y' || c == 'p' || c == 's'
//                        || c == 'd' || c == 'f' || c == 'g' || c == 'h' || c == 'j' || c == 'k'
//                        || c == 'l' || c == 'z' || c == 'x' || c == 'c' || c == 'v' || c == 'b'
//                        || c == 'n' || c == 'm') {
//
//                    count++;
//                }
//            }
//            return count;
//        }

    }
}


