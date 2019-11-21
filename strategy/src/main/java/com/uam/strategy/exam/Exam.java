package com.uam.strategy.exam;

import com.google.common.base.Preconditions;

import java.util.List;
import java.util.Map;

public class Exam {

    private List<ExamQuestion> questions;

    private EvaluationStrategy strategy;

    public Exam(List<ExamQuestion> questions, EvaluationStrategy strategy) {
        Preconditions.checkArgument(!questions.isEmpty(), "Exam have to have at least one question.");
        this.questions = questions;
        switchEvaluationStrategy(strategy);
    }

    public List<ExamQuestion> getQuestions() {
        return questions;
    }

    public void switchEvaluationStrategy(EvaluationStrategy strategy) {
        this.strategy = strategy;
    }

    public Grade evaluate(Map<ExamQuestion, ExamAnswer> answers) {
        return this.strategy.evaluate(answers);
    }
}
