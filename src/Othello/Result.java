package Othello;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Result {

	Font font;
	Result(int status)
	{
		String str="";
		if(status ==1)
			str="PLAYER1WON";
		else if(status ==2)
			str="PLAYER2WON";
		else if(status==3)
			str="draw";
		
		JFrame j=new JFrame("the end");
		j.setBounds(200,200,500,430);
		j.setResizable(false);
        j.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
       
		JLabel jl1=new JLabel("Game Status: "+str);
		JLabel jl=new JLabel("");
		
		jl.setBounds(210, 200,490,420);
	    font = new Font("Times new Roman", Font.BOLD, 20);
	    jl1.setFont(font);
	    
		Icon end=new ImageIcon(Board.class.getResource("/images/dancing gif2.gif"));
jl.setIcon(end);
j.add(jl1,BorderLayout.NORTH);
//j.add(Board.newGame,BorderLayout.SOUTH);
//Board.newGame.addMouseListener(new MyMouseEvent());
j.add(jl,BorderLayout.CENTER);
j.setVisible(true);
	}
}
