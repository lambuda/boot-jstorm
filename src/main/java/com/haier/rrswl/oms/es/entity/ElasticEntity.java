package com.haier.rrswl.oms.es.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 参数
 * @author: 01437768
 * @create: 2020/05/09 10:36
 */
@Data
public class ElasticEntity<T> implements Serializable {

    private String id;

    private T data;

    public ElasticEntity(String id, T data) {
        this.id = id;
        this.data = data;
    }

}
