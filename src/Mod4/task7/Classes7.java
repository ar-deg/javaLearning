package Mod4.task7;

import java.util.Scanner;

/*
Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади, периметра
и  точки пересечения медиан.
 */
public class Classes7 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(-2, 0, 4, 0, 0, 3);
        if (triangle.triangleRule()) {
            System.out.println("Треугольник сущестсвует");
            System.out.println("Площадь треугольника = " + triangle.findArea());
            System.out.println("Периметр треугольника = " + triangle.findPerimetr());
            System.out.println("Точки пересечения медиан по x = " + triangle.getMedianIntersectionX());
            System.out.println("Точки пересечения медиан по y = " + triangle.getMedianIntersectionY());
        }


    }
}
