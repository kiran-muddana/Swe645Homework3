package com.hw.survey01.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hw.survey01.exception.ResourceNotFoundException;
import com.hw.survey01.model.Survey;
import com.hw.survey01.repository.SurveyRepository;
import com.hw.survey01.service.SurveyService;

@Service
public class SurveyServiceImpl implements SurveyService {
	
	public SurveyRepository surveyRepository;
	
	public SurveyServiceImpl(SurveyRepository surveyRepository) {
		super();
		this.surveyRepository = surveyRepository;
	}

	@Override
	public Survey saveSurvey(Survey survey) {
		return surveyRepository.save(survey);
	}

	@Override
	public List<Survey> getAllSurveys() {
		return surveyRepository.findAll();
	}

	@Override
	public Survey getSurveyById(long id) {
        return surveyRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Survey", "Id", id));
	}

	@Override
	public Survey updateSurvey(Survey survey, long id) {
        Survey existingSurvey = surveyRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Survey", "Id", id));
        existingSurvey.setFirstName(survey.getFirstName());
        existingSurvey.setLastName(survey.getLastName());
        existingSurvey.setStreetAddress(survey.getStreetAddress());
        existingSurvey.setCity(survey.getCity());
        existingSurvey.setState(survey.getState());
        existingSurvey.setZip(survey.getZip());
        existingSurvey.setTelephoneNumber(survey.getTelephoneNumber());
        existingSurvey.setEmail(survey.getEmail());
        existingSurvey.setDateOfSurvey(survey.getDateOfSurvey());
        existingSurvey.setLikedMost(survey.getLikedMost());
        existingSurvey.setInterestedInUniversity(survey.getInterestedInUniversity());
        existingSurvey.setRecommendLikelihood(survey.getRecommendLikelihood());
        return surveyRepository.save(existingSurvey); 
	}

	@Override
	public void deleteSurvey(long id) {
		surveyRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Survey", "Id", id));
		surveyRepository.deleteById(id);		
	}

}
