package graphcalculator;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class gui extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public gui() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 848, 600);
	}
	
	 public static void main(String[] args) {
		 
		 JTextField text1 = new JTextField();
		 text1 = new JTextField("文字を入力してください");
		 text1.setBounds(0, 540, 500, 30);
		 
		 JLabel label = new JLabel();
		 label.setText("どうしよう");
		 label.setBackground(Color.BLUE);
		 label.setBounds(0,520,300,20);
		 
		 JButton button =new JButton("取得");
		 button.setBounds(500, 540, 100, 30);
		 
		 JPanel panel = new JPanel();
		 panel.setBackground(Color.GRAY);
		 panel.add(text1);
		 panel.add(button);
		 panel.add(label);
		 panel.setLayout(null);
		 
		 gui frame = new gui();
		 frame.setVisible(true);
		 frame.setTitle("グラフ計算機");
		 frame.setResizable(false);
		 frame.add(panel);
		 
		 Canvas canvas = new Canvas();
		 canvas.setBackground(Color.LIGHT_GRAY);
		 canvas.setBounds(0,0,848, 400);
		 panel.add(canvas);
		
	 }
	 class AppCanvas extends Canvas{
		  //以下に描画したい内容を書く
		  public void paint(Graphics g){
		    int x,y;//描画するための横位置の基準
		    int w,h;
		    x=20;y=20;
		    w=20;h=20;
		    g.fillRect(x, y, w, h);
		  }
	 }
}