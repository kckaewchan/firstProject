
  // revArr({1, 2, 3, 4, 5}) -> {5, 4, 3, 2, 1}
  // revArr({1})             -> {1}
  // revArr({1, 2, 3})       -> {3, 2, 1}

  public void revArr(int[] arrNum) {
    // we will use two 'pointers'. One pointer will start from the beginning
    // another one from the back and we will swap their values

    // pointer that will start from the back
    int j = arrNum.length - 1;

    // our loop will go till half of our input array
    // 'i' is a pointer that will start from the beginning
    for(int i = 0; i < arrNum.length / 2; i++) {
      // swap elements using positions of i and (j - i)
      int tmp = arrNum[i];
      arrNum[i] = arrNum[j - i];
      arrNum[j - i] = tmp;
    }
  }
  
  // Time Complexity: O(n/2) but basically we can say O(n)
  // Note: 
  // Array works with references(same objects) so if we will modify argument
  // it will have effect on an original array.
