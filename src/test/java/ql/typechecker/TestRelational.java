package ql.typechecker;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ql.typechecker.relational.TestAnd;
import ql.typechecker.relational.TestEqual;
import ql.typechecker.relational.TestGreater;
import ql.typechecker.relational.TestGreaterOrEqual;
import ql.typechecker.relational.TestLower;
import ql.typechecker.relational.TestLowerOrEqual;
import ql.typechecker.relational.TestNot;
import ql.typechecker.relational.TestNotEqual;
import ql.typechecker.relational.TestOr;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestAnd.class,
	TestEqual.class,
	TestGreaterOrEqual.class,
	TestGreater.class,
	TestLowerOrEqual.class,
	TestLower.class,
	TestNotEqual.class,
	TestNot.class,
	TestOr.class
})
public class TestRelational {}
