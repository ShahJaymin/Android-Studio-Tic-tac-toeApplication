/* Jaymin Shah
   CS 207 Summer 2016
   Assignment 4
*/
import java.util.*;
public class Gameboard
{
   private char[][] gameboard;
   
   public Gameboard(int row,int  col)
   {
      gameboard = new char[row][col];
      for(row = 0;row<gameboard.length;row++)
      {
         for(col = 0;col<gameboard[row].length;col++)
         {
            gameboard[row][col] = '-';
         }
      }      
   }
   
   public void printBoard()
   {
      for(int i = 0; i < gameboard.length; i++)
      { 
         for(int j = 0; j < gameboard[i].length; j++)
         {
            System.out.print(gameboard[i][j]);
            if(j ==0 || j == 1)
            {
               System.out.print("|");
            }
         }
         if(i==0 || i==1)
         {
            System.out.print("\n------\n");
         }
      }
   }
   public char getCharacter(int row, int col)
   {
      return(this.gameboard[row][col]);
   }
   
      public void setCharacter(char player,int row,int col)
   {
      gameboard[row][col]= player;
   } 
   
  
   public boolean clearBoard()
   {
      
      for(int row = 0;row<gameboard.length;row++)
      {
         for(int col = 0;col<gameboard[row].length;col++)
         {
            gameboard[row][col] = '-';
         }
      } 
      return false;
   }
}