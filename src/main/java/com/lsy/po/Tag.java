package com.lsy.po;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lsy
 * @data 2020/3/12 - 21:27
 */


@Data
@Entity
@Table(name="t_tag")
public class Tag {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToMany(mappedBy =  "tags")
    private List<Blog> blogs = new ArrayList<>();
}