package com.tahirkaplan;

public class Main implements Launcher {
    int x;


    public static void main(String[] args){
        System.out.println("Git Projesi");


        Main main = new Main();
        main.create();
    }

    @Override
    public void create() {
        System.out.println("Create çalıştı");
        x = 15;
    }
}
