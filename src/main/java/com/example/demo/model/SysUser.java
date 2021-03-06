package com.example.demo.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Author: 青菜
 * @Date: 2019/8/30 下午4:54
 * @Description:
 * @Version 1.0
 */
@Data
public class SysUser implements Serializable {

    private String userId;

    private String userName;

    private String password;

    private String updateUserId;

    private String createUserId;

    private LocalDateTime updateTime;

    private LocalDateTime createTime;

}
