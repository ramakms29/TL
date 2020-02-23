package com.raki.dao;

import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import org.springframework.stereotype.Repository;

@Repository
public class QuestionsDaoImpl implements QuestionsDao{
    private Properties questions;
    private String questionsLocation = "/datastore/questions.xml";

    public QuestionsDaoImpl() throws InvalidPropertiesFormatException, IOException {
        questions = new Properties();
        questions.loadFromXML(this.getClass().getResourceAsStream(questionsLocation));
    }

    @Override
    public String getQuestion(String questionId) {
        return this.questions.getProperty(questionId);
    }

}
