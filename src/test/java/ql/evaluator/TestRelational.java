package ql.evaluator;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ql.evaluator.relational.TestAnd;
import ql.evaluator.relational.TestEqual;
import ql.evaluator.relational.TestGreater;
import ql.evaluator.relational.TestGreaterOrEqual;
import ql.evaluator.relational.TestLower;
import ql.evaluator.relational.TestLowerOrEqual;
import ql.evaluator.relational.TestNot;
import ql.evaluator.relational.TestNotEqual;
import ql.evaluator.relational.TestOr;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestAnd.class,
	TestEqual.class,
	TestGreater.class,
	TestGreaterOrEqual.class,
	TestLower.class,
	TestLowerOrEqual.class,
	TestNot.class,
	TestNotEqual.class,
	TestOr.class,
})
public class TestRelational {}
