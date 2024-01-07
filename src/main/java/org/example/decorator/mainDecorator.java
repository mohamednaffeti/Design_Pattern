package org.example.decorator;

public class mainDecorator {

    public static void main (String []args){
        Boisson cafe = new Cafe();
        System.out.println(cafe.getDescription() + " cout " + cafe.cout());


        Boisson cafeCaramel= new Caramel(cafe);
        System.out.println(cafeCaramel.cout());
        System.out.println(cafeCaramel.getDescription());

        cafeCaramel = new Lait(cafeCaramel);
        System.out.println(cafeCaramel.cout());
        System.out.println(cafeCaramel.getDescription());

        cafeCaramel = new Chocolat(cafeCaramel);
        System.out.println(cafeCaramel.cout());
        System.out.println(cafeCaramel.getDescription());

    }
}
