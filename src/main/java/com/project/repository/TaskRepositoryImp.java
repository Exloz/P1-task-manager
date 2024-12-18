package com.project.repository;

import com.project.model.Task;

import java.util.List;

public class TaskRepositoryImp implements TaskRepository{
    @Override
    public Boolean saveTask(Task task) {

        return null;
    }

    @Override
    public Task updateTask(Task task) {
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
    public Task getTaskById(Integer id) {
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
