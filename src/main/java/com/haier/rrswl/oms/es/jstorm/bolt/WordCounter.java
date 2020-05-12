package com.haier.rrswl.oms.es.jstorm.bolt;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.IRichBolt;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.tuple.Tuple;
import com.haier.rrswl.oms.es.NewomsJstormEsApplication;
import com.haier.rrswl.oms.es.config.ApplicationContextHolder;
import com.haier.rrswl.oms.es.service.TestService;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: 01437768
 * @create: 2020/05/11 15:58
 */
public class WordCounter implements IRichBolt {
    Integer id;
    String name;
    Map<String, Integer> counters;
    private OutputCollector collector;

    @Override
    public void prepare(Map stormConf, TopologyContext context,
                        OutputCollector collector) {
        NewomsJstormEsApplication.runSpring();

        TestService bean = ApplicationContextHolder.getBean(TestService.class);
        bean.test();
        this.counters = new HashMap<String, Integer>();
        this.collector = collector;
        this.name = context.getThisComponentId();
        this.id = context.getThisTaskId();

    }
    @Override
    public void execute(Tuple input) {
        String str = input.getString(0);
        if (!counters.containsKey(str)) {
            counters.put(str, 1);
        } else {
            Integer c = counters.get(str) + 1;
            counters.put(str, c);
        }
        // 确认成功处理一个tuple
        collector.ack(input);
    }
    /**
     * Topology执行完毕的清理工作，比如关闭连接、释放资源等操作都会写在这里
     * 因为这只是个Demo，我们用它来打印我们的计数器
     * */
    @Override
    public void cleanup() {
        System.out.println("-- Word Counter [" + name + "-" + id + "] --");
        for (Map.Entry<String, Integer> entry : counters.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        counters.clear();
    }
    @Override
    public void declareOutputFields(OutputFieldsDeclarer declarer) {
        // TODO Auto-generated method stub

    }
    @Override
    public Map<String, Object> getComponentConfiguration() {
        // TODO Auto-generated method stub
        return null;
    }

}
