public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        if(intervals==null ){
            intervals=new ArrayList<>();
            intervals.add(newInterval);
            return intervals;
        }
        if(intervals.size()==0) {
            intervals.add(newInterval); 
            return intervals;
        }
        int i=0;
        Interval toInsert=newInterval;
        while(i<intervals.size()){
            Interval currentInterval=intervals.get(i);
            if(currentInterval.end<toInsert.start){
                i++;
                continue;
            }
            else if(toInsert.end<currentInterval.start){
                intervals.add(i,toInsert);
                break;
            }
            else{
               toInsert.start= Math.min(currentInterval.start,toInsert.start);
               toInsert.end= Math.max(currentInterval.end,toInsert.end);
               intervals.remove(i);
            }
        }
        if(i==intervals.size())
        intervals.add(toInsert);
        return intervals;

    }
}
