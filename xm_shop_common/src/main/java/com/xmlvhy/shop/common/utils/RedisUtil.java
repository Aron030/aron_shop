package com.xmlvhy.shop.common.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * redis 工具类
 */
public class RedisUtil {

    private static JedisPool jedisPool = null;

    static {
        jedisPool = (JedisPool) SpringBeanHolder.getBean("jedisPool");
    }

    /**
     *功能描述: 保存数据到 redis 到redis 缓存中
     * @Author 小莫
     * @Date 23:43 2019/03/12
     * @Param [key, value]
     * @return void
     */
    public static void set(String key, String value) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.set(key, value);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }

    /**
     *功能描述: 保存数据到 redis 到redis 缓存中带过期时间
     * @Author 小莫
     * @Date 23:43 2019/03/12
     * @Param [key, value, expireTIme]
     * @return void
     */
    public static void set(String key, String value, int expireTIme) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.set(key, value);
            jedis.expire(key, expireTIme); //设置过期时间
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }

    /**
     *功能描述: 获取redis缓存中的内容
     * @Author 小莫
     * @Date 23:43 2019/03/12
     * @Param [key]
     * @return java.lang.String
     */
    public static String get(String key) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedis.get(key);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        return null;
    }
}
