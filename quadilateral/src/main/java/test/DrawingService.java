package test;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component("draw")
public class DrawingService implements Drawing {

    @Resource
    public Quadrilateral square;



    public void drawShape() {



        square.Draw();

    }


}
