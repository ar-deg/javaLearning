package Mod4.task16;

import java.util.*;

/*
Нужно спроектировать программу для интернет-магазина мотоэкипировки. Программа должна хранить список товаров
(шлем, куртка, мотоботы и тп (не менее 5) ), уметь сортировать их по цене, считать общую стоимость и
находить экипировку, соответствующую заданному уровню защиты. Все невалидные варианты запросов должны быть обработаны.
Требуется максимальное использование ООП - Инкапсуляция,Наследование,Полиморфизм,Абстракция .
 */
public class Class6 {
    public static void main(String[] args) {
        BackProtection backProtection1 = new BackProtection("Протектор(защита)", 50.5, "lvl2", "s", 234567);
        BackProtection backProtection2 = new BackProtection("Протектор(защита)", 40.2, "lvl1", "m", 456890);
        BackProtection backProtection3 = new BackProtection("Протектор(защита)", 50.5, "lvl2", "l", 197546);

        KneeProtection kneeProtection1 = new KneeProtection("Наколенники", 30.3, "lvl1", "xs", 854321);
        KneeProtection kneeProtection2 = new KneeProtection("Наколенники", 31.1, "lvl2", "s", 256435);
        KneeProtection kneeProtection3 = new KneeProtection("Наколенники", 30.3, "lvl1", "xl", 887654);

        MotorcycleGloves motorcycleGloves1 = new MotorcycleGloves("Мотоперчатки", 20.0, "EN13593", "s", 356789);
        MotorcycleGloves motorcycleGloves2 = new MotorcycleGloves("Мотоперчатки", 20.5, "EN13594", "m", 332456);
        MotorcycleGloves motorcycleGloves3 = new MotorcycleGloves("Мотоперчатки", 20.5, "EN13594", "l", 11223);

        MotorcycleBoots motorcycleBoots1 = new MotorcycleBoots("мотоБоты", 100.0, "EN13634", "42", 228778);
        MotorcycleBoots motorcycleBoots2 = new MotorcycleBoots("мотоБоты", 100.5, "EN13632", "40", 987654);
        MotorcycleBoots motorcycleBoots3 = new MotorcycleBoots("мотоБоты", 95.0, "EN13634", "45", 345678);

        MotorcycleHelmet motorcycleHelmet1 = new MotorcycleHelmet("Шлем", 230.0, "ECE 22.06", "xs", 123567);
        MotorcycleHelmet motorcycleHelmet2 = new MotorcycleHelmet("Шлем", 225.0, "DOT", "s", 998887);
        MotorcycleHelmet motorcycleHelmet3 = new MotorcycleHelmet("Шлем", 220.0, "SNELL", "m", 156354);

        Jacket jacket1 = new Jacket("Куртка", 165.0, "AA", "s", 256512);
        Jacket jacket2 = new Jacket("Куртка", 100.0, "A", "l", 856345);
        Jacket jacket3 = new Jacket("Куртка", 95.0, "B", "m", 745365);

        List<Equipment> equipment = new ArrayList<>();
        equipment.add(backProtection1);
        equipment.add(backProtection2);
        equipment.add(backProtection3);

        equipment.add(kneeProtection1);
        equipment.add(kneeProtection2);
        equipment.add(kneeProtection3);

        equipment.add(motorcycleGloves1);
        equipment.add(motorcycleGloves2);
        equipment.add(motorcycleGloves3);

        equipment.add(motorcycleBoots1);
        equipment.add(motorcycleBoots2);
        equipment.add(motorcycleBoots3);

        equipment.add(motorcycleHelmet1);
        equipment.add(motorcycleHelmet2);
        equipment.add(motorcycleHelmet3);

        equipment.add(jacket1);
        equipment.add(jacket2);
        equipment.add(jacket3);

        Store store = new Store(equipment);
//        System.out.println("Сортировка по цене:");
//        store.sortEquip(equipment);
//        for (Equipment equip : equipment) {
//            System.out.println(equip.getProductName() + " - " + equip.getPrice() + " byn ");
//        }
//        System.out.println();
//        System.out.println("Общая стоимость экипировки:");
//        double sum = store.calculateTotal(equipment);
//        System.out.println(sum + " byn ");

//        System.out.println();
//        System.out.println("Поиск экипировки по уровню защиты:");
//        List<Equipment> a = store.findEquip(equipment, "lvl1");
//        for (Equipment eq : a) {
//            System.out.println(eq.getProductName() + " " + eq.getLevelOfProtection() + " " + eq.getSize() + " " + eq.getPrice() + " byn ");
//        }
        List<Equipment> random = new ArrayList<>(equipment);
        Collections.shuffle(random); //тусуем лист
        List<Equipment> sublist = random.subList(0, 3);

        System.out.println();
        Cart cart = new Cart();

        Scanner sc = new Scanner(System.in);
        System.out.println("Добрый день! Подобрали для вас: ");
        for (Equipment eq : sublist) {
            System.out.println(eq.getProductName() + " /" + "(артикул) - " + eq.getArticle() + " (уровень защиты) - " + eq.getLevelOfProtection() + "/" + "(размер) - " + eq.getSize() + " / " + eq.getPrice() + " byn ");
        }
        System.out.println("Выберите следующее действие: (нажмите соответствующую цифру)\n" +
                "1 - Добавить товар из подборки в корзину\n" +
                "2 - Перейти в каталог товаров");
        int choice = sc.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    System.out.println("Напишите артикул товара, который хотите добавить в корзину:");
                    int articlePr = sc.nextInt();
                    try {
                        for (Equipment eq : equipment) {
                            if (eq.getArticle() == articlePr) {
                                cart.addEquipToTheCart(eq);
                                System.out.println("Товар: " + eq.getProductName() + " / " + "(артикул) - " + eq.getArticle() + " (уровень защиты) - " + eq.getLevelOfProtection() + " / " + "(размер) - " + eq.getSize() + " / " + eq.getPrice() + " byn " + " - добавлен в корзину");
                            } else {
                                throw new NotFound("К сожалению, товара с таким артикулом не найдено");
                            }
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }


                case 2:
                    System.out.println("Каталог товаров\n" +
                            "10 - Протектор(защита)\n" +
                            "11 - Мотоперчатки\n" +
                            "12 - мотоБоты\n" +
                            "13 - Наколенники\n" +
                            "14 - Куртка\n" +
                            "15 - Шлем\n" +
                            "16 - отсортировать/просмотреть товар по уровню защиты\n" +
                            "Выберите интересующую категорию");
                    choice = sc.nextInt();
                    break;


                case 3:
                    System.out.println("Корзина: ");
                    cart.showCart();
                    double calculateTotalCart = cart.calculateTotalCart();
                    System.out.println("Товаров в корзине на сумму " + " " + calculateTotalCart + " byn ");
                    if (calculateTotalCart > 0) {
                        System.out.println("Оформить заказ?\n" +
                                "Нажмите 8 - чтобы оформить\n" +
                                "9 - продолжить покупки");
                        int answer = sc.nextInt();
                        if (answer == 8) {
                            System.out.println("Заказ оформлен! Спасибо за покупку!");
                            cart.clear();
                            System.out.println("Нажмите 2 - для перехода в каталог\n" +
                                    "Нажмите 0 для выхода");
                            choice = sc.nextInt();
                        } else if (answer == 9) {
                            System.out.println("Рады снова видеть Вас!");
                            System.out.println("Нажмите 2 - для продолжения покупок (перехода в каталог)\n" +
                                    "Нажмите 0 для выхода");
                            choice = sc.nextInt();
                        }

                    }
                    break;

                case 4:
                    System.out.println("Напишите артикул товара, который хотите добавить в корзину:");
                    int articleP = sc.nextInt();
                    try {
                        for (Equipment eq : equipment) {
                            if (eq.getArticle() == articleP) {
                                cart.addEquipToTheCart(eq);
                                System.out.println("Товар: " + eq.getProductName() + " / " + "(артикул) - " + eq.getArticle() + " (уровень защиты) - " + eq.getLevelOfProtection() + " / " + "(размер) - " + eq.getSize() + " / " + eq.getPrice() + " byn " + " - добавлен в корзину");
                            } else {
                                throw new NotFound("К сожалению, товар с таким артикулом закончился");
                            }
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    System.out.println("Выберите следующее действие:\n" +
                            "2 - вернуться в каталог\n" +
                            "3 - просмотреть корзину\n" +
                            "0 - выйти");
                    choice = sc.nextInt();

                    break;


                case 10:
                    System.out.println("Протектор(защита): ");
                    for (Equipment eq : equipment) {
                        if (eq.getProductName().equals("Протектор(защита)")) {
                            System.out.println(eq.getProductName() + " / " + "(артикул) - " + eq.getArticle() + " (уровень защиты) - " + eq.getLevelOfProtection() + "/ " + "(размер) - " + eq.getSize() + " / " + eq.getPrice() + " byn ");

                        }

                    }
                    System.out.println("Выберите следующее действие: \n" +
                            "Нажмите 4 - для добавления товара в корзину\n" +
                            "Нажмите 5 - для сортировки протектор(защита) по цене\n" +
                            "Нажмите 2 - для возврата в каталог\n" +
                            "Нажмите 0 - для выхода");
                    choice = sc.nextInt();
                    break;

                case 11:
                    System.out.println("Мотоперчатки: ");
                    for (Equipment eq : equipment) {
                        if (eq.getProductName().equals("Мотоперчатки")) {
                            System.out.println(eq.getProductName() + " / " + "(артикул) - " + eq.getArticle() + " (уровень защиты) - " + eq.getLevelOfProtection() + " / " + "(размер) - " + eq.getSize() + " / " + eq.getPrice() + " byn ");

                        }

                    }
                    System.out.println("Выберите следующее действие: \n" +
                            "Нажмите 4 - для добавления товара в корзину\n" +
                            "Нажмите 6 - для сортировки мотоперчаток по цене\n" +
                            "Нажмите 2 - для возврата в каталог\n" +
                            "Нажмите 0 - для выхода");
                    choice = sc.nextInt();
                    break;

                case 12:
                    System.out.println("мотоБоты: ");
                    for (Equipment eq : equipment) {
                        if (eq.getProductName().equals("мотоБоты")) {
                            System.out.println(eq.getProductName() + " / " + "(артикул) - " + eq.getArticle() + " (уровень защиты) - " + eq.getLevelOfProtection() + " / " + "(размер) - " + eq.getSize() + " / " + eq.getPrice() + " byn ");

                        }

                    }
                    System.out.println("Выберите следующее действие: \n" +
                            "Нажмите 4 - для добавления товара в корзину\n" +
                            "Нажмите 7 - для сортировки мотоБот по цене\n" +
                            "Нажмите 2 - для возврата в каталог\n" +
                            "Нажмите 0 - для выхода");
                    choice = sc.nextInt();
                    break;

                case 13:
                    System.out.println("Наколенники: ");
                    for (Equipment eq : equipment) {
                        if (eq.getProductName().equals("Наколенники")) {
                            System.out.println(eq.getProductName() + " / " + "(артикул) - " + eq.getArticle() + " (уровень защиты) - " + eq.getLevelOfProtection() + " / " + "(размер) - " + eq.getSize() + " / " + eq.getPrice() + " byn ");

                        }

                    }
                    System.out.println("Выберите следующее действие: \n" +
                            "Нажмите 4 - для добавления товара в корзину\n" +
                            "Нажмите 17 - для сортировки наколенников по цене\n" +
                            "Нажмите 2 - для возврата в каталог\n" +
                            "Нажмите 0 - для выхода");
                    choice = sc.nextInt();
                    break;

                case 14:
                    System.out.println("Куртка: ");
                    for (Equipment eq : equipment) {
                        if (eq.getProductName().equals("Куртка")) {
                            System.out.println(eq.getProductName() + " / " + "(артикул) - " + eq.getArticle() + " (уровень защиты) - " + eq.getLevelOfProtection() + " / " + "(размер) - " + eq.getSize() + " / " + eq.getPrice() + " byn ");

                        }

                    }
                    System.out.println("Выберите следующее действие: \n" +
                            "Нажмите 4 - для добавления товара в корзину\n" +
                            "Нажмите 18 - для сортировки курток по цене\n" +
                            "Нажмите 2 - для возврата в каталог\n" +
                            "Нажмите 0 - для выхода");
                    choice = sc.nextInt();
                    break;

                case 15:
                    System.out.println("Шлем: ");
                    for (Equipment eq : equipment) {
                        if (eq.getProductName().equals("Шлем")) {
                            System.out.println(eq.getProductName() + " / " + "(артикул) - " + eq.getArticle() + " (уровень защиты) - " + eq.getLevelOfProtection() + " / " + "(размер) - " + eq.getSize() + " / " + eq.getPrice() + " byn ");

                        }

                    }
                    System.out.println("Выберите следующее действие: \n" +
                            "Нажмите 4 - для добавления товара в корзину\n" +
                            "Нажмите 19 - для сортировки шлемов по цене\n" +
                            "Нажмите 2 - для возврата в каталог\n" +
                            "Нажмите 0 - для выхода");
                    choice = sc.nextInt();
                    break;

                case 16:
                    System.out.println("Поиск экипировки по уровню защиты\n" +
                            "Выберите уровень защиты:\n" +
                            "lvl1\n" +
                            "lvl2\n" +
                            "EN13593\n" +
                            "EN13594\n" +
                            "EN13634\n" +
                            "EN13632\n" +
                            "ECE 22.06\n" +
                            "DOT\n" +
                            "SNELL\n" +
                            "AA\n" +
                            "A\n" +
                            "B");
                    sc.nextLine();             //Происходит считывание конца строки (начиная от ранее введенного числа и заканчивая переводом строки). Можете добавить дополнительный вызов sc.nextLine(); после каждого вызова nextInt();.
                    String levelOfProtSc = sc.nextLine();
                    List<Equipment> a = store.findEquip(equipment, levelOfProtSc);
                    for (Equipment eq : a) {
                        System.out.println(eq.getProductName() + " " + eq.getLevelOfProtection() + " " + eq.getSize() + " " + eq.getPrice() + " byn ");
                    }
                    System.out.println("Выберите следующее действие: \n" +
                            "Нажмите 4 - для добавления товара в корзину\n" +
                            "Нажмите 2 - для возврата в каталог\n" +
                            "Нажмите 0 - для выхода");
                    choice = sc.nextInt();

                    break;


                case 5:
                    System.out.println("Сортировка протектор(защита) по цене:");
                    store.sortEquip(equipment);
                    for (Equipment equip : equipment) {
                        if (equip.getProductName().equals("Протектор(защита)")) {
                            System.out.println("Товар: " + equip.getProductName() + " / " + "(артикул) - " + equip.getArticle() + " (уровень защиты) - " + equip.getLevelOfProtection() + " / " + "(размер) - " + equip.getSize() + " / " + equip.getPrice() + " byn " + " - добавлен в корзину");
                        }
                    }
                    System.out.println("Выберите следующее действие: \n" +
                            "Нажмите 4 - для добавления товара в корзину\n" +
                            "Нажмите 2 - для возврата в каталог\n" +
                            "Нажмите 0 - для выхода");
                    choice = sc.nextInt();
                    break;

                case 6:
                    System.out.println("Сортировка мотоперчаток по цене:");
                    store.sortEquip(equipment);
                    for (Equipment equip : equipment) {
                        if (equip.getProductName().equals("Мотоперчатки")) {
                            System.out.println("Товар: " + equip.getProductName() + " / " + "(артикул) - " + equip.getArticle() + " (уровень защиты) - " + equip.getLevelOfProtection() + " / " + "(размер) - " + equip.getSize() + " / " + equip.getPrice() + " byn " + " - добавлен в корзину");
                        }
                    }
                    System.out.println("Выберите следующее действие: \n" +
                            "Нажмите 4 - для добавления товара в корзину\n" +
                            "Нажмите 2 - для возврата в каталог\n" +
                            "Нажмите 0 - для выхода");
                    choice = sc.nextInt();
                    break;

                case 7:
                    System.out.println("Сортировка мотоБот по цене:");
                    store.sortEquip(equipment);
                    for (Equipment equip : equipment) {
                        if (equip.getProductName().equals("мотоБоты")) {
                            System.out.println("Товар: " + equip.getProductName() + " / " + "(артикул) - " + equip.getArticle() + " (уровень защиты) - " + equip.getLevelOfProtection() + " / " + "(размер) - " + equip.getSize() + " / " + equip.getPrice() + " byn " + " - добавлен в корзину ");
                        }
                    }
                    System.out.println("Выберите следующее действие: \n" +
                            "Нажмите 4 - для добавления товара в корзину\n" +
                            "Нажмите 2 - для возврата в каталог\n" +
                            "Нажмите 0 - для выхода");
                    choice = sc.nextInt();
                    break;

                case 17:
                    System.out.println("Сортировка наколенников по цене:");
                    store.sortEquip(equipment);
                    for (Equipment equip : equipment) {
                        if (equip.getProductName().equals("Наколенники")) {
                            System.out.println(equip.getProductName() + " / " + "(артикул) - " + equip.getArticle() + " (уровень защиты) - " + equip.getLevelOfProtection() + " / " + "(размер) - " + equip.getSize() + " / " + equip.getPrice() + " byn ");
                        }
                    }
                    System.out.println("Выберите следующее действие: \n" +
                            "Нажмите 4 - для добавления товара в корзину\n" +
                            "Нажмите 2 - для возврата в каталог\n" +
                            "Нажмите 0 - для выхода");
                    choice = sc.nextInt();
                    break;

                case 18:
                    System.out.println("Сортировка курток по цене:");
                    store.sortEquip(equipment);
                    for (Equipment equip : equipment) {
                        if (equip.getProductName().equals("Куртка")) {
                            System.out.println("Товар: " + equip.getProductName() + " / " + "(артикул) - " + equip.getArticle() + " (уровень защиты) - " + equip.getLevelOfProtection() + " / " + "(размер) - " + equip.getSize() + " / " + equip.getPrice() + " byn " + " - добавлен в корзину");
                        }
                    }
                    System.out.println("Выберите следующее действие: \n" +
                            "Нажмите 4 - для добавления товара в корзину\n" +
                            "Нажмите 2 - для возврата в каталог\n" +
                            "Нажмите 0 - для выхода");
                    choice = sc.nextInt();
                    break;

                case 19:
                    System.out.println("Сортировка шлемов по цене:");
                    store.sortEquip(equipment);
                    for (Equipment equip : equipment) {
                        if (equip.getProductName().equals("Шлем")) {
                            System.out.println("Товар: " + equip.getProductName() + " / " + "(артикул) - " + equip.getArticle() + " (уровень защиты) - " + equip.getLevelOfProtection() + " / " + "(размер) - " + equip.getSize() + " / " + equip.getPrice() + " byn " + " - добавлен в корзину");
                        }
                    }
                    System.out.println("Выберите следующее действие: \n" +
                            "Нажмите 4 - для добавления товара в корзину\n" +
                            "Нажмите 2 - для возврата в каталог\n" +
                            "Нажмите 0 - для выхода");
                    choice = sc.nextInt();
                    break;
            }

        }
    }
}

class NotFound extends Exception {
    // Parameterless Constructor
    public NotFound() {
    }

    // Constructor that accepts a message
    public NotFound(String message) {
        super(message);
    }
}

