/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package m_quizjava;

import java.util.ArrayList;

/**
 *
 * @author Mikołaj
 */
public class Question {
    
    private String questionString;
    private ArrayList<Answer> answerList;
    private int questionID;
    private int attemptsOnThisQuestion;
    private int successfulAttemptsOnThisQuestion;
    
    public Question(String questionString, ArrayList<Answer> answerList, int questionID, int attemptsOnThisQuestion, int successfulAttemptsOnThisQuestion) {
        this.questionString = questionString;
        this.answerList = answerList;
        this.questionID = questionID;
        this.attemptsOnThisQuestion = attemptsOnThisQuestion;
        this.successfulAttemptsOnThisQuestion = successfulAttemptsOnThisQuestion;
    }

    public String getQuestionString() {
        return questionString;
    }

    public ArrayList<Answer> getAnswerList() {
        return answerList;
    }

    public int getQuestionID() {
        return questionID;
    }

    public int getAttemptsOnThisQuestion() {
        return attemptsOnThisQuestion;
    }

    public int getSuccessfulAttemptsOnThisQuestion() {
        return successfulAttemptsOnThisQuestion;
    }

    public void incrementAttemptsOnThisQuestion() {
        this.attemptsOnThisQuestion++;
    }

    public void incrementSuccessfulAttemptsOnThisQuestion() {
        this.successfulAttemptsOnThisQuestion++;
    }
    
    
    
    
}
