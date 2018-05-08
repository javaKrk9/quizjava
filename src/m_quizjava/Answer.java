/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package m_quizjava;

/**
 *
 * @author Mikołaj
 */
public class Answer {
    
    private String answerString;
    private boolean correct;

    public Answer(String answerString, boolean correct) {
        this.answerString = answerString;
        this.correct = correct;
    }

    public String getAnswerString() {
        return answerString;
    }

    public boolean isCorrect() {
        return correct;
    }

    
    
    
    
}
