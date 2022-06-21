package com.userprofile.service.impl;

import com.userprofile.bean.TaskTagRule;
import com.userprofile.mapper.TaskTagRuleMapper;
import com.userprofile.service.TaskTagRuleService;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangchen
 * @since 2021-04-15
 */
@Service
@DS("mysql")
public class TaskTagRuleServiceImpl extends ServiceImpl<TaskTagRuleMapper, TaskTagRule> implements TaskTagRuleService {

}
