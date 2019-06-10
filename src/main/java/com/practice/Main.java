package com.practice;

import org.springframework.expression.spel.ast.MethodReference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

interface Dog{
    void eat();
}
interface Messageable{
    Message getMessage(String str);
}

class Message{
    public Message(String msg){
        System.out.println(msg);
    }
}
class Adder{
    public static double add(double a,double b){
        return a+b;
    }

    public  int add2(int a,int b){
        return a+b;
    }
    public static float add3(int a,float b){
        return a+b;
    }
    public double add5(int a,double b){
        return a+b;
    }
}


public class Main {
    public  static void dogEating(){
        System.out.println("dog is eating chicken");
    }


    public static void main(String[] arg){
        System.out.println("hello friends chai pilop");

        List<String> list=new ArrayList<>();
        list.add("aditya");
        list.add("raj");
        list.add("ravi");
        list.add("noah wheeler");
        list.forEach(name-> System.out.println(name));
        System.out.println("hdhjdhdhdjkhdhkdhdddddd");
        list.forEach(System.out::println);






        Messageable messageable=Message::new;
        messageable.getMessage("adityasddfdfdfdfdfdfdfdfdd");







        BiFunction<Double,Double,Double> adde2=Adder::add;
        double result2=adde2.apply(10.9, 45.0);
        BiFunction<Integer,Float,Float> add4=Adder::add3;
        System.out.println(result2);
        float flu=add4.apply(10,12f);
        System.out.println(flu);
        BiFunction<Integer,Integer,Integer> fkk=new Adder()::add2;
        System.out.println(fkk.apply(12,22));







//        Main main=new Main();
//        Dog dog=main::dogEating;
        //calling interface method
      //  dog.eat();
        Runnable runnable=Main::dogEating;
        Thread thread=new Thread(runnable);
        thread.start();

    }
}
