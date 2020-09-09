package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece whitePawns1 = ChessPiece.PAWN_WHITE;
        ChessPiece whitePawns2 = ChessPiece.PAWN_WHITE;
        ChessPiece whitePawns3 = ChessPiece.PAWN_WHITE;
        ChessPiece whitePawns4 = ChessPiece.PAWN_WHITE;

        ChessPiece blackRook1 = ChessPiece.ROOK_BLACK;
        ChessPiece blackRook2 = ChessPiece.ROOK_BLACK;
        ChessPiece blackRook3 = ChessPiece.ROOK_BLACK;
        ChessPiece blackRook4 = ChessPiece.ROOK_BLACK;

        ChessPiece[] chessArray ={
                whitePawns1,whitePawns2,whitePawns3,whitePawns4,
                blackRook1,blackRook2,blackRook3,blackRook4
        };

        for(ChessPiece chess : chessArray){
            System.out.print(chess + " ");
        }
    }
}
