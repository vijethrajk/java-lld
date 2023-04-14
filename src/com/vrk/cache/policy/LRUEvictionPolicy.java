package com.vrk.cache.policy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUEvictionPolicy<K> implements EvictionPolicy<K> {

    private LinkedList<K> linkedList; // use custom implementation of doubly linked list
    private Map<K, LinkedList<K>> mapper;

    public LRUEvictionPolicy() {
        linkedList = new LinkedList<>();
        mapper = new HashMap<>();
    }

    @Override
    public void keyAccessed(K key) {
        if (mapper.containsKey(key)) {
            linkedList.remove(key);
            linkedList.addLast(key);
        } else {
           // LinkedList<K> node = new LinkedList<>();
            linkedList.addLast(key);
            mapper.put(key, linkedList);
        }

    }

    @Override
    public K evictKey(K Key) {
        K itemToRemove=linkedList.getFirst();
        if(itemToRemove==null) return null;
        return linkedList.removeFirst();
    }
}
