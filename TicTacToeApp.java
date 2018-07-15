/* Jaymin Shah
   CS 207 Summer 2016
   Assignment 4
*/
public class TicTacToeApp
{
   public static void main(String[]args)
   {
      TicTacToe t = new TicTacToe();
     
      t.print();
      int counter = 1;
      while(true)
      {
         if(counter%2 == 0)
         {
            t.askplayer('O');
         }
         else
         {
            t.askplayer('X');
         }
         counter++;
         System.out.println();
                
        t.print();
         if(t.checkWinner())
         {
            counter = 1;
         }
         if(t.isDraw() || t.checkWinner())
         {
            counter = 1;
            
         }
      }
   }
}