class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Interval[] interval = new Interval[intervals.length];

        for(int i = 0; i < intervals.length; i++) {
            interval[i] = new Interval(intervals[i][0], intervals[i][1]);
        }

        Arrays.sort(interval, (a,b) -> a.end - b.end);

        int remove = 0, freeTime = interval[0].end;

        for (int i = 1; i < interval.length; i++) {
            if (interval[i].start < freeTime) {
                remove++;
            } else {
               freeTime = interval[i].end;
            }
        }

        return remove;
        
    }
}

// Interval data
class Interval {
    int start;
    int end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}