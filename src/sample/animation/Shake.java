package sample.animation;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class Shake {
    private TranslateTransition tt;

    public Shake(Node node) {
        tt = new TranslateTransition(Duration.millis(70), node);
        tt.setFromX(0f); // перемещения ноуда по оси Х
        tt.setByX(10f); // перемещение по оси Y
        tt.setCycleCount(3);
        tt.setAutoReverse(true);// возвращает node на место
    }

    public void playAnim() {
        tt.playFromStart();
    }
}
