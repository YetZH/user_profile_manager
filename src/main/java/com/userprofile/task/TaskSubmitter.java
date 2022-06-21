package com.userprofile.task;

import com.userprofile.bean.TaskProcess;
import com.userprofile.service.TaskSubmitService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class TaskSubmitter implements Runnable {

    TaskProcess taskProcess;

    @Autowired
    private TaskSubmitService taskSubmitService;

    public TaskSubmitter(TaskProcess taskProcess){
        this.taskProcess=taskProcess;
    }

    public  void submit(){
        taskSubmitService.submitTask(taskProcess,false);
    }

    public void run(){
        submit();
    }

}
