package task;

public class Execution extends Utility {

	public static void main(String[] args) throws InterruptedException {
		
launch("http://adactinhotelapp.com/index.php");
LoginPage l=new LoginPage();
fill(l.getUser(),"SanjuArjun");
Thread.sleep(4000);
fill(l.getPasswrd(),"Cinna0419!");
Thread.sleep(3000);
klik(l.getLoginbtn());


HotelSearch s=new HotelSearch();
dropdown(s.getDdloc(),2);
dropdown(s.getDdhotel(),3);
dropdown(s.getDdroom(),1);
dropdown(s.getDdroomno(),1);
dropdown(s.getDdadultroom(),2);
dropdown(s.getDdchildroom(),2);
Thread.sleep(4000);
lgnbtnclick(s.getSubmitbtn());

SelectHotel sh=new SelectHotel();
Thread.sleep(3000);
radiobtn(sh.getRadbtn());
Thread.sleep(3000);
lgnbtnclick(sh.getConbtn());

Booking b=new Booking();
Thread.sleep(3000);
fill(b.getFiname(),"Sanju");
Thread.sleep(3000);
fill(b.Liname(),"Arjun");
Thread.sleep(3000);
fill(b.Addr(),"ooty");
Thread.sleep(3000);
fill(b.Ccnum(),"8989765436578905");
Thread.sleep(3000);
dropdown(b.Cctype(),2);
Thread.sleep(3000);
dropdown(b.Ccexpmon(),3);
Thread.sleep(3000);
dropdown(b.Ccexpyear(),7);
Thread.sleep(3000);
dropdown(b.Ccexpyear(),5);
Thread.sleep(3000);
fill(b.CcCvv(),"567");
Thread.sleep(3000);
lgnbtnclick(b.Booknowbtn());

Confirm c=new Confirm();
Thread.sleep(3000);
webtable(c.getTabrow());
	}
}
	


	



