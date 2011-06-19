package dinghy.core.model;

import java.util.Collection;

public interface TaskService {
	Task getTask(String id);
	void addTask(Task task);
	Collection<Task> getTasks();
}
