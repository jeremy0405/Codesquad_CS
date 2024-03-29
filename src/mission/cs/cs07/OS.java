package mission.cs.cs07;

import java.util.ArrayList;
import java.util.List;

public class OS {

	public static void main(String[] args) {
		Process processA = new Process(3);
		Process processB = new Process(5);
		Process processC = new Process(7);

		List<Process> processList = new ArrayList<>(List.of(processA, processB, processC));

		Scheduler CPUscheduler = new Scheduler(processList);

		CPUscheduler.start();

		processA = new Process(3, 1);
		processB = new Process(5, 2);
		processC = new Process(7, 3);

		processList = new ArrayList<>(List.of(processA, processB, processC));
		CPUscheduler = new Scheduler(processList);

		CPUscheduler.start();

	}

}
