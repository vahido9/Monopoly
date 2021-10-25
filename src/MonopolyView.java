import javax.swing.*;

public class MonopolyView extends JFrame {
    private BoardPanel boardPanel;

    public MonopolyView(String title) {
        super(title);
        boardPanel = new BoardPanel(new MonopolyBoard());
        this.add(boardPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MonopolyView mv = new MonopolyView("Monopoly");
    }
}
