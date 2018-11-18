/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stopwatch;

import java.util.TimerTask;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ROUNA
 */
public class Stopwatch extends Thread {
	String writeThis;

	public Stopwatch() {
		this.writeThis = "00:00:00";
	}

    @Override
    public void run() {
        timerFunc();
    }

    public void timerFunc() {
        int charsWritten = 0;
        long start = System.currentTimeMillis();
        while (1 > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Stopwatch.class.getName()).log(Level.SEVERE, null, ex);
            }
            long elapsedTime = System.currentTimeMillis() - start;
            elapsedTime = elapsedTime / 1000;

            String seconds = Integer.toString((int) (elapsedTime % 60));
            String minutes = Integer.toString((int) ((elapsedTime % 3600) / 60));
            String hours = Integer.toString((int) (elapsedTime / 3600));

            if (seconds.length() < 2) {
                seconds = "0" + seconds;
            }

            if (minutes.length() < 2) {
                minutes = "0" + minutes;
            }

            if (hours.length() < 2) {
                hours = "0" + hours;
            }

            writeThis = hours + ":" + minutes + ":" + seconds;

            for (int i = 0; i < charsWritten; i++) {
                System.out.print("\b");
            }
            //System.out.print(writeThis);
            charsWritten = writeThis.length();
        }
    }

}
