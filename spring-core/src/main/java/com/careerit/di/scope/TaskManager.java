package com.careerit.di.scope;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaskManager {

        public List<String> showActiveTasks(){
            return List.of("Task1", "Task2", "Task3");
        }
}
