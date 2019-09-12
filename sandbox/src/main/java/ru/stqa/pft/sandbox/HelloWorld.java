package ru.stqa.pft.sandbox;

class HelloWorld {

    public static void main(String[] args) {
        hello("World");
        hello("User");
        hello("Kostya");

        Square s = new Square(5);
        Rectangle r = new Rectangle(4,6);

        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
    }

    public static void hello(String somebody){
        System.out.println("Hello, " + somebody + "!");
    }
}

