package ql.typechecker;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ql.typechecker.arithmetic.TestAddition;
import ql.typechecker.arithmetic.TestDivision;
import ql.typechecker.arithmetic.TestMultiplication;
import ql.typechecker.arithmetic.TestNegation;
import ql.typechecker.arithmetic.TestPositive;
import ql.typechecker.arithmetic.TestSubtraction;

@RunWith(Suite.class)
@Suite.SuiteClasses({
   TestAddition.class,
   TestDivision.class,
   TestMultiplication.class,
   TestNegation.class,
   TestPositive.class,
   TestSubtraction.class
})
public class TestArithmetic {}
