package com.techandsolve.springboot.rest;

import com.techandsolve.service.SwhoVersionService;
import com.techandsolve.usecase.ShowVersionUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ShowVersionController {
    SwhoVersionService swhoVersionService;
    public ShowVersionController(SwhoVersionService swhoVersionService){
        this.swhoVersionService = swhoVersionService;
    }

    @GetMapping("/getVersion")
    public Mono<ShowVersionUseCase.Response> getVersion(){
        return Mono.fromFuture(swhoVersionService.getVersion());
    }
}
