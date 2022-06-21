package com.userprofile.service;

import com.userprofile.bean.TaskProcess;

public interface TaskSubmitService {


    public void submitTask(TaskProcess taskProcess, boolean isRetry);
}
