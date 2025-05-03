package rnd.dev.calculator.sevice;

import lombok.Setter;
import org.springframework.stereotype.Service;
import rnd.dev.calculator.record.request.NumberAddRequest;
import rnd.dev.calculator.record.request.NumberDivisionRequest;
import rnd.dev.calculator.record.request.NumberMultiplicationRequest;
import rnd.dev.calculator.record.request.NumberSubtractRequest;
import rnd.dev.calculator.record.response.NumberAdditionResponse;
import rnd.dev.calculator.record.response.NumberDivisionResponse;
import rnd.dev.calculator.record.response.NumberMultiplicationResponse;
import rnd.dev.calculator.record.response.NumberSubtractionResponse;

public interface MathematicalOperationService {
    NumberAdditionResponse addition(NumberAddRequest numberAddRequest);

    NumberSubtractionResponse subtraction(NumberSubtractRequest numberSubtractRequest);

    NumberMultiplicationResponse multiply(NumberMultiplicationRequest numberMultiplicationRequest);

    NumberDivisionResponse division(NumberDivisionRequest numberDivisionRequest);

}
