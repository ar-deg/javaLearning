package Mod4.task3;

/*
Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость(массив из пяти элементов).
Создайте массив из десяти элементов такого типа.
Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
public class Classes3 {
    public static void main(String[] args) {
        Student students[] = new Student[10];
        students[0] = new Student("Ivanov", "A. D.", 5, new int[]{9, 9, 9, 10, 10});
        students[1] = new Student("Egorov", "R.F.", 1, new int[]{9, 8, 7, 6, 5});
        students[2] = new Student("Maksomov", "K.A.", 3, new int[]{10, 9, 10, 10, 9});
        students[3] = new Student("Filipow", "A.A.", 4, new int[]{1, 2, 3, 4, 5});
        students[4] = new Student("Kirkorov", "F.B.", 2, new int[]{9, 9, 9, 10, 9});
        students[5] = new Student("Ermolov", "L.D.", 1, new int[]{10, 9, 3, 4, 5});
        students[6] = new Student("Titov", "R.A.", 2, new int[]{1, 9, 3, 4, 5});
        students[7] = new Student("Komarov", "D.A.", 5, new int[]{2, 6, 3, 4, 5});
        students[8] = new Student("Lazarev", "S.A.", 3, new int[]{10, 9, 8, 7, 6});
        students[9] = new Student("Kotov", "M.G.", 5, new int[]{10, 9, 3, 4, 8});

        System.out.println("Фамилии и группы студентов, имеющих оценки 9 и 10:");
        for (int i = 0; i < students.length; i++) {
            if (students[i].checkProgress()) {
                System.out.println(students[i]);
            }
        }


    }
}

