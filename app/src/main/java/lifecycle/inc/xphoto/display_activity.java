package lifecycle.inc.xphoto;


import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class display_activity extends AppCompatActivity {

    private ImageView displayImageView;
    private TextView displayTextView;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        displayImageView=findViewById(R.id.displayImageViewId);
        displayTextView=findViewById(R.id.displayTextViewId);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null)
        {
            int modelImage = bundle.getInt("image_key");
            displayImageView.setImageResource(modelImage);


            //Random number
            Random random = new Random();
            int randomNumber = random.nextInt(10)+1;
            if (randomNumber==1)
            {
                displayTextView.setText("Hi friend");

            }if (randomNumber==2)
            {
                displayTextView.setText("Hi dear");

            }if (randomNumber==3)
            {
                displayTextView.setText("Hello!");

            }if (randomNumber==4)
            {
                displayTextView.setText("Welcome");

            }if (randomNumber==5)
            {
                displayTextView.setText("How are you?");

            }if (randomNumber==6)
            {
                displayTextView.setText("Hi friend good morning.");

            }if (randomNumber==7)
            {
                displayTextView.setText("You are so sweet.");

            }if (randomNumber==8)
            {
                displayTextView.setText("Thank you.");

            }if (randomNumber==9)
            {
                displayTextView.setText("Thanks for visits.");

            }if (randomNumber==10)
            {
                displayTextView.setText("You are lucky.");

            }

        }



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