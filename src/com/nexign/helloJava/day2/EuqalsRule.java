package com.nexign.helloJava.day2;

import com.nexign.helloJava.day1.Person;

import java.util.Objects;

public class EuqalsRule {
    public static void main(String[] args) {
        //RULE1 Примитивы сравниваем через ==
        boolean b = 400 == 400;
        //RULE2 Ссылки сравниваем через Equals
        boolean b1 = "one".equals("one");
        //RULE3 Если работаем с кастомным классом для сранвнения нужно добавить equals в этот класс

 /**@Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(salary, person.salary) == 0 && Objects.equals(name, person.name);
    }
 */
        boolean b2 = new Person().equals(new Person());
    }


}
