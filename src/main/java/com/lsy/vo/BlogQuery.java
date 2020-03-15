package com.lsy.vo;

import lombok.Data;

/**
 * @author lsy
 * @data 2020/3/13 - 14:56
 */
@Data
public class BlogQuery {
    private String title;
    private Long typeId;
    private boolean recommend;
}
