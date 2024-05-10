package com.quiz.service;

import com.quiz.entity.Quiz;
import com.quiz.repository.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizService {

    @Autowired
    private QuizRepo quizRepo;
    @Autowired
    private QuestionClient questionClient;

    public Quiz save(Quiz quiz){
        return quizRepo.save(quiz);
    }
    public List<Quiz> get(){
       List<Quiz> quizz= quizRepo.findAll();
      List<Quiz> newQuizList = quizz.stream().map(quiz -> {
           quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getId()));
           return quiz;
       }).collect(Collectors.toList());
        return newQuizList;
    }

    public Quiz getById(Long id){
        Quiz quiz = quizRepo.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));
        quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getId()));
        return quiz;
    }
}
