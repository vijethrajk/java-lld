package com.vrk.cache.storage;

import com.vrk.cache.exception.NotFoundException;
import com.vrk.cache.exception.StorageFullException;

import java.util.HashMap;
import java.util.Map;

public class HashBasedStorage<K,V> implements Storage<K,V>{

    private Map<K,V> storageMap;
    private final Integer capacity;

    public HashBasedStorage(Integer capacity){
        this.capacity=capacity;
        this.storageMap = new HashMap<>();
    }
    @Override
    public void save(K key, V value) {
        if (isStorageFull()) throw  new StorageFullException("cache storage is full");
        storageMap.put(key,value);
    }

    @Override
    public V get(K key) {
        if(!storageMap.containsKey(key)) throw new NotFoundException("Key not found");
        return storageMap.get(key);
    }

    @Override
    public V remove(K key) {
        if(!storageMap.containsKey(key)) throw new NotFoundException("Key not found");
        return storageMap.remove(key);
    }

    private boolean isStorageFull(){
        return storageMap.size()==capacity;
    }
}
