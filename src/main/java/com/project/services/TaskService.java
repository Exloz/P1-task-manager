package com.project.services;

import com.project.model.Task;
import com.project.repository.TaskRepository;
import com.project.repository.utils.CreateId;

public class TaskService {

    private final TaskRepository repository;
    public static final String SAVE_OK = "Task created and save correctly.";
    public static final String SAVE_ERROR = "Error trying to save Task, try again.";

    public static final String UPDATE_OK = "Task updated correctly.";
    public static final String UPDATE_NULL = "Failed to update the task, check if description is correct,";

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public String CreateTask(String description){
        Integer id= CreateId.execute();
        Task task = new Task(description, id);
        return ( repository.saveTask(task) ) ? SAVE_OK : SAVE_ERROR;
    }

    public String UpdateTask(Integer id, String description){
        Task task = repository.getTaskById(id);
        if (description.isBlank() || description.isEmpty()) {
            repository.updateTask(task);
            return UPDATE_NULL;
        }
        task.setDescription(description);
        repository.updateTask(task);
        return UPDATE_OK;
    }



}
