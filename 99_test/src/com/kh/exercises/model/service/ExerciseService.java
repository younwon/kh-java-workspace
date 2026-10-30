package com.kh.exercises.model.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.naming.NameNotFoundException;

import com.kh.exercises.NotFoundException;
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
	
	public List<Exercise> readExercise() {
		return new ArrayList<Exercise>(exercises);
	}
	
	public void save(Exercise exercise) {
		exercises.add(exercise);
	}
	
	public void delete(String name)  {
		for (int i = 0; i < exercises.size(); i++) {
			if (name.equals(exercises.get(i).getExerciseName())) {
				exercises.remove(i);
				return;
			}
		}
		throw new NotFoundException("해당하는 기록이 없습니다");
		
	}
	
	public List<Exercise> findByTarget(String name) {
		List<Exercise> list = exercises.stream().filter(s -> s.getExerciseName().equals(name)).toList();
		return list;
	}
	
	public void updateReps(String name, int reps) {
		for (Exercise exercise : exercises) {
			if (name.equals(exercise.getExerciseName())) {
				exercise.setReps(reps);
				return;
			}
		}
		throw new NotFoundException("해당하는 기록이 없습니다");
	}
	
	public int totalWeight() {
		int sum = 0;
		for (Exercise exercise : exercises) {
			sum += exercise.getWeight();
		}
		return sum;
	}
	
	public void clearHistory() {
	
	}
	

}
