package com.haier.rrswl.oms.es;

import com.haier.rrswl.oms.es.config.BaseElasticClient;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
class NewomsJstormEsApplicationTests {

    @Resource
    private BaseElasticClient client;

    @Test
    void contextLoads() {

      /*  DistributeQueryEsEntity esEntity = new DistributeQueryEsEntity();
        esEntity.setAdd2("add2");
        esEntity.setAaa(122);
        esEntity.setItemType("222");
        esEntity.setChangeAppointDate(DateUtil.formatDate(new Date()));
        esEntity.setCarOrderNo("carORderNo");
        esEntity.setArriveUserDate(DateUtil.formatDate(new Date()));
        ElasticEntity<DistributeQueryEsEntity> entity = new ElasticEntity<DistributeQueryEsEntity>();
        entity.setData(esEntity);
        entity.setId("1");
        //client.insertOrUpdateOne("oms_distribute_query", entity);
        client.deleteIndex("oms_distribute_query");
        //client.createIndex("oms_distribute_query",JSON.toJSONString(esEntity));*/
    }


}
