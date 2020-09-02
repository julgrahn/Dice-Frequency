package dices;
import java.util.Random;

public class Dice
{
    private static Random rand = new Random();
    private int value;

    public Dice()
    {
        value = 1;
    }

    public int throwDice()
    {
        value = rand.nextInt(6) + 1;
        return value;
    }

    public int getValue()
    {
        return value;
    }

    @Override
    public String toString()
    {
        String diceInfo = "value = " + value;
        return diceInfo;
    }
}
