package com.careerit.jfs.quiz;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class QuizService {

    private List<Question> questions;
    public QuizService() {
        //String fileName = "/java_questions.json";
        this.questions = QuizUtil.getQuestions();
    }

    public void startQuiz(String userName) throws InterruptedException {

        System.out.println("Welcome to the quiz : " + userName);
        System.out.println("-------------------------------------------------");
        System.out.println("Please wait for the quiz to start....");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Total questions : " + questions.size());
        Scanner sc = new Scanner(System.in);
        int qno = 1;
        int score = 0;
        for (Question question : questions) {
            System.out.println("Q" + qno + ") " + question.getQuestion());
            List<String> options = question.getOptions();
            for (int i = 0; i < options.size(); i++) {
                System.out.println("\t"+(i + 1) + ". " + options.get(i));
            }
            System.out.println("Enter the option :");
            int answer = sc.nextInt();
            if (answer == question.getAnswer()) {
                score++;
            }
            qno++;
        }
        System.out.println("Please wait for the result....");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Total questions : " + questions.size());
        System.out.println("Correct answers : " + score);
        System.out.println("Wrong answers   : " + (questions.size() - score));
    }
}
