package com.LambdaLearning;

public class PrintAMessage {

    public static void main(String[] args) {

        Message m1 = () -> System.out.println("Hello Lambda");
        m1.myMessage();
    }
}

@FunctionalInterface
interface Message {
    public void myMessage();

}
