/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package c_quizjava;

import java.util.ArrayList;
import m_quizjava.Question;
import m_quizjava.Questions;
import m_quizjava.Settings;

/**
 *
 * @author Mikołaj
 */
public class QuestionManager {
    
    
    private Questions questions;
    
    
    public QuestionManager()
    {
        questions = new Questions(new ArrayList<Question>());
    }
    
    public boolean loadQuestions()
    {
        return this.unmarshallQuestions();
    }
    
    private boolean unmarshallQuestions()
    {
        //unmarshall questions
        return true;
    }
    
    public boolean saveQuestions()
    {
        return marshallQuestions();
    }
    
    private boolean marshallQuestions()
    {
        //marshall questions
        return true;
    }
    
    public Question getRandomQuestion()
    {
        return questions.getQuestion();
    }
    
    public Question getQuestionByID(int id)
    {
        return questions.getQuestionByID(id);
    }
    
    public boolean addQuestion(Question question)
    {
        return questions.addQuestion(question);
    }
    
    public ArrayList<Question> getQuestions()
    {
        return questions.getQuestionList();
    }
}
