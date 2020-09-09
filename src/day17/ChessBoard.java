package day17;

public class ChessBoard {
    ChessPiece[][] chessGame;

    public ChessBoard(ChessPiece[][] chessGame) {
        this.chessGame = chessGame;
    }

    public ChessPiece[][] getChessGame() {
        return chessGame;
    }

    public static void print(ChessBoard chessBoard){
        for(int i = 0;i < 8;i++){
            for(int j = 0;j < 8;j++){
                System.out.print(chessBoard.getChessGame()[i][j]);
            }
            System.out.println();
        }
    }
}
