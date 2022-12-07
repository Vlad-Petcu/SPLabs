package SP;

import SP.Paragraph;
import SP.AlignmentStrategy;

public class AlignCenter implements AlignmentStrategy {

    @Override
    public void render(Paragraph p) {
        System.out.println("###"+p.getText()+"###");
    }
}
