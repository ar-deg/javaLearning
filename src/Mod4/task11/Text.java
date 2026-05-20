package Mod4.task11;

import java.util.List;

public class Text {
    private List<Sentence> sentenceList;
    private String title;

    public Text(List<Sentence> sentenceList, String title) {
        this.sentenceList = sentenceList;
        this.title = title;
    }

    public List<Sentence> getSentenceList() {
        return sentenceList;
    }

    public void setSentenceList(List<Sentence> sentenceList) {
        this.sentenceList = sentenceList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addSentence(Sentence sentence) {
        this.sentenceList.add(sentence);
    }

    public void printTitle() {
        System.out.println(this.title);
    }

    @Override
    public String toString() {
        return "Text{" +
                "sentenceList=" + sentenceList +
                ", title='" + title + '\'' +
                '}';
    }
}
