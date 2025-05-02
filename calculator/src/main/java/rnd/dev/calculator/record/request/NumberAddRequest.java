package rnd.dev.calculator.record.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NumberAddRequest {
    private double firstNumber;
    private double secondNumber;
}