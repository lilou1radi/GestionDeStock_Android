package eu.glaasri.inventorymanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class HomeActivity extends AppCompatActivity implements View.OnClickListener{
    private AppCompatActivity activity = HomeActivity.this;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        getSupportActionBar().setTitle("");
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.butt1:
                // Navigate to RegisterActivity
                Intent intentconsult = new Intent(activity, MainActivity.class);
                startActivity(intentconsult);
                break;
            case R.id.butt3:
                // Navigate to RegisterActivity
                Intent intentconsult1 = new Intent(activity, DetailsActivity.class);
                startActivity(intentconsult1);
                break;
                case R.id.butt4:
                // Navigate to RegisterActivity
                Intent intentconsult2 = new Intent(activity, UsersListActivity.class);
                startActivity(intentconsult2);
                break;
                case R.id.butt2:
                // Navigate to RegisterActivity
                Intent intentconsult3 = new Intent(activity, ReportActivity.class);
                startActivity(intentconsult3);
                break;
                case R.id.butt6:
                // Navigate to RegisterActivity
                Intent intentconsult4 = new Intent(activity, AddSuppActivity.class);
                startActivity(intentconsult4);
                break;

        }
    }


}
