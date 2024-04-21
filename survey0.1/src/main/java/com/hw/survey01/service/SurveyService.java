package com.hw.survey01.service;

import java.util.List;

import com.hw.survey01.model.Survey;

public interface SurveyService {
	Survey saveSurvey(Survey survey);

    List<Survey> getAllSurveys();

    Survey getSurveyById(long id);

    Survey updateSurvey(Survey survey, long id);

    void deleteSurvey(long id);

}
