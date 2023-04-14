package com.vrk.cache.storage;

import com.vrk.cache.exception.NotFoundException;
import com.vrk.cache.exception.StorageFullException;

public interface Storage<K, V> {
    void save(K key, V value) throws StorageFullException;

    V get(K key) throws NotFoundException;

    V remove(K key)throws NotFoundException;
}
