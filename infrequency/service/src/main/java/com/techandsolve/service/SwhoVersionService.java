package com.techandsolve.service;

import com.techandsolve.usecase.ShowVersionUseCase;
import com.techandsolve.usecase.base.UseCase;
import com.techandsolve.usecase.base.UseCaseHandler;

import java.util.concurrent.CompletableFuture;

public class SwhoVersionService {
    private ShowVersionUseCase useCase;
    public SwhoVersionService(ShowVersionUseCase useCase){
     this.useCase = useCase;
    }

    public CompletableFuture<ShowVersionUseCase.Response> getVersion() {
        return UseCaseHandler
                .getInstance()
                .execute(useCase, new Request());
    }

    public static class Request implements UseCase.RequestValues{

    }
}
