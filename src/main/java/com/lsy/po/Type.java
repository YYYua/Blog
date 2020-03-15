package com.lsy.po;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lsy
 * @data 2020/3/12 - 21:25
 */
@Data
@Entity
@Table(name="t_type")
public class Type {
    @Id
    @GeneratedValue
    private Long id;
    @NotBlank(message="分类名称不能为空")
    private String name;

    @OneToMany(mappedBy = "type")
    private List<Blog> blogs = new ArrayList<>();
}
