package example.demo6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button loveBtn , angryBtn , confuseBtn , happyBtn , madBtn , ignoreBtn ;

    private ImageView mood_image;

    @Override

    protected void onCreate(Bundle s)

    {
        super.onCreate(s);

        setContentView(R.layout.activity_main);

        loveBtn = (Button) findViewById(R.id.love_id);
        angryBtn = (Button) findViewById(R.id.gussa_id);
        confuseBtn = (Button) findViewById(R.id.uljha_id);
        happyBtn = (Button) findViewById(R.id.hassa_id);
        madBtn = (Button) findViewById(R.id.shudayi_id);
        ignoreBtn = (Button) findViewById(R.id.ignore_id);

        mood_image = (ImageView) findViewById(R.id.mood_image_id);

        View.OnClickListener onbtnclick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(v.getId() == R.id.love_id)
                {

                    mood_image.setImageDrawable(getResources().getDrawable(R.drawable.inlove));
                }

                if(v.getId() == R.id.gussa_id)
                {

                    mood_image.setImageDrawable(getResources().getDrawable(R.drawable.angry));
                }

                if(v.getId() == R.id.hassa_id)
                {

                    mood_image.setImageDrawable(getResources().getDrawable(R.drawable.happy));
                }

                if(v.getId() == R.id.uljha_id)
                {

                    mood_image.setImageDrawable(getResources().getDrawable(R.drawable.confused));
                }

                if(v.getId() == R.id.shudayi_id)
                {
                    mood_image.setImageDrawable(getResources().getDrawable(R.drawable.mad));
                }

                if(v.getId() == R.id.ignore_id)
                {
                    mood_image.setImageDrawable(getResources().getDrawable(R.drawable.smile));
                }

            }
        };



        loveBtn.setOnClickListener(onbtnclick);
        angryBtn.setOnClickListener(onbtnclick);
        confuseBtn.setOnClickListener(onbtnclick);
        madBtn.setOnClickListener(onbtnclick);
        ignoreBtn.setOnClickListener(onbtnclick);
        happyBtn.setOnClickListener(onbtnclick);
    }
}
