package cn.humingfeng.common.redis.prefix;

public interface KeyPrefix {

	public int expireSeconds();

	public String getPrefix();

}
