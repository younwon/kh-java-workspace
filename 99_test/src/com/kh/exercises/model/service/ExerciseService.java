package com.kh.exercises.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.exercises.model.dto.Exercise;

public class ExerciseService {
	private List<Exercise> exercises = new ArrayList<Exercise>();
	
	{
		exercises.add(new Exercise("Bench Press", 60, 10, "Chest"));
		exercises.add(new Exercise("Squat", 80, 8, "Legs"));
		exercises.add(new Exercise("Lat Pulldown", 45, 12, "Back"));
		exercises.add(new Exercise("Overhead Press", 35, 10, "Shoulders"));
		exercises.add(new Exercise("Bicep curl", 12, 15, "Arms"));
	}
	
	public void readExercise() {
		
	}
	
	public void save() {
		
	}
	
	public void delete() {
		
	}
	
	public void findByTarget() {
		
	}
	
	public void updateReps() {
		
	}
	
	public void totalReps() {
		
	}
	
	public void clearHistory() {
	
	}
	

}
