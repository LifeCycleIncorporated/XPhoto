package lifecycle.inc.xphoto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;

public class video_activity extends AppCompatActivity {

    private ListView videoListView;
    private String[] modelContent;
    private int[] Images = {
            R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six,R.drawable.seven, R.drawable.eight,R.drawable.nine,R.drawable.ten,

            R.drawable.eleven,R.drawable.twelve,R.drawable.thirteen,R.drawable.fourteen,R.drawable.fifteen,R.drawable.sixteen,R.drawable.seventeen, R.drawable.eighteen,R.drawable.nineteen,R.drawable.twenty};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_baseline_home);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        modelContent = getResources().getStringArray(R.array.content_name);

        videoListView=findViewById(R.id.videoListViewId);

        Adepter adepter = new Adepter(this,modelContent,Images);
        videoListView.setAdapter(adepter);

        videoListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(video_activity.this,display_activity.class);
                intent.putExtra("image_key", Images[i]);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()== android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
