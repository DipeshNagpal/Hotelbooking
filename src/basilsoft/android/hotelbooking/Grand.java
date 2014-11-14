package basilsoft.android.hotelbooking ;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class Grand extends Activity{
	
	public void onCreate(Bundle savedInstanceState){
		
	super.onCreate(savedInstanceState) ;
	setContentView(R.layout.grand) ;
	 View b1 = (Button)findViewById(R.id.g1) ;
     b1.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_VIEW,
					    Uri.parse("http://www.grandcityhotels.com")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;
     View b2 = (Button)findViewById(R.id.g2) ;
     b2.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:+49308870880")) ;
			            startActivity(i) ;
		}	
	
		
     }) ; 
     View b3 = (Button)findViewById(R.id.g3) ;
     b3.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:+31-20-6 54 15 62")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;
     View b4 = (Button)findViewById(R.id.g4) ;
     b4.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:+7916 026 1133")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;  
     View b6 = (Button)findViewById(R.id.g5) ;
     b6.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:+33-1-5343 7900")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;  
     View b5 = (Button)findViewById(R.id.g6) ;
     b5.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:86 63 59 15 35")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;
     View b7 = (Button)findViewById(R.id.g7) ;
     b7.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:+46 8 545 259 55")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;
     View b8 = (Button)findViewById(R.id.g8) ;
     b8.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:+34 – 91- 458 57 27")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;
     View b9 = (Button)findViewById(R.id.g9) ;
     b9.setOnClickListener(new OnClickListener()
     {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			 Intent i = new Intent(android.content.Intent.ACTION_DIAL,
					    Uri.parse("tel:+39 - 02 - 43 45 83 11")) ;
			            startActivity(i) ;
		}	
	
		
     }) ;
       
      
	}
}
	
