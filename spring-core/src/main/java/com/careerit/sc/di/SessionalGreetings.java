package com.careerit.sc.di;

public class SessionalGreetings  implements GreetingService{
    @Override
    public String greet(String name) {
        return String.format("Dear %s, Wish you all the best for your exams", name);
    }
}
