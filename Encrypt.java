public class Encrypt {

    public static void main(String[] args) {
        // Example; Let's declare war on Prince
        //QRUEOfd348893*&^$*(#^$(&$&-- Key- small piece of information that let's you decode
        

        String text = "Hey, How's it hanging?";  // Revealed message

        char[] chars = text.toCharArray();

        for(char c : chars) {
            c += 5;   // creates a new value 5 character spaces over, + encrypts and - decrypts
            System.out.print(c);
        }

        System.out.println(text);
    }
}

Output:  %Mj~1%mt|,x%ny%mfslnslD  Hey, how's it hanging?
