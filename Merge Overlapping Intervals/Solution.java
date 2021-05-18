public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        if(intervals==null || intervals.size()==0 || intervals.size()==1 ) return intervals;
        Collections.sort(intervals,Comparator.comparing(s -> s.start));
        int i=0;
        while(i<intervals.size()-1){
            Interval currentInterval=intervals.get(i);
            Interval nextInterval=intervals.get(i+1);
            if(currentInterval.end>=nextInterval.start){
                currentInterval.start=Math.min(currentInterval.start,nextInterval.start);
                currentInterval.end=Math.max(currentInterval.end,nextInterval.end);
                intervals.remove(i);
                intervals.remove(i);
                intervals.add(i,currentInterval);
                if(i>0)
                    i--;
            }
            else i++;
        }
        return intervals;
    }
}