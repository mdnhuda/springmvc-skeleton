package com.hello.service;

import org.springframework.stereotype.Service;

/**
 * @author nhuda
 * @since 28/07/16
 */
@Service
public class HelloService {
    public String getGreeting() {
        return "Hello Earthling!";
    }
}
