package com.dk.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author wujunjin
 * @Date 2021/5/25 10:37
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//链式写法
@Accessors(chain = true)
public class Dept implements Serializable {

    private Long deptno;
    private String dname;

    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
