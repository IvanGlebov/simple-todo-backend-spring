package com.example.todobackend;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
public class TodoItem {

    private static final String[] arr = {"Not started", "In progress", "Done"};
    private static final List<String> statuses = new ArrayList<>(Arrays.asList(arr));

    private @Id
    @GeneratedValue Long id;
    private String name;
    private String description;
    private String status;

    public TodoItem() {
    }

    public TodoItem(String name, String description) {
        this.name = name;
        this.description = description;
        this.status = statuses.get(0);
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getStatus() {
        return this.status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean setStatus(String status) {
        if (status.contains(status)) {
            this.status = status;
            return true;
        } else {
            return false;
        }
    }


}
