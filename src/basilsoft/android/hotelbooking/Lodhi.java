package basilsoft.android.hotelbooking ;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class Lodhi extends Activity{
	
	public void onCreate(Bundle savedInstanceState){
		
	super.onCreate(savedInstanceState) ;
	setContentView(R.layout.lodhi) ;
	 View b1 = (Button)findViewById(R.id.l4) ;
     b1.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_VIEW,
					    Uri.parse("http://www.thelodhi.com")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;
     View b2 = (Button)findViewById(R.id.l5) ;
     b2.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:1800 103 7333 ")) ;
			            startActivity(i) ;
		}	
	
		
     }) ; 
     View b3 = (Button)findViewById(R.id.l6) ;
     b3.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:949-487-0522 ")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;
    
      
	}
}
	
