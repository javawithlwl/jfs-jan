package com.careerit.jfs.quiz;

public class QuizManager {

    public static void main(String[] args) throws InterruptedException {

        QuizService obj = new QuizService();
        obj.startQuiz("Krish");
    }
}
