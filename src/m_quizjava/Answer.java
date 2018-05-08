/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package m_quizjava;

import javax.xml.bind.annotation.XmlElement;

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

    public Answer() {
    }
    
    @XmlElement
    public String getAnswerString() {
        return answerString;
    }

    @XmlElement
    public boolean isCorrect() {
        return correct;
    }

    public void setAnswerString(String answerString) {
        this.answerString = answerString;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    
    
    
    
}
