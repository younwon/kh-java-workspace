package com.kh.exercises.model.dto;

public class Exercise {
	
	private String exerciseName;
	private int weight;
	private int reps;
	private String target;
	
	public Exercise(String exerciseName, int weight, int reps, String target) {
		super();
		this.exerciseName = exerciseName;
		this.weight = weight;
		this.reps = reps;
		this.target = target;
	}

	public String getExerciseName() {
		return exerciseName;
	}

	public void setExerciseName(String exerciseName) {
		this.exerciseName = exerciseName;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getReps() {
		return reps;
	}

	public void setReps(int reps) {
		this.reps = reps;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	@Override
	public String toString() {
		return "Exercise [exerciseName=" + exerciseName + ", weight=" + weight + ", reps=" + reps + ", target=" + target
				+ "]";
	}
	
	
	

}
