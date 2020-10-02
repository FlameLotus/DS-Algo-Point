/*
    Swapping two numbers in java without using third variable
*/

class SwappingNumbers
{
    void main()
    {
    int a,b;
    a=5;
    b=8;
    System.out.println("numbers are:" a + "," + b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("numbers are:" a + "," + b);
    }

}
