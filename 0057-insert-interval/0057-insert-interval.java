class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> list = new ArrayList<>();
        boolean inserted = false;

        // Insert in sorted order
        for (int[] interval : intervals) {
            if (!inserted && newInterval[0] < interval[0]) {
                list.add(newInterval);
                inserted = true;
            }
            list.add(interval);
        }

        if (!inserted) {
            list.add(newInterval);
        }

        // Merge intervals
        List<int[]> res = new ArrayList<>();

        int start = list.get(0)[0];
        int end = list.get(0)[1];

        for (int i = 1; i < list.size(); i++) {
            int s = list.get(i)[0];
            int e = list.get(i)[1];

            if (end >= s) {
                end = Math.max(end, e);
            } else {
                res.add(new int[]{start, end});
                start = s;
                end = e;
            }
        }

        res.add(new int[]{start, end});

        return res.toArray(new int[res.size()][]);
    }
}