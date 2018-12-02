package com.tahirkaplan;

public class Main implements Launcher {

    public static void main(String[] args){
        System.out.println("Git Projesi");
        int x;

        Main main = new Main();
        main.create();
    }

    @Override
    public void create() {
        System.out.println("Create çalıştı");
    }
}
