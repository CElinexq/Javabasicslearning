package cn.itcast.day04.demo01;

public class Card
{
    private int Num;
    private String Suit;
    public String Display;


    public Card(int num, String suit)
    {
        String[] str = new String[4];
        str[0] = "♦";
        str[1] = "♠";
        str[2] = "♥";
        str[3] = "♣";

        String[] n = new String[13];
        n[0] = "A";
        n[1] = "2";
        n[2] = "3";
        n[3] = "4";
        n[4] = "5";
        n[5] = "6";
        n[6] = "7";
        n[7] = "8";
        n[8] = "9";
        n[9] = "10";
        n[10] = "J";
        n[11] = "Q";
        n[12] = "K";

        String[] dis = new String[54];
        int index = 0;
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 13; j++)
            {
                dis[index] = str[i] + n[j];
                index++;
            }
        }
        dis[52]="大王";
        dis[53]="小王";
    }

}
