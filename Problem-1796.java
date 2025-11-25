class Solution {
    public int secondHighest(String s) {
        ArrayList<Integer> arr= new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)){
                arr.add(c - '0');
            }
        }
        int firstLargest=-1;
        int secondLargest=-1;
        for (int num: arr){
            if(num>firstLargest){
                secondLargest=firstLargest;
                firstLargest=num;
            }
            else if(num>secondLargest && num!=firstLargest){
                secondLargest=num;
            }
        }
        return secondLargest;
    }

}
