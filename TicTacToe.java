/* Jaymin Shah
   CS 207 Summer 2016
   Assignment 4
*/
import java.util.*;
public class TicTacToe
{    
     private Gameboard g1;
   public TicTacToe()
   {
     g1 = new Gameboard(3,3);
   }
   public void print()
   {
      g1.printBoard();
   }
   public void clear()
   {
      g1.clearBoard();
   }
  public void askplayer(char player)
   {
      Scanner input = new Scanner(System.in);
      int row,col;
      System.out.println();
      do
      {
         System.out.println("Player: "+ player);
         row = input.nextInt();
         col = input.nextInt();
      }while(checkIfLegal(row,col));
      g1.setCharacter(player,row,col);
   }
  public boolean checkIfLegal(int row, int column) {
        if ((row > 3 || column > 3) || (row < 0 || column < 0) || !isEmpty(row, column)) {
            return true;
        } else if (g1.getCharacter(row, column) == 'X' || g1.getCharacter(row, column) == 'O') {
            return true;
        }else
        return false;
    }
    public boolean isEmpty(int row, int col)
   {
      if(row<3 && col<3)
         if(g1.getCharacter(row, col) == '-')
            return true;
         else
            System.out.println("The Position is already taken!");
   
      return false;
   } 

   public boolean checkWinner()
   {  
      Scanner input = new Scanner(System.in);
      for(int row = 0;row<3;row++)
      
         if(g1.getCharacter(row, 0)==g1.getCharacter(row, 1) && g1.getCharacter(row, 1)==g1.getCharacter(row, 2) && g1.getCharacter(row, 0)!='-')
         {
            System.out.println("\nWinner is "+g1.getCharacter(row, 0));
            System.out.println("Play Again? Y or N");
            String str = input.next();
            if(str.equals("Y") || str.equals("y"))
            {
               
             clear();
               print(); 
                   
            }
            else
               System.exit(0);
            return true;           
         }
      
      for(int col = 0;col<3;col++)
      {
         if(g1.getCharacter(0, col)==g1.getCharacter(1, col) && g1.getCharacter(1, col)==g1.getCharacter(2, col)  && g1.getCharacter(0, col) !='-')
         {
            System.out.println("\nWinner is "+g1.getCharacter(0, col));
            System.out.println("Play Again? Y or N");
            String str = input.next();
            if(str.equals("Y") || str.equals("y"))
            {
               clear();
               print(); 
            }
            else
               System.exit(0);
            return true;
         
         }
         if(g1.getCharacter(0, 0)==g1.getCharacter(1, 1) && g1.getCharacter(1, 1)==g1.getCharacter(2, 2) && g1.getCharacter(0, 0)!='-')
         {
            System.out.println("\nWinner is "+g1.getCharacter(0, 0));
            System.out.println("Play Again? Yes or No");
            String str = input.next();
            if(str.equals("Y") || str.equals("y"))
            {
                clear();
               print();           
            }
            else
               System.exit(0);
            return true;  
         }
         if(g1.getCharacter(0, 2)==g1.getCharacter(1, 1) && g1.getCharacter(1, 1)==g1.getCharacter(2, 0) && g1.getCharacter(2, 0)!='-')
         {
            System.out.println("\nWinner is "+g1.getCharacter(1, 1));
            System.out.println("Play Again? Y or N");
            String str = input.next();
                           
            if(str.equals("Y") || str.equals("y"))
            {
               clear();
               print();            
            }
            else
               System.exit(0);
            return true;
         
         }
      }
      return false; 
   }
   public boolean isDraw() 
   {
      Scanner input = new Scanner(System.in);
      for (int row = 0; row <3 ; row++) 
      {
         for (int col = 0; col < 3; col++) 
         {
            if (g1.getCharacter(row, col) == '-') 
            {
               return false;  // an empty cell found, not draw, exit
            }
         }
      }
      System.out.println("\nIt's a Draw");
      System.out.println("Play Again? Y or N");
      String str = input.next();
                           
      if(str.equals("Y") || str.equals("y"))
      {
          clear();
          print();           
      }
      else
         System.exit(0);
   
      return true;  
}
   
      
      
    
}