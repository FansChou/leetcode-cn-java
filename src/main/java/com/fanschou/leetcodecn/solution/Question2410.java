package com.fanschou.leetcodecn.solution;

import java.util.Arrays;

public class Question2410 {

    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int m = players.length;
        int j = 0;
        for (int trainer : trainers) {
            if(j < m && players[j] <= trainer) {
                j++;
            }
        }

        return j;
    }
}
