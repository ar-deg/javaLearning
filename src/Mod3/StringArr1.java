package Mod3;

/*
Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */
public class StringArr1 {
    public static void main(String[] args) {
        String[] camelCase = {"userAge", "userName", "maxCount"};
        String[] snakeCase = new String[camelCase.length];

        for (int i = 0; i < snakeCase.length; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < camelCase[i].length(); j++) {
                char letter = camelCase[i].toCharArray()[j];
                if (Character.isLowerCase(letter)) {
                    sb.append(letter);
                } else {
                    sb.append("_");
                    sb.append(Character.toLowerCase(letter));
                }
            }
            snakeCase[i] = sb.toString();
            System.out.println(snakeCase[i] + " ");
        }
    }
}
