package basilsoft.android.hotelbooking ;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle ;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class H2 extends Activity implements OnClickListener{
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState) ;
		setContentView(R.layout.hb2) ;
		View b4 = (Button) findViewById(R.id.b4) ;
		b4.setOnClickListener(this) ;
		b4.setSelected(true) ;
		View b6 = (Button) findViewById(R.id.b6) ;
		b6.setOnClickListener(this) ;
		b6.setSelected(true) ;
	}

public void onClick(View V){
	if(V.getId() == R.id.b4)
	{
		Intent i = new Intent(this, H6.class) ;
		startActivity(i) ;
	}
	else
	{
		Intent j = new Intent(this, H8.class) ;
		startActivity(j) ;
	}
}
	
}