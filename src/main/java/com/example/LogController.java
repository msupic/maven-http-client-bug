package com.example;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
class LogController {

    private static final Logger LOG = LoggerFactory.getLogger(LogController.class);

    @Post("/log")
    void log(@Body String message) {
        LOG.info(message);
    }
}
