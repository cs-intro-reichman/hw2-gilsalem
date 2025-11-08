public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        String time = args[0];
		String min=args[1];
		String hh;
		String mm;
		String[] parts = time.split(":");
        int strgHours = Integer.parseInt(parts[0]); 
        int strgMinutes = Integer.parseInt(parts[1]);
	    int	newhours= ((strgHours*60)+Integer.parseInt(min)
		+strgMinutes)/60;
		if(newhours>=24)
		{
			newhours=newhours%24;
		}
		int newmin=((strgHours*60)+Integer.parseInt(min)
		+strgMinutes)%60;
		if(newhours < 10) 
		 hh = ("0" + newhours) ;
		 else
		 hh=Integer.toString(newhours);
	
         if(newmin < 10)
         mm = ("0" + newmin);
		 else
		 mm=Integer.toString(newmin);

		System.out.println(hh+":"+mm);
	
    }
}
