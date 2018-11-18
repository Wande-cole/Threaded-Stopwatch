/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stopwatch;

/**
 *
 * @author WANDE
 */
public class MyTime extends Thread{
	String currentTime;
	
	public MyTime() {
		this.currentTime = "00:00:00";
	}
	
	public String timer(){
		String curTime = this.currentTime;
		int num = 0;
		while(true){
			curTime = "00:00:0"+num;
			num++;
			return curTime;
		}
	}

	@Override
	public void run() {
		timer();
	}
	
	
}
