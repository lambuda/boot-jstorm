package com.haier.rrswl.oms.es.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: 索引
 * @author: 01437768
 * @create: 2020/05/09 14:28
 */
public class EsIndex {

    /***
     *  mapping 常用的数据类型
     *
     *  text：默认会进行分词，支持模糊查询（5.x之后版本string类型已废弃，请大家使用text）。
     *  keyword：不进行分词；keyword类型默认开启doc_values来加速聚合排序操作，占用了大量磁盘io 如非必须可以禁用doc_values。
     *  number：如果只有过滤场景 用不到range查询的话，使用keyword性能更佳，另外数字类型的doc_values比字符串更容易压缩。
     *  array：es不需要显示定义数组类型，只需要在插入数据时用'[]'表示即可，'[]'中的元素类型需保持一致。
     *  range：对数据的范围进行索引；目前支持 number range、date range 、ip range。
     *  boolean: 只接受true、false 也可以是字符串类型的“true”、“false”
     *  date：支持毫秒、根据指定的format解析对应的日期格式，内部以long类型存储。
     *  geo_point：存储经纬度数据对。
     *  ip：将ip数据存储在这种数据类型中，方便后期对ip字段的模糊与范围查询。
     *  nested：嵌套类型，一种特殊的object类型，存储object数组，可检索内部子项。
     *  object：嵌套类型，不支持数组。
     *
     *  es7.x 新增以下数据类型
     *
     *  alias：并不实际存在，而是对已有字段的一种别名映射，搜索该字段与搜索实际字段返回的内容没有本质的区别。
     *  date_nanos：另一种时间类型，可精确到纳秒，用法类似date。
     *  features：用来存储特征向量，数据不能为0和负数，查询时只能使用rank_feature query，该字段主要为支持后续机器学习相关功能做准备。
     *  vector：存储特征数组，支持稀疏与稠密向量存储，该字段主要为支持后续机器学习相关功能做准备。
     *
     *  -------------------------------------------------------------------------
     *  dynamic：动态mapping，禁用后将不会自动创建field，但数据仍可以正常插入
     * "dynamic":"false"
     **/

}
