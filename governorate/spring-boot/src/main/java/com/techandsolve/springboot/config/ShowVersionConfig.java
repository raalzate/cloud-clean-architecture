package com.techandsolve.springboot.config;

import com.techandsolve.service.SwhoVersionService;
import com.techandsolve.usecase.ShowVersionUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShowVersionConfig {

    @Bean
    public SwhoVersionService swhoVersionService(){
        ShowVersionUseCase uc = new ShowVersionUseCase();
        return new SwhoVersionService(uc);
    }

}
