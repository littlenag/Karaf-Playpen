package dinghy.core.persistence;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import dinghy.core.model.Task;
import dinghy.core.model.TaskService;



public class TaskServiceImpl implements TaskService {
	Map<String, Task> taskMap;
	
	public TaskServiceImpl() {
		taskMap = new HashMap<String, Task>();
		Task task = new Task();
		task.setId("1");
		task.setTitle("Buy coffee");
		task.setDescription("Take the extra strong");
		addTask(task);
		task = new Task();
		task.setId("2");
		task.setTitle("Finish karaf tutorial");
		task.setDescription("Last check and wiki upload");
		addTask(task);
	}
	
	@Override
	public Task getTask(String id) {
		return taskMap.get(id);
	}

	@Override
	public void addTask(Task task) {
		taskMap.put(task.getId(), task);
	}

	@Override
	public Collection<Task> getTasks() {
		return taskMap.values();
	}

}
