package com.yin.service;

public class test {
    public static void main(String[] args) {

        Food before = new Before().get();
        Food after  = new After().get();
        System.out.println(before.getClass().getName());
        System.out.println(after.getClass().getName());
        System.out.println(before.getClass().getSuperclass().getName());
    }
}
