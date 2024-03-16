package com.project.scheduler;

import org.springframework.boot.autoconfigure.batch.BatchProperties;

import java.util.Date;

public class ScheduleTask implements BatchProperties.Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        // Logic for the scheduled task
        System.out.println("Scheduled task executed at: " + new Date());

        // You can include any business logic here, such as sending reminders, processing data, etc.
    }
}
