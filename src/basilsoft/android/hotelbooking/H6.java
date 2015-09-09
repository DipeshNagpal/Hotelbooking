package basilsoft.android.hotelbooking ;

import android.app.Activity ;
import android.content.Intent;
import android.os.Bundle ;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class H6 extends Activity implements OnClickListener{

	public void onCreate(Bundle savedInstanceState){
	super.onCreate(savedInstanceState) ;
	setContentView(R.layout.searchhotels) ;
	
	View b4 = (Button) findViewById(R.id.search) ;
	b4.setOnClickListener(this) ;
	b4.setSelected(true) ;
}

public void onClick(View V){
if(V.getId() == R.id.search)
{
	Intent i = new Intent(this, Fivestar.class) ;
	startActivity(i) ;
}

}

}