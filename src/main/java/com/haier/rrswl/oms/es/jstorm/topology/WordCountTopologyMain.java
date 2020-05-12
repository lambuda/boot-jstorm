package com.haier.rrswl.oms.es.jstorm.topology;

import backtype.storm.Config;
import backtype.storm.LocalCluster;
import backtype.storm.topology.TopologyBuilder;
import backtype.storm.tuple.Fields;
import com.haier.rrswl.oms.es.jstorm.bolt.WordCounter;
import com.haier.rrswl.oms.es.jstorm.bolt.WordNormalizer;
import com.haier.rrswl.oms.es.jstorm.spout.SimpleConsumerSpout;

/**
 * @description:
 * @author: 01437768
 * @create: 2020/05/11 16:00
 */
public class WordCountTopologyMain {


    public static void main(String[] args) throws InterruptedException {
        //定义一个Topology
        TopologyBuilder builder = new TopologyBuilder();
        builder.setSpout("word-reader",new SimpleConsumerSpout());
        builder.setBolt("word-normalizer", new WordNormalizer())
                .shuffleGrouping("word-reader");
        builder.setBolt("word-counter", new WordCounter(),2)
                .fieldsGrouping("word-normalizer", new Fields("word"));
        //配置
        Config conf = new Config();
        conf.put("wordsFile", "d:/text.txt");
        conf.setDebug(false);
        //提交Topology
        conf.put(Config.TOPOLOGY_MAX_SPOUT_PENDING, 1);
        //创建一个本地模式cluster
        LocalCluster cluster = new LocalCluster();
        cluster.submitTopology("Getting-Started-Toplogie", conf,
                builder.createTopology());
        Thread.sleep(1000);


    }
}
