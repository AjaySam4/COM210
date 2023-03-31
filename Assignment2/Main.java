package Assignment2;


class Apples{
    public static void main(String[] args) {

      // create arrays of 10, 100, 1000 elements 
      FetchArray arr = new FetchArray(10);
      FetchArray arr2 = new FetchArray(100);
      FetchArray arr3 = new FetchArray(1000);

// load array and make sure there is enough space to insert
      for (int i = 0; i < 7; i++){
        arr.insert();
      }
      for (int i = 0; i < 90; i++){
        arr2.insert();      }
      for (int i = 0; i < 990; i++){
        arr3.insert();
      }

      // unsorted insert algorithm 
arr.insert(4);
arr2.insert(4);
arr3.insert(4);
      // unsorted fetch algorithm 
arr.search(4);
arr2.search(4);
arr3.search(4);

  }
}