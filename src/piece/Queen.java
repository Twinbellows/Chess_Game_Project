package piece;

import main.GamePanel;

public class Queen extends Piece{

	public Queen(int color, int col, int row) {
		super(color, col, row);
		
		if(color == GamePanel.WHITE) {
			image = getImage("/piece/w-Queen");
		}
		else {
			image = getImage("/piece/b-Queen");
		}
	}
	public boolean canMove(int targetCol, int targetRow) {
		
		if(isWithinBoard(targetCol,targetRow) && isSameSquare(targetCol, targetRow) == false) {
			
			// Vertical and Horizontal
			if(targetCol == preCol || targetRow == preRow) {
				if(isValidSquare(targetCol, targetRow) && pieceIsOnStraightLine(targetCol, targetRow) == false) {
					return true;
				}
			}
			// Diagonal
			if(Math.abs(targetCol - preCol) == Math.abs(targetRow - preRow)) {
				if(isValidSquare(targetCol, targetRow) && pieceIsOnDiagonalLine (targetCol, targetRow) == false) {
					return true;
				}
			}
		}
		return false;
	}
}
