package rnd.dev.calculator.sevice;

import org.springframework.stereotype.Service;
import rnd.dev.calculator.record.request.NumberAddRequest;
import rnd.dev.calculator.record.request.NumberDivisionRequest;
import rnd.dev.calculator.record.request.NumberMultiplicationRequest;
import rnd.dev.calculator.record.request.NumberSubtractRequest;
import rnd.dev.calculator.record.response.NumberAdditionResponse;
import rnd.dev.calculator.record.response.NumberDivisionResponse;
import rnd.dev.calculator.record.response.NumberMultiplicationResponse;
import rnd.dev.calculator.record.response.NumberSubtractionResponse;

@Service
public class MathematicalOperationServiceImpl implements MathematicalOperationService {

    @Override
    public NumberAdditionResponse addition(NumberAddRequest numberAddRequest) {
        return NumberAdditionResponse.builder()
                .result(numberAddRequest.getFirstNumber() + numberAddRequest.getSecondNumber())
                .build();
    }

    @Override
    public NumberSubtractionResponse subtraction(NumberSubtractRequest numberSubtractRequest) {
        return NumberSubtractionResponse.builder()
                .result(numberSubtractRequest.getFirstNumber() - numberSubtractRequest.getSecondNumber())
                .build();
    }

    @Override
    public NumberMultiplicationResponse multiply(NumberMultiplicationRequest numberMultiplicationRequest) {
        return NumberMultiplicationResponse.builder()
                .result(numberMultiplicationRequest.getFirstNumber() * numberMultiplicationRequest.getSecondNumber())
                .build();
    }

    @Override
    public NumberDivisionResponse division(NumberDivisionRequest numberDivisionRequest) {
        return NumberDivisionResponse.builder()
                .result(numberDivisionRequest.getFirstNumber() / numberDivisionRequest.getSecondNumber())
                .build();
    }
}
