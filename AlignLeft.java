package SP;

import SP.Paragraph;
import SP.AlignmentStrategy;

public class AlignLeft implements AlignmentStrategy {

    @Override
    public void render(Paragraph p) {
        System.out.println(p.getText()+"###");
    }
}
