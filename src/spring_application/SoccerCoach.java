package spring_application;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {

	@Override
	public String getWorkout() {
		// TODO Auto-generated method stub
		return "Played soccer for 30 minutes";
	}

}
