package basilsoft.android.hotelbooking ;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class Oberoi extends Activity{
	
	public void onCreate(Bundle savedInstanceState){
		
	super.onCreate(savedInstanceState) ;
	setContentView(R.layout.oberoi) ;
	 View b1 = (Button)findViewById(R.id.o1) ;
     b1.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_VIEW,
					    Uri.parse("http://www.oberoihotels.com")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;
     View b2 = (Button)findViewById(R.id.o2) ;
     b2.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:+91-11-2389 0606")) ;
			            startActivity(i) ;
		}	
	
		
     }) ; 
     View b3 = (Button)findViewById(R.id.o3) ;
     b3.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:+44 207 222 0606")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;
     View b4 = (Button)findViewById(R.id.o4) ;
     b4.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:+65 64083796")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;  
     View b6 = (Button)findViewById(R.id.o5) ;
     b6.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:+1 212-223-8800")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;  
    
      
	}
}
	
