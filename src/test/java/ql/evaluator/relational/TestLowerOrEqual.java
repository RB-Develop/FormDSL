package ql.evaluator.relational;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ql.Value;
import ql.value.BooleanValue;
import ql.value.UndefinedValue;
import ql.evaluator.BaseTest;

@RunWith(value = Parameterized.class)
public class TestLowerOrEqual extends BaseTest {
	@Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][] {
				{ "3 <= 5", new BooleanValue(true) },
				{ "5 <= 5", new BooleanValue(true) },
	   			{ "7 <= 5", new BooleanValue(false) },
	   			{ "integerQuestion <= 5", new BooleanValue(false) },
	   			{ "integerQuestion <= 10", new BooleanValue(true) },
	   			{ "integerQuestion <= 15", new BooleanValue(true) },
	   			{ "5 <= integerQuestion", new BooleanValue(true) },
	   			{ "10 <= integerQuestion", new BooleanValue(true) },
	   			{ "15 <= integerQuestion", new BooleanValue(false) },
	   			
	   			{ "3.0 <= 5.0", new BooleanValue(true) },
				{ "5.0 <= 5.0", new BooleanValue(true) },
	   			{ "7.0 <= 5.0", new BooleanValue(false) },
	   			{ "floatQuestion <= 5.0", new BooleanValue(false) },
	   			{ "floatQuestion <= 10.5", new BooleanValue(true) },
	   			{ "floatQuestion <= 15.0", new BooleanValue(true) },
	   			{ "5.0 <= floatQuestion", new BooleanValue(true) },
	   			{ "10.5 <= floatQuestion", new BooleanValue(true) },
	   			{ "15.0 <= floatQuestion", new BooleanValue(false) },
	   			
	   			{ "3 <= 5.0", new BooleanValue(true) },
				{ "5 <= 5.0", new BooleanValue(true) },
	   			{ "7 <= 5.0", new BooleanValue(false) },
	   			{ "integerQuestion <= 5.0", new BooleanValue(false) },
	   			{ "integerQuestion <= 10.0", new BooleanValue(true) },
	   			{ "integerQuestion <= 15.0", new BooleanValue(true) },
	   			{ "5.0 <= integerQuestion", new BooleanValue(true) },
	   			{ "10.0 <= integerQuestion", new BooleanValue(true) },
	   			{ "15.0 <= integerQuestion", new BooleanValue(false) },
	   			
	   			{ "3.0 <= 5", new BooleanValue(true) },
				{ "5.0 <= 5", new BooleanValue(true) },
	   			{ "7.0 <= 5", new BooleanValue(false) },
	   			{ "floatQuestion <= 5", new BooleanValue(false) },
	   			{ "floatQuestion <= 10", new BooleanValue(false) },
	   			{ "floatQuestion <= 15", new BooleanValue(true) },
	   			{ "5 <= floatQuestion", new BooleanValue(true) },
	   			{ "10 <= floatQuestion", new BooleanValue(true) },
	   			{ "15 <= floatQuestion", new BooleanValue(false) },
	   			
	   			{ "undefinedQuestion <= 10.5", new UndefinedValue() },
	   			{ "10.5 <= undefinedQuestion", new UndefinedValue() },
	   			
	   			{ "undefinedQuestion <= 10", new UndefinedValue() },
	   			{ "10 <= undefinedQuestion", new UndefinedValue() },	   			
		});
    }

    public TestLowerOrEqual(String input, Value expected) {
   	 	super(input, expected);
    }
}
