package com.techandsolve.usecase;

import com.techandsolve.usecase.base.UseCase;

public class ShowVersionUseCase extends UseCase<UseCase.RequestValues, ShowVersionUseCase.Response> {
    @Override
    protected void executeUseCase(RequestValues requestValues) {
        emit().onSuccess(new ShowVersionUseCase.Response());

    }

    public static class Response implements UseCase.ResponseValue{
        String name = "1.2";
        public String getName(){
            return name;
        }
    }
}
