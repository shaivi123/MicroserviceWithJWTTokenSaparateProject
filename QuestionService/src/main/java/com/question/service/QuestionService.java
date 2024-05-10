package com.question.service;

import com.question.entity.Question;
import com.question.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepo questionRepo;

    public Question save(Question question){
        return questionRepo.save(question);
    }

    public List<Question> getAll(){
        return questionRepo.findAll();
    }

    public Question getById(Long id){
        return questionRepo.findById(id).orElseThrow(() -> new RuntimeException("Question Not found!"));
    }

    public List<Question> getQuestionsOfQuiz(Long quizId){
        return questionRepo.findByQuizId(quizId);
    }
}
