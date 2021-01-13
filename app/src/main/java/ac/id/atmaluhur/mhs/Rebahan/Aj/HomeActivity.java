package ac.id.atmaluhur.mhs.Rebahan.Aj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void pindah2(View view) {
        Intent intent1 = new Intent(HomeActivity.this, BarActivity.class);
            startActivity(intent1);
    }
}
