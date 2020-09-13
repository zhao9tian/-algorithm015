package lc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lc_46 {

    List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> track = new LinkedList<Integer>();
        generate(track,new boolean[nums.length],nums);
        return result;
    }

    private void generate(LinkedList<Integer> track,boolean[] visited,  int[] nums) {

        if (nums.length == track.size()) {
            result.add(new LinkedList(track));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;
            track.add(nums[i]);
            visited[i] = true;
            generate(track,visited, nums);
            track.removeLast();
            visited[i] = false;
        }
    }
}
