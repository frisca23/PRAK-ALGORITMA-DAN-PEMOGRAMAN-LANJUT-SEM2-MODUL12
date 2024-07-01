class testPalindrome {
public static boolean testPalindrome(String[] str) {
    // Base case: String dengan panjang 0 atau 1 adalah palindrome
    if (str.length <= 1) {
        return true;
    }

    // Ubah semua karakter menjadi huruf kecil dan hapus spasi serta tanda baca
    for (int i = 0; i < str.length; i++) {
        str[i] = str[i].toLowerCase().replaceAll("[^a-zA-Z]", "");
    }

    // Bandingkan karakter pertama dan terakhir secara rekursif
    return str[0].equals(str[str.length - 1]) && testPalindrome(Arrays.copyOfRange(str, 1, str.length - 1));
}
}