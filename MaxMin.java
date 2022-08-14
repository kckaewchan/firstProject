  
  // max({4, 781, 8, 99, 103})   -> 781
  // max({1, 2, 3, 4, 5})        -> 5
  // max({3, 4})                 -> 4
  // max({100})                  -> 100

  public int max(int[] arrNum) {
    // assume first element of array is biggest number
    int max = arrNum[0];

    // loop over the array and test our above assumption
    for(int i = 0; i < arrNum.length; i++) {
      // if max was not the biggest number, update it
      if(max < arrNum[i]) {
        max = arrNum[i];
      }
    }

    // after the loop max variable will hold the biggest number
    return max;                  
  }

  // Time Complexity: O(n)
