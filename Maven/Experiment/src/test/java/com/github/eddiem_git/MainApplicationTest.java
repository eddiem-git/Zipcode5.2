package com.github.eddiem_git;

public class MainApplicationTest {
    public static void main(String[] deafultArgumentsInMainMethod) {
        Runnable runnable = () -> {
            String[] args = "Hey world look at this go!".split(" ");
            for (int j = 0; j < args.length; j++) {
                String arg = args[j];
                System.out.println(arg);
            }
            System.out.println();
        };
    }


    public static void strangeBehavior(Runnable runnable, int numberOfIterations) {
        for (int i = 0; i <numberOfIterations; i++) {
            runnable.run();
        }
    }
}
