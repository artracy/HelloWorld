package a1;

import static org.junit.Assert.fail;

/*   
 *   File: ChessBoardTest.java
 *   Name: Andrew Tracy
 *   Data: 20180121
 *   Course: CS 414
 *   Assignment: A1
 *   Desc:  Junit test class to test the ChessBoard Class
 * 
 * 
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import a1.ChessPiece.Color;

class ChessBoardTest {
	static String pos[][] = new String[8][8];
	

	
	/*
	 * Test creation of the board
	 */
	
	@Test	
	void testCreateBoard() {
		
		pos[0] = new String[] {"a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1"};
		pos[1] = new String[] {"a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2"};
		pos[2] = new String[] {"a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3"};
		pos[3] = new String[] {"a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4"};
		pos[4] = new String[] {"a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5"};
		pos[5] = new String[] {"a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6"};
		pos[6] = new String[] {"a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7"};
		pos[7] = new String[] {"a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8"};
		
		ChessBoard testBoard1 = new ChessBoard(); 
		assertTrue( testBoard1 != null);
		assertTrue(testBoard1.getClass() == ChessBoard.class);	
		
		for(int row = 0; row < 8; row ++)
		{
			for(int column = 0; column < 8; column++) 
			{
				try {
					assertTrue(testBoard1.getPiece(pos[row][column]) == null);
				}catch (IllegalPositionException e) {
					
				}
			}
		}
	}
	
	/*
	 * Test placement of a piece and getting the same piece
	 */
	
	@Test	
	void testA1PlacePiece() {
		ChessBoard testBoard1 = new ChessBoard(); 
		Pawn testPawn = new Pawn(testBoard1, Color.WHITE);
		testBoard1.placePiece(testPawn, "a1");
		try {
			assertTrue( testBoard1.getPiece("a1").getClass() == Pawn.class);
		}catch (IllegalPositionException e) {
			
		}		
		
	}
	
	@Test	
	void testA8PlacePiece() {
		ChessBoard testBoard1 = new ChessBoard(); 
		Pawn testPawn = new Pawn(testBoard1, Color.WHITE);
		testBoard1.placePiece(testPawn, "a8");
		try {
			assertTrue( testBoard1.getPiece("a8").getClass() == Pawn.class);
		}catch (IllegalPositionException e) {
			
		}		
		
	}
	
	
	@Test	
	void testH1PlacePiece() {
		ChessBoard testBoard1 = new ChessBoard(); 
		Pawn testPawn = new Pawn(testBoard1, Color.BLACK);
		testBoard1.placePiece(testPawn, "h1");
		try {
			assertTrue( testBoard1.getPiece("h1").getClass() == Pawn.class);
		}catch (IllegalPositionException e) {
			
		}		
		
	}
	
	@Test	
	void testH8PlacePiece() {
		ChessBoard testBoard1 = new ChessBoard(); 
		Pawn testPawn = new Pawn(testBoard1, Color.WHITE);
		testBoard1.placePiece(testPawn, "h8");
		try {
			assertTrue( testBoard1.getPiece("h8").getClass() == Pawn.class);
		}catch (IllegalPositionException e) {
			
		}		
		
	}
	
	@Test	
	void testE3PlacePiece() {
		ChessBoard testBoard1 = new ChessBoard(); 
		Pawn testPawn = new Pawn(testBoard1, Color.BLACK);
		testBoard1.placePiece(testPawn, "e3");
		try {
			assertTrue( testBoard1.getPiece("e3").getClass() == Pawn.class);
		}catch (IllegalPositionException e) {
			
		}		
		
	}
	
	void testI7PlacePiece() {
		ChessBoard testBoard1 = new ChessBoard(); 
		Pawn testPawn = new Pawn(testBoard1, Color.BLACK);
		assertFalse( testBoard1.placePiece(testPawn, "i3"));
		assertTrue( testPawn.getPosition() != "i3");				
		
	}
	
	void testAPlacePiece() {
		ChessBoard testBoard1 = new ChessBoard(); 
		Pawn testPawn = new Pawn(testBoard1, Color.BLACK);
		assertFalse( testBoard1.placePiece(testPawn, "a"));
		assertTrue( testPawn.getPosition() != "a");				
		
	}
	
	void testD77PlacePiece() {
		ChessBoard testBoard1 = new ChessBoard(); 
		Pawn testPawn = new Pawn(testBoard1, Color.BLACK);
		assertFalse( testBoard1.placePiece(testPawn, "d77"));
		assertTrue( testPawn.getPosition() != "d77");				
		
	}
	
	
	
	/*
	 * Test the Initialize of the board
	 */
	
	@Test	
	void testInitializeBoard() {
		ChessPiece testPiece;
		
		pos[0] = new String[] {"a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1"};
		pos[1] = new String[] {"a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2"};
		pos[2] = new String[] {"a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3"};
		pos[3] = new String[] {"a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4"};
		pos[4] = new String[] {"a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5"};
		pos[5] = new String[] {"a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6"};
		pos[6] = new String[] {"a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7"};
		pos[7] = new String[] {"a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8"};
		
		
		ChessBoard testBoard1 = new ChessBoard(); 
		testBoard1.initialize();
		
		//assertTrue( );
		//Test pawns
		for(int column = 0; column < 8; column++) 
		{
			try {
				testPiece = testBoard1.getPiece(pos[1][column]);
				assertTrue(testPiece.getClass() == Pawn.class);
				assertTrue(testPiece.getColor() == Color.WHITE);
				assertEquals(testPiece.getPosition(), pos[1][column]);
				
				testPiece = testBoard1.getPiece(pos[6][column]);
				assertTrue(testPiece.getClass() == Pawn.class);
				assertTrue(testPiece.getColor() == Color.BLACK);
				assertEquals(testPiece.getPosition(), pos[6][column]);
				
			}catch (IllegalPositionException e) {
				
			}
		}
		
		//Test empty space
		for(int row = 2; row <=5; row ++)
		{
			for(int column = 0; column < 8; column++) 
			{
				try {
					assertTrue(testBoard1.getPiece(pos[row][column]) == null);
				}catch (IllegalPositionException e) {
					
				}
			}
		}
		
		try {
			
			//test for white pieces
			testPiece = testBoard1.getPiece(pos[0][0]);
			assertTrue(testPiece.getClass() == Rook.class );
			assertTrue(testPiece.getColor() == Color.WHITE);
			assertEquals(testPiece.getPosition(), pos[0][0]);
			
			testPiece = testBoard1.getPiece(pos[0][1]);
			assertTrue(testPiece.getClass() == Knight.class);
			assertTrue(testPiece.getColor() == Color.WHITE);
			assertEquals(testPiece.getPosition(), pos[0][1]);
			
			testPiece = testBoard1.getPiece(pos[0][2]);
			assertTrue(testPiece.getClass() == Bishop.class);
			assertTrue(testPiece.getColor() == Color.WHITE);
			assertEquals(testPiece.getPosition(), pos[0][2]);
			
			testPiece = testBoard1.getPiece(pos[0][3]);
			assertTrue(testPiece.getClass() == Queen.class);
			assertTrue(testPiece.getColor() == Color.WHITE);
			assertEquals(testPiece.getPosition(), pos[0][3]);
			
			testPiece = testBoard1.getPiece(pos[0][4]);
			assertTrue(testPiece.getClass() == King.class);
			assertTrue(testPiece.getColor() == Color.WHITE);
			assertEquals(testPiece.getPosition(), pos[0][4]);
			
			testPiece = testBoard1.getPiece(pos[0][5]);
			assertTrue(testPiece.getClass() == Bishop.class);
			assertTrue(testPiece.getColor() == Color.WHITE);
			assertEquals(testPiece.getPosition(), pos[0][5]);
			
			testPiece = testBoard1.getPiece(pos[0][6]);
			assertTrue(testPiece.getClass() == Knight.class);
			assertTrue(testPiece.getColor() == Color.WHITE);
			assertEquals(testPiece.getPosition(), pos[0][6]);
			
			testPiece = testBoard1.getPiece(pos[0][7]);
			assertTrue(testPiece.getClass() == Rook.class);
			assertTrue(testPiece.getColor() == Color.WHITE);
			assertEquals(testPiece.getPosition(), pos[0][7]);
			
			
			//Test Black pieces
			
			testPiece = testBoard1.getPiece(pos[7][0]);
			assertTrue(testPiece.getClass() == Rook.class);
			assertTrue(testPiece.getColor() == Color.BLACK);
			assertEquals(testPiece.getPosition(), pos[7][0]);
			
			testPiece = testBoard1.getPiece(pos[7][1]);
			assertTrue(testPiece.getClass() == Knight.class);
			assertTrue(testPiece.getColor() == Color.BLACK);
			assertEquals(testPiece.getPosition(), pos[7][1]);
			
			testPiece = testBoard1.getPiece(pos[7][2]);
			assertTrue(testPiece.getClass() == Bishop.class);
			assertTrue(testPiece.getColor() == Color.BLACK);
			assertEquals(testPiece.getPosition(), pos[7][2]);
			
			testPiece = testBoard1.getPiece(pos[7][3]);
			assertTrue(testPiece.getClass() == Queen.class);
			assertTrue(testPiece.getColor() == Color.BLACK);
			assertEquals(testPiece.getPosition(), pos[7][3]);
			
			testPiece = testBoard1.getPiece(pos[7][4]);
			assertTrue(testPiece.getClass() == King.class);
			assertTrue(testPiece.getColor() == Color.BLACK);
			assertEquals(testPiece.getPosition(), pos[7][4]);
			
			testPiece = testBoard1.getPiece(pos[7][5]);
			assertTrue(testPiece.getClass() == Bishop.class);
			assertTrue(testPiece.getColor() == Color.BLACK);
			assertEquals(testPiece.getPosition(), pos[7][5]);
			
			testPiece = testBoard1.getPiece(pos[7][6]);
			assertTrue(testPiece.getClass() == Knight.class);
			assertTrue(testPiece.getColor() == Color.BLACK);
			assertEquals(testPiece.getPosition(), pos[7][6]);
			
			testPiece = testBoard1.getPiece(pos[7][7]);
			assertTrue(testPiece.getClass() == Rook.class);
			assertTrue(testPiece.getColor() == Color.BLACK);
			assertEquals(testPiece.getPosition(), pos[7][7]);
			
		}catch (IllegalPositionException e) {
			
		}		
		
		
	}
	
	@Test	
	void testResetBoard() {
		ChessPiece testPiece;
		
		pos[0] = new String[] {"a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1"};
		pos[1] = new String[] {"a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2"};
		pos[2] = new String[] {"a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3"};
		pos[3] = new String[] {"a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4"};
		pos[4] = new String[] {"a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5"};
		pos[5] = new String[] {"a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6"};
		pos[6] = new String[] {"a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7"};
		pos[7] = new String[] {"a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8"};
		
		
		ChessBoard testBoard1 = new ChessBoard(); 
		
		testBoard1.placePiece(new Pawn(testBoard1, Color.WHITE), "a1");
		testBoard1.placePiece(new Pawn(testBoard1, Color.WHITE), "d3");
		testBoard1.placePiece(new Pawn(testBoard1, Color.WHITE), "f8");
		testBoard1.placePiece(new Pawn(testBoard1, Color.WHITE), "c2");
		
		testBoard1.initialize();
		
		//assertTrue( );
		//Test pawns
		for(int column = 0; column < 8; column++) 
		{
			try {
				testPiece = testBoard1.getPiece(pos[1][column]);
				assertTrue(testPiece.getClass() == Pawn.class);
				assertTrue(testPiece.getColor() == Color.WHITE);
				assertEquals(testPiece.getPosition(), pos[1][column]);
				
				testPiece = testBoard1.getPiece(pos[6][column]);
				assertTrue(testPiece.getClass() == Pawn.class);
				assertTrue(testPiece.getColor() == Color.BLACK);
				assertEquals(testPiece.getPosition(), pos[6][column]);
				
			}catch (IllegalPositionException e) {
				
			}
		}
		
		//Test empty space
		for(int row = 2; row <=5; row ++)
		{
			for(int column = 0; column < 8; column++) 
			{
				try {
					assertTrue(testBoard1.getPiece(pos[row][column]) == null);
				}catch (IllegalPositionException e) {
					
				}
			}
		}
		
		try {
			
			//test for white pieces
			testPiece = testBoard1.getPiece(pos[0][0]);
			assertTrue(testPiece.getClass() == Rook.class );
			assertTrue(testPiece.getColor() == Color.WHITE);
			assertEquals(testPiece.getPosition(), pos[0][0]);
			
			testPiece = testBoard1.getPiece(pos[0][1]);
			assertTrue(testPiece.getClass() == Knight.class);
			assertTrue(testPiece.getColor() == Color.WHITE);
			assertEquals(testPiece.getPosition(), pos[0][1]);
			
			testPiece = testBoard1.getPiece(pos[0][2]);
			assertTrue(testPiece.getClass() == Bishop.class);
			assertTrue(testPiece.getColor() == Color.WHITE);
			assertEquals(testPiece.getPosition(), pos[0][2]);
			
			testPiece = testBoard1.getPiece(pos[0][3]);
			assertTrue(testPiece.getClass() == Queen.class);
			assertTrue(testPiece.getColor() == Color.WHITE);
			assertEquals(testPiece.getPosition(), pos[0][3]);
			
			testPiece = testBoard1.getPiece(pos[0][4]);
			assertTrue(testPiece.getClass() == King.class);
			assertTrue(testPiece.getColor() == Color.WHITE);
			assertEquals(testPiece.getPosition(), pos[0][4]);
			
			testPiece = testBoard1.getPiece(pos[0][5]);
			assertTrue(testPiece.getClass() == Bishop.class);
			assertTrue(testPiece.getColor() == Color.WHITE);
			assertEquals(testPiece.getPosition(), pos[0][5]);
			
			testPiece = testBoard1.getPiece(pos[0][6]);
			assertTrue(testPiece.getClass() == Knight.class);
			assertTrue(testPiece.getColor() == Color.WHITE);
			assertEquals(testPiece.getPosition(), pos[0][6]);
			
			testPiece = testBoard1.getPiece(pos[0][7]);
			assertTrue(testPiece.getClass() == Rook.class);
			assertTrue(testPiece.getColor() == Color.WHITE);
			assertEquals(testPiece.getPosition(), pos[0][7]);
			
			
			//Test Black pieces
			
			testPiece = testBoard1.getPiece(pos[7][0]);
			assertTrue(testPiece.getClass() == Rook.class);
			assertTrue(testPiece.getColor() == Color.BLACK);
			assertEquals(testPiece.getPosition(), pos[7][0]);
			
			testPiece = testBoard1.getPiece(pos[7][1]);
			assertTrue(testPiece.getClass() == Knight.class);
			assertTrue(testPiece.getColor() == Color.BLACK);
			assertEquals(testPiece.getPosition(), pos[7][1]);
			
			testPiece = testBoard1.getPiece(pos[7][2]);
			assertTrue(testPiece.getClass() == Bishop.class);
			assertTrue(testPiece.getColor() == Color.BLACK);
			assertEquals(testPiece.getPosition(), pos[7][2]);
			
			testPiece = testBoard1.getPiece(pos[7][3]);
			assertTrue(testPiece.getClass() == Queen.class);
			assertTrue(testPiece.getColor() == Color.BLACK);
			assertEquals(testPiece.getPosition(), pos[7][3]);
			
			testPiece = testBoard1.getPiece(pos[7][4]);
			assertTrue(testPiece.getClass() == King.class);
			assertTrue(testPiece.getColor() == Color.BLACK);
			assertEquals(testPiece.getPosition(), pos[7][4]);
			
			testPiece = testBoard1.getPiece(pos[7][5]);
			assertTrue(testPiece.getClass() == Bishop.class);
			assertTrue(testPiece.getColor() == Color.BLACK);
			assertEquals(testPiece.getPosition(), pos[7][5]);
			
			testPiece = testBoard1.getPiece(pos[7][6]);
			assertTrue(testPiece.getClass() == Knight.class);
			assertTrue(testPiece.getColor() == Color.BLACK);
			assertEquals(testPiece.getPosition(), pos[7][6]);
			
			testPiece = testBoard1.getPiece(pos[7][7]);
			assertTrue(testPiece.getClass() == Rook.class);
			assertTrue(testPiece.getColor() == Color.BLACK);
			assertEquals(testPiece.getPosition(), pos[7][7]);
			
		}catch (IllegalPositionException e) {
			
		}
			
	}
	
	
	/*
	 * Test the move function
	 */
	
	@Test
	void testMoveRook() {
		ChessBoard testBoard1 = new ChessBoard(); 
		Rook testRook = new Rook(testBoard1, Color.WHITE);
		Pawn testPawn = new Pawn(testBoard1, Color.BLACK);
		
		testBoard1.placePiece(testPawn, "c6");
		testBoard1.placePiece(testRook, "c2");
		try {
			testBoard1.move("c2", "c6");
			assertTrue( testBoard1.getPiece("c6").getClass() == Rook.class);
			assertTrue(testBoard1.getPiece("c2") == null);
			assertEquals(testBoard1.getPiece("c6").getPosition(), "c6");
		}catch (IllegalPositionException e ) {
			
		}catch (IllegalMoveException e)	{
			
		}
		
	}
	
	@Test
	void testMoveNull() {
		ChessBoard testBoard1 = new ChessBoard(); 
		Rook testRook = new Rook(testBoard1, Color.WHITE);
		Pawn testPawn = new Pawn(testBoard1, Color.BLACK);
		
		testBoard1.placePiece(testPawn, "c6");
		testBoard1.placePiece(testRook, "c2");
		
		assertThrows(IllegalMoveException.class , () -> {testBoard1.move("c1", "c6");});		
		
	}
	
	void testMoveBadFrom() {
		ChessBoard testBoard1 = new ChessBoard(); 
		Rook testRook = new Rook(testBoard1, Color.WHITE);
		Pawn testPawn = new Pawn(testBoard1, Color.BLACK);
		
		testBoard1.placePiece(testPawn, "c6");
		testBoard1.placePiece(testRook, "c2");
		
		assertThrows(IllegalMoveException.class , () -> {testBoard1.move("i2", "c6");});		
		
	}
	
	void testMoveBadTo() {
		ChessBoard testBoard1 = new ChessBoard(); 
		Rook testRook = new Rook(testBoard1, Color.WHITE);
		Pawn testPawn = new Pawn(testBoard1, Color.BLACK);
		
		testBoard1.placePiece(testPawn, "c6");
		testBoard1.placePiece(testRook, "c2");
		
		assertThrows(IllegalMoveException.class , () -> {testBoard1.move("c1", "c77");});		
		
	}
	

}
