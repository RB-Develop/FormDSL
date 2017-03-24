package ql.evaluator;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ql.evaluator.arithmetic.TestAddition;
import ql.evaluator.arithmetic.TestDivision;
import ql.evaluator.arithmetic.TestMultiplication;
import ql.evaluator.arithmetic.TestNegation;
import ql.evaluator.arithmetic.TestPositive;
import ql.evaluator.arithmetic.TestSubtraction;

@RunWith(Suite.class)
@Suite.SuiteClasses({
   TestAddition.class,   
   TestDivision.class,
   TestMultiplication.class,
   TestNegation.class,
   TestPositive.class,
   TestSubtraction.class,
})
public class TestArithmetic {}
