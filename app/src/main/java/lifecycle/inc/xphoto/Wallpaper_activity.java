package lifecycle.inc.xphoto;
// this activity is successful coding
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;

public class Wallpaper_activity extends AppCompatActivity {

    private ListView wallpaperListView;
    private String[] modelContent;
    private int[] Images = {
            R.drawable.wone,
            R.drawable.wtwo,
            R.drawable.wthree,
            R.drawable.wfour,
            R.drawable.wfive,
            R.drawable.wsix,
            R.drawable.wseven,
            R.drawable.weight,
            R.drawable.wnine,
            R.drawable.wten};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_baseline_home);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        modelContent = getResources().getStringArray(R.array.content_name);

        wallpaperListView=findViewById(R.id.wallpaperListViewId);

        Adepter adepter = new Adepter(this,modelContent,Images);
        wallpaperListView.setAdapter(adepter);

        wallpaperListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Wallpaper_activity.this,display_activity.class);
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
