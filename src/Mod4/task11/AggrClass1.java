package Mod4.task11;

import java.util.ArrayList;
import java.util.List;

/*
Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на консоль текст,
заголовок текста.
 */
public class AggrClass1 {
    public static void main(String[] args) {
        Word word1 = new Word("Hello");  //создание слова
        Word word2 = new Word("my");
        Word word3 = new Word("friend");

        List<Word> words = new ArrayList<>(); //создание пустого списка слов, куда добавляем слова
        words.add(word1);
        words.add(word2);
        words.add(word3);

        Sentence sentence = new Sentence(words);   //создание объекта и вкладывание в него списка слов
        List<Sentence> sentenceList = new ArrayList<>(); //создание пустого списка предложний, в кот. добавляю предложение
        sentenceList.add(sentence);

        Text text = new Text(sentenceList, "Welcome"); // создание объекта, состоящего из предложения и заголовка
        text.printTitle();

        Word newWords1 = new Word("How"); //создание новых слов для добавления в объект
        Word newWords2 = new Word("are");
        Word newWords3 = new Word("you?");

        List<Word> newWords = new ArrayList<>(); //добавление этих слов в список
        newWords.add(newWords1);
        newWords.add(newWords2);
        newWords.add(newWords3);

        Sentence newSentence = new Sentence(newWords); //создание нового предложения
        text.addSentence(newSentence); //добавление предложения в объект

        for (Sentence allSentence : text.getSentenceList()) { //вывод списков предложений объекта на экран
            System.out.println(allSentence.getWords());
        }


    }
}
