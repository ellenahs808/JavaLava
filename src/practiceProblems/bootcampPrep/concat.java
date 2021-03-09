package practiceProblems.bootcampPrep;


class Solution {
    public String concat(String word1, String word2) {
        String res = word1 + " " + word2;
        return res;
    }

    public static void main(String[] args) {
        Solution test1 = new Solution();
//        Solution test2 = new Solution();
        System.out.println(test1.concat("Hello", "World"));
        System.out.println(test1.concat("Try", "this"));
    }

}



