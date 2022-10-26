package com.example.kafkatest;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {

    @Cacheable(value = "test")
    public List test(String check) {
        System.out.println("체크가 동일하면 그대로 리턴 시키나 ?");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add((int) Math.random());
        return list;
    }

    @CacheEvict(value = "test", allEntries = true)
    public void cacheDelete() {
        System.out.println("캐시 삭제");
    }
}
