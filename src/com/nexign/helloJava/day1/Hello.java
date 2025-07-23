package com.nexign.helloJava.day1;

public class Hello {
    //main или psvm
    public static void main(String[] args) {
        //sout

        System.out.println(args[0]);
        System.out.println("hello");

        //Alt+Enter - маг. комбинация
        //Ctrl + D - дублировать строку
        Person p = new Person();
        Person p2 = new Person();


        boolean b = p == p2;
        System.out.println(b);
        System.out.println("Наконец то нормальное сравнение нам выдаст " + p.equals(p2));

        String h = "Hello";
        int f = 100;
        double f1 = 40;
        boolean c = f1 % 2 == 0;
        System.out.println(f/f1);

        System.out.println(f == f1);


        Person p1 = new Person();
        System.out.println(p1.getAge());
        p1.setAge(30);
//        p1.setName("Alex");
//        p1.age = 30;
//        p1.name = "Alex";
//        p1.salary = 1.1;

        double v = p1.calculateSalary(2.);
        System.out.println(v);

        //sout
        System.out.println(Person.count);
        p1.print();
        p2.print();
        String s = p1.talk(" hello there");

        p1.move(300L);

        System.out.println(s.toUpperCase());

    }

}
