package com.project.model;

import com.project.model.Enums.Status;

import java.time.Instant;
import java.util.Optional;

public class Task {

    private final Integer id;
    private String description;
    private Status status;
    private final Instant createdAt;
    private Instant updatedAt;

    public Task(String description, Optional<Integer> currentId) {
        this.updatedAt = Instant.now();
        this.createdAt = Instant.now();
        this.status = Status.todo;
        this.description = description;
        this.id = createId(currentId);
    }

    private Integer createId(Optional<Integer> currentId){
        return currentId.orElse(1);
    }


    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

}
