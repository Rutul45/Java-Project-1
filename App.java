import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        
        int boardWidht = 1200;
        int boardHeight = 900;

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(boardWidht,boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame = new SnakeGame(boardWidht, boardHeight);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();
    }
}
