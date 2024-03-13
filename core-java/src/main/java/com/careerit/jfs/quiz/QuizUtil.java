package com.careerit.jfs.quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuizUtil {


    public static List<Question> loadQuestionsFromFile(String fileName){
        return null;
    }

    public static List<Question> getGKQuestions() {
        Question q1 = new Question(1,
                "What is the capital of India?",
                List.of("Delhi", "Mumbai", "Kolkata", "Chennai"), 1);
        Question q2 = new Question(2, "What is the capital of Telangana?",
                List.of("Nizamabad", "Hyderabad", "Warangal", "Karimnagar"), 1);
        Question q3 = new Question(3, "What is the capital of Andhra Pradesh?",
                List.of("Vijayawada", "Vishakapatnam", "Amaravati", "Kurnool"), 3);
        Question q4 = new Question(4, "What is the capital of Tamilnadu?",
                List.of("Chennai", "Madurai", "Coimbatore", "Trichy"), 1);
        Question q5 = new Question(5, "What is the capital of Kerala?",
                List.of("Kochi", "Trivandrum", "Kozhikode", "Kannur"), 2);
        return List.of(q1, q2, q3, q4, q5);
    }

    public static List<Question> getJavaQuestions() {
        Question q1 = new Question(1,"Which of the following is not a keyword in Java?",
                List.of("class", "interface", "extends", "abstraction"), 4);
        Question q2 = new Question(2,"Which of the following is not a valid identifier in Java?",
                List.of("abc", "123", "abc123", "abc_123"), 2);
        Question q3 = new Question(3,"Which of the following is not a valid data type in Java?",
                List.of("int", "float", "double", "string"), 4);
        Question q4 = new Question(4,"Which of the following is not a valid access modifier in Java?",
                List.of("public", "protected", "default", "private"), 4);
        Question q5 = new Question(5,"Which of the following is not a valid loop in Java?",
                List.of("for", "while", "do-while", "repeat"), 4);
        return List.of(q1, q2, q3, q4, q5);
    }
    public static List<Question> getQuestions(){
        List<Question> questions = new ArrayList<>();
        questions.addAll(getJavaQuestions());
        questions.addAll(getGKQuestions());
        Collections.shuffle(questions);
        return questions;
    }
}
