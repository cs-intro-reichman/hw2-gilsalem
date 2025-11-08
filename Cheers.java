//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	   
                String cheer = args[0];
                int n=Integer.parseInt((args[1]));
                String cheerWordUpp = cheer.toUpperCase();
                String an = "AEFHILMNRSXO";
                for(int i=0;i<cheerWordUpp.length();i++)
                {
                char letter = cheerWordUpp.charAt(i);
                    if(an.indexOf(cheerWordUpp.charAt(i))!=-1)
                    {
                        System.out.println("Give me an "+letter+": "+letter +"!");
                    }
                    else
                    {
                        System.out.println("Give me a "+letter+": "+letter +"!");
                    }
                }
                System.out.println("What does that spell?");
        String finalCheer = cheerWordUpp + "!!!";
        
        for (int i = 0; i < n; i++) {
            System.out.println(finalCheer);
        }

        }
}
