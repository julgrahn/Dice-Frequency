package dices;

public class DiceMain
{
    public static void main(String[] args)
    {
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        System.out.println(d1.toString() + ", " + d2.toString());
        d1.throwDice();
        d2.throwDice();
        System.out.println(d1.toString() + ", " + d2.toString());

       int[] freq = new int[6];
       int v;

       for(int i = 0; i < 1000; i++)
       {
           d1.throwDice();
           v = d1.getValue();
           freq[v-1] = freq[v-1] + 1;
       }

       double rel_freq;

       for(int i = 0; i < freq.length; i++)
       {
           rel_freq = freq[i]/1000.0;
           System.out.println((i + 1) + ": " + rel_freq);
       }
    }
}
