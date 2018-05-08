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
public class Question {
    
    private String questionString;
    private Answer[] answerList;
    private Integer questionID;
    private int attemptsOnThisQuestion;
    private int successfulAttemptsOnThisQuestion;
    
//    public Question(String questionString, Answer[] answerList, int questionID, int attemptsOnThisQuestion, int successfulAttemptsOnThisQuestion) {
//        this.questionString = questionString;
//        this.answerList = answerList;
//        this.questionID = questionID;
//        this.attemptsOnThisQuestion = attemptsOnThisQuestion;
//        this.successfulAttemptsOnThisQuestion = successfulAttemptsOnThisQuestion;
//    }
//
//    private Question(Builder builder) {
//        this.questionString = builder.questionString;
//        this.answerList = builder.answerList;
//        this.questionID = builder.questionID;
//        this.attemptsOnThisQuestion = builder.attemptsOnThisQuestion;
//        this.successfulAttemptsOnThisQuestion = builder.successfulAttemptsOnThisQuestion;
//    }

    public Question() {
    }
    
    @XmlElement
    public String getQuestionString() {
        return questionString;
    }
    
    @XmlElement
    public Answer[] getAnswerList() {
        return answerList;
    }

    @XmlElement
    public Integer getQuestionID() {
        return questionID;
    }

    @XmlElement
    public int getAttemptsOnThisQuestion() {
        return attemptsOnThisQuestion;
    }

    @XmlElement
    public int getSuccessfulAttemptsOnThisQuestion() {
        return successfulAttemptsOnThisQuestion;
    }

    public void setQuestionString(String questionString) {
        this.questionString = questionString;
    }

    public void setAnswerList(Answer[] answerList) {
        this.answerList = answerList;
    }

    public void setQuestionID(Integer questionID) {
        this.questionID = questionID;
    }

    public void setAttemptsOnThisQuestion(int attemptsOnThisQuestion) {
        this.attemptsOnThisQuestion = attemptsOnThisQuestion;
    }

    public void setSuccessfulAttemptsOnThisQuestion(int successfulAttemptsOnThisQuestion) {
        this.successfulAttemptsOnThisQuestion = successfulAttemptsOnThisQuestion;
    }

    public void incrementAttemptsOnThisQuestion() {
        this.attemptsOnThisQuestion++;
    }

    public void incrementSuccessfulAttemptsOnThisQuestion() {
        this.successfulAttemptsOnThisQuestion++;
    }

    @Override
    public String toString() {
        return questionID +". " + questionString ;
    }
  
        
  public static NeedID builder() {
    return new Builder();
  }
    
    public static class Builder implements NeedID, NeedQuestionString, NeedAnswer1, NeedAnswer2, NeedAnswer3, NeedAnswer4, 
            NeedAnswer5, NeedAnswer6, NeedAttemptsOnThisQuestion, NeedSuccessfulAttemptsOnThisQuestion, CanBeBuild
    {
        private String questionString;
        private Answer[] answerList;
        private int questionID;
        private int attemptsOnThisQuestion;
        private int successfulAttemptsOnThisQuestion;
    
        public Builder()
        {
            answerList = new Answer[6];
        }
        
        @Override
        public Builder addID(int questionID)
        {
            this.questionID = questionID;
            return this;
        }
        
        @Override
        public Builder addQuestionString(String questionString)
        {
            this.questionString=questionString;
            return this;
        }
        
        @Override
        public Builder addAnswer1(String answerString, boolean correct)
        {
            this.answerList[0]= new Answer(answerString, correct);
            return this;
        }
        
        @Override
        public Builder addAnswer2(String answerString, boolean correct)
        {
            this.answerList[1]= new Answer(answerString, correct);
            return this;
        }
        
        @Override
        public Builder addAnswer3(String answerString, boolean correct)
        {
            this.answerList[2]= new Answer(answerString, correct);
            return this;
        }
        
        @Override
        public Builder addAnswer4(String answerString, boolean correct)
        {
            this.answerList[3]= new Answer(answerString, correct);
            return this;
        }
        
        @Override
        public Builder addAnswer5(String answerString, boolean correct)
        {
            this.answerList[4]= new Answer(answerString, correct);
            return this;
        }
        
        @Override
        public Builder addAnswer6(String answerString, boolean correct)
        {
            this.answerList[5]= new Answer(answerString, correct);
            return this;
        }
        
        @Override
        public Builder addAttemptsOnThisQuestion(int attemptsOnThisQuestion)
        {
            this.attemptsOnThisQuestion = attemptsOnThisQuestion;
            return this;
        }
        
        @Override
        public Builder addSuccessfulAttemptsOnThisQuestion(int successfulAttemptsOnThisQuestion)
        {
            this.successfulAttemptsOnThisQuestion = successfulAttemptsOnThisQuestion;
            return this;
        }
        
        @Override
        public Question build() 
        {
            Question question = new Question();
            question.questionString = this.questionString;
            question.answerList = this.answerList;
            question.questionID = this.questionID;
            question.attemptsOnThisQuestion = this.attemptsOnThisQuestion;
            question.successfulAttemptsOnThisQuestion = this.successfulAttemptsOnThisQuestion;
            return question;
        }
        
    }

  public interface NeedID {
    public NeedQuestionString addID(int id);
  }
  
  public interface NeedQuestionString{
    public NeedAnswer1 addQuestionString(String questionString);
  }
    
  public interface NeedAnswer1{
    public NeedAnswer2 addAnswer1(String answerString, boolean correct);
  }
  
  public interface NeedAnswer2{
    public NeedAnswer3 addAnswer2(String answerString, boolean correct);
  }
  
  public interface NeedAnswer3{
    public NeedAnswer4 addAnswer3(String answerString, boolean correct);
  }
  
  public interface NeedAnswer4{
    public NeedAnswer5 addAnswer4(String answerString, boolean correct);
  }
  
  public interface NeedAnswer5{
    public NeedAnswer6 addAnswer5(String answerString, boolean correct);
  }
  
  public interface NeedAnswer6{
    public NeedAttemptsOnThisQuestion addAnswer6(String answerString, boolean correct);
  }
  
  public interface NeedAttemptsOnThisQuestion{
    public NeedSuccessfulAttemptsOnThisQuestion addAttemptsOnThisQuestion(int attemptsOnThisQuestion);
  }
  
  public interface NeedSuccessfulAttemptsOnThisQuestion{
    public CanBeBuild addSuccessfulAttemptsOnThisQuestion(int successfulAttemptsOnThisQuestion);
  }
  
  public interface CanBeBuild{
    public Question build();
  }
  
  
}
