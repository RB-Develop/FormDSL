package ql.typechecker;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ql.typechecker.statement.TestComputedQuestion;
import ql.typechecker.statement.TestForm;
import ql.typechecker.statement.TestIf;
import ql.typechecker.statement.TestQuestion;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestComputedQuestion.class,
	TestForm.class,
	TestIf.class,
	TestQuestion.class
})
public class TestStatement {}
