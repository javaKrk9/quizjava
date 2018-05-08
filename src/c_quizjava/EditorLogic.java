/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package c_quizjava;

import java.util.ArrayList;
import java.util.Collections;
import m_quizjava.Question;

/**
 *
 * @author Mikołaj
 */
public class EditorLogic {
    
    private QuestionManager questionManager;

    public EditorLogic(QuestionManager questionManager) {
        this.questionManager = questionManager;
    }

    public EditorLogic() {
        this.questionManager = new QuestionManager();
    }
    
    public boolean addQuestion(Question question){
        questionManager.addQuestion(question);
        return saveQuestion();
    }
    
    public ArrayList<Question> getQuestionList(){
        return questionManager.getQuestions();
    }
    
    public int getFirstFreeIDNumber()
    {
        ArrayList<Question> questions = questionManager.getQuestions();
        Collections.sort(questions, (a, b) -> a.getQuestionID() < b.getQuestionID() ? -1 : a.getQuestionID() == b.getQuestionID() ? 0 : 1);
        for(int i=0; i< questions.size(); i++)
        {
            if(questions.get(i).getQuestionID()!=i+1)
            {
                return ++i;
            }
        }
        return questions.size()+1;
    }
    
    public Question getQuestionByID(int id){
        return questionManager.getQuestionByID(id);
    }
    
    public boolean saveQuestion()
    {
        return questionManager.saveQuestions();
    }
    
    public boolean loadQuestions()
    {
        return questionManager.loadQuestions();
    }
    
}
