package com.example.sse;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import java.awt.*;

@RestController
public class sseController {
    @GetMapping(path = "/sse", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public SseEmitter suscribe() {
        SseEmitter emitter = new SseEmitter(Long.MAX_VALUE);
        return emitter;
    }
}
