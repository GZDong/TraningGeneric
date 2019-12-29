package com.gzd.traninggeneric;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyList<String> wrapper = new MyList<>();
        wrapper.add("test");

        Shop<Apple> appleShop = ...;  //interface不能实例化, =new AppleShop()就可以
        AppleShop shop = new AppleShop();

        SimShop<Apple, ChinaUnicom> appleUnicomShop = new AppleUnicomShop();
        AppleUnicomShop shop1 = new AppleUnicomShop();
        SimShop<Apple, ChinaMobile> shop2 = ...;  //Type Parameter, Type Argument
        ChinaMobile sim = shop2.getSim("gzd", "123");

        MyList<Fruit> fruit = new MyList<Apple>(); //这里不是继不继承的报错，而是范围放大的报错
        MyList<Apple> appleMyList = new MyList<>();
        Fruit fruit1 = new Banana();
        appleMyList.add(fruit1);
        fruit.add(fruit1); //这里就出错了

        MyList<? extends Fruit> fruits = new MyList<Apple>(); //MyList<T> ?是对T的限制，用于形参
                                                               //这里方框了范围
        Fruit fruit2 = new Banana();
        Apple apple = new Apple();
        fruits.add(fruit2);
        fruits.add(apple);
        //这才是?的作用
        fruits = new MyList<Banana>();
        //这2个的区别是，前者通过类继承扩大了范围，后者通过泛型限制扩大了范围
        MyList<Fruit> fruit11 = new MyList<Apple>();
        MyList<? extends Fruit> fruits22 = new MyList<Apple>();

        List<Fruit> fruits1 = new ArrayList<>();
        fruit.add(new Apple());
        fruit.add(new Banana());
        float sum = totalWeight(fruits1);
        List<Apple> apples = new ArrayList<>();
        float appleWeight = totalWeight(apples);

        Fruit[] fruitsArray = new Apple[];
        fruitsArray[0] = new Apple();
        fruitsArray[1] = new Banana(); // 这里没报错，但是会运行时报错

        List<Fruit> fruits2 = (ArrayList) new ArrayList<Apple>(); //类型擦除，除了泛型的extends，其他会被擦除
        fruits2.add(new Banana());//类型擦除，导致编译能通过

        Eater<Human> monster = new Eater<Human>();
        monster.eat(new Human());
        Eater<Animal> beast = new Eater<Animal>();
        beast.eat(new Animal());
        beast.eat(new Human());

        List<? super Apple> apples2 = new ArrayList<Fruit>();
        Apple apple1 = new Apple();
        List<Apple> lis = new ArrayList<>();
        List<Fruit> fruits3 = new ArrayList<>();
        apple1.addMeToList(lis);
        apple1.addMeToList(fruits3);//super

        //一般不会这么写，一般对于方法进行扩充用的
        List<Fruit> fruits4 = new ArrayList<Apple>();
        List<Apple> apples4 = new ArrayList<Fruit>();
        List<? extends Fruit> fruits5 = new ArrayList<Apple>();  //? extends,super都是用于声明
        List<? super Apple> apples5 = new ArrayList<Fruit>();
    }

    public float totalWeight(List<? extends Fruit> fruits) {
        float weight = 0;
        for (Fruit fruit: fruits) {
            weight += fruit.weight();
            fruit.add(); //有泛型参数的方法都不能用了，因为?
        }
        return weight;
    }
}
