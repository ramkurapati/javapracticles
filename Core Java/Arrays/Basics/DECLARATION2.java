package Basics;

public class DECLARATION2 {
    public static void main(String[] args)
    {
        int arr[][] = {{1,2,3,4},{10,20,30,40}};
        int arr1[][]={{1,2,4,5},{2,32},{5,6,7}};

        System.out.println(" This is no of rows in my array " +arr.length);
        System.out.println(" this is arr1.[1]'s length " +arr1[1].length);

        display(arr);
        display(arr1);

    }

public static void display(int x[][])
        {
    for(int row=0;row<x.length;row++)
        {
        for(int column=0;column<x[row].length;column++)
        {
            System.out.print(x[row][column]+ "\t");
        }
        System.out.println();
    }
}

}
