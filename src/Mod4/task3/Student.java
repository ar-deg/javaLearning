package Mod4.task3;

class Student {
    private String surname;
    private String initials;
    private int numberOfGroup;
    private int[] progress;

    public Student(String surname, String initials, int numberOfGroup, int[] progress) {
        this.surname = surname;
        this.initials = initials;
        this.numberOfGroup = numberOfGroup;
        this.progress = progress;

    }

    public boolean checkProgress() {
        for (int i = 0; i < progress.length; i++) {
            if (progress[i] < 9) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return "Фамилия:" + " " + surname + "," + " " + "группа:" + " " + numberOfGroup;
    }

}
