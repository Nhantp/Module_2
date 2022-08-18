package ss4_lop_va_doi_tuong.bai_tap;

import java.time.LocalTime;
public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;
    StopWatch(LocalTime startTime, LocalTime endTime){
        this.startTime=startTime;
        this.endTime=endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }
    public LocalTime getEndTime() {
        return endTime;
    }

    StopWatch() {
        startTime = LocalTime.now();
    }

    public void start() {
        startTime = LocalTime.now();
    }
    public void end(){
        endTime = LocalTime.now();
    }

    public int getElapsedTime(){
        int milliSecond= (((endTime.getHour()-startTime.getHour())*3600)+(endTime.getMinute()*60-startTime.getMinute())*3600+
                (endTime.getSecond()-startTime.getSecond())*1000);
        return milliSecond;
    }

    public static void main(String[] args) {
        LocalTime start=LocalTime.now();
        LocalTime end=LocalTime.now();
        StopWatch stw=new StopWatch(start, end );
        System.out.println("Time:" +stw.getElapsedTime()+ " MilliSecond");
    }
}

