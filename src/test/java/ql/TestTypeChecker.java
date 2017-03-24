package ql;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ql.typechecker.TestArithmetic;
import ql.typechecker.TestCompatibility;
import ql.typechecker.TestIdentifier;
import ql.typechecker.TestLiteral;
import ql.typechecker.TestRelational;
import ql.typechecker.TestStatement;

@RunWith(Suite.class)
@Suite.SuiteClasses({
   TestArithmetic.class,
   TestLiteral.class,
   TestStatement.class,
   TestRelational.class,
   TestIdentifier.class,
   TestCompatibility.class
})
public class TestTypeChecker {
}
