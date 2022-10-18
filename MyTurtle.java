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
        setDelay(1);
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
        //double d = myAngle.angle(); // ta dando um probleminha pra puxar essa funcao
        this.relative_position(5, angle);
        this.square(3);
        this.relative_position(2, 180);
        pen.setStrokeWidth(90);
        for(double i = 0; i<30; i = i + 0.2){
            this.circle(i);
            relative_position(i*5, i*150);
        }
        


    }
    private void square(double size) {
		for (int i = 0; i < 4; i++) {
			this.forward(size);
			this.turn(90);
		}
	}

    private void relative_position(double px, double angle) {
        pen.up();
        this.turn(angle);
        this.forward(px);
        pen.down();
    }

    private void circle(double size){
        for(int i = 0; i<360; i++){
            this.forward(size);
            this.turn(1);
        }
    }

}
