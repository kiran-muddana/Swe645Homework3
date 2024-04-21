package com.hw.survey01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hw.survey01.model.Survey;

public interface SurveyRepository extends JpaRepository<Survey, Long>{

}
