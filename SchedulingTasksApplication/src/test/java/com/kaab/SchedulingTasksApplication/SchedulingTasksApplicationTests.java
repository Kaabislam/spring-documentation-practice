package com.kaab.SchedulingTasksApplication;

import org.awaitility.Durations;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import java.time.Duration;

import static org.awaitility.Awaitility.await;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;

@SpringBootTest
class SchedulingTasksApplicationTests {
	@SpyBean
	ScheduledTasks tasks;

	@Test
	public void reportCurrentTime() {
		await().atMost(Durations.TEN_SECONDS)
				.untilAsserted(()->{
					verify(tasks,atLeast(2))
							.reportCurrentTime();
				});
	}

}
