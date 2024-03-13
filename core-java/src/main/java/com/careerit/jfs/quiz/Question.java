package com.careerit.jfs.quiz;

import java.util.List;

public class Question {

    private int qno;
    private String question;
    private List<String> options;
    private int answer;

    public Question(int qno, String question, List<String> options, int answer) {
        this.qno = qno;
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public int getQno() {
        return qno;
    }

    public void setQno(int qno) {
        this.qno = qno;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
