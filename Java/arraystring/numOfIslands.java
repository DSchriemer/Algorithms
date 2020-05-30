class template {

  //given a 2d grid of 1 and 0s, output how many islands
  //1 = land, 0 = water
  //1110
  //11010
  //10000
  //00000
  //1 island

public static void main(String[] args){
  char[][] s = new char[5][5];
  System.out.println(method(s));
}


  public static int method(char[][] grid) {

    if(grid == null || grid.length == 0)
    {
      return 0;
    }

    int numIslands = 0;

    for(int i = 0; i < grid.length; i++)
    {
      for(int j = 0; j < grid[i].length; j++)
      {
        if(grid[i][j] == '1')
        {
          numIslands += dfs(grid, i, j);
        }
      }
    }
    return numIslands;

  }

  public int dfs(char[][] grid, int i, int j)
  {
    if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0')
    {
      return 0;
    }

    grid[i][j] = '0';
    dfs(grid, i +1, j);
    dfs(grid, i-1, j);
    dfs(grid, i, j+1);
    dfs(grid, i, j-1);

    return 1;
  }
}
