package com.project.repository;

import com.project.model.Task;

import java.util.List;

public interface TaskRepository {
    Boolean saveTask(Task task);
    Task updateTask(Task task);
    Boolean deleteTask(Integer id);
    Boolean markInProgress(Integer id);
    Boolean markDone(Integer id);
    Task getTaskById(Integer id);
    List<Task> getAllTask();
    List<Task> getByStatusTodo();
    List<Task> getByStatusInProgress();
    List<Task> getByStatusDone();
    Integer getLastId();
}
