public class Unit8_1a
{
  //Method by Tomas Oh, Period 2
  public int [] [] modifyRows (int [] [] array)
  {
    int[][] newArray = new int[array.length][array[0].length];
    for(int row = 0; row < newArray.length; row++)
    {
      for(int col = 0; col < newArray[0].length; col++)
      {
        if(row %2 == 0)
        {
          newArray[row][col] = array[row][col];
        }
        if(row %2 == 1)
        {
          newArray[row][col] = newArray[row - 1][col];
        }
     }
   }
  return newArray; 
  }
}
 