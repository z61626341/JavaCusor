package Interface;

import static java.lang.System.out; 

public class Game {
	public static void main(String[] arg) {
		play(Action.RIGHT);
		play(Action.UP);
	}
	
	public static void play(int action) {
		switch(action) {
			case Action.STOP:
				out.print("播放停止動畫");
				break;
			case Action.RIGHT:
				out.print("播放向右動畫");
				break;
			case Action.LEFT:
				out.print("播放向左動畫");
				break;
			case Action.UP:
				out.print("播放向上動畫");
				break;
			case Action.DOWN:
				out.print("播放向下動畫");
				break;
			default:
				out.print("不支援此動作");
		}
	}
}
