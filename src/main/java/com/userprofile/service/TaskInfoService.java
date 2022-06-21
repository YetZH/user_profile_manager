package com.userprofile.service;

import com.userprofile.bean.TaskInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangchen
 * @since 2021-04-15
 */
public interface TaskInfoService extends IService<TaskInfo> {
    public void saveTaskInfoWithTag( TaskInfo taskInfo);

    public TaskInfo getTaskInfoWithTag(Long taskId);




}
