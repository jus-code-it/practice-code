package lambdas;
import java.util.function.Consumer;

interface StringFunction {
    String run(String str);
}

interface IntegerFunction {
    int run(int num);
}

public class MyLambdas {
    // WRITE A LAMBDA FUNCTION THAT DOUBLES THE INPUT NUMBER
    public static final IntegerFunction doubler = (x) -> { return x; };

    // WRITE A LAMBDA FUNCTION THAT ADDS "AY" TO THE INPUT STRING
    public static final StringFunction ayString = input_string -> { return input_string; };

    // WRITE A LAMBDA FUNCTION THAT RETURNS THE NEGATIVE OF THE INPUT NUMBER
    public static final IntegerFunction negator = x -> { return x; };
}
