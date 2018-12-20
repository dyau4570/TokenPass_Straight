public class TokenPass
{

        private int[]board;
        private int currentPlayer;

        public TokenPass (int playerCount)
        {
            this.board=new int[playerCount];
            int i=0;
            while(i<10)
            {
                board[i]=(int)(Math.random()*10+1);
                currentPlayer=(int) Math.random()*playerCount;

            }

        }
        public void distributeCurrentPlayerTokens()
        {
            int currentToken=board[currentPlayer];
            board[currentPlayer]=0;

            int pos=(currentPlayer+1) % board.length;
            while(currentToken>0)
            {
                
            }
        }

}
