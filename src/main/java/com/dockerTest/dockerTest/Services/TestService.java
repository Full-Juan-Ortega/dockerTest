package com.dockerTest.dockerTest.Services;

import com.dockerTest.dockerTest.Entities.Test;
import com.dockerTest.dockerTest.Repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    TestRepository testRepository;

    public Test save(Test test){
        return testRepository.save(test);
    }
}
