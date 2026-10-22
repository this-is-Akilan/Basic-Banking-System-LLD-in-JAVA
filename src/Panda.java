public class Panda {
    public static void main(String[] args) {

            String[] encoded = {
                    "\u0049", " ", "\u006A", "\u0075", "\u0073", "\u0074", " ",
                    "\u0077", "\u0061", "\u006E", "\u0074", " ", "\u0074", "\u006F", " ",
                    "\u0062", "\u0065", " ", "\u0079", "\u006F", "\u0075", "\u0072", " ",
                    "\u006C", "\u0061", "\u0073", "\u0074", ".", " ",
                    "\u0043", "\u0061", "\u006E", " ", "\u0049", " ",
                    "\u0062", "\u006F", "\u0073", "\u0073", "\u003F", "\u003F"
            };

            System.out.println("Launching system instance...");
            System.out.println("Diagnostics: PASS");
            System.out.println("Reading core buffer...\n");

            StringBuilder message = new StringBuilder();
            for (String code : encoded) {
                message.append(code);
            }

            System.out.println("Final Output:\n" + message.toString());
            System.out.println("Me: yes gurl. Yenaku nee than last uh...atha thadukka varavan Lost uh 😈");
    }
}
