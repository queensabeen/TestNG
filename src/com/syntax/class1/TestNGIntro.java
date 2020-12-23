package com.syntax.class1;

import org.testng.annotations.Test;

public class TestNGIntro {
    //TestNG is annotation based framework. Do not need main method

    @Test
    public void hello() {
        System.out.println("Hello");
    }

    @Test
    public void sayBye() {
        System.out.println("Bye");
    }

    @Test
    public void howAreYou() {
        System.out.println("How are you?");
    }

}
