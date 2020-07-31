package com.test;
public class TestJumpRecord {

    public static void main(final String [] args) {
        final com.test.JumpRecord jumpRecord = new com.test.JumpRecord(3);

        //Test 1
        if(jumpRecord.maxJumps() == 3) {
            System.out.println("Test 1 \n Pass");
        }
        else {
            System.out.println("Test 1 \n Failed");
        }

        //Test 2
        jumpRecord.recordJump(2.9);

        if(jumpRecord.jumps() == 1) {
            System.out.println("Test 2 \n Pass");
        }
        else {
            System.out.println("Test 2 \n Failed");
        }

        //Test 3
        jumpRecord.recordFoulJump();

        if(jumpRecord.isFoulJump(2)) {
            System.out.println("Test 3 \n Pass");
        }
        else {
            System.out.println("Test 3 \n Failed");
        }

        //Test 4
        if(jumpRecord.finished() == false) {
            System.out.println("Test 4 \n Pass");
        }
        else {
            System.out.println("Test 4 \n Failed");
        }

        //Test 5
        jumpRecord.recordJump(3.0);

        if(jumpRecord.getLongest() == 3) {
            System.out.println("Test 5 \n Pass");
        }
        else {
            System.out.println("Test 5 \n Failed");
        }


        //Test 6
        if(jumpRecord.foulJumps() == 1) {
            System.out.println("Test 6 \n Pass");
        }
        else {
            System.out.println("Test 6 \n Failed");
        }

        //Test 7
        if(jumpRecord.jumps() == 3) {
            System.out.println("Test 7 \n Pass");
        }
        else {
            System.out.println("Test 7 \n Failed");
        }



    }

}
