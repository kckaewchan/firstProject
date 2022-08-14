`i
  // isPalNum(545)   -> true
  // isPalNum(1001)  -> true
  // isPalNum(13)    -> false
  // isPalNum(33)    -> true

  public boolean isPalNum(int num) {
    // there are two most important things to remember
    // to get most right number, we can do 'num % 10'
    // to remove most right number, we can do 'num / 10'
    // both will work for any numbers

    int copyOfOriginal = num;
    int reversedNumber = 0;
    int remainder;

    while(num > 0) {
      // get most right number
      remainder = num % 10;

      // multiply by 10 to concat, not to add(plus)
      reversedNumber = (reversedNumber * 10) + remainder;

      // remove most right number from num. 
      num = num / 10;
    }

    // if reversed version and original are equal so it's palindrome
    return reversedNumber == copyOfOriginal;
  }

  // Time Complexity: O(n)
  // Note:
  // 'remainder = num % 10;' 
  // here when num will become less than 10 expression will return that number
  // so that's how program copying last(first) number

  // 'num = num / 10;'  
  //  here when num will become less than 10 expression will make it 0
  //  and program will exit from the loop
