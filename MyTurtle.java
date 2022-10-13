public class MyTurtle extends BaseTurtle {

    public void draw () {
        int angle = -144;
        int size = 3;
        /*pen.setColor(255, 0, 0);
        pen.setStrokeWidth(30);
        for(int i = 0; i < 5; i++ ){
            this.forward(size);
            this.turn(angle);
            this.forward(size);
            this.turn(72 - angle);
        }
        pen.setColor(255, 255, 0);
        pen.setStrokeWidth(10);
        for(int i = 0; i < 5; i++ ){
            this.forward(size);
            this.turn(angle);
            this.forward(size);
            this.turn(72 - angle);
        }
        pen.setColor(0, 255, 0);
        pen.setStrokeWidth(6);
        for(int i = 0; i < 5; i++ ){
            this.forward(size);
            this.turn(angle);
            this.forward(size);
            this.turn(72 - angle);
        }
        pen.setColor(0, 0, 255);
        pen.setStrokeWidth(2);
        for(int i = 0; i < 5; i++ ){
            this.forward(size);
            this.turn(angle);
            this.forward(size);
            this.turn(72 - angle);
        }*/
        
        int n = 5; // tamanho do vetor
        //int v[] = new int[n]; // declaração e alocação de espaço para o vetor "v"
        int v[] = {30, 10, 6, 3, 1};
        for(int j=0; j < 5; j++){
            //v[j] = (int)Math.round(Math.random() * 2);
            pen.setStrokeWidth(v[j]);
            pen.setRandomColor();
            for(int i = 0; i < 5; i++ ){
                this.forward(size);
                this.turn(angle);
                this.forward(size);
                this.turn(72 - angle);
            } 
        }
    }
}