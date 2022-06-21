package com.userprofile.bean;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhangchen
 * @since 2021-04-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TagCommonTask对象", description="")
public class TagCommonTask implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;

    private Long taskFileId;

    private String mainClass;

    private Date updateTime;

    @TableField(exist = false)
    private FileInfo fileInfo;

}
