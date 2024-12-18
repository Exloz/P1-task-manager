package com.project.repository.utils;

import com.project.model.Task;

import java.util.Optional;

public class CreateId {

    public static Integer execute(){
        Optional<Task> lastTask = jsonRepository.GetLastTask();
        return (lastTask.isPresent()) ? lastTask.get().getId() + 1 : 1;
    }
}
