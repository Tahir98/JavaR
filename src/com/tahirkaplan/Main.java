package com.tahirkaplan;

public class Main {
    int x;

    public static void main(String[] args){
        System.out.println("Git Projesi");


        Main main = new Main();
        main.create();
    }


    public void create() {
        System.out.println("Create çalıştı");
        x = 15;
        System.out.println("x:"+x);
    }
}
