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
import rnd.dev.calculator.sevice.MathematicalOperationService;

@RestController
public class MathematicalOperationController {

    private final MathematicalOperationService mathematicalOperationService;

    public MathematicalOperationController(MathematicalOperationService mathematicalOperationService) {
        this.mathematicalOperationService = mathematicalOperationService;
    }

    @PostMapping("/add/num")
    public NumberAdditionResponse addNumber(@RequestBody NumberAddRequest numberAddRequest) {
        return mathematicalOperationService.addition(numberAddRequest);
    }

    @PostMapping("/sub/num")
    public NumberSubtractionResponse subtractNumber(@RequestBody NumberSubtractRequest numberSubtractRequest) {
        return mathematicalOperationService.subtraction(numberSubtractRequest);
    }


    @PostMapping("/multiply/num")
    public NumberMultiplicationResponse multiplyNumber(@RequestBody NumberMultiplicationRequest numberMultiplicationRequest) {
        return mathematicalOperationService.multiply(numberMultiplicationRequest);
    }

    @PostMapping("/divison/num")
    public NumberDivisionResponse divisionNumber(@RequestBody NumberDivisionRequest numberDivisionRequest) {
        return mathematicalOperationService.division(numberDivisionRequest);
    }

}

