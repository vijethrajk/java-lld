package com.vrk.cache;

import com.vrk.cache.exception.NotFoundException;
import com.vrk.cache.exception.StorageFullException;
import com.vrk.cache.policy.EvictionPolicy;
import com.vrk.cache.storage.Storage;

public class Cache<K,V> {

    private final EvictionPolicy<K> evictionPolicy;
    private final Storage<K,V> storage;

    public Cache(EvictionPolicy<K> evictionPolicy, Storage<K, V> storage) {
        this.evictionPolicy = evictionPolicy;
        this.storage = storage;
    }

    public void put(K key,V value){
        try {
            this.storage.save(key,value);
            this.evictionPolicy.keyAccessed(key);
        } catch (StorageFullException e) {
            System.out.println("Storage is full!! Evicting item from cache");
            K item = this.evictionPolicy.evictKey(key);
            if(item ==null){
                throw new RuntimeException("unexpected error!! ");
            }
            System.out.println("Clearing space by removing one items from cache|| "+item );
            this.storage.remove(item);
            put(key,value);
        }
    }

    public V get(K key){
        try {
            V value = this.storage.get(key);
            this.evictionPolicy.keyAccessed(key);
            return  value;
        } catch (NotFoundException e) {
            System.out.println("Key not found in the cache");
            return null;
        }
    }
}
