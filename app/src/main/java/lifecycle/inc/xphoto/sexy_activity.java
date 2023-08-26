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

public class sexy_activity extends AppCompatActivity {

    private ListView sexyListView;
    private String[] modelContent;
    private int[] Images = {
            //1-10
            R.drawable.sone,R.drawable.stwo,R.drawable.sthree,R.drawable.sfour,R.drawable.sfive,R.drawable.ssix,R.drawable.sseven, R.drawable.seight,R.drawable.snine,R.drawable.sten,
            //11-20
            R.drawable.seleven,R.drawable.stwelve,R.drawable.sthirteen,R.drawable.fourteen,R.drawable.sfifteen,R.drawable.ssixteen,R.drawable.sseventeen, R.drawable.seighteen,R.drawable.snineteen,R.drawable.stwenty,
            //21-30
            R.drawable.stwentyone,R.drawable.stwentytwo,R.drawable.stwentythree,R.drawable.stwentyfour,R.drawable.stwentyfive,R.drawable.stwentysix,R.drawable.stwentyseven, R.drawable.stwentyeight,R.drawable.stwentynine,R.drawable.sthirty,
            //31-40
            R.drawable.sthirtyone,R.drawable.sthirtytwo,R.drawable.sthirtythree,R.drawable.sthirtyfour,R.drawable.sthirtyfive,R.drawable.sthirtysix,R.drawable.sthirtyseven, R.drawable.shirtyeight,R.drawable.sthirtynine,R.drawable.sforty,
            //41-50
            R.drawable.fortyone,R.drawable.sfortytwo,R.drawable.sfortythree,R.drawable.sfortyfour,R.drawable.sfortyfive,R.drawable.sfortysix,R.drawable.sfortyseven, R.drawable.sfortyeight,R.drawable.sfortynine,R.drawable.sfifty,
            //51-60
            R.drawable.sfiftyone,R.drawable.sfiftytwo,R.drawable.sfiftythree,R.drawable.sfiftyfour,R.drawable.sfiftyfive,R.drawable.sfiftysix,R.drawable.sfiftyseven, R.drawable.sfiftyeight,R.drawable.sfiftynine,R.drawable.ssixty,
            //61-70
            R.drawable.ssixtyone,R.drawable.ssixtytwo,R.drawable.ssixtythree,R.drawable.ssixtyfour,R.drawable.ssixtyfive,R.drawable.ssixtysix,R.drawable.ssixtyseven, R.drawable.ssixtyeight,R.drawable.ssixtynine,R.drawable.sseventy,
            //71-80
            R.drawable.sseventyone,R.drawable.sseventytwo,R.drawable.sseventythree,R.drawable.sseventyfour,R.drawable.sseventyfive,R.drawable.sseventysix,R.drawable.sseventyseven, R.drawable.sseventyeight,R.drawable.sseventynine,R.drawable.seighty,
            //81-90
            R.drawable.seightyone,R.drawable.seightytwo,R.drawable.seightythree,R.drawable.seightyfour,R.drawable.seightyfive,R.drawable.seightysix,R.drawable.seightyseven, R.drawable.seightyeight,R.drawable.seightynine,R.drawable.sninety,
            //90-100
            R.drawable.sninetyone,R.drawable.sninetytwo,R.drawable.sninetythree,R.drawable.sninetyfour,R.drawable.sninetyfive,R.drawable.sninetysix,R.drawable.sninetyseven, R.drawable.sninetyeight,R.drawable.sninetynine,R.drawable.sonehounded,
            //101-110
            R.drawable.sonehoundedone,R.drawable.sonehoundedtwo,R.drawable.sonehoundedthree,R.drawable.sonehoundedfour,R.drawable.sonehoundedfive,R.drawable.sonehoundedsix,R.drawable.sonehoundedseven, R.drawable.sonehoundedeight,R.drawable.sonehoundednine,R.drawable.sonehoundedten,
            //111-120
            R.drawable.sonehoundedeleven,R.drawable.sonehoundedtwelve,R.drawable.sonehoundedthirteen,R.drawable.sonehoundedfourteen,R.drawable.sonehoundedfifteen,R.drawable.sonehoundedsixteen,R.drawable.sonehoundedseventeen, R.drawable.sonehoundedeighteen,R.drawable.sonehoundednineteen,R.drawable.sonehoundedtwenty,
            //121-130
            R.drawable.sonehoundedtwentyone,R.drawable.sonehoundedtwentytwo,R.drawable.sonehoundedtwentythree,R.drawable.sonehoundedtwentyfour,R.drawable.sonehoundedtwentyfive,
            //R.drawable.sonehoundedtwentysix,R.drawable.sonehoundedtwentyseven, R.drawable.sonehoundedtwentyeight,R.drawable.sonehoundedtwentynine,
            R.drawable.sonehoundedthirty,
            //131-140
            R.drawable.sonehoundedthirtyone,R.drawable.sonehoundedthirtytwo,R.drawable.sonehoundedthirtythree,R.drawable.sonehoundedthirtyfour,R.drawable.sonehoundedthirtyfive,R.drawable.sonehoundedthirtysix,R.drawable.sonehoundedthirtyseven, R.drawable.sonehoundedthirtyeight,R.drawable.sonehoundedthirtynine,R.drawable.sonehoundedforty,
            //141-150
            R.drawable.sonehoundedfortyone,R.drawable.sonehoundedfortytwo,R.drawable.sonehoundedfortythree,R.drawable.sonehoundedfortyfour,R.drawable.sonehoundedfortyfive,R.drawable.sonehoundedfortysix,R.drawable.sonehoundedfortyseven, R.drawable.sonehoundedfortyeight,R.drawable.sonehoundedfortynine,R.drawable.sonehoundedfifty,
            //151-160
            R.drawable.sonehoundedfiftyone,R.drawable.sonehoundedfiftytwo,R.drawable.sonehoundedfiftythree,R.drawable.sonehoundedfiftyfour,R.drawable.sonehoundedfiftyfive,R.drawable.sonehoundedfiftysix,R.drawable.sonehoundedfiftyseven, R.drawable.sonehoundedfiftyeight,R.drawable.sonehoundedfiftynine,R.drawable.sonehoundedsixty,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sexy);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_baseline_home);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        modelContent = getResources().getStringArray(R.array.content_name);

        sexyListView=findViewById(R.id.sexyListViewId);

        Adepter adepter = new Adepter(this,modelContent,Images);
        sexyListView.setAdapter(adepter);

        sexyListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(sexy_activity.this,display_activity.class);
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
