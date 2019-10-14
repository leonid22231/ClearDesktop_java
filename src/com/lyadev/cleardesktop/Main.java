package com.lyadev.cleardesktop;

public class Main implements Runnable{
Thread winThread = null;
Window mainWindow = new Window();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Main().start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (winThread != null) {
		      try {
		        Thread.sleep(100);
		      } catch (InterruptedException e) {
		      }
		      
		    }
		    winThread = null;
		
	}
	public void start() {
		if(winThread == null) {
		winThread = new Thread(mainWindow);
		winThread.start();
		}
	}
	public void stop() {
		winThread = null;
	}

}
