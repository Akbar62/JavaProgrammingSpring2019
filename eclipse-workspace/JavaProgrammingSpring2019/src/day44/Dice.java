package day44;

import java.util.*;


public class Dice {
	public static void main(String[] args) {
		Job job1 = new Job();
		Job job2 = new Job("Java Dev");
		Job job3 = new Job("SDET", "Leidos", 95000);

		System.out.println(job1.toString());
		System.out.println(job2.toString());
		System.out.println(job3.toString());

		// create a list of jobs
		// add 5 different jobs with title, company, and salary
		ArrayList<Job> jobs = new ArrayList<>();
		jobs.add(job3);
		jobs.add(new Job("Scrum master", "Google", 120000));
		jobs.add(new Job("SDET", "Freddie Mac", 115000));
		jobs.add(new Job("BA", "Apple", 69000));
		jobs.add(new Job("Senior QA Tester", "Delta", 150000));

		System.out.println(jobs.toString());

		// find the highest paying job and print toString for it
		int index = -1;
		double max = 0.0;
		for (int i = 0; i < jobs.size(); i++) {
			if(jobs.get(i).getAnnualSalary() > max) {
				max = jobs.get(i).getAnnualSalary();
				index = i;
			}
		}
		Job bestJob = jobs.get(index);
		System.out.println("Highest salary: "+ bestJob.toString());

	}

}
