package com.dxc.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.logging.Logger;

public class ForkJoinPoolTest extends RecursiveAction {
	 
    private static String workload = "aaaassssssssssssssggggggggbbbbbbbbbbbbb";
    private static final int THRESHOLD = 4;
 
    private static Logger logger = 
      Logger.getAnonymousLogger();
 
    public ForkJoinPoolTest(String workload) {
        this.workload = workload;
    }
 
    @Override
    protected void compute() {
        if (workload.length() > THRESHOLD) {
            ForkJoinTask.invokeAll(createSubtasks());
        } else {
           processing(workload);
        }
    }
    static List<ForkJoinPoolTest>  subtasks = new ArrayList<>();
    private List<ForkJoinPoolTest> createSubtasks() {
       
 
        String partOne = workload.substring(0, workload.length() / 2);
        String partTwo = workload.substring(workload.length() / 2, workload.length());
 
        subtasks.add(new ForkJoinPoolTest(partOne));
        subtasks.add(new ForkJoinPoolTest(partTwo));
 
        return subtasks;
    }
 
    private void processing(String work) {
        String result = work.toUpperCase();
        logger.info("This result - (" + result + ") - was processed by "
          + Thread.currentThread().getName());
    }
    
    public static void main(String args[]) {
    	ForkJoinPool commonPool = ForkJoinPool.commonPool();
    	commonPool.invokeAll(subtasks);
    	ForkJoinPoolTest test= new ForkJoinPoolTest(workload);
    	ForkJoinPoolTest.invokeAll(subtasks);
    }
}
