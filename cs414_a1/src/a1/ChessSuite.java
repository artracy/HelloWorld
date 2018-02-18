package a1;


/*   
 *   File: ChessSuite.java
 *   Name: Andrew Tracy
 *   Data: 20180121
 *   Course: CS 414
 *   Assignment: A1
 *   Desc:  Main function to run all of the JUnit test cases for the assignment
 *          There is a bug with JUnit5 right now that this does not work.
 *          To run all test cases in Eclipse 4.7.2, click run -> Run Configurations...  
 *          In the Run Configurations window,  select JUnit -> ChessSuite.  
 *          Set Test Runner to JUnit 5.  Click "Run all tests in the selected project, package or source folder".  
 *          Under that, there is a Search button.  Click said search button and look for the a1 package.  
 *          Select the a1 package and click OK.  Now back in the Run Configuration window, click Run.
 * 
 * 
 */



import a1.BishopTest;
import junit.framework.JUnit4TestAdapter;
import junit.framework.TestCase;
import org.junit.runners.Suite;

import org.junit.runners.Suite.SuiteClasses;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)


@SuiteClasses({
	BishopTest.class,
	RookTest.class,
	KingTest.class,
	KnightTest.class,
	QueenTest.class,
	PawnTest.class,
	ChessBoardTest.class
	
})
public class ChessSuite {
	public static void main (String[] args)
	{
		junit.textui.TestRunner.run (suite());
	}

	private static  junit.framework.Test suite() {
		return new JUnit4TestAdapter (ChessSuite.class);
		//return null;
	}
}
