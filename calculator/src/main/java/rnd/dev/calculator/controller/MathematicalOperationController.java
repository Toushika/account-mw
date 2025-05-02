package rnd.dev.calculator.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import rnd.dev.calculator.record.request.NumberAddRequest;
import rnd.dev.calculator.record.request.NumberDivisionRequest;
import rnd.dev.calculator.record.request.NumberMultiplicationRequest;
import rnd.dev.calculator.record.request.NumberSubtractRequest;
import rnd.dev.calculator.record.response.NumberAdditionResponse;
import rnd.dev.calculator.record.response.NumberDivisionResponse;
import rnd.dev.calculator.record.response.NumberMultiplicationResponse;
import rnd.dev.calculator.record.response.NumberSubtractionResponse;

@RestController
public class MathematicalOperationController {

    @PostMapping("/add/num")
    public NumberAdditionResponse addNumber(@RequestBody NumberAddRequest numberAddRequest) {
        return NumberAdditionResponse.builder()
                .result(numberAddRequest.getFirstNumber() + numberAddRequest.getSecondNumber())
                .build();
    }

    @PostMapping("/sub/num")
    public NumberSubtractionResponse subtractNumber(@RequestBody NumberSubtractRequest numberSubtractRequest) {
        return NumberSubtractionResponse.builder()
                .result(numberSubtractRequest.getFirstNumber() - numberSubtractRequest.getSecondNumber())
                .build();
    }


    @PostMapping("/multiply/num")
    public NumberMultiplicationResponse multiplyNumber(@RequestBody NumberMultiplicationRequest numberMultiplicationRequest) {
        return NumberMultiplicationResponse.builder()
                .result(numberMultiplicationRequest.getFirstNumber() * numberMultiplicationRequest.getSecondNumber())
                .build();
    }

    @PostMapping("/divison/num")
    public NumberDivisionResponse divisionNumber(@RequestBody NumberDivisionRequest numberDivisionRequest) {
        return NumberDivisionResponse.builder()
                .result(numberDivisionRequest.getFirstNumber() / numberDivisionRequest.getSecondNumber())
                .build();
    }

}

