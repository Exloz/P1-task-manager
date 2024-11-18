package com.project.repository;

import com.project.model.Task;

import java.util.List;

public class TaskRepositoryImp implements TaskRepository{
    @Override
    public Task createTask() {
        return null;
    }

    @Override
    public Task updateTask(Integer id, String description) {
        return null;
    }

    @Override
    public Boolean deleteTask(Integer id) {
        return null;
    }

    @Override
    public Boolean markInProgress(Integer id) {
        return null;
    }

    @Override
    public Boolean markDone(Integer id) {
        return null;
    }

    @Override
    public List<Task> getAllTask() {
        return List.of();
    }

    @Override
    public List<Task> getByStatusTodo() {
        return List.of();
    }

    @Override
    public List<Task> getByStatusInProgress() {
        return List.of();
    }

    @Override
    public List<Task> getByStatusDone() {
        return List.of();
    }

    @Override
    public Integer getLastId() {
        return 0;
    }
}
