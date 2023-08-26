package lifecycle.inc.xphoto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView modelCardView, sexyCardView, openCardView, videoCardView, womanCardView, aboutCardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        modelCardView=findViewById(R.id.modelCardViewId);
        sexyCardView=findViewById(R.id.sexyCardViewId);
        openCardView=findViewById(R.id.openCardViewId);
        videoCardView=findViewById(R.id.videoCardViewId);
        womanCardView=findViewById(R.id.forWomanCardViewId);
        aboutCardView=findViewById(R.id.aboutCardViewId);

        modelCardView.setOnClickListener(this);
        sexyCardView.setOnClickListener(this);
        openCardView.setOnClickListener(this);
        videoCardView.setOnClickListener(this);
        womanCardView.setOnClickListener(this);
        aboutCardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.modelCardViewId) {
            Intent intent = new Intent(MainActivity.this,model_activity.class);
            startActivity(intent);}

        if (view.getId()==R.id.sexyCardViewId) {
            Intent intent = new Intent(MainActivity.this,sexy_activity.class);
            startActivity(intent);}

        if (view.getId()==R.id.openCardViewId) {
            Intent intent = new Intent(MainActivity.this,open_activity.class);
            startActivity(intent);}

        if (view.getId()==R.id.videoCardViewId) {
            Intent intent = new Intent(MainActivity.this,video_activity.class);
            startActivity(intent);}

        if (view.getId()==R.id.forWomanCardViewId) {
            Intent intent = new Intent(MainActivity.this, Wallpaper_activity.class);
            startActivity(intent);}

        if (view.getId()==R.id.aboutCardViewId) {
            Intent intent = new Intent(MainActivity.this,about_activity.class);
            startActivity(intent); }
    }
}