package ql.typechecker;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ql.typechecker.literal.TestBooleanLiteral;
import ql.typechecker.literal.TestFloatLiteral;
import ql.typechecker.literal.TestIntegerLiteral;
import ql.typechecker.literal.TestStringLiteral;

@RunWith(Suite.class)
@Suite.SuiteClasses({
   TestBooleanLiteral.class,
   TestFloatLiteral.class,
   TestIntegerLiteral.class,
   TestStringLiteral.class
})
public class TestLiteral {}
