/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package c_quizjava;

import m_quizjava.Question;
import m_quizjava.Questions;
import m_quizjava.Settings;

/**
 *
 * @author Mikołaj
 */
public class ApplicationManager {
    
    
    private Questions questions;
    private Settings settings;
    
    
    public ApplicationManager()
    {
        
    }
    
    public void loadQuestions()
    {
        //unmarshall questions
    }
    
    public void saveQuestions()
    {
        //marshall questions
    }
    
    public Question getQuestion()
    {
        return questions.getQuestion();
    }
    
    public void loadSettings()
    {
        //unmarshall settings
    }
    
    public void saveSettings()
    {
        //marshall settings
    }
    
}
