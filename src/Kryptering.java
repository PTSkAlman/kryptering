public class Kryptering {
    public static void main(String[] args) {
        char key = 'L';
        byte[] encryptedMessage = encrypt("hej", key);
        System.out.println(encrypt("hej", key));
        System.out.println( decrypt(encryptedMessage, key));

    }

    private static String decrypt(byte[] encryptedMessage, char key) {
        byte[] decrypt = new byte[encryptedMessage.length];
        for (int i = 0; i < encryptedMessage.length; i++) {
            decrypt[i] = (byte) (encryptedMessage[i]^key);
        }
        return new String(decrypt);
    }

    private static byte[] encrypt(String message, char key) {
        String encryptedMessage = "";
        for (int i = 0; i < message.length(); i++) {
            encryptedMessage += Integer.toBinaryString(message.charAt(i)^key) + " ";
        }
        return encryptedMessage.getBytes();
    }
}
