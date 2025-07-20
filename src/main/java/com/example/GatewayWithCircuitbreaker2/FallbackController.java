package com.example.GatewayWithCircuitbreaker2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Fallback контроллер. При недоступности сервиса отдает сообщение
 */
@RestController
public class FallbackController {

    @RequestMapping("/fallback")
    public Mono<String> userServiceFallback() {
        return Mono.just("User service is currently unavailable. Please try later.");
    }
}
