package com.hw.survey01.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hw.survey01.model.Survey;
import com.hw.survey01.service.SurveyService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/surveys")
public class SurveyController {
	
	private SurveyService surveyService;

    public SurveyController(SurveyService surveyService) {
    	super();
        this.surveyService = surveyService;
    }

    @PostMapping
    public ResponseEntity<Survey> saveSurvey(@RequestBody Survey survey) {
        Survey createdSurvey = surveyService.saveSurvey(survey);
        return new ResponseEntity<>(createdSurvey, HttpStatus.CREATED);
    }

    @GetMapping
    @CrossOrigin(origins = "http://localhost:8080")
    public List<Survey> getAllSurveys() {
        return surveyService.getAllSurveys();
    }

    @GetMapping("{id}")
    public ResponseEntity<Survey> getSurveyById(@PathVariable("id") long surveyId) {
        Survey survey = surveyService.getSurveyById(surveyId);
        return new ResponseEntity<>(survey, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Survey> updateSurvey(@PathVariable("id") long id, @RequestBody Survey survey) {
        Survey updatedSurvey = surveyService.updateSurvey(survey, id);
        return new ResponseEntity<>(updatedSurvey, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteSurvey(@PathVariable("id") long id) {
        surveyService.deleteSurvey(id);
        return new ResponseEntity<String>("Survey deleted successfully.", HttpStatus.NO_CONTENT);
    }
}
