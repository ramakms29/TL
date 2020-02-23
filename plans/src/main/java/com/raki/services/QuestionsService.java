package com.raki.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raki.dao.QuestionsDao;

@Service
public class QuestionsService {
    @Autowired
    QuestionsDao questions;
    
    public String getQuestion(String questionId) {
        return this.questions.getQuestion("q"+questionId);
    }
    
}
