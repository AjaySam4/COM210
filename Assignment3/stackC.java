package Assignment3;

public class stackC {

private int maxSize;
private char[] stackArray;
private int top;

    public stackC(int s)
{
    maxSize = s; 
    stackArray = new char[maxSize];
    top = -1;
}
public void push(char c)
{
    stackArray[++top] = c;
}

public long pop()
{
    return stackArray[top--];
}

public boolean isEmpty()
{
    return (top == -1);
}

public boolean isFull()
{
    return (top == maxSize-1);
}
}

