package com.ttn.awslambda.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandler implements RequestHandler<String, String> {
    @Override
    public String handleRequest(String input, Context context) {
        return "Hello from Lambda!";
    }
}