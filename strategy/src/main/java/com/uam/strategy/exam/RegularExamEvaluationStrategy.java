package com.uam.strategy.exam;

import java.util.Map;

public class RegularExamEvaluationStrategy implements EvaluationStrategy {

    public Grade evaluate(Map<ExamQuestion, ExamAnswer> answers) {
        int goodAnswers = 0;
        for (Map.Entry<ExamQuestion, ExamAnswer> entry : answers.entrySet()){
            if(entry.getKey().getCorrectAnswer().equals(entry.getValue())){
                goodAnswers++;
            }
        }
        return goodAnswers > answers.size()/2 ? Grade.A : Grade.B;
    }


}
