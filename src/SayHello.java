import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;


public class SayHello extends java.applet.Applet {
	Font f =new Font("TimesRoman", Font.BOLD, 24);
	public void paint(Graphics screen){
		screen.setFont(f);
		screen.setColor(Color.RED);
		screen.drawString("Hello World",5,40);
	}

}
