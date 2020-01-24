package com.github.eddiem_git;

import org.junit.Test;

public class PersonTest {
    @Test
    public void test1() {
        // given
        // sets name, age, and account balance of new person instance upon construction
        Person eddie = new Person("Eddie", 28, 999999999.99);
        Person kaila = new Person("Kaila", 21, 999999999.99);
        Person leon = new Person("Leon", 26, 99999999.99);

        System.out.println(eddie.getMyName());
        System.out.println(kaila.toString());
        System.out.println(leon.toString());

    }

    public void test2() {
        //given
        //I am going to set the name, age, weight and height off eddie
        Person eddie = new Person()

    }
}
