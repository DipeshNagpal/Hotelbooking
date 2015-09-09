package basilsoft.android.hotelbooking ;

import android.app.Activity ;
import android.content.Intent;
import android.os.Bundle ;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class H8 extends Activity implements OnClickListener{
	public void onCreate(Bundle savedInstanceState){
	super.onCreate(savedInstanceState) ;
	setContentView(R.layout.hreservation) ;
	View b1 = (Button) findViewById(R.id.b1) ;
	b1.setOnClickListener(this) ;
	b1.setSelected(true) ;
	View b2 = (Button) findViewById(R.id.b2) ;
	b2.setOnClickListener(this) ;
	b2.setSelected(true) ;
	
	
	}
	public void onClick(View V){
		if(V.getId()== R.id.b1){
			Intent i = new Intent(this, Fivestar.class) ;
			startActivity(i) ;
		}
		else{
			Intent j = new Intent(this, Fourstar.class);
			startActivity(j) ;
		}


}
}
	

