package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.shapes.Circle;
import br.edu.ifpb.padroes.shapes.CompoundShape;
import br.edu.ifpb.padroes.shapes.Dot;
import br.edu.ifpb.padroes.shapes.Rectangle;
import br.edu.ifpb.padroes.editor.ImageEditor;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED),
                        new Rectangle(110, 110, 100, 100, Color.BLACK)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
