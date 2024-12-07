class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));

        List<int[]> list = new ArrayList<>();
        int x=intervals[0][0];
        int y=intervals[0][1];
        for( int i=1;i<intervals.length;i++){
            int[] pair = intervals[i];
            if(y>=pair[0] && y<=pair[1]) y= pair[1];
            else if(y>=pair[0] ) y= y;
            else {
                int[] arr= new int[2];
                arr[0]= x;
                arr[1] = y;

                list.add(arr);
                x=pair[0];
                y=pair[1];
            }
        }
        int[] arr= new int[2];
        arr[0]= x;
        arr[1] = y;
        list.add(arr);
        return  list.toArray(new int[0][]);

    }
}