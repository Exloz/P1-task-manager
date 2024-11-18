package com.project.repository;

import com.project.model.Task;

import java.util.List;

public interface TaskRepository {
    Task createTask();
    Task updateTask(Integer id, String description);
    Boolean deleteTask(Integer id);
    Boolean markInProgress(Integer id);
    Boolean markDone(Integer id);
    List<Task> getAllTask();
    List<Task> getByStatusTodo();
    List<Task> getByStatusInProgress();
    List<Task> getByStatusDone();
    Integer getLastId();
}
