package com.vrk.cache;

import com.vrk.cache.policy.EvictionPolicy;
import com.vrk.cache.policy.LRUEvictionPolicy;
import com.vrk.cache.storage.HashBasedStorage;
import com.vrk.cache.storage.Storage;

public class Client {
    public static void main(String[] args) {

        EvictionPolicy<String> evictionPolicy=new LRUEvictionPolicy<>();
        Storage<String,String> storage=new HashBasedStorage<>(5);

        Cache<String,String> cache=new Cache<>(evictionPolicy,storage);

        cache.put("a","first");
        cache.put("b","sec");
        cache.put("c","third");
        cache.put("d","fourth");
        cache.put("e","fifth");
        cache.put("f","sixth");
      //  cache.get("b");
        cache.put("g","seventh");

        System.out.println("Reading from cache: "+cache.get("c"));
    }
}
