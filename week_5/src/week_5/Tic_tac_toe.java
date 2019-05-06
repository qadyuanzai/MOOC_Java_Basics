package week_5;

import java.util.Scanner;

public class Tic_tac_toe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		final int SIZE = 3;
		int[][] board = new int[SIZE][SIZE];
		boolean gotResult = false;
		int numOFX = 0;
		int numOFO = 0;
		
		//读入矩阵
		for(int i = 0; i<SIZE; i++)
		{
			for(int j = 0; j<SIZE; j++)
			{
				board[i][j] = in.nextInt();
			}
		}
		
		//检查行
		for(int i = 0; i<SIZE; i++)
		{
			numOFX = 0;
			for(int j = 0; j<SIZE; j++)
			{
				if(board[i][j]==1)
				{
					numOFX++;
				}
			}
			if(numOFX==3||numOFX==0)
			{
				gotResult = true;
			}
		}
		
		//检查列
		for(int j = 0; j<SIZE; j++)
		{
			numOFX = 0;
			for(int i = 0; i<SIZE; i++)
			{
				if(board[i][j]==1)
				{
					numOFX++;
				}
			}
			if(numOFX==3||numOFX==0)
			{
				gotResult = true;
			}
		}
		
		//检查对角线
		numOFX = 0;
		for(int i = 0; i<SIZE; i++ )
		{
			if(board[i][i]==1)
			{
				numOFX++;
			}
		}
		if(numOFX==3||numOFX==0)
		{
			gotResult = true;
		}
		
		//检查反对角线
		numOFX = 0;
		for(int i = 0; i<SIZE; i++)
		{
			if(board[i][SIZE - i - 1]==1)
			{
				numOFX++;
			}
		}
		if(numOFX==3||numOFX==0)
		{
			gotResult = true;
		}
		
		//输出矩阵
		for(int i = 0; i<SIZE; i++)
		{
			for(int j = 0; j<SIZE; j++)
			{
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		
		//输出判断
		System.out.println(gotResult);
	}
}
