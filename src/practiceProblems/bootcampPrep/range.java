package practiceProblems.bootcampPrep;

class Range {
    public int[] range(int start, int end) {
        int num = end - start;

        int[] newArr = new int[num + 1];
        for (int i = start; i <= end; i++) {
            newArr[i] = i;
        }
        int i = 0;
        while (i <= num + 1) {
            newArr[i] =
            i++;
        }

        return newArr;
    }

    public static void main(String[] args) {
        Range test1 = new Range();
        System.out.println(test1.range(5, 8));
    }
}
