package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/*

0515 Инициализация объектов
Изучи внимательно класс Person.
Исправь класс так, чтобы только один метод initialize инициализировал все переменные класса Person.

Требования:
1. Программа не должна считывать данные с клавиатуры.
2. У класса Person должно быть 5 переменных.
3. У класса должен быть один метод initialize.
4. Метод initialize должен иметь пять параметров.


*/

// public class Person
public class Main {

    String name;
    char sex;
    int money;
    int weight;
    double size;

    public void initialize(String name, char sex, int money, int weight, double size) {
        this.name = name; this.sex = sex; this.money = money; this.weight = weight; this.size = size;
    }
    
    public static void main(String[] args) {
    }
}




