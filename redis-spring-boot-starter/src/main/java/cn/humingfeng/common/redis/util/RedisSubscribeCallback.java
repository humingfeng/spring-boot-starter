package cn.humingfeng.common.redis.util;


public interface RedisSubscribeCallback {
    void callback(String msg);
}
