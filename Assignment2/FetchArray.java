package Assignment2;
// Ajay Samsundar
import java.util.Random;

public class FetchArray {
    private long[] arr;  
    private int nElems; 

    public FetchArray(int max)
    {
        arr = new long[max];
        nElems = 0; 
    }
    public void load(){
        for (int i = 0; i < arr.length; i++) {  
            arr[i]=i;
            nElems++;
            }
    }
    public void display(){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public void find (long searchKey){
        int lowerBound = 0;
        int upperBound = nElems-1; 
        int CurIn;

        while (true)
        {
            CurIn = (lowerBound+upperBound)/2;
            if(arr[CurIn]==searchKey){
                System.out.println(CurIn);
                break;
        }
        else if(lowerBound>upperBound){
            System.out.println("Not found");
            break;
        }
        else
        {
            if(arr[CurIn]<searchKey) 
            lowerBound = CurIn + 1;
            
            else 
            upperBound = CurIn - 1;
            
        }
    }
    }
    public void search(long searchKey){         // fetch algorithm 
        for (int i = 0; i < nElems; i++) {
            if (arr[i] == searchKey){
                System.out.println(i);
            }
        }
    }
    public void insert(int num){                // insert algorithm 
        arr[nElems++] = num;
    }
    public void insert(){
        int randNum = randNum();
        arr[nElems++] = randNum;
    }
    public int randNum (){          // random number generator with numbers from 0-100
        Random rand = new Random();
        int randNum = rand.nextInt(101);
        return randNum;
    }
    }



