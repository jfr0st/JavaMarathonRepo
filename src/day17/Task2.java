package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece blackRook = ChessPiece.ROOK_BLACK;
        ChessPiece whiteRook = ChessPiece.ROOK_WHITE;
        ChessPiece blackKing = ChessPiece.KING_BLACK;
        ChessPiece whiteKing = ChessPiece.KING_WHITE;
        ChessPiece free = ChessPiece.ENUM;
        ChessPiece blackPawn = ChessPiece.PAWN_BLACK;
        ChessPiece whitePawn = ChessPiece.PAWN_WHITE;
        ChessPiece blackKnight = ChessPiece.KNIGHT_BLACK;
        ChessPiece blackQeen = ChessPiece.QUEEN_BLACK;
        ChessPiece whiteQeen = ChessPiece.QUEEN_WHITE;
        ChessPiece whiteBishop = ChessPiece.BISHOP_WHITE;
        ChessPiece blackBishop = ChessPiece.BISHOP_BLACK;

        ChessPiece[][] boardArray = new ChessPiece[8][8];

        boardArray[0][0] = blackRook;
        boardArray[0][5] = blackRook;
        boardArray[0][6] = blackKing;

        boardArray[1][1] = whiteRook;
        boardArray[1][4] = blackPawn;
        boardArray[1][5] = blackPawn;
        boardArray[1][7] = blackPawn;

        boardArray[2][0] = blackPawn;
        boardArray[2][2] = blackKnight;
        boardArray[2][6] = blackPawn;

        boardArray[3][0] = blackQeen;
        boardArray[3][3] = whiteBishop;

        boardArray[4][3] = blackBishop;
        boardArray[4][4] = whitePawn;

        boardArray[5][4] = whiteBishop;
        boardArray[5][5] = whitePawn;

        boardArray[6][0] = whitePawn;
        boardArray[6][3] = whiteQeen;
        boardArray[6][5] = whitePawn;
        boardArray[6][7] = whitePawn;

        boardArray[7][5] = whiteRook;
        boardArray[7][6] = whiteKing;

        ChessBoard board = new ChessBoard(boardArray);


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (boardArray[i][j] == null) {
                    boardArray[i][j] = free;
                }
            }
        }
        ChessBoard.print(board);
    }
}
