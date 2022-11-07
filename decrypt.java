public class Encrypt {

    public static void main(String[] args) {
        // Example; Let's declare war on Prince
        //QRUEOfd348893*&^$*(#^$(&$&-- Key- small piece of information that let's you decode

        int key = 5;  /// Used to decrypt the message

        String text = "%Mj~1%mt|,x%ny%mfslnslD";  // Revealed message

        char[] chars = text.toCharArray();

        for(char c : chars) {
            c -= key;   // create a new value 5 character spaces over, + encrypts and - decrypts
            System.out.print(c);
        }

        System.out.println(text);
    }
}

Output:  Hey, how's it hanging?%Mj~1%mt|,x%ny%mfslnslD
