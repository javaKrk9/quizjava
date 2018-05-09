/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package c_quizjava;

/**
 *
 * @author Mikołaj
 */
public class QuizLogic {
    
    private QuestionManager questionManager;
    private SettingsManager settingsManager;
    private StatisticsManager statisticsManager;

    public QuizLogic() 
    {
        initQuestionManager();
        initSettingsManager();
        initStatisticsManager();
    }

    private void initQuestionManager()
    {
        questionManager = new QuestionManager();
        questionManager.loadQuestions();
    }
    
    private void initSettingsManager()
    {
        settingsManager = new SettingsManager();
        //settingsManager.loadSettings();
    }
     
    private void initStatisticsManager()
    {
        statisticsManager = new StatisticsManager();
        //statisticsManager.loadStatistics();
    }
    
    public QuestionManager getQuestionManager() {
        return questionManager;
    }

    public void setQuestionManager(QuestionManager questionManager) {
        this.questionManager = questionManager;
    }

    public SettingsManager getSettingsManager() {
        return settingsManager;
    }

    public void setSettingsManager(SettingsManager settingsManager) {
        this.settingsManager = settingsManager;
    }

    public StatisticsManager getStatisticsManager() {
        return statisticsManager;
    }

    public void setStatisticsManager(StatisticsManager statisticsManager) {
        this.statisticsManager = statisticsManager;
    }
    
    
    
    
    
    
}
