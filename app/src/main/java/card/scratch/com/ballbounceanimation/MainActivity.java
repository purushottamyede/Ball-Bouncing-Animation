package card.scratch.com.ballbounceanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {

    private Animation bounce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bounce = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
        bounce.setAnimationListener(this);
        ImageView imgLogo = findViewById(R.id.imgLogo);
        imgLogo.startAnimation(bounce);

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        if (animation == bounce) {

        }
    }

    @Override
    public void onAnimationRepeat(Animation animation) {
        // Animation is repeating
    }

    @Override
    public void onAnimationStart(Animation animation) {
        // Animation started
    }

}
