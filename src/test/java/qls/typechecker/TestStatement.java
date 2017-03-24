package qls.typechecker;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import qls.typechecker.statement.TestDefault;
import qls.typechecker.statement.TestQuestion;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestDefault.class,
	TestQuestion.class
})
public class TestStatement {

}
