package com.haier.rrswl.oms.es.common;

import shade.storm.org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: 01437768
 * @create: 2020/05/11 17:56
 */
public class YmlUtil {

    private static Map<String, Map> CONFIGS = new HashMap();
    private static Map<String, Object> allConfig = new HashMap();

    public YmlUtil() {
    }

    public static synchronized Map loadYaml(String confPath) {
        if (CONFIGS.containsKey(confPath)) {
            return (Map)CONFIGS.get(confPath);
        } else {
            Map ret = null;
            Yaml yaml = new Yaml();

            try {
                InputStream stream = new FileInputStream(confPath);
                ret = (Map)yaml.load(stream);
                if (ret == null || ret.isEmpty()) {
                    throw new RuntimeException("Failed to read config file");
                }
            } catch (FileNotFoundException var4) {
                System.out.println("No such file " + confPath);
                throw new RuntimeException("No config file");
            } catch (Exception var5) {
                var5.printStackTrace();
                throw new RuntimeException("Failed to read config file");
            }

            CONFIGS.put(confPath, ret);
            allConfig.putAll(ret);
            return ret;
        }
    }

    public static Object get(String key) {
        return allConfig.get(key);
    }

    public static Map<String, Object> getAllConfig() {
        return allConfig;
    }

    public static synchronized void addLocalConfig(Map<String, Object> config) {
        allConfig.putAll(config);
    }
}
