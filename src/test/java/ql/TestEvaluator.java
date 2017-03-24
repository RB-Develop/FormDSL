package ql;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ql.evaluator.TestArithmetic;
import ql.evaluator.TestLiteral;
import ql.evaluator.TestRelational;

@RunWith(Suite.class)
@Suite.SuiteClasses({
   TestArithmetic.class,
   TestLiteral.class,
   TestRelational.class,
})
public class TestEvaluator {
}
