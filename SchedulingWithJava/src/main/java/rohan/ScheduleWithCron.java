package rohan;

import org.springframework.scheduling.annotation.Scheduled;

public class ScheduleWithCron {

	@Scheduled(cron = "0 30 15 * * ?")
	public void doSomething() {
		System.out.println("Printing a scheduled job");
	}
}