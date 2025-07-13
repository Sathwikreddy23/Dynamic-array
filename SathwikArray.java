class MyArray
{
    private int[] array;
    private int capacity;
    private int length;
    
   public MyArray(int capacity)
    {
      this.capacity = capacity;
      array = new int[capacity];
      length = 0;
    }

    public void add(int number)
    {
      if(length==capacity)
      {
        resize();
      }

      arr[length]=number;
      length++;
    }

  public void remove()
  {
    if(length==0)
    {
      System.out.println("there is no element to remove");
    }
    else
    {
      for(int i =1;i<length-1;i++)
        {
          arr[i-1]=arr[i];
        }
      arr[length-1]=0;
      length--;
    }
    
  }

    public void resize()
  {
    capacity = capacity*2;
    int[] newarr = new int[capacity];
    for(int i=0;i<length;i++)
      {
        newarr[i] = arr[i];
      }
    arr = newarr;
  }

  public void getCapacity()
  {
    System.out.println("This is the capacity of the array"+capacity);
  }

  public void getLength();
  {
    System.out.println("This is the length of the array"+length);
  }

  public void print()
  {
    for(int i=0;i<length;i++)
      {
        System.out.print(arr[i]);
      }
    System.out.println("");
  }

}

public class SathwikArray
{
  public static void main(String[] args)
  {
    MyArray arr = new MyArray(5);
    arr.getCapacity();
    arr.getLength();
    arr.add(10);
    arr.add(20);
    arr.add(30);
    arr.add(40);
    arr.print();
    arr.remove();
    System.out.println("after removing");
    arr.print();
  }
}
