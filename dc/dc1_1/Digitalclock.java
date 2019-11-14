package dc1_1;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;

public class Digitalclock extends Frame implements Runnable {

	static int h; //時
	static int m; //分
	static int s; //秒

	boolean a = true;

	//インスタンス
	static Digitalclock f = new Digitalclock();
	static Thread th = new Thread(f);
	Calendar now = Calendar.getInstance();

	public static void main(String args[]) {

		//フレーム作成
		f.setSize(200, 100);
		f.setVisible(true);
		f.addWindowListener(new Ada());

		th.start(); //スレッドスタート
	}

	public void run() {
		while (a == true) {
			h = now.getInstance().get(now.HOUR_OF_DAY); //時を代入
			m = now.getInstance().get(now.MINUTE); //分を代入
			s = now.getInstance().get(now.SECOND); //秒を代入
			repaint();

			try {
				th.sleep(1000); //スリープ１秒
			} catch (InterruptedException e) {

			}
		}
	}

	public void paint(Graphics g) {
		g.drawString(h + ":" + m + ":" + s, 50, 59);
	}

}

class Ada extends WindowAdapter {
	public void windowClosing(WindowEvent e) { //×を押されたときの処理
		System.exit(0);
	}
}
