package dc1_2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.util.Calendar;

public class Digitalclock extends Frame implements Runnable {

	static int h; //時
	static int m; //分
	static int s; //秒

	boolean a = true; //ループ条件

	static Font font = new Font("Serif", Font.BOLD + Font.ITALIC, 60); //フォント
	static Color bk; //背景色

	static PDialog dlg; //ダイアログ

	static final long serialVersionUID = 1L;
	static int width;
	static int height;
	static BufferedImage bi;
	static Graphics2D offs;

	//インスタンス
	static Digitalclock f = new Digitalclock();
	static Thread th = new Thread(f);
	Calendar now = Calendar.getInstance();

	public void init() {
		width = getWidth();
		height = getHeight();
		bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		font = new Font("Serif", Font.BOLD + Font.ITALIC, 60);
		bk = Color.white;
		offs = (Graphics2D) bi.getGraphics();

	}

	public static void main(String args[]) {

		//フレーム作成
		f.setSize(400, 400);
		f.setVisible(true);
		f.addWindowListener(new Adapter());

		//メニュー作成
		MenuBar mb = new MenuBar();
		Menu menubar = mb.add(new Menu("メニュー", true));
		menubar.add(new MenuItem("プロパティ"));
		f.setMenuBar(mb);

		//ダイアログ作成
		dlg = new PDialog(f);

		//スレッドスタート
		th.start();
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
		setBackground(bk);
		g.setFont(font);
		//setLayout(new FlowLayout(FlowLayout.CENTER, 5, 20));
		g.drawString(h + ":" + m + ":" + s, 150, 200);
	}

	public boolean action(Event ev, Object arg) {
		if (ev.target instanceof MenuItem) {
			if (arg.equals("プロパティ"))
				dlg.setVisible(true);
		}
		return true;
	}

}

class PDialog extends Dialog implements ActionListener {
	PDialog(Frame owner) {
		super(owner);
		setLayout(new FlowLayout());
		Button b1 = new Button("終了");
		b1.addActionListener(this);
		add(b1);
		setTitle("PDialog");
		setResizable(false);
		setSize(200, 200);
	}

	public void actionPerformed(ActionEvent e) {
		setVisible(false);
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}

class Adapter extends WindowAdapter {

	public void windowClosing(WindowEvent e) { //×を押されたときの処理
		System.exit(0);
	}

}
