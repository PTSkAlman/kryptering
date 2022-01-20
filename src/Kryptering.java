public class Kryptering {
    public static void main(String[] args) {
        char key = 'L';
        String encryptedMessage = encrypt("hej", key);
        System.out.println(encrypt("hej", key));
        decrypt(encryptedMessage, key);
    }

    private static String decrypt(String encryptedMessage, char key) {

        return "";
    }

    private static String encrypt(String message, char key) {
        String encryptedMessage = "";
        for (int i = 0; i < message.length(); i++) {
            encryptedMessage += Integer.toBinaryString(message.charAt(i)^key) + " ";
        }
        return encryptedMessage;
    }
}
