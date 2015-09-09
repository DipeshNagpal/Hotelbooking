package basilsoft.android.hotelbooking ;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle ;
import android.view.View;
import android.view.View.OnClickListener;




public class Fivestar extends Activity implements OnClickListener{
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState) ;
		setContentView(R.layout.fivestar) ;
		  View Button = findViewById(R.id.v7) ;
	        Button.setOnClickListener((OnClickListener) this);
	        View Button1 = findViewById(R.id.b8) ;
	        Button1.setOnClickListener((OnClickListener) this);
	        View Button2 = findViewById(R.id.b9) ;
	        Button2.setOnClickListener((OnClickListener) this);
	        View Button3 = findViewById(R.id.b10) ;
	        Button3.setOnClickListener((OnClickListener) this);
	        View Button4 = findViewById(R.id.b11) ;
	        Button4.setOnClickListener((OnClickListener) this);
	        View Button5 = findViewById(R.id.b12) ;
	        Button5.setOnClickListener((OnClickListener) this);
	        View Button6 = findViewById(R.id.b13) ;
	        Button6.setOnClickListener((OnClickListener) this);
	        View Button7 = findViewById(R.id.b14) ;
	        Button7.setOnClickListener((OnClickListener) this);}
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.v7:
		Intent i = new Intent(this, Viventa.class);
		startActivity(i);
		break;
		case R.id.b8 : Intent j = new Intent(this, Hyatt.class) ;
						startActivity(j) ;
						break ;
		case R.id.b9 : Intent k = new  Intent(this, Lalit.class) ;
						startActivity(k) ;
						break ;
		case R.id.b10 : Intent l = new Intent(this, Lodhi.class) ;
						startActivity(l) ;
						break ;
		case R.id.b11 : Intent m = new Intent(this, Leela.class) ;
						startActivity(m) ;
						break ;
		case R.id.b12 : Intent n = new Intent(this, Taj.class) ;
		startActivity(n) ;
		break ;
        case R.id.b13 : Intent o = new Intent(this, Grand.class) ;
		startActivity(o) ;
		break ;
        case R.id.b14 : Intent p = new Intent(this, Oberoi.class) ;
        startActivity(p) ;
        break ;
		}
	}

}

