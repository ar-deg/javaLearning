package Mod4.task16;

public class Support<T> {
    private T question;

    public Support(T question) {
        this.question = question;
    }

    public T getQuestion() {
        return question;
    }

    public void setQuestion(T question) {
        this.question = question;
    }

    public void printSupport() {
        System.out.println("Служба поддержки магазина мотоэкипировки\n" +
                "задайте свой вопрос в строке ниже:");

        System.out.println("Причина обращения: " + this.question.toString());

    }
}
