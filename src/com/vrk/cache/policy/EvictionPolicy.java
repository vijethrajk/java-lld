package com.vrk.cache.policy;

public interface EvictionPolicy<K> {
    void keyAccessed(K key);

    K evictKey(K Key);
}
