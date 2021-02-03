package com.javapractice;

public class snakeLadderUc5{
public static final int noPlay=0;
public static final int snake=2;
public static final int ladder=1;

public static void main(String[] args) {
	
		int userget=0 ,CurrentPos=0;
		
		
		while (CurrentPos<100)
		{
			int roll=(int)(Math.floor(Math.random()*10)%3);
		if (roll==noPlay)
		{
			System.out.println("Its not your turn to roll dice wait for your chance");
		}
		else if(roll==ladder)
		{
			userget=(int) (Math.floor(Math.random()*(6-1+1)+1));
			System.out.println("Player roll the dice and get ladder="+userget);
				if (CurrentPos+userget<=100)
				{
				CurrentPos=CurrentPos+userget;
				System.out.println("Player current in position on board is="+CurrentPos);		
				}
				else 
					break;
		}
		else 
			{
			userget=(int) (Math.floor(Math.random()*(6-1+1)+1));
			CurrentPos=CurrentPos-userget;
			System.out.println("Player roll the dice and snake bite you ="+userget);
			System.out.println("After snake bite your current position ="+CurrentPos);
			if (CurrentPos<0)
				CurrentPos=0;
			}
		}
	}
	}
