class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
    if (intervals.length == 0) {
      return 0;
    }

    Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

    int remove = 0, freeTime = intervals[0][1];

    for (int i = 1; i < intervals.length; i++) {
      if (freeTime > intervals[i][0]) {
        remove++;
      } else {
        freeTime = intervals[i][1];
      }
    }

    return remove;
  }
}
