package com.test;

import java.util.ArrayList;
import java.util.List;

public class JumpRecord {

    private final List<Double> jumpDistance;
    private static int jumps;
    private static int maxJumps;
    private static int foulJumps;

    public JumpRecord(final int maxJumps) {
        jumps = 0 ;
        this.maxJumps = maxJumps;
        foulJumps = 0;
        jumpDistance = new ArrayList<Double>();
    }

    public void recordJump(final double distance) {

        if(!finished()) {
            jumpDistance.add(distance);
        }
        jumps ++;

    }

    void recordFoulJump() {

        if(!finished()) {
            jumpDistance.add((double) -1); // as the distance cant be -1, we know that it is a foulJump is we find -1 as the distance
        }
        jumps++;
        foulJumps++;
    }

    public int jumps() {
        return jumps;
    }

    public boolean finished() {
        return jumps>=maxJumps;
    }

    public int maxJumps() {
        return maxJumps;
    }

    public int foulJumps() {
        return foulJumps;
    }

    boolean isFoulJump(final int n) {
        return jumpDistance.get(n-1) == -1;
    }

    double getJumpDistance(final int n) {
        return jumpDistance.get(n-1);
    }

    int getLongest() {
        final Double max = Double.MIN_VALUE;
        int jumpNumber = -1;
        for(int i = 0 ; i < maxJumps; i++) {
            if(max < jumpDistance.get(i)) {
                jumpNumber = i+1;
            }
        }
        return jumpNumber;
    }

}





