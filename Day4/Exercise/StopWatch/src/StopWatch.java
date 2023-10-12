package src;

public class StopWatch {
    long startTime;
    long endTime;

    public StopWatch(){}

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void end(){
        this.endTime = System.currentTimeMillis();
    }

    public  long getElapsedTime(){
        return  this.endTime - this.startTime;
    }
}
