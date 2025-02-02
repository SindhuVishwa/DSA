public class ValidPalindrome125 {

/*    public boolean isPalindrome(String s) {

       String str =  s.toLowerCase().replaceAll("[^a-z0-9]","").trim();

      // System.out.println(str);

       for(int i =0; i< str.length()/2; i++) {
      //     System.out.println(str.charAt(i) + " " + str.charAt(str.length()-1-i));
           if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
           }
       }
       return true;
    }*/

    public boolean isPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            while (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))) {
               return false;
            }
               start++;
               end--;

        }
        return true;
    }


    public static void main(String[] args) {

        ValidPalindrome125 validPalindrome125 = new ValidPalindrome125();
        System.out.println(validPalindrome125.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(validPalindrome125.isPalindrome("raceacar"));
        System.out.println(validPalindrome125.isPalindrome(" "));

    }

}
