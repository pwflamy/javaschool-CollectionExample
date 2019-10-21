package com.sbt.collections_api.examples;

import com.sbt.collections_api.Person;
import com.sbt.collections_api.PersonFirstLoad;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Example6_TreeSet {
    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();
        System.out.println("-1.--------------------------------");
        // инициализируйте вызовом PersonFirstLoad.init()
        // выведите содержимое вызовом PersonFirstLoad.print()
        // проанализируйте порядок элементов
        PersonFirstLoad.init(persons);
        PersonFirstLoad.print(persons);

        System.out.println("-2.--------------------------------");
        // сформируйте новый объект TreeSet, с использованием внешнего Comparator,
        // который будет сортировку в обратном естественному порядке
        // инициализируйте вызовом PersonFirstLoad.init(persons)
        // последовательно извлеките все элементы из PriorityQueue и проанализируйте порядок извлечения
        TreeSet<Person> second = new TreeSet<>(Comparator.reverseOrder());
        PersonFirstLoad.init(second);
        PersonFirstLoad.print(second);
    }
}
